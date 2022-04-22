package com.example.demo.dao.mapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.example.demo.model.Product;

public class ProductRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs,int rowNum) throws SQLException{
       Product product = new Product();

       product.setId(rs.getInt("id"));
       product.setProductAge(rs.getString("productAge"));
       product.setProductName(rs.getString("productName"));
       product.setProductType(rs.getString("productType"));
       product.setProductCost(rs.getDouble("productCost"));


        return product;
    }
}

