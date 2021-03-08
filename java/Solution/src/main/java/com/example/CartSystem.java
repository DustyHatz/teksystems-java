package com.example;

public class CartSystem extends TheSystem {
	CartSystem() {
	}

	@Override
	public void display() { 
		
		Double preTaxTotal = 0.0;
		Double totalTax = 0.0;
		Double grandTotal = 0.0;

		System.out.println("Cart:");
		System.out.printf("%-20s %-20s %-10s %-10s %-10s%n", "Name", "Description", "Price", "Quantity", "Sub Total");

		for (String item : itemCollection.keySet()) {

			Double subTotal = itemCollection.get(item).getItemPrice() * itemCollection.get(item).getQuantity();
			Double tax = subTotal * .05;
			Double total = subTotal + tax;
			
			preTaxTotal += subTotal;
			totalTax += tax;
			grandTotal += total;

			System.out.printf("%-20s %-20s %-10.2f %-10d %-10.2f%n", itemCollection.get(item.toString()).getItemName(),
					itemCollection.get(item.toString()).getItemDesc(),
					itemCollection.get(item.toString()).getItemPrice(),
					itemCollection.get(item.toString()).getQuantity(), subTotal);
		}
		
		System.out.printf("%-20s %-20.2f%n", "Pre-tax Total", preTaxTotal);
		System.out.printf("%-20s %-20.2f%n", "Tax", totalTax);
		System.out.printf("%-20s %-20.2f%n", "Total", grandTotal);
	}
}
