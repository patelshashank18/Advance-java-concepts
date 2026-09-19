package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * DAO class to save Employee data into the database.
 */
public class EmployeeDao {

        private static final String URL = "jdbc:mysql://localhost:3306/EmployeeDB";

        private static final String USER = "root";

        private static final String PASSWORD = "root";

        /**
         * Saves employee registration data into MySQL database.
         *
         * @param firstname employee first name
         * @param lastname  employee last name
         * @param username  employee username
         * @param password  employee password
         * @param address   employee address
         * @param contactNo employee contact number
         */
        public void registerEmployee(
                        String firstname,
                        String lastname,
                        String username,
                        String password,
                        String address,
                        String contactNo) {

                String sql = "INSERT INTO employee "
                                + "(Firstname, Lastname, Username, Password, Address, `Contact No`) "
                                + "VALUES (?, ?, ?, ?, ?, ?)";

                try {

                        Class.forName("com.mysql.cj.jdbc.Driver");

                        Connection connection = DriverManager.getConnection(
                                        URL,
                                        USER,
                                        PASSWORD);

                        PreparedStatement statement = connection.prepareStatement(sql);

                        statement.setString(1, firstname);
                        statement.setString(2, lastname);
                        statement.setString(3, username);
                        statement.setString(4, password);
                        statement.setString(5, address);
                        statement.setString(6, contactNo);

                        statement.executeUpdate();

                        statement.close();
                        connection.close();

                } catch (Exception e) {

                        e.printStackTrace();
                }
        }
}
