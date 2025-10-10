# 📚 Book Manager API

Простое REST-приложение на **Spring Boot** для управления списком книг.  
Данные хранятся в **PostgreSQL**, проект запускается через **Docker Compose**.  
Используются Lombok, Spring Data JPA и Maven.

---

## 🚀 Быстрый старт

1. Установите [Docker Desktop](https://www.docker.com/products/docker-desktop/).
2. Клонируйте репозиторий:
   git clone https://github.com/lliriq-dev/book-manager-api.git  
   cd bookmanager
3. Запустите проект:
   docker compose up

После запуска API будет доступно по адресу: http://localhost:8080/books

---

## 🧩 API эндпоинты

Метод | Endpoint | Описание
--- | --- | ---
GET | /books | Получить все книги
POST | /books | Добавить новую книгу
GET | /books/{id} | Получить книгу по ID
DELETE | /books/{id} | Удалить книгу по ID

**Пример запроса (POST):**  
URL: http://localhost:8080/books  
Body (JSON): {"title": "Clean Code"}  
Ответ: {"id": 1, "title": "Clean Code"}

---

## 🧱 Используемые технологии

- Java 17
- Spring Boot 3
- PostgreSQL
- Spring Data JPA
- Lombok
- Docker & Docker Compose
- Maven

---

## ⚙️ Переменные окружения (Docker)

Переменная | Значение по умолчанию | Назначение
--- | --- | ---
SPRING_DATASOURCE_URL | jdbc:postgresql://postgres:5432/bookdb | URL подключения к базе
SPRING_DATASOURCE_USERNAME | postgres | Имя пользователя PostgreSQL
SPRING_DATASOURCE_PASSWORD | password | Пароль PostgreSQL
SPRING_JPA_HIBERNATE_DDL_AUTO | update | Автоматическое создание таблиц

Все параметры уже прописаны в `docker-compose.yml`.
