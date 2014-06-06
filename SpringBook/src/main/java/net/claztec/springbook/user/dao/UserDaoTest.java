package net.claztec.springbook.user.dao;

import java.sql.SQLException;

import net.claztec.springbook.user.domain.User;

public class UserDaoTest {
	
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		
		UserDao dao = new DaoFactory().userDao();
		User user = new User();
		user.setId("claztec");
		user.setName("최재만");
		user.setPassword("pass");

		dao.add(user);

		System.out.println(user.getId() + " 등록 성공.");

		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
	}
}
