# 📚 Book Manager API

Simple REST API for managing books, built with **Spring Boot 3** and **Lombok**.

---

## 🧩 Tech Stack
- Java 17
- Spring Boot 3
- Lombok
- Maven

---

## 🚀 Run locally

```bash
mvn spring-boot:run

Server runs at:
👉 http://localhost:8080

## 🔥 Example API calls

➕ Add book
POST /books

{ "title": "Effective Java" }

📚 Get all books

GET /books

❌ Delete book

DELETE /books/{id}