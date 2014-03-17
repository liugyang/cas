package com.connect.model.dao;

import com.connect.model.Stock;

public interface StockManager {
	
	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(String stockCode);

}
