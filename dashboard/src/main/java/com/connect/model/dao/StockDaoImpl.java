package com.connect.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.connect.model.Stock;

@Repository
public class StockDaoImpl implements StockDao {

	@Autowired
    private SessionFactory sessionFactory;
	
	public void save(Stock stock) {
		this.sessionFactory.getCurrentSession().save(stock);
	}

	public void update(Stock stock) {
		this.sessionFactory.getCurrentSession().update(stock);
	}

	public void delete(Stock stock) {
		this.sessionFactory.getCurrentSession().delete(stock);
	}

	public Stock findByStockCode(String stockCode) {
		return null;
	}

}
