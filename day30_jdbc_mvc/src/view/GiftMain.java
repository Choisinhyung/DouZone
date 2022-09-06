package view;

import java.sql.SQLException;

import controller.GiftController;

public class GiftMain {

	public static void main(String[] args) throws SQLException {
		
		GiftController.connect();
		GiftController.menu();
	}

}
