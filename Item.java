package com.qa.ims.persistence.domain;

public class Item {

	private Long ItemID;
	private String Item;
	private String Price;

	public Item(String Item, String Price) {
		this.setItem(Item);
		this.setPrice(Price);
	}

	public Item(Long ItemID, String Item, String Price) {
		this.setItemID(ItemID);
		this.setItem(Item);
		this.setPrice(Price);
	}

	public Long getItemID() {
		return ItemID;
	}

	public void setItemID(Long itemID) {
		ItemID = itemID;
	}

	public String getItem() {
		return Item;
	}

	public void setItem(String item) {
		Item = item;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Item No.:" + ItemID + " Item name:" + Item + " Price:" + Price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Item == null) ? 0 : Item.hashCode());
		result = prime * result + ((ItemID == null) ? 0 : ItemID.hashCode());
		result = prime * result + ((Price == null) ? 0 : Price.hashCode());
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
		if (getItem() == null) {
			if (other.getItem() != null)
				return false;
		} else if (!getItem().equals(other.getItem()))
			return false;
		if (ItemID == null) {
			if (other.ItemID != null)
				return false;
		} else if (!ItemID.equals(other.ItemID))
			return false;
		if (Price == null) {
			if (other.Price != null)
				return false;
		} else if (!Price.equals(other.Price))
			return false;
		return true;
	}

}
