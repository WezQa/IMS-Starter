package com.qa.ims.persistence.domain;

public class Order {

	private Long OrderNum;
	private Long id;

	public Order(Long id, Long OrderNum) {
		super();
		this.id = id;
		this.OrderNum = OrderNum;
	}

	/**
	 * @return the orderNum
	 */
	public Long getOrderNum() {
		return OrderNum;
	}

	/**
	 * @param orderNum the orderNum to set
	 */
	public void setOrderNum(Long orderNum) {
		OrderNum = orderNum;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Order [OrderNum=" + OrderNum + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OrderNum == null) ? 0 : OrderNum.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Order other = (Order) obj;
		if (getOrderNum() == null) {
			if (other.getOrderNum() != null)
				return false;
		} else if (!getOrderNum().equals(other.getOrderNum()))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}