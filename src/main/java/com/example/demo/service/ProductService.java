package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductService {
    private final ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public List<Map<String, Object>> getProduct() {
        return productDao.getProducts();
    }

    public List<Product> getProductList(){ return productDao.getProductList();}

    public Product getProductById(Integer productId){ return  productDao.getProductbyId(productId);}

    public void deleteProduct(Integer prudctId){productDao.deleteProduct(prudctId);}

    public void save(Product product){
        if(product.getId()==null)
            productDao.insert(product);
        else
            productDao.update(product);
    }
}
