package com.example;

public class AppSystem extends TheSystem {
	AppSystem() {

	}

	@Override
	public void display() {
		// Your code here
		System.out.println("AppSystem Inventory:");
		System.out.printf("%-20s %-20s %-10s %-10s%n", "Name", "Description", "Price", "Available Quantity");

		for (String item : itemCollection.keySet()) {

			System.out.printf("%-20s %-20s %-10.2f %-10d%n", itemCollection.get(item.toString()).getItemName(),
					itemCollection.get(item.toString()).getItemDesc(),
					itemCollection.get(item.toString()).getItemPrice(),
					itemCollection.get(item.toString()).getAvailableQuantity());
			System.out.println();
		}

	}

	@Override // this overwrites the parents class add method
	public Boolean add(Item item) {
		// Your code here
		if (item == null) {
			return false;

		} else if (itemCollection.containsKey(item.getItemName())) {
			System.out.println(item.getItemName() + " is already in the App System");
			return false;
		}
		itemCollection.put(item.getItemName(), item);
		return true;
	}

	public Item reduceAvailableQuantity(String item_name) {
		// Your code here
		if (!itemCollection.containsKey(item_name)) {
			return null;
		} else if (itemCollection.get(item_name).getAvailableQuantity() == 0) {
			itemCollection.remove(item_name);
			return null;
		} else {
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
