package net.claztec.springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DaoFactory {

//	@Bean
	public UserDao userDao() {
		UserDao userDao = new UserDao();
		userDao.setConnectionMaker(connectionMaker());
		return userDao;
	}
	
//	public AccountDao accountDao() {
//		AccountDao accountDao = new AccountDao(connectionMaker());
//		return accountDao;
//	}

//	public MessageDao messageDao() {
//		MessageDao messageDao = new MessageDao(connectionMaker());
//		return messageDao;
//	}

//	@Bean
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}
