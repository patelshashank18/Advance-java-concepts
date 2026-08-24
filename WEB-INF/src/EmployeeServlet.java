import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * EmployeeServlet class
 * Handles employee registration requests.
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {

    /**
     * Handles POST request from employee registration form.
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        /** Get form parameters */
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        double salary = Double.parseDouble(
                request.getParameter("salary"));

        /** Create Employee object */
        Employee employee = new Employee(
                firstName,
                lastName,
                email,
                phone,
                salary);

        /** Create DAO object */
        EmployeeDao employeeDao = new EmployeeDao();

        /** Save employee data */
        boolean result = employeeDao.saveEmployee(employee);

        /** Set response type */
        response.setContentType("text/html");

        /** Create response writer */
        PrintWriter out = response.getWriter();

        if (result) {

            out.println("<html>");
            out.println("<body>");

            out.println("<h2>Employee Registered Successfully!</h2>");

            out.println("<p>First Name: " + firstName + "</p>");
            out.println("<p>Last Name: " + lastName + "</p>");
            out.println("<p>Email: " + email + "</p>");
            out.println("<p>Phone: " + phone + "</p>");
            out.println("<p>Salary: " + salary + "</p>");

            out.println("</body>");
            out.println("</html>");

        } else {

            out.println("<html>");
            out.println("<body>");

            out.println("<h2>Employee Registration Failed!</h2>");

            out.println("</body>");
            out.println("</html>");
        }
    }
}