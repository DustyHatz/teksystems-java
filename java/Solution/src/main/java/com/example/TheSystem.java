package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {

	// Declare the instance variable for the hashmap of items in the system
	HashMap<String, Item> itemCollection;

	TheSystem() {

		// Initialize the hashmap to be itemCollection
		this.itemCollection = new HashMap<String, Item>();

		// Checks if the AppSystem is invoking the constructor
		if (getClass().getSimpleName().equals("AppSystem")) {

			// Add items from sample.txt to the itemCollection
			try {
				String filePath = "./resources/sample.txt";
				File file = new File(filePath);
				Scanner scn = new Scanner(file);

				while (scn.hasNextLine()) {

					String[] items = scn.nextLine().split("  ");

					// scan line for the itemName, then the itemDesc, then itemPrice, then
					// availableQuantity
					String itemName = items[0];
					String itemDesc = items[1];
					Double itemPrice = Double.valueOf(items[2]);
					Integer availableQuantity = Integer.valueOf(items[3]);

					// enter itemName as key and create a new Item with the above saved variables as
					// value into the itemCollection
					itemCollection.put(itemName, new Item(itemName, itemDesc, itemPrice, availableQuantity));

				}
				// Display if the file is not found
			} catch (FileNotFoundException e) {
				System.out.println("FILE NOT FOUND...");
			}

		}
	}

	// Get the itemCollection
	public HashMap<String, Item> getItemCollection() {
		// Your code here
		return itemCollection;
	}

	// If the item quantity is greater than or equal to the available quantity,
	// display a message
	public Boolean checkAvailability(Item item) {
		// Your code here
		if (item.getQuantity() >= item.getAvailableQuantity()) {

			System.out.printf("System is unable to add %s to the card. System only has %d %ss", item.getItemName(),
					item.getAvailableQuantity(), item.getItemName());

			return false;
		}
		return true;
	}

	// If the item is already in the collection, increase the quantity by one and
	// return true
	// If the item is not in the collection, add item and return true
	public Boolean add(Item item) {
		// Your code here
		if (item == null) {
			return false;
		} else if (itemCollection.containsKey(item.getItemName())) {
			item.setQuantity(item.getQuantity() + 1);
			return true;
		} else if (!itemCollection.containsKey(item.getItemName())) {
			itemCollection.put(item.getItemName(), item);
			return true;
		}
		return false;
	}

	// If item is in the collection, remove the item and return the item.
	public Item remove(String itemName) {
		// Your code here
		if (itemCollection.containsKey(itemName)) {
			return itemCollection.remove(itemName);
		}
		return null;
	}

	public abstract void display();
}
