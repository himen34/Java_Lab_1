# Lab 1

Made by Khylia Ivan, IP-22, variant 24

## How to run the project

To run this project, you need to have [Maven](https://maven.apache.org/) installed on your computer. Follow the steps below to get started:

### 1. Clone the repository:

```bash
git clone https://github.com/himen34/Java_Lab_1.git
cd Java_Lab_1
```

### 2. Build the project (this will also run unit tests):

```bash
mvn package
```

### 3. Run the project:

```bash
mvn clean compile exec:java
```

### 4. Run unit tests:

```bash
mvn test
```

## Requirements

- Java 17 or higher
- Maven 3.6.0 or higher

## Project description

This project demonstrates matrix operations, including matrix multiplication and finding the sum of the largest elements in each column. The project is structured as follows:
- **Matrix operations** are implemented in the `MatrixOperations` class.
- Unit tests are written with **JUnit 5** to verify the correctness of the matrix operations.

For more details on how to run the project or tests, follow the steps mentioned above.
