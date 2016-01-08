package com.ds.stack;

import java.util.Date;

import com.ds.linkedlist.single.stack.Stack;

public class StockSpan {

	public void findSpanOfStocks(Stock[] stockArray) {

		Stack<Stock> stack = new Stack<Stock>();

		for (int i = 0; i < stockArray.length; i++) {

			while (!stack.isEmpty()
					&& stack.top().getPrice() > stockArray[i].getPrice()) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				stockArray[i].setSpan(1);
			} else {
				long span = getDifferenceDays(stockArray[i].getDate(), stack
						.top().getDate());
				stockArray[i].setSpan(span);
			}
		}

	}

	public long getDifferenceDays(Date d1, Date d2) {
		long diff = d2.getTime() - d1.getTime();
		long diffDays = diff / (24 * 60 * 60 * 1000);
		return diffDays;
	}

}
