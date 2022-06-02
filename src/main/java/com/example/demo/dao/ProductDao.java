package com.example.demo.dao;

import com.example.demo.dao.mapper.ProductRowMapper;
import com.example.demo.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
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



    public void saveRating(Integer productId, Integer rating) {
        Integer ratingCount = jdbcTemplate.queryForObject("select ratingCount from product where id = "+productId, Integer.class);
        Integer ratingCurrent = jdbcTemplate.queryForObject("select rating from product where id = "+productId, Integer.class);
        if (ratingCurrent==null) ratingCurrent = 0;
        ratingCount = ratingCount==null ? 1 : ratingCount + 1;

        Integer ratingToSave = Math.round((ratingCurrent*(ratingCount-1)+rating)/(ratingCount));


        /*
        if (ratingCount==null)
            ratingCount = 0;
        else
            ratingCount = ratingCount + 1;
        */



        Integer finalRatingCount = ratingCount;
        jdbcTemplate.update("update product set rating =?, ratingCount=? where id =?",
                preparedStatement -> {
                    preparedStatement.setDouble(1, ratingToSave);
                    preparedStatement.setInt(2, finalRatingCount);
                    preparedStatement.setInt(3, productId);
                });
    }

}
