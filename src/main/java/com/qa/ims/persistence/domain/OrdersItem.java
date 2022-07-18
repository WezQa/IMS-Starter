package com.qa.ims.persistence.domain;

import java.util.Objects;

public class OrdersItem {

	private long Order_Items_ID;
	private long Order_No;
	private long ItemID;
	private double Total;
	private int Quantity;

	public OrdersItem(long Order_No, long ItemID, double Total, int Quantity) {
		this.Order_No = (Order_No);
		this.ItemID = (ItemID);
		this.Total = (Total);
		this.Quantity = (Quantity);

	}

	public OrdersItem(long Orders_Items_ID, long Order_No, long ItemID, double Total, int Quantity) {
		this.Order_Items_ID = Orders_Items_ID;
		this.Order_No = (Order_No);
		this.ItemID = (ItemID);
		this.Total = (Total);
		this.Quantity = (Quantity);
	}

	public long getOrder_Items_ID() {
		return Order_Items_ID;
	}

	public void setOrder_Items_ID(long order_Items_ID) {
		Order_Items_ID = order_Items_ID;
	}

	public long getOrder_No() {
		return Order_No;
	}

	public void setOrder_No(long order_No) {
		Order_No = order_No;
	}

	public long getItemID() {
		return ItemID;
	}

	public void setItemID(long itemID) {
		ItemID = itemID;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrdersItem [Order_Items_ID=" + Order_Items_ID + ", Order_No=" + Order_No + ", ItemID=" + ItemID
				+ ", Total=" + Total + ", Quantity=" + Quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ItemID, Order_Items_ID, Order_No, Quantity, Total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdersItem other = (OrdersItem) obj;
		return ItemID == other.ItemID && Order_Items_ID == other.Order_Items_ID && Order_No == other.Order_No
				&& Quantity == other.Quantity && Double.doubleToLongBits(Total) == Double.doubleToLongBits(other.Total);
	}

}
