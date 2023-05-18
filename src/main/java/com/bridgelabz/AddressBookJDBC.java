package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressBookJDBC {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program on JDBC ...");
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/address_book_service", "root", "Swapnil123");
            System.out.println("Connection Done...");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select count(contactType) from address_book where contactType='Family'");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)
                        + " | " + resultSet.getString(2)
                        + " | " + resultSet.getString(3)
                        + " | " + resultSet.getString(4)
                        + " | " + resultSet.getString(5)
                        + " | " + resultSet.getString(6)
                        + " | " + resultSet.getInt(7)
                        + " | " + resultSet.getInt(8)
                        + " | " + resultSet.getString(9)
                        + " | " + resultSet.getString(10));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
