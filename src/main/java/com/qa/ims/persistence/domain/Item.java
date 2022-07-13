package com.qa.ims.persistence.domain;

public class Item {

	private Long Item_No;
	private String ItemName;
	private String ItemPrice;

	public Item(String ItemName, String ItemPrice) {
		this.setItemName(ItemName);
		this.setItemPrice(ItemPrice);
	}

	public Item(Long Item_no, String ItemName, String ItemPrice) {
		this.setItem_No(Item_No);
		this.setItemName(ItemName);
		this.setItemPrice(ItemPrice);
	}

	public Long getItem_No() {
		return Item_No;
	}

	public void setItem_No(Long item_No) {
		Item_No = item_No;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(String itemPrice) {
		ItemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Item No.:" + Item_No + " Item name:" + ItemName + " Price:" + ItemPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ItemName == null) ? 0 : ItemName.hashCode());
		result = prime * result + ((Item_No == null) ? 0 : Item_No.hashCode());
		result = prime * result + ((ItemPrice == null) ? 0 : ItemPrice.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (getItemName() == null) {
			if (other.getItemName() != null)
				return false;
		} else if (!getItemName().equals(other.getItemName()))
			return false;
		if (Item_No == null) {
			if (other.Item_No != null)
				return false;
		} else if (!Item_No.equals(other.Item_No))
			return false;
		if (ItemPrice == null) {
			if (other.ItemPrice != null)
				return false;
		} else if (!ItemPrice.equals(other.ItemPrice))
			return false;
		return true;
	}

}
