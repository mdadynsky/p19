package com.example.demo.dao;

import com.example.demo.dao.mapper.ProductRowMapper;
import com.example.demo.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ProductDao extends BaseDao {
    public ProductDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Product> getProductList() {
        return jdbcTemplate.query("select * from product", new ProductRowMapper());
    }

    public List<Map<String, Object>> getProducts() {
        return jdbcTemplate.queryForList("select * from product");
    }

    public Product getProductbyId(Integer productId) {
        List<Product> products = jdbcTemplate.query(
                "select * from product where id = ?",
                preparedStatement -> preparedStatement.setInt(1, productId),
                new ProductRowMapper());
        if (products.isEmpty())
            return null;

        return products.get(0);
    }

    public void deleteProduct(Integer productId) {
        jdbcTemplate.update("delete from product where id = " + productId);
    }

    public void update(Product product) {
        jdbcTemplate.update("update product set productName =?, productType =?, productAge =?,productCost =? where id =?",
                preparedStatement -> {
                    preparedStatement.setString(1, product.getProductName());
                    preparedStatement.setString(2, product.getProductType());
                    preparedStatement.setString(3, product.getProductAge());
                    preparedStatement.setDouble(4, product.getProductCost());
                    preparedStatement.setInt(5, product.getId());
                });
    }

    public void insert(Product product) {
        jdbcTemplate.update("insert into product(productName , productType , productAge ,productCost) values ( ?,?,?,? )",
                preparedStatement -> {
                    preparedStatement.setString(1, product.getProductName());
                    preparedStatement.setString(2, product.getProductType());
                    preparedStatement.setString(3, product.getProductAge());
                    preparedStatement.setDouble(4, product.getProductCost());
                });
    }

}
