
# 📚 Book Catalog API - Spring Boot Project

Welcome to the **Book Catalog REST API**!  
This Spring Boot app allows you to **Create, Read, Update, and Delete** books using RESTful endpoints.

---

## 🔧 Tech Stack

- ☕ Java 17+
- 🌱 Spring Boot 3.x
- 🐘 Maven
- 🧪 H2 (in-memory database)
- 🔍 Swagger UI (for API testing)
- 🧰 Postman (optional)
- 🖥️ IDE: IntelliJ / VS Code / Eclipse

---

## 🚀 How to Run This Project Locally

### 1️⃣ Clone or Download

```bash
git clone https://github.com/your-username/book-catalog.git
```
Or just unzip the provided `.zip` file.

---

### 2️⃣ Navigate to Project Folder

```bash
cd book-catalog
```

---

### 3️⃣ Run with Maven

If using terminal:

```bash
mvn spring-boot:run
```

Or run the `BookCatalogApplication.java` class in your IDE as a **Java Application**

---

### 4️⃣ Access the API 🎉

Once running, open:

- ✅ Swagger UI:  
  [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

- ✅ REST Endpoints:  
  Example: `GET http://localhost:8080/api/books`

---

## 📬 API Endpoints

| Method | Endpoint              | Description            |
|--------|------------------------|------------------------|
| GET    | `/api/books`           | Get all books          |
| GET    | `/api/books/{id}`      | Get book by ID         |
| POST   | `/api/books`           | Add a new book         |
| PUT    | `/api/books/{id}`      | Update book by ID      |
| DELETE | `/api/books/{id}`      | Delete book by ID      |

---

## 🔄 Sample JSON for POST & PUT

```json
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9780132350884"
}
```

---

## 🧪 Testing APIs with Postman

1. Open Postman
2. Create new request
3. Use the URL `http://localhost:8080/api/books`
4. Set HTTP method (GET, POST, PUT, DELETE)
5. For POST/PUT → go to Body → Raw → JSON → paste sample body

---

## ⚠️ Common Issues

- **Port 8080 already in use?**
  - Change it in `application.properties`:  
    `server.port=8081`

- **Build errors?**  
  Run:
  ```bash
  mvn clean install
  ```

---

## 🙌 Contributing

Pull requests are welcome! If you’d like to improve error handling, validation, or connect a real DB — feel free to fork & PR.

---

## 📃 License

This project is for learning and demo purposes. No license applied.

---

Made with ❤️ using Spring Boot.
