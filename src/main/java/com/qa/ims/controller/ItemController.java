package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemsDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

/**
 * Takes in Item details for CRUD functionality
 *
 */
public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = LogManager.getLogger();

	private ItemsDAO itemsDAO;
	private Utils utils;

	public ItemController(ItemsDAO itemsDAO, Utils utils) {
		super();
		this.itemsDAO = itemsDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Item> readAll() {
		List<Item> items = itemsDAO.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}

	/**
	 * Creates a Item by taking in user input
	 */
	@Override
	public Item create() {
		LOGGER.info("Please enter Item name");
		String ItemName = utils.getString();
		LOGGER.info("Please enter the item price");
		String ItemPrice = utils.getString();
		Item item = itemsDAO.create(new Item(ItemName, ItemPrice));
		LOGGER.info("Item created");
		return item;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Item update() {
		LOGGER.info("Please enter the Item_No you would like to update");
		Long Item_No = utils.getLong();
		LOGGER.info("Please enter Item name");
		String ItemName = utils.getString();
		LOGGER.info("Please enter new price");
		String ItemPrice = utils.getString();
		Item item = itemsDAO.update(new Item(Item_No, ItemName, ItemPrice));
		LOGGER.info("Item Updated");
		return item;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the Item_No of the item you would like to delete");
		Long Item_No = utils.getLong();
		return itemsDAO.delete(Item_No);
	}

}
