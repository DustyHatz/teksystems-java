package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
   
	HashMap<String, Item> itemCollection;

    TheSystem() {
        // Your code here
    	this.itemCollection = new HashMap<String, Item>();
    }
    
    public HashMap<String, Item> getItemCollection(){
        // Your code here
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
