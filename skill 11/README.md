# Skill 11: REST API Development

This skill demonstrates building a RESTful API using Spring Boot.

## Features
- REST endpoints for User management
- GET /api/users - Get all users
- GET /api/users/{id} - Get user by ID
- POST /api/users - Create a new user

## Technologies Used
- Spring Boot 3.2.0
- Spring Web
- Java 17

## Running the Application
```bash
mvn spring-boot:run
```

The application will start on port 8081.

## Testing the API
You can use tools like Postman or curl to test the endpoints.

Example:
```bash
curl -X GET http://localhost:8081/api/users
```