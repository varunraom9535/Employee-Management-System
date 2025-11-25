Employee Management System (EMS)
Spring Boot | Thymeleaf | MVC | MySQL
📌 Overview

The Employee Management System (EMS) is a production-ready, enterprise-level Spring Boot CRUD Application designed to manage employee data efficiently.

It is built using:
✔ Spring Boot
✔ Spring MVC
✔ Spring Data JPA
✔ Thymeleaf
✔ MySQL

This system demonstrates clean architecture, modular design, reusable layers, and scalable coding standards inspired by 10+ years of backend development experience.

✨ Features
✔ Add New Employee

Create new employee records using a clean, user-friendly UI.

✔ View All Employees

Displays all employees in a structured table format.

✔ Update Employee Details

Edit existing employee information with form validation.

✔ Delete Employee

Remove an employee safely using ID-based deletion.

✔ MVC + Service Layer Architecture

Strict separation of Controller → Service → Repository for clean code and testability.

✔ MySQL Integration

Fully configured with Spring Data JPA + Hibernate.

✔ Reusable Templates

Thymeleaf templates for dynamic, SEO-friendly frontend pages.

📡 Controller Endpoints (Implemented in Your Code)
HTTP Method	Endpoint	Description
GET	/	Displays all employees (Home Page)
GET	/showNewEmployeeForm	Shows form to add new employee
POST	/saveEmployee	Saves employee to DB
GET	/showFormForUpdate/{id}	Loads update form for employee
GET	/delete/{id}	Deletes employee by ID
📁 Project Structure
EmployeeManagementSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/EMS/
│   │   │       ├── controller/                 # Spring MVC Controllers
│   │   │       │   └── EmployeeController.java
│   │   │       ├── entity/                     # JPA Entities
│   │   │       │   └── Employee.java
│   │   │       ├── repository/                 # Spring Data Repositories
│   │   │       │   └── EmployeeRepository.java
│   │   │       └── service/                    # Service Layer
│   │   │           ├── EmployeeService.java
│   │   │           └── EmployeeServiceImpl.java
│   │   └── resources/
│   │       ├── templates/                      # Thymeleaf Pages
│   │       │   ├── index.html
│   │       │   ├── new_employee.html
│   │       │   └── update_employee.html
│   │       └── application.properties           # DB Configuration
│   └── test/                                    # Unit Tests
├── pom.xml                                       # Maven Dependencies
└── README.md                                     # Documentation

🛠 Tech Stack

Java 17+

Spring Boot 3.x

Spring MVC

Spring Data JPA / Hibernate

Thymeleaf

MySQL Database

Maven

Lombok

🚀 Setup Instructions
1️⃣ Clone the Repository
git clone https://github.com/your-username/Employee-Management-System.git
cd Employee-Management-System

2️⃣ Configure MySQL

Update the application.properties file:

spring.datasource.url=jdbc:mysql://localhost:3306/emsdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

3️⃣ Run the Application
mvn spring-boot:run

4️⃣ Open in Browser
http://localhost:8080/
