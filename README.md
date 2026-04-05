# Skill-6: Spring MVC Web Request Handling Demo

| Field   | Details                                             |
|---------|-----------------------------------------------------|
| Student | Ch. Venkata Sai Nikesh                              |
| ID      | 2400080138                                          |
| Section | 51                                                  |
| GitHub  | https://github.com/NIkesh7474/FSAD-Skill-6          |

---

## Aim

To create a Spring Boot MVC controller (LibraryController) that exposes multiple REST endpoints demonstrating @GetMapping, @PostMapping, @PathVariable, @RequestParam, and @RequestBody for an online library system.

---

## What is This Project?

This project is a Spring Boot REST API for an online library system.

Each endpoint handles a different type of HTTP request and returns different types of data (String, int, double, List, or JSON object). All endpoints are tested using Postman.

---

## Key Annotations

| Annotation      | Purpose                                        |
|-----------------|------------------------------------------------|
| @RestController | Marks class as REST API controller             |
| @GetMapping     | Handles HTTP GET requests                      |
| @PostMapping    | Handles HTTP POST requests                     |
| @PathVariable   | Reads value from the URL path                  |
| @RequestParam   | Reads value from URL query string              |
| @RequestBody    | Reads JSON from request body                   |

---

## Project Structure
```
FullStack-Skill-6/
├── src/
│   └── main/
│       ├── java/com/fsad/mvc/
│       │   ├── Book.java
│       │   ├── LibraryController.java
│       │   └── LibraryMvcApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

---

## Tech Stack

| Technology  | Version | Purpose                   |
|-------------|---------|---------------------------|
| Java        | 17      | Programming language       |
| Spring Boot | 3.2.0   | Auto-configuration         |
| Spring MVC  | 6.x     | REST controller handling   |
| Maven       | 3.x     | Build and dependency tool  |
| Postman     | -       | API testing tool           |

---

## All Endpoints

| Method | Endpoint        | Type          | Returns              |
|--------|-----------------|---------------|----------------------|
| GET    | /welcome        | String        | Welcome message      |
| GET    | /count          | int           | Total books (150)    |
| GET    | /price          | double        | Price (499.99)       |
| GET    | /books          | List          | All book titles      |
| GET    | /books/{id}     | PathVariable  | Book details by ID   |
| GET    | /search?title=  | RequestParam  | Search confirmation  |
| GET    | /author/{name}  | PathVariable  | Books by author      |
| POST   | /addbook        | RequestBody   | Adds book to memory  |
| GET    | /viewbooks      | List          | All added books JSON |

---

## Expected Postman Output

### GET /welcome
```
"Welcome to the Online Library System!"
```

### GET /count
```
150
```

### GET /price
```
499.99
```

### GET /books
```json
["Clean Code","Effective Java","Spring in Action","Design Patterns"]
```

### GET /books/3
```
"Book ID: 3 | Title: Spring Boot in Practice"
```

### GET /search?title=Java
```
"Search result for: Java"
```

### GET /author/RobertMartin
```
"Books by author: RobertMartin"
```

### POST /addbook
```json
{"id":101,"title":"Spring MVC Deep Dive","author":"Craig Walls","price":799.00}
```
**Response:** `"Book added: Spring MVC Deep Dive"`

### GET /viewbooks
```json
[{"id":101,"title":"Spring MVC Deep Dive","author":"Craig Walls","price":799.0}]
```

---

## How to Run

**Step 1** — Open Eclipse

**Step 2** — Import project
```
File -> Import -> Maven -> Existing Maven Projects -> Finish
```

**Step 3** — Run the app
```
Right click project -> Run As -> Maven build...
Goal: spring-boot:run -> Click Run
```

**Step 4** — App starts at `http://localhost:8080`

**Step 5** — Test with Postman

---

## Tasks Completed

- [x] Task 1  - Created LibraryController with @RestController
- [x] Task 2  - GET /welcome returns String
- [x] Task 3  - GET /count returns int 150
- [x] Task 4  - GET /price returns double 499.99
- [x] Task 5  - GET /books returns List of book titles
- [x] Task 6  - GET /books/{id} uses @PathVariable
- [x] Task 7  - GET /search uses @RequestParam
- [x] Task 8  - GET /author/{name} uses @PathVariable
- [x] Task 9  - POST /addbook uses @RequestBody
- [x] Task 10 - GET /viewbooks returns all added books
- [x] Task 11 - Project pushed to GitHub

---

## Git Commands
```cmd
cd C:\Users\HP\Downloads\FullStack-Skill-6\FullStack-Skill-6

git init
git add .
git commit -m "Skill6: Spring MVC LibraryController - all endpoints"
git remote add origin https://github.com/NIkesh7474/FSAD-Skill-6
git branch -M main
git push -u origin main --force
```
