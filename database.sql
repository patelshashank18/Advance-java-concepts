/** Create EmployeeData database  */

CREATE DATABASE EmployeeData;


/** Select EmployeeData database  */

USE EmployeeData;


    /** Create employee table  */

    CREATE TABLE employee (
    
    /** Employee unique ID */
    id INT PRIMARY KEY AUTO_INCREMENT,

    /** Employee first name */
    first_name VARCHAR(50),

    /** Employee last name */
    last_name VARCHAR(50),

    /** Employee email address */
    email VARCHAR(100),

    /** Employee phone number must be unique */
    phone VARCHAR(20) UNIQUE,

    /** Employee salary */
    salary DOUBLE
);


/**     Display all employee records     */

SELECT * FROM employee;