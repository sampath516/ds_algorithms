package com.ds.stack;

import java.util.Date;

public class Stock {

	private double price;
	private long span;
	private Date date;

	public Stock(double price, Date date) {
		this.price = price;
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getSpan() {
		return span;
	}

	public void setSpan(long span) {
		this.span = span;
	}

}
