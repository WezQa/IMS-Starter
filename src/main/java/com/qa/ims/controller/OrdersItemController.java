package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrdersItemDAO;
import com.qa.ims.persistence.domain.OrdersItem;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class OrdersItemController implements CrudController<OrdersItem> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrdersItemDAO OrdersItemDAO;
	private Utils utils;

	public OrdersItemController(OrdersItemDAO ordersitemDAO, Utils utils) {
		super();
		this.OrdersItemDAO = ordersitemDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<OrdersItem> readAll() {
		List<OrdersItem> orders_items = OrdersItemDAO.readAll();
		for (OrdersItem ordersitem : orders_items) {
			LOGGER.info(ordersitem);
		}
		return orders_items;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public OrdersItem create() {
		LOGGER.info("Please enter Order Number");
		Long OrderNum = utils.getLong();
		LOGGER.info("Please ItemID");
		long ItemID = utils.getLong();
		LOGGER.info("Please enter total");
		double Total = utils.getDouble();
		LOGGER.info("Please enter quantity");
		double Quantity = utils.getDouble();
		OrdersItem ordersitem = OrdersItemDAO.create(new OrdersItem(OrderNum, ItemID, Total, Quantity));
		LOGGER.info("OrderItem created");
		return ordersitem;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public OrdersItem update() {
		LOGGER.info("Please enter OrderItems Number yuo would like to update");
		Long Order_Items_ID = utils.getLong();
		LOGGER.info("Please ItemID");
		long ItemID = utils.getLong();
		LOGGER.info("Please enter total");
		double Total = utils.getDouble();
		LOGGER.info("Please enter quantity");
		Double Quantity = utils.getDouble();
		OrdersItem ordersitems = OrdersItemDAO.update(new OrdersItem(Order_Items_ID, ItemID, Total, Quantity));
		LOGGER.info("OrderItems Updated");
		return ordersitems;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the Order_Items_ID of the customer you would like to delete");
		Long Order_Items_ID = utils.getLong();
		return OrdersItemDAO.delete(Order_Items_ID);
	}

}
