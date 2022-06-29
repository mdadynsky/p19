package com.example.demo.dao.mapper;

        import com.example.demo.model.Gift;
        import org.springframework.jdbc.core.RowMapper;

        import java.sql.ResultSet;
        import java.sql.SQLException;

public class GiftRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Gift gift = new Gift();

        gift.setId(rs.getInt("id"));
        gift.setGiftName(rs.getString("giftName"));
        gift.setGiftDescription(rs.getString("giftDescription"));
        gift.setGiftPrice(rs.getString("giftPrice"));

        return gift;
    }
}