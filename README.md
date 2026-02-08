# Sample Item Management REST API

A simple Spring Boot REST API for managing items.  
This is a backend-only application created as a sample task and uses in-memory storage (no database).

The project is **live deployed on Render**, so it can be tested directly without cloning or running locally.

----------------------------------------------------------------

FEATURES

- Add a new item
- Fetch item by ID
- Input validation using Jakarta Validation
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
- Render (Cloud Deployment)
- Docker (optional)

----------------------------------------------------------------


LIVE DEPLOYMENT

This project is deployed on **Render** and is publicly accessible.

Base URL:
https://sample-item-api.onrender.com

Health Check:
https://sample-item-api.onrender.com/items/ping

----------------------------------------------------------------

API ENDPOINTS

1) Health Check (Ping)

Method: GET  
URL:
/items/ping

Response:
Application is running

----------------------------------------------------------------

2) Add New Item

Method: POST  
URL:
/items

Example: 
https://sample-item-api.onrender.com/items

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
https://sample-item-api.onrender.com/items/1

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
- Data is reset when the application restarts
- Item IDs are auto-generated using a simple counter

----------------------------------------------------------------

HOW TO TEST (NO SETUP REQUIRED)

- The application is already deployed on Render
- Use browser or Postman to test APIs directly
- No cloning or local setup is required

Example:
https://sample-item-api.onrender.com/items/ping

----------------------------------------------------------------

NOTES

- This project is intended for learning, demo, and freelance sample purposes
- No database integration is included
- Easily extendable with JPA, database, authentication, and security


