# Sample Item Management REST API

This is a simple Spring Boot REST API developed as part of a freelance sample task.  
The application provides REST endpoints to manage items using in-memory storage.

> **Note:** This is a backend-only application and does not include a UI page at the base URL.

---

## Features
- Add a new item
- Get a single item by ID
- Input validation for required fields
- In-memory data storage using ArrayList
- Health check endpoint to verify application status

---

## Tech Stack
- Java 17  
- Spring Boot  
- REST API  
- Maven  
- Docker  

---

## API Endpoints

### 1. Health Check

Used to verify that the application is running.

**GET**
/items/ping


**Live URL**
https://sample-item-api.onrender.com/items/ping

