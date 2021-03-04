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
    				
    				
    				// Need to figure out how to read the strings, the double, and integer seperately.
    				String itemName = scn.next
    				
    				String[] itemInfo = scn.nextLine().split("\s ");
    				
    				String itemName = itemInfo[0];
    				String itemDesc = itemInfo[1];
    				Double itemPrice = itemInfo[2];
    				Integer availableQuantity = itemInfo[3];
    				
    				itemCollection.put(itemName, new Item());
    				
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
	}

	public Boolean add(Item item) {
		// Your code here
	}

	public Item remove(String itemName) {
		// Your code here
	}

	public abstract void display();
}
