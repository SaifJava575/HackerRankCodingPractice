package com.nt.test;

public class Hr_22_ElectronicShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int maxCost = -1;

		// Iterate through each keyboard and USB drive price combination
		for (int keyboardPrice : keyboards) {
			for (int drivePrice : drives) {
				// Calculate the total cost of buying the keyboard and USB drive together
				int totalCost = keyboardPrice + drivePrice;

				// Check if the total cost is within the budget and greater than the current
				// maxCost
				if (totalCost <= b && totalCost > maxCost) {
					maxCost = totalCost;
				}
			}
		}

		return maxCost;
	}

	public static void main(String[] args) {
		int keyboard[] = { 40, 50, 60 };
		int usb[] = { 5, 8, 12 };
		int budget = 60;
		int response = getMoneySpent(keyboard, usb, budget);
		System.out.println("The most expensive budget is " + response);
	}

}
