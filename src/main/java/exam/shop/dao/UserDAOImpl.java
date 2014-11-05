package exam.shop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import exam.shop.dto.User;

public class UserDAOImpl implements UserDAO{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// DataSource 이용해서 DataBase 연결
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	// 로그인
	@Override
	public User getUserByUserId(String userId, String userPwd) {
		
		String sql ="select * from users where user_id = ? and user_pwd = ?";
		
		User user = jdbcTemplate.queryForObject(sql, new Object[] {userId, userPwd}, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user 
				= new User(rs.getString("user_id"), 
						   rs.getString("user_pwd"),
						   rs.getString("user_name"));
				return user;
			}
		});
		return user;
	}

	// 회원가입
	@Override
	public void registerUser(User user) {
		String sql ="insert into users values (?, ?, ?)";
		jdbcTemplate.update(sql, user.getUserId(), user.getUserPwd(), user.getUserName());
	}

}
