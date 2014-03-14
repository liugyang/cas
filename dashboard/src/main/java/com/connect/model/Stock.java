package com.connect.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@Entity
@Table(name="stock")
public class Stock {

	@Id
    @GeneratedValue
    @Column(name="STOCK_ID")
	private int stockId;
	@Column(name="STOCK_CODE")
	private String stockCode;
	@Column(name="STOCK_NAME")
	private String stockName;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public Stock(int stockId, String stockCode, String stockName) {
		this.stockId = stockId;
		this.stockCode = stockCode;
		this.stockName = stockName;
	}
	
	public static void main(String[] args){
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		Groups g = new Groups(1, "test","test","test", 2,new Timestamp(222L), new Timestamp(22L));
		t.begin();
		s.persist(g);
		t.commit();
		s.close();
		
	}
	
}
