package cn.com.beenhere.core.storage.mybatis.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.com.beenhere.core.storage.mybatis.exception.DaoException;
import cn.com.beenhere.core.storage.mybatis.orm.Inscription;


public interface InscriptionMapper {
	public int add(Inscription inscription) throws DaoException;
	
	public int removeById(String id) throws DaoException;
	
	public int remove(Map params) throws DaoException;
	
	public int update(Map params) throws DaoException;
	
	public Map get(Map params) throws DaoException;	
	
	public long getCount(Map params) throws DaoException;
	
	public List<Inscription> list(Map params) throws DaoException;
}