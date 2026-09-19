# Practical 27 – Employee Registration

A simple **Employee Registration Web Application** developed using **Java Servlet, JSP, JDBC, and MySQL**.

The application allows a user to enter employee details through a JSP registration form. The submitted data is handled by a Servlet and stored in a MySQL database using a DAO class.

---

## Project Overview

This project demonstrates a basic Java web application using the following flow:

```
JSP Registration Form
        ↓
EmployeeServlet
        ↓
EmployeeDao
        ↓
JDBC
        ↓
MySQL Database

---

## Technologies Used

* Java
* JSP
* Servlet
* JDBC
* MySQL
* Apache Tomcat
* HTML
* Git / GitHub

---

## Project Structure


Advance-java-concepts
│
├── lib
│   └── mysql-connector-j.jar
│
├── README.md
│
├── src
│    ├── dao
│      └── EmployeeDao.java
│    └── servlet
│      └── EmployeeServlet.java
│
└── WebContent
    ├── employee-registration.jsp
    │
    └── WEB-INF
        └── web.xml

---

## Features

* Employee registration form
* First name input
* Last name input
* Username input
* Password input
* Address input
* Contact number input
* Servlet-based form processing
* JDBC database connection
* Employee data stored in MySQL

---

## Database

### Database Name


EmployeeDB


### Table Name


employee

### Table Columns

| Column     | Data Type    | Description                    |
| ---------- | ------------ | ------------------------------ |
| id         | INT          | Primary key and auto increment |
| Firstname  | VARCHAR(100) | Employee first name            |
| Lastname   | VARCHAR(100) | Employee last name             |
| Username   | VARCHAR(100) | Employee username              |
| Password   | VARCHAR(100) | Employee password              |
| Address    | VARCHAR(255) | Employee address               |
| Contact No | VARCHAR(20)  | Employee contact number        |

---

## Database Setup

Open MySQL and run the SQL file:


sql/employee.sql

Or execute:


CREATE DATABASE IF NOT EXISTS EmployeeDB;

USE EmployeeDB;

CREATE TABLE IF NOT EXISTS employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    Firstname VARCHAR(100) NOT NULL,
    Lastname VARCHAR(100) NOT NULL,
    Username VARCHAR(100) NOT NULL,
    Password VARCHAR(100) NOT NULL,
    Address VARCHAR(255),
    `Contact No` VARCHAR(20)
);


---

## MySQL Configuration

The application currently uses the following database configuration in `EmployeeDao.java`:


Database URL: jdbc:mysql://localhost:3306/EmployeeDB
Username: root
Password: root

If your MySQL username or password is different, update these values in:


src/com/Employee/dao/EmployeeDao.java


---

## Application Flow

### 1. Employee Registration Form

The registration form is located at:


WebContent/employee-registration.jsp


The form sends employee information using a `POST` request:


/register


---

### 2. EmployeeServlet

The Servlet receives the form data.


request.getParameter("firstname");
request.getParameter("lastname");
request.getParameter("username");
request.getParameter("password");
request.getParameter("address");
request.getParameter("contactNo");


The Servlet then passes the data to `EmployeeDao`.

---

### 3. EmployeeDao

`EmployeeDao.java` handles database operations.

It:

1. Loads the MySQL JDBC driver.
2. Creates a database connection.
3. Creates a `PreparedStatement`.
4. Inserts employee information into the `employee` table.
5. Closes the database resources.

---

## JDBC Insert Query

The application uses the following SQL operation:


INSERT INTO employee
(Firstname, Lastname, Username, Password, Address, `Contact No`)
VALUES (?, ?, ?, ?, ?, ?);


`PreparedStatement` is used to pass the form values to the query.

---

## Required Software

Before running the project, install:

* Java JDK
* MySQL Server
* Apache Tomcat 9
* Git
* A Java IDE or VS Code

---

## MySQL Connector

The project contains the MySQL JDBC driver:


lib/mysql-connector-j.jar


This JAR is required for the Java application to connect to MySQL.

---

## Running the Application

### Step 1 – Start MySQL

Make sure the MySQL server is running.

### Step 2 – Create the Database

Execute:


sql/employee.sql


### Step 3 – Configure Database Credentials

Check:


src/com/Employee/dao/EmployeeDao.java


Make sure the following values match your MySQL configuration:


URL
USER
PASSWORD


### Step 4 – Deploy the Project to Tomcat

Copy/deploy the project to Apache Tomcat.

Start the Tomcat server.

### Step 5 – Open the Application

Open the application in a browser using the appropriate Tomcat URL.

For example:


http://localhost:8080/EmployeeRegistration/employee-registration.jsp


The exact URL depends on the deployed application/context name.

---

## Registration Process


User opens employee-registration.jsp
            ↓
User enters employee details
            ↓
User clicks Register
            ↓
POST /register
            ↓
EmployeeServlet receives data
            ↓
EmployeeDao.registerEmployee()
            ↓
JDBC Connection
            ↓
INSERT INTO employee
            ↓
Employee data stored in MySQL
            ↓
"Employee Registered Successfully"


---

## Important Files

### `employee-registration.jsp`

Contains the employee registration form.

### `EmployeeServlet.java`

Handles the HTTP POST request and receives form data.

### `EmployeeDao.java`

Handles the database connection and employee insertion.

### `employee.sql`

Creates the database and employee table.

### `web.xml`

Contains the web application configuration.

---

## Learning Objectives

This practical demonstrates:

* JSP form creation
* HTML form fields
* HTTP POST request
* Servlet request handling
* `HttpServlet`
* `doPost()`
* `request.getParameter()`
* DAO pattern
* JDBC
* `Connection`
* `PreparedStatement`
* MySQL database connectivity
* SQL `INSERT`
* Tomcat deployment

---

## Author

**Employee Registration – Practical 27**
