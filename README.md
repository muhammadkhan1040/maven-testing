# CI/Continuous Testing Project - Calculator Application

This repository was created as part of the **Continuous Integration and Testing** university group project. 

The goal of this project was to set up a fully automated CI environment that responds to developer pushes by automatically building a Java application and running automated Unit Tests and Integration Tests.

## Tech Stack & CI Components Used

* **Application Language:** Java 17
* **Build Tool:** Apache Maven
* **Testing Framework:** JUnit 5 (Jupiter), Maven Surefire Plugin (Unit Tests), Maven Failsafe Plugin (Integration Tests)
* **Version Control:** Git (managed via Eclipse EGit / CMD)
* **Version Control Server:** GitHub
* **Continuous Integration (CI) Tool:** GitHub Actions

## Development Process: Test-Driven Development (TDD)

To meet the project requirements, our team followed an Agile **Test-Driven Development (TDD)** methodology. The codebase was developed in phases to prove this methodology:

1. **The Failing Run:** We first wrote Unit Tests for the Calculator features (`add`, `subtract`, `multiply`, `divide`). Because the actual implementation methods only returned dummy values (`0`), the CI pipeline and tests **failed** initially. This ensures our tests are actually validating logic.
2. **The Passing Run:** After validating the failure, we implemented the actual Calculator logic. When pushed, the GitHub Actions CI pipeline ran the Maven build and successfully passed all Unit and Integration tests.

## Application Features
To demonstrate the environment, we built a modular `Calculator` class. It features:
* Basic arithmetic: Addition, Subtraction, Multiplication, Division.
* Advanced statistical features: Mean Average and Sample Standard Deviation calculations.

The Unit tests guarantee that each individual method works as intended, while the *Integration Tests (`CalculatorIT.java`)* ensure that building complex data arrays with basic operations and then passing them into the statistical methods works seamlessly as an integrated system. We also utilized parameterized tests to ensure there are no hard-coded values in the test suite.

## How to Run Locally

If you clone this repository, you can run the entire test suite locally using Maven:

1. Ensure **Java 17** and **Maven** are installed.
2. Open a terminal in the project root directory.
3. Run the following command:
   ```bash
   mvn clean verify
   ```
This will compile the application, run the localized Unit Tests (`Surefire`), bundle the JAR, and then run the Integration Tests (`Failsafe`). 

## Group Contribution Statement
This repository represents the collaborative work of our 4-person team. Each member cloned the repository, configured the local IDE tools (like Eclipse), authored tests, and individually committed code to trigger the Continuous Integration pipeline on GitHub. Screen recordings were captured by all members to document our unified understanding of the CI infrastructure.
