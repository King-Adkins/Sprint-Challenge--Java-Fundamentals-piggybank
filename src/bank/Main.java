package bank;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Bank> bank = new ArrayList<Bank>();
			bank.add(new Quarter());
			bank.add(new Dime());
			bank.add(new Dollar(5));
			bank.add(new Nickel(3));
			bank.add(new Dime(7));
			bank.add(new Dollar());
			bank.add(new Penny(10));

			bank.forEach((i) -> System.out.println(i));

			double total = 0;
			for (Bank j : bank) {
				total += j.getQuantity() * j.getValue();
			}

		System.out.println("The Piggy Bank holds $" + total);
	}
}