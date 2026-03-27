# 🚀 SpringBoot Job App

## 📌 Project Description

SpringBoot Job App is a backend REST API application developed using Spring Boot.
This project demonstrates CRUD (Create, Read, Update, Delete) operations for managing job listings.

Currently, the application uses in-memory data storage (no database integration), making it suitable for learning backend development concepts and REST API design.

---

## ✨ Features

* ➕ Add new job listings
* 📄 View all jobs
* 🔍 Get job details by ID
* ✏️ Update job information
* ❌ Delete job listings
* 🌐 REST API implementation

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Web
* Maven

---

## ⚠️ Current Limitation

* ❌ No database integration
* ❌ Data stored temporarily (in-memory)
* ❌ Data resets when server restarts

---

## 🏗️ Project Structure

```bash
src/
 ├── controller/
 ├── service/
 ├── model/
 └── repository/ (if present)
```

---

## ⚙️ How to Run the Project

### 🔹 Step 1: Clone Repository

```bash
git clone https://github.com/prasadduvvada/SpringBoot-JobApp.git
```

### 🔹 Step 2: Open in IntelliJ IDEA

* Import as Maven project

### 🔹 Step 3: Run Application

* Run main class (`@SpringBootApplication`)

### 🔹 Step 4: Access APIs

```
http://localhost:8080
```

---

## 📡 API Endpoints

| Method | Endpoint   | Description    |
| ------ | ---------- | -------------- |
| GET    | /jobs      | Get all jobs   |
| GET    | /jobs/{id} | Get job by ID  |
| POST   | /jobs      | Create new job |
| PUT    | /jobs/{id} | Update job     |
| DELETE | /jobs/{id} | Delete job     |

---

## 🧪 Sample JSON

```json
{
  "title": "Java Developer",
  "company": "ABC Pvt Ltd",
  "location": "Hyderabad"
}
```

---

## 🎯 Learning Outcomes

* Understanding REST API development
* Spring Boot project structure
* CRUD operations implementation
* Backend logic design

---

## 🔮 Future Enhancements

* ✅ Add MySQL database integration
* ✅ Use Spring Data JPA
* ✅ Add validation
* ✅ Add Swagger documentation
* ✅ Build frontend using React

---

## 👨‍💻 Author

**Prasad Duvvada**

---

## ⭐ Support

If you like this project, give it a ⭐ on GitHub!
