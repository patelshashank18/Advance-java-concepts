import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * EmployeeDao class
 * Saves employee data into the database.
 */
public class EmployeeDao {

    /** Database URL */
    private static final String URL =
            "jdbc:mysql://localhost:3306/EmployeeData";

    /** Database username */
    private static final String USER = "root";

    /** Database password */
    private static final String PASSWORD = "root";

    /**
     * Saves employee data into the employee table.
     */
    public boolean saveEmployee(Employee employee) {

        String sql = "INSERT INTO employee "
                   + "(first_name, last_name, email, phone, salary) "
                   + "VALUES (?, ?, ?, ?, ?)";

        try {

            /** Load MySQL JDBC driver */
            Class.forName("com.mysql.cj.jdbc.Driver");

            /** Create database connection */
            Connection connection =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            /** Prepare SQL statement */
            PreparedStatement statement =
                    connection.prepareStatement(sql);

            /** Set employee values */
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.setString(3, employee.getEmail());
            statement.setString(4, employee.getPhone());
            statement.setDouble(5, employee.getSalary());

            /** Execute INSERT query */
            int rows = statement.executeUpdate();

            /** Close resources */
            statement.close();
            connection.close();

            return rows > 0;

        } catch (Exception e) {

            e.printStackTrace();

            return false;
        }
    }
}