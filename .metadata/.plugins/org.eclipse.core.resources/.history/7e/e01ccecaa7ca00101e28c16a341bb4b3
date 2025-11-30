package com.spring.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	 JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
	String sql = "insert into new(Username,Password) values(?,?)";
	jdbcTemplate.update(sql, new Object[] 
			{ user.getUsername(), user.getPassword()
			});
		
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		String sql = "select * from new";
		return jdbcTemplate.query(sql, (rs,rowNum)->
		{
			User user=new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("Username"));
			user.setPassword(rs.getString("Password"));
			return user;
		});
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql="delete from new where id=?";
		jdbcTemplate.update(sql,new Object[] {id} );
	}


	@Override
	public User getUserById(int id) {
		String sql= "SELECT * FROM new WHERE id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {id}, (rs,rowNum)->{
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("Username"));
			user.setPassword(rs.getString("Password"));
			return user;
		});
	}


	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		String sql="UPDATE new SET Username=?, Password=? WHERE id=?";
		jdbcTemplate.update(sql, new Object[] {user.getUsername(), user.getPassword(), user.getId()});		
	}

}
