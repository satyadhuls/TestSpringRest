package com.newexample.model;

public class Groceries {
	public int itemNumber;
	public String itemName;
	public String itemType;
	public boolean isFruit;
	
	public Grocery(){
		
	}
	public Grocery(int itemno, String itemName, String itemType, boolean isFruit) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.isFruit = isFruit;
		this.itemNumber=itemno;
	}
	
	
	public Grocery(String itemName, String itemType) {
		this.itemName = itemName;
		this.itemType = itemType;

	}
	

}
