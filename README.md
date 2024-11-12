# PersonAPP Hexa Spring Application

This is a Spring application for managing a database of `personas`, `profesiones`, `estudios`, and `telefonos` using a MongoDB and Maria databases. The application supports basic CRUD operations and is containerized using Docker.

## Prerequisites

Make sure you have the following installed on your machine:

- [Java](https://www.oracle.com/java/technologies/downloads/) (version 11 or above)
- [Docker](https://www.docker.com/get-started) (latest version)

## Running the Application

You can run the application using Docker Compose, which will build the Spring application and set up a Server databases (MongoDB and Maria). The database schema is automatically applied upon container start.

### Steps to Run:

1. **Clone this repository:**

git clone https://github.com/GianlucaGav/personapp-hexa-spring-boot.git
cd <your-repo-directory>


2. **Start the application using Docker Compose:**

docker-compose up --build


This command will:

- Build the Spring application.
- Set up the Server databases.
- Automatically apply the schema and seed some initial data.

3. **Access the Front:**

- Swagger UI will be available at: `http://localhost:3000/swagger-ui/index.html`

## Running the Console CLI

If you prefer, you can also run the application using any IDE that supports Java. The `PersonAppCli` class can be executed to perform CRUD operations directly through the console. This provides a CLI-based interface for managing `personas`, `profesiones`, `estudios`, and `telefonos` without needing to use Docker.

### Steps to Run with an IDE:

1. **Open the Project in Your IDE:**

   Import the project into your preferred IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) and ensure that Java 11 or above is configured.

2. **Run the PersonAppCli Class:**

   Locate the `PersonAppCli` class in the project and run it. This will allow you to interact with the database and perform CRUD operations through the console interface.

3. **Accessing Data:**

   Use the console prompts to create, read, update, or delete entries in the `personas`, `profesiones`, `estudios`, and `telefonos` tables.
