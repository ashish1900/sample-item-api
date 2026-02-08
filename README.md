# Sample Item Management REST API

A simple Spring Boot REST API for managing items.  
This is a backend-only application created as a sample task and uses in-memory storage (no database).

Note: This project does not include any UI. All operations are performed via REST APIs only.

----------------------------------------------------------------

FEATURES

- Add a new item
- Fetch item by ID
- In-memory data storage using ArrayList
- Health check API to keep the service alive on free hosting platforms
- Clean layered architecture (Controller, Service, Model)

----------------------------------------------------------------

TECH STACK

- Java 17
- Spring Boot
- Spring Web (REST API)
- Jakarta Validation
- Lombok
- Maven
- Docker (optional)



----------------------------------------------------------------

API ENDPOINTS

1) Health Check (Ping)

Method: GET  
URL:
/items/ping

Response:
Application is running

Live URL:
https://sample-item-api.onrender.com/items/ping

----------------------------------------------------------------

2) Add New Item

Method: POST  
URL:
/items

Request Body (JSON):
{
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "category": "Electronics"
}

Validation Rules:
- name is mandatory and cannot be blank

Success Response: 201 CREATED

{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "category": "Electronics"
}

----------------------------------------------------------------

3) Get Item By ID

Method: GET  
URL:
/items/{id}

Example:
/items/1

Success Response: 200 OK

{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop",
  "price": 75000,
  "category": "Electronics"
}

If Item Not Found:
404 NOT FOUND

----------------------------------------------------------------

DATA STORAGE

- Uses in-memory storage (ArrayList)
- Data is lost when the application restarts
- Item IDs are auto-generated using a simple counter

----------------------------------------------------------------

HOW TO RUN LOCALLY

1. Clone the repository
2. Open the project in IDE (IntelliJ / Eclipse / VS Code / STS)
3. Run the Spring Boot application
4. Test APIs using Postman or browser

Local URL:
https://sample-item-api.onrender.com/items

----------------------------------------------------------------

NOTES

- This project is intended for learning, demo, and freelance sample purposes
- No database integration is included
- Can be easily extended with JPA, database, authentication, and security


