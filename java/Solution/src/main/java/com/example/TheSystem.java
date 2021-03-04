package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {

	private HashMap<String, Item> itemCollection;

	TheSystem() {
		// Your code here
		this.itemCollection = new HashMap<String, Item>();

		if (getClass().getSimpleName().equals("AppSystem")) {
			// Add items from sample.txt to the itemCollection
			try {
				String filePath = "./resources/samples.txt";
				File file = new File(filePath);
				Scanner scn = new Scanner(file);

				while (scn.hasNextLine()) {

					// tell Scanner to use double space as the delimiter before reading
					scn.useDelimiter("  ");

					// scan line for the itemName String, then the itemDesc String, then itemPrice
					// Double, then availableQuantity Integer
					String itemName = scn.next();
					String itemDesc = scn.next();
					Double itemPrice = scn.nextDouble();
					Integer availableQuantity = scn.nextInt();

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
	}

	public Item remove(String itemName) {
		// Your code here
	}

	public abstract void display();
}
