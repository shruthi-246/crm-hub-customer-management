# CRM Hub – Customer Management System

CRM Hub is a web-based Customer Relationship Management system developed using **Java Spring Boot, MySQL, JDBC, HTML, CSS and JavaScript**.

The application allows users to manage customer information through a simple dashboard.

## 🚀 Features

- 📊 Customer Management Dashboard
- 👤 Add Customer
- 🔍 Search Customers
- ✏️ Edit Customer Details
- 🗑️ Delete Customer
- 📋 View All Customers
- ⚙️ Settings Page
- 🔗 REST API based backend
- 🗄️ MySQL database integration

## 🛠️ Technologies Used

### Frontend
- HTML
- CSS
- JavaScript

### Backend
- Java
- Spring Boot
- Spring JDBC
- JdbcTemplate
- Maven

### Database
- MySQL

### Development Tools
- Visual Studio Code
- Git
- GitHub

## 📁 Project Structure

```text
crm/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── crm/
│   │   │           │   ├── CrmApplication.java
│   │   │           │   ├── controller/
│   │   │           │   │   └── CustomerController.java
│   │   │           │   └── frontend/
│   │   │           │       └── index.html
│   │   │           │
│   │   │           └── repository/
│   │   │               └── CustomerRepository.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       │   └── index.html
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
├── .gitignore
├── mvnw
├── mvnw.cmd
└── README.md
