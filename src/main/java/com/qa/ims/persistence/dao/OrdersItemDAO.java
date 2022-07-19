package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.domain.OrdersItem;
import com.qa.ims.utils.DBUtils;

public class OrdersItemDAO implements Dao<OrdersItem> {

	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public OrdersItem modelFromResultSet(ResultSet resultSet) throws SQLException {
		Long Order_Items_ID = resultSet.getLong("Order_Items_ID");
		Long OrderNum = resultSet.getLong("OrderNum");
		Long ItemID = resultSet.getLong("ItemID");
		Double Total = resultSet.getDouble("Total");
		Double Quantity = resultSet.getDouble("Quantity");

		return new OrdersItem(Order_Items_ID, OrderNum, ItemID, Total, Quantity);
	}

	/**
	 * Reads all customers from the database
	 * 
	 * @return A list of customers
	 */
	@Override
	public List<OrdersItem> readAll() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM orders_items");) {
			List<OrdersItem> orders_items = new ArrayList<>();
			while (resultSet.next()) {
				orders_items.add(modelFromResultSet(resultSet));
			}
			return orders_items;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}

	public OrdersItem readLatest() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM orders_items ORDER BY id DESC LIMIT 1");) {
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Creates a customer in the database
	 * 
	 * @param customer - takes in a customer object. id will be ignored
	 */
	@Override
	public OrdersItem create(OrdersItem ordersitem) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement(
						"INSERT INTO orders_items(OrderNum, ItemID, Total, Quantity) VALUES (?, ?, ?, ?)");) {
			statement.setLong(1, ordersitem.getOrderNum());
			statement.setLong(2, ordersitem.getItemID());
			statement.setDouble(3, ordersitem.getTotal());
			statement.setDouble(4, ordersitem.getQuantity());
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public OrdersItem read(Long Order_Items_ID) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("SELECT * FROM orders_items WHERE Order_Items_ID = ?");) {
			statement.setLong(1, Order_Items_ID);
			try (ResultSet resultSet = statement.executeQuery();) {
				resultSet.next();
				return modelFromResultSet(resultSet);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Updates a customer in the database
	 * 
	 * @param customer - takes in a customer object, the id field will be used to
	 *                 update that customer in the database
	 * @return
	 */
	@Override
	public OrdersItem update(OrdersItem ordersitem) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement(
						"UPDATE orders_items SET OrderNum = ?, ItemID = ?,  Total = ?, Quantity = ? WHERE orders_items = ?");) {
			statement.setLong(1, ordersitem.getOrderNum());
			statement.setLong(2, ordersitem.getItemID());
			statement.setDouble(3, ordersitem.getTotal());
			statement.setDouble(4, ordersitem.getQuantity());
			statement.executeUpdate();
			return read(ordersitem.getOrder_Items_ID());
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Deletes a customer in the database
	 * 
	 * @param id - id of the customer
	 */
	@Override
	public int delete(long Order_Items_ID) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("DELETE FROM orders_items WHERE Order_Items_ID = ?");) {
			statement.setLong(1, Order_Items_ID);
			return statement.executeUpdate();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return 0;
	}

}
