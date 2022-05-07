package com.example.demo.web;

import com.example.demo.model.ShoppingCardResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShoppingCartController {

    public static final String ITEMS = "Items";

    @GetMapping("/shopping/list.html")
    public String shoppingCartList(HttpSession session, Model model){
        List items = (ArrayList) session.getAttribute(ShoppingCartController.ITEMS);
        model.addAttribute("items", items);
        return "/shopping/list";
    }

    @GetMapping("/shopping/add.html")
    @ResponseBody
    public ShoppingCardResult addToShoppingCart(HttpSession session){

        List items = (ArrayList) session.getAttribute(ShoppingCartController.ITEMS);
        if (items==null)
            items = new ArrayList();

        items.add("Самокат");

        session.setAttribute(ShoppingCartController.ITEMS, items);

        ShoppingCardResult result = new ShoppingCardResult();
        result.setResult("ok");

        return result;
    }
}
