package org.master2.ensup.kapoor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnec {
	private static Connection connect = null;

	private static Statement statement = null;

	public static void closeConnection() {
		try {
			DbConnec.connect.close();
			DbConnec.statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Statement getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				DbConnec.connect = DriverManager
						.getConnection("jdbc:mysql://localhost/boncoin?user=root&password=");
				DbConnec.statement = DbConnec.connect.createStatement();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Erreur 1" + e);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Erreur 2");
		}

		return DbConnec.statement;
	}
}
