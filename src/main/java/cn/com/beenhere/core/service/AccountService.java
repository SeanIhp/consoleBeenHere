package cn.com.beenhere.core.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.beenhere.core.storage.mybatis.exception.DaoException;
import cn.com.beenhere.core.storage.mybatis.mapper.AccountMapper;
import cn.com.beenhere.core.storage.mybatis.orm.Account;

@Service
@Transactional
public interface AccountService {
	public int regist(Account account) throws DaoException;
	
	public Account login(Account account) throws DaoException;
	
	public String add(Account account);
	
	public Object list();
}