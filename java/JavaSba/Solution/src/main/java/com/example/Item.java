package com.example;

public class Item{
    
    
    public Item() {
        // Your code here
    	private String itemName;
    	private String itemDesc;
    	private Double itemPrice;
    	private Integer quantity;
    	private Integer availableQuantity;
    }
    
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        // Your code here
    	this.itemName = itemName;
    	this.itemDesc = itemDesc;
    	this.itemPrice = itemPrice;
    	this.quantity = 1;
    	this.availableQuantity = availableQuantity;
    }
    
    
    
}
