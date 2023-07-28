package com.nt.test;

import java.util.ArrayList;
import java.util.List;

public class Hr_18_BillDivisionProblem {

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		int totalBill = 0;

		// Calculate the total bill excluding the item Anna didn't eat
		for (int i = 0; i < bill.size(); i++) {
			if (i != k) 
				totalBill += bill.get(i);
		}

		// Calculate Anna's share of the bill
		int annaShare = totalBill / 2;

		// Check if Anna's share matches the amount she contributed (b)
		if (annaShare == b) 
			System.out.println("Bon Appetit");
		else {
			// If Anna's share doesn't match, calculate the amount Brian owes Anna
			int refundAmount = b - annaShare;
			System.out.println(refundAmount);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(10);
		list.add(2);
		list.add(9);
		bonAppetit(list, 0, 0);

	}

}
