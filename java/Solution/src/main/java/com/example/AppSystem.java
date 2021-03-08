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
			
			System.out.printf("%-20s %-20s %-10.2f %-10d%n",
					itemCollection.get(item.toString()).getItemName(),
					itemCollection.get(item.toString()).getItemDesc(),
					itemCollection.get(item.toString()).getItemPrice(),
					itemCollection.get(item.toString()).getAvailableQuantity());
			System.out.println();
		}
    	
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        // Your code here
    	return true;
    }

    public Item reduceAvailableQuantity(String item_name) {
        // Your code here
    	if(!itemCollection.containsKey(item_name)) {
			return null;
		}
    	else if( itemCollection.get(item_name).getAvailableQuantity() == 0 ) {
    		itemCollection.remove(item_name);
    		return null;
    	}
    	Item setItem = itemCollection.get(item_name);
    	setItem.setAvailableQuantity(setItem.getAvailableQuantity() - 1);
    	itemCollection.remove(item_name);
    	itemCollection.put(item_name, setItem);
		return setItem;
    }
    
}
