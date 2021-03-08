package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {

	HashMap<String, Item> itemCollection;
	
	TheSystem() {
		// Your code here
		
		HashMap<String, Item> itemCollection;

		if (getClass().getSimpleName().equals("AppSystem")) {
			// Add items from sample.txt to the itemCollection
			try {
				itemCollection = new HashMap<String, Item>();
				String filePath = "./resources/sample.txt";
				File file = new File(filePath);
				Scanner scn = new Scanner(file);

				while (scn.hasNextLine()) {
					
					
					String[] items = scn.nextLine().split("  ");


					// scan line for the itemName String, then the itemDesc String, then itemPrice
					// Double, then availableQuantity Integer
					String itemName = items[0];
					String itemDesc = items[1];
					Double itemPrice = Double.valueOf(items[2]);
					Integer availableQuantity = Integer.valueOf(items[3]);
					

					// enter itemName as key and create a new Item with the above saved variables as
					// value into the itemCollection
					itemCollection.put(itemName, new Item(itemName, itemDesc, itemPrice, availableQuantity));

					// scan document for next line
					scn.nextLine();

				}

			} catch (FileNotFoundException e) {
				System.out.println("FILE NOT FOUND...");
			}

		}
	}

	public HashMap<String, Item> getItemCollection() {
		// Your code here
		return itemCollection;
	}

	public Boolean checkAvailability(Item item) {
		// Your code here
		if (item.getQuantity() >= item.getAvailableQuantity()) {

			System.out.printf("System is unable to add %s to the card. System only has %d %ss", item.getItemName(),
					item.getAvailableQuantity(), item.getItemName());

			return false;
		}
		return true;
	}

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

	public Item remove(String itemName) {
		// Your code here
		if (itemCollection.containsKey(itemName)) {
			return itemCollection.remove(itemName);
		}
		return null;
	}

	public abstract void display();
}
