package br.com.sodexo.db;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import br.com.sodexo.product.dao.CommonDAO;

public class CommonDAOProducer {
	@Produces
	@Default
	CommonDAO dao;
	
	@Inject 
	private SqlSessionFactory sessionFactory;
	
	public CommonDAOProducer(){}
	
	@PostConstruct
	public void init(){
		SqlSession session = sessionFactory.openSession();
	    dao = session.getMapper(CommonDAO.class);
	}
	
	public CommonDAO getCommonDAO(){
		return dao;
	}
}
