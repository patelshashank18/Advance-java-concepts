/**
 * Employee class
 * Stores employee registration details.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private double salary;

    /**
     * Default constructor.
     */
    public Employee() {
    }

    /**
     * Parameterized constructor.
     */
    public Employee(String firstName, String lastName,
            String email, String phone, double salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    /**
     * Get first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get salary.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Set salary.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}