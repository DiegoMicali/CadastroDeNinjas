# CadastroDeNinjas

REST API built with Spring Boot for managing ninja registrations and mission assignments. The project includes a server-side rendered UI using Thymeleaf alongside the full REST interface.

---

## Technologies

- **Java 25**
- **Spring Boot 4.0.2**
- **Spring Data JPA** — repository layer and ORM abstraction
- **Hibernate** — JPA implementation
- **H2 Database** — in-memory relational database
- **Flyway** — database migration versioning
- **Thymeleaf** — server-side HTML rendering
- **Lombok** — boilerplate reduction
- **Maven** — build and dependency management

---

## Architecture

The project follows a layered architecture:

```
Controller  →  Service  →  Repository  →  Database
                  ↕
               Mapper
                  ↕
                DTO
```

- **Controller** — handles HTTP requests, returns responses
- **Service** — business logic layer
- **Repository** — data access via Spring Data JPA
- **Mapper** — converts between entity (Model) and data transfer object (DTO)
- **DTO** — data contracts exposed through the API, decoupled from JPA entities
- **Model** — JPA entities mapped to database tables

---

## Data Model

```
Missoes (1) ──── (N) Ninja
```

A mission can have multiple ninjas. A ninja can be assigned to one mission.

---

## Running the Project

**Prerequisites:** Java 17 and Maven installed.

```bash
./mvnw spring-boot:run
```

The application starts at `http://localhost:8080`.

The H2 console is available at `http://localhost:8080/h2-console`.

---

## REST API

### Ninjas

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/ninjas/criar` | Create a ninja |
| GET | `/ninjas/listar` | List all ninjas |
| GET | `/ninjas/listar/{id}` | Get ninja by ID |
| PUT | `/ninjas/alterar/{id}` | Update ninja by ID |
| DELETE | `/ninjas/deletar/{id}` | Delete ninja by ID |

### Missoes

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/missoes/criar` | Create a mission |
| GET | `/missoes/listar` | List all missions |
| GET | `/missoes/listar/{id}` | Get mission by ID |
| PUT | `/missoes/alterar/{id}` | Update mission by ID |
| DELETE | `/missoes/deletar/{id}` | Delete mission by ID |

**Request body example (Ninja):**
```json
{
  "nome": "Naruto Uzumaki",
  "email": "naruto@konoha.com",
  "imgUrl": "https://example.com/naruto.jpg",
  "idade": 17,
  "rank": "Genin",
  "missoes": {
    "id": 1
  }
}
```

---

## Web UI

A browser interface is available at the routes below:

| Route | Description |
|-------|-------------|
| `/ninjas/ui/listar` | List all ninjas |
| `/ninjas/ui/listar/{id}` | Ninja detail page |
| `/ninjas/ui/adicionar` | Add ninja form |

---

## Project Structure

```
src/main/java/dev/java10x/CadastroDeNinjas/
├── Ninjas/
│   ├── Controller/
│   ├── DTO/
│   ├── Mapper/
│   ├── Model/
│   ├── Repository/
│   └── Service/
├── Missoes/
│   ├── Controller/
│   ├── DTO/
│   ├── Mapper/
│   ├── Model/
│   ├── Repository/
│   └── Service/
src/main/resources/
├── static/css/
├── templates/
│   └── fragments/
└── db/migrations/
```
