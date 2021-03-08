package com.example;

public class CartSystem extends TheSystem {
	CartSystem() {
	}

	@Override
	public void display() { 
		
		// Declare and initialize variables to be displayed in the second table
		Double preTaxTotal = 0.0;
		Double totalTax = 0.0;
		Double grandTotal = 0.0;
		
		// Print header and column names
		System.out.println("Cart:");
		System.out.printf("%-20s %-20s %-10s %-10s %-10s%n", "Name", "Description", "Price", "Quantity", "Sub Total");

		// Iterate through items
		for (String item : itemCollection.keySet()) {
			
			// Calculate subtotal, tax, and total for amount of each item
			Double subTotal = itemCollection.get(item).getItemPrice() * itemCollection.get(item).getQuantity();
			Double tax = subTotal * .05;
			Double total = subTotal + tax;
			
			// Increment the combined item total variables
			preTaxTotal += subTotal;
			totalTax += tax;
			grandTotal += total;

			// Print item name, item description, item price, and quantity
			System.out.printf("%-20s %-20s %-10.2f %-10d %-10.2f%n", itemCollection.get(item.toString()).getItemName(),
					itemCollection.get(item.toString()).getItemDesc(),
					itemCollection.get(item.toString()).getItemPrice(),
					itemCollection.get(item.toString()).getQuantity(), subTotal);
		}
		
		// Print combined item totals
		System.out.printf("%-20s %-20.2f%n", "Pre-tax Total", preTaxTotal);
		System.out.printf("%-20s %-20.2f%n", "Tax", totalTax);
		System.out.printf("%-20s %-20.2f%n", "Total", grandTotal);
	}
}
