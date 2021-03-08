package com.example;

// AppSystem class implements the logic only related to the App system
public class AppSystem extends TheSystem {
	// Constructor method
	AppSystem() {

	}

	// Displays the current item information in the system itemCollection
	@Override
	public void display() {

		// Print header
		System.out.println("AppSystem Inventory:");
		// Print column names
		System.out.printf("%-20s %-20s %-10s %-10s%n", "Name", "Description", "Price", "Available Quantity");
		// Iterate through the collection items
		for (String item : itemCollection.keySet()) {
			// Print item name, description, price, and available quantity
			System.out.printf("%-20s %-20s %-10.2f %-10d%n", itemCollection.get(item.toString()).getItemName(),
					itemCollection.get(item.toString()).getItemDesc(),
					itemCollection.get(item.toString()).getItemPrice(),
					itemCollection.get(item.toString()).getAvailableQuantity());
			System.out.println();
		}

	}

	// Adds an item to the system
	@Override
	public Boolean add(Item item) {

		if (item == null) {
			return false;
			// If the item is already in the system, print message and return false
		} else if (itemCollection.containsKey(item.getItemName())) {
			System.out.println(item.getItemName() + " is already in the App System");
			return false;
		}
		// If the item is not already in the system, add it to the system and return
		// true
		itemCollection.put(item.getItemName(), item);
		return true;
	}

	// Checks if the item is in the itemCollection and decreases the quantity in the
	// system by 1 and returns the Item
	public Item reduceAvailableQuantity(String item_name) {
		
		if (!itemCollection.containsKey(item_name)) {
			return null;
		// If the item quantity is already 0, remove the item from the system
		} else if (itemCollection.get(item_name).getAvailableQuantity() == 0) {
			itemCollection.remove(item_name);
			return null;
		} else {
			// Decrease the Item quantity by 1
			Integer currentAvailQ = itemCollection.get(item_name).getAvailableQuantity();
			itemCollection.get(item_name).setAvailableQuantity(currentAvailQ - 1);
			if (itemCollection.get(item_name).getAvailableQuantity() == 0) {
				itemCollection.remove(item_name);
				return null;
			}
			return itemCollection.get(item_name);
		}

	}

}
