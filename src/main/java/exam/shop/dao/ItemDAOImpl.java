package exam.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import exam.shop.dto.Item;

public class ItemDAOImpl implements ItemDAO {
	
	private JdbcTemplate jdbcTemplate;

	// DataSource �̿��ؼ� DataBase ����
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		
		String sql ="select * from items";
		
		List<Item> list = jdbcTemplate.query(sql, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				Item item 
					= new Item(rs.getInt("item_id"), 
							   rs.getString("item_name"),
							   rs.getInt("price"),
							   rs.getString("description"),
							   rs.getString("pictureUrl"));
				
				return item;
			}
		});
		
		return list;
	}

	@Override
	public Item findByItemId(int itemId) {
		
		String sql ="select * from items where item_id = ?";
		
		Item item = jdbcTemplate.queryForObject(sql, new Object[] {itemId}, new RowMapper<Item>() {
			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				Item item 
				= new Item(rs.getInt("item_id"), 
						   rs.getString("item_name"),
						   rs.getInt("price"),
						   rs.getString("description"),
						   rs.getString("pictureUrl"));
				return item;
			}
		});
		
		return item;
	}
}
