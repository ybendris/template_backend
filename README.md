# Spring Boot 3 JWT Authentication Project Template

Welcome to my Spring Boot 3 JWT Authentication Project Template! This project serves as a foundation for building secure and scalable Java applications with Spring Boot 3 and JWT authentication.

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Usage](#usage)

## Features

- **Java 17**: Utilizes the latest features and improvements in Java programming language.
- **Spring Boot 3**: A powerful and flexible framework for building Java-based enterprise applications.
- **JWT Authentication**: Implements JSON Web Token (JWT) based authentication for secure user access.
- **Modular Structure**: Designed with a modular structure to facilitate project scalability and maintainability.
- **Easy Customization**: Easily extend or modify authentication features to suit your application's needs.

## Prerequisites

Before you begin, ensure you have the following installed:

- [Java 17](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/)

## Getting Started

1. Clone this repository:

    ```bash
    git clone https://github.com/ybendris/template_backend.git
    cd template_backend
    ```

2. Build the project:

    ```bash
    mvn clean install
    ```

3. Run the application:

    ```bash
    java -jar target/backend-0.0.1-SNAPSHOT.jar
    ```

4. Access the application at [http://localhost:8080](http://localhost:8080).

## Configuration

The project can be configured to meet your specific requirements. The configuration files are located in the `src/main/resources` directory.

- `application.yml`: General application configuration.

Modify these files according to your needs, such as database settings, security configurations, or other application properties.

## Usage

This project provides a simple JWT authentication setup. To use this template to start your application, follow these steps:

1. Copy the authentication-related code from this template to your project. 
2. Customize the authentication logic as needed for your application.

Refer to the [Spring Security documentation](https://docs.spring.io/spring-security/site/docs/current/reference/html5/) for more details on customizing and extending authentication features.
