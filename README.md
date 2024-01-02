# Wordle Clone Application

This repository contains the source code for a Wordle application, a popular word-guessing game. The backend is implemented using Java 17 with Spring Boot 3.2.1, and the frontend is built using Thymeleaf.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

Before you begin, ensure you have the following installed:
- Java JDK (preferred: Java 17 or higher)
- Maven (for dependency management and running the application)

### Installing

**Clone the Repository**

   ```bash
   git clone https://github.com/HSpodynek/Wordle.git
   cd Wordle
   ```
### Build the Project
  Use Maven to build and compile the project:
  ```
mvn clean install
```
### Run the Application

After successfully building the project, you can run it using:
```
mvn spring-boot:run
```
The application will start and be accessible at http://localhost:8080/WordleSPA.html.

## Usage
Once the application is running, navigate to http://localhost:8080/WordleSPA.html in your web browser. You will be presented with the Wordle game interface where you can start playing by guessing words.

## Built With
- **Java 17** - The core programming language used.
- **Spring Boot 3.2.1** - The framework used for easy bootstrapping and development of new Spring applications.
- **Thymeleaf** - Server-side Java template engine for web applications.
- **Maven** - Dependency management and build tool.
