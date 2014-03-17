package com.connect.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.connect.model.Stock;

@Service
public class StockManagerImpl implements StockManager {
	
	@Autowired
	private StockDao stockDao;

	@Transactional
	public void save(Stock stock){
		stockDao.save(stock);
	}
 
	@Transactional
	public void update(Stock stock){
		stockDao.update(stock);
	}
 
	@Transactional
	public void delete(Stock stock){
		stockDao.delete(stock);
	}
 
	@Transactional
	public Stock findByStockCode(String stockCode){
		return stockDao.findByStockCode(stockCode);
	}

}
