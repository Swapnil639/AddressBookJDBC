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
            statement.execute("INSERT INTO address_book VALUES('Pushkar','Raj','vashi','vashi','Maharashtra','pushkar@gamil.com','515701','1233456','PR','Business')");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM address_book  ");
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
