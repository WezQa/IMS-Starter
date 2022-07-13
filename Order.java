package com.qa.ims.persistence.domain;

public class Order {

	private Long Order_No;

	public Order(Long order_No2) {
		// TODO Auto-generated constructor stub
	}

	public Order(String order_No2) {
		// TODO Auto-generated constructor stub
	}

	public Long getOrder_No() {
		return Order_No;
	}

	public void setOrder_No(Long order_No) {
		Order_No = order_No;
	}

	@Override
	public String toString() {
		return "Order [Order_No=" + Order_No + ", getOrder_No()=" + getOrder_No() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Order_No == null) ? 0 : Order_No.hashCode());
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
		Order other = (Order) obj;
		if (getOrder_No() == null) {
			if (other.getOrder_No() != null)
				return false;
		} else if (!getOrder_No().equals(other.getOrder_No()))
			return false;
		if (Order_No == null) {
			if (other.Order_No != null)
				return false;
		} else if (!Order_No.equals(other.Order_No))
			return false;
		return true;
	}

}
