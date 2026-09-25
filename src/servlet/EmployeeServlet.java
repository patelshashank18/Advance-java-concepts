package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.EmployeeDao;

/**
 * Servlet to handle Employee Registration form submission.
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {

        /**
         * Handles POST request from Employee Registration form.
         *
         * @param request  HTTP request
         * @param response HTTP response
         * @throws ServletException if servlet error occurs
         * @throws IOException      if input/output error occurs
         */
        protected void doPost(
                        HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {

                String firstname = request.getParameter("firstname");

                String lastname = request.getParameter("lastname");

                String username = request.getParameter("username");

                String password = request.getParameter("password");

                String address = request.getParameter("address");

                String contactNo = request.getParameter("contactNo");

                EmployeeDao employeeDao = new EmployeeDao();

                employeeDao.registerEmployee(
                                firstname,
                                lastname,
                                username,
                                password,
                                address,
                                contactNo);

                response.setContentType("text/html");

                response.getWriter().println(
                                "<h2>Employee Registered Successfully</h2>");
        }

}
