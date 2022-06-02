package com.example.demo.web;

import com.example.demo.model.Product;
import com.example.demo.model.ShoppingCardResult;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShoppingCartController {

    public static final String ITEMS = "Items";
    private final ProductService productService;

    public ShoppingCartController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/shopping/list.html")
    public String shoppingCartList(HttpSession session, Model model) {
        List<Product> items = (ArrayList) session.getAttribute(ShoppingCartController.ITEMS);
        model.addAttribute("items", items);

        Double total = 0.0;
        if (!CollectionUtils.isEmpty(items)) {
            for (Product product : items) {
                total += product.getProductCost();
            }
        }

        model.addAttribute("total", total);

        return "/shopping/list";
    }

    @GetMapping("/shopping/add.html")
    @ResponseBody
    public ShoppingCardResult addToShoppingCart(@RequestParam Integer productId, HttpSession session) {
        List items = (ArrayList) session.getAttribute(ShoppingCartController.ITEMS);
        if (items == null)
            items = new ArrayList();

        Product product = productService.getProductById(productId);

        items.add(product);

        session.setAttribute(ShoppingCartController.ITEMS, items);

        ShoppingCardResult result = new ShoppingCardResult();
        result.setCount(items.size());
        result.setResult("ok");

        return result;
    }

    @GetMapping("/shopping/clear.html")
    public String clearCard(HttpSession session) {
        session.removeAttribute(ShoppingCartController.ITEMS);
        return "redirect:/shopping/list.html";
    }

    @GetMapping("/shopping/clearOne.html")
    public String clearOne(HttpSession session,
                           @RequestParam Integer productId) {
        List<Product> items = (ArrayList) session.getAttribute(ShoppingCartController.ITEMS);

        if (items != null) {
            Product productForDelete = null;

            for (Product product : items) {
                if (product.getId() == productId) {
                    productForDelete = product;
                }
            }

            if (productForDelete != null)
                items.remove(productForDelete);
        }

        return "redirect:/shopping/list.html";
    }

    @GetMapping("/shopping/rating.html")
    @ResponseBody
    public String setRating(Integer productId, Integer rating) {
        productService.setRating(productId, rating);
        return "ok";
    }
}
