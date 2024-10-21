# 🛡️ CS 305 - Secure Software Practices for Artemis Financial

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![License](https://img.shields.io/badge/license-MIT-green?style=for-the-badge)

---

## 📑 Table of Contents

1. [📖 Project Overview](#project-overview)
2. [⚙️ Key Features](#key-features)
3. [🗂️ Project Structure](#project-structure)
4. [📸 Screenshots](#screenshots)
5. [🔍 Vulnerability Assessment](#vulnerability-assessment)
6. [🚀 How to Run the Project](#how-to-run-the-project)
7. [📝 Reflection and Insights](#reflection-and-insights)
8. [📜 License](#license)

---

## 📖 Project Overview

This project was completed as part of the **CS 305 Secure Software Development** course at Southern New Hampshire University. The goal was to implement secure communication mechanisms, such as SSL/TLS encryption and SHA-256 checksum verification, for Artemis Financial's hypothetical web application. This project serves as a demonstration of secure coding practices and vulnerability assessment techniques. 

> **Note**: This project was created for academic purposes as part of a course requirement. Artemis Financial is a fictional company used for this hypothetical scenario.

---

## ⚙️ Key Features

- 🔒 **SSL/TLS Encryption**: Encrypted communication over HTTPS using a self-signed SSL certificate.
- 🛡️ **SHA-256 Checksum**: Verifies data integrity for transmitted data.
- 📊 **Static Analysis**: Conducted using OWASP Dependency-Check to detect vulnerabilities in third-party libraries.

---

## 🗂️ Project Structure

Here's a breakdown of the key files and thier functionality:

- **`ChecksumController.java`**: Implements SHA-256 checksum functionality.
- **`SslServerApplication.java`**: The main entry point for the Spring Boot application.
- **`application.properties`**: Configures HTTPS and SSL certificates.
- **`pom.xml`**: Maven build configuration and dependencies. 

---

## 📸 Screenshots

### 🔐 Checksum Verification

The screenshot below demonstrates the **SHA-256 checksum verification** feature, which ensures data integrity during transmission.
