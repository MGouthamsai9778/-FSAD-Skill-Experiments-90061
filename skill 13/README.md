# Skill 13: Full Stack Application

This skill demonstrates a complete full stack application with backend, database, and frontend.

## Features
- Product management system
- CRUD operations
- H2 in-memory database
- Thymeleaf templates with Bootstrap

## Technologies Used
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database
- Thymeleaf
- Bootstrap 4.5.2
- Java 17

## Running the Application
```bash
mvn spring-boot:run
```

The application will start on port 8083.

Visit http://localhost:8083/products to manage products.

## Database Console
Access H2 console at http://localhost:8083/h2-console
- JDBC URL: jdbc:h2:mem:testdb
- Username: sa
- Password: (leave empty)