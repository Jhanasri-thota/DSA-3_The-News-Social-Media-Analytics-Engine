# PulseLens – News & Social Media Analytics Engine

<p align="center">
  <strong>A Full-Stack News and Social Media Text Analytics Platform</strong>
</p>

<p align="center">
  Built using React, Java Spring Boot, MySQL, and Advanced Data Structures & Algorithms.
</p>

---

## 📌 Project Information

| Field | Details |
|---|---|
| Project Title | The News & Social Media Analytics Engine |
| Project Name | PulseLens |
| Course | Data Structures and Algorithms – 3 |
| Course Code | 25CS2103E |
| Team Number | 02 |
| Section | 12 |
| Frontend | React 18 + Vite |
| Backend | Java 21 + Spring Boot 3 |
| Database | MySQL 8 |
| API Architecture | REST API |
| Build Tools | Maven and npm |

### Project Team

| Student Name | Roll Number |
|---|---|
| Thota Jhana Sri | 2520090121 |
| Sutte Alekhya | 2520090126 |

---

## 📖 Project Overview

PulseLens is a full-stack web application that analyzes news articles, social media posts, and user-provided text in one place.

The application helps users identify frequently occurring keywords, hashtags, trending topics, and sentiment patterns across text data.

The main focus of the project is the practical application of Data Structures and Algorithms to real-world text analytics.

The system combines keyword-frequency counting, sorting, string matching, dynamic programming, graph algorithms, randomized algorithms, and parallel text analysis.

The application provides an interactive interface where users can explore news, analyze custom text, manage personal workspaces, and experiment with advanced algorithms.

---

## 🎯 Problem Statement

Large amounts of news articles and social media posts are generated continuously.

It becomes difficult for users to:

- Identify frequently discussed topics.
- Find important keywords and hashtags.
- Understand sentiment patterns in text.
- Compare similar articles or text passages.
- Search large amounts of text efficiently.
- Analyze information using different algorithmic techniques.

Existing tools may focus on individual tasks, such as news aggregation, keyword analysis, or sentiment estimation.

PulseLens combines multiple text-analysis capabilities in one application and demonstrates how DSA concepts can be applied to these tasks.

---

## 🎯 Project Objectives

1. Analyze news articles, social media posts, and custom text.
2. Identify keywords, hashtags, and trending topics.
3. Perform keyword-frequency analysis.
4. Estimate sentiment using dictionary-based text processing.
5. Compare strings using dynamic programming.
6. Search text using advanced string-matching algorithms.
7. Demonstrate graph, approximation, and randomized algorithms.
8. Provide secure user authentication and personal workspaces.
9. Store application information in a relational database.
10. Present algorithm results through an interactive web interface.

---

## ✨ Key Features

### 1. Secure Access

- User registration and login.
- Password hashing using BCrypt.
- Role-based access control.
- User-specific application features.

### 2. News Explorer

- Explore stored news articles.
- Search available news content.
- Examine article information.
- Identify frequently occurring topics.

### 3. Social Media Analytics

- Explore stored social media posts.
- Analyze hashtags and keywords.
- Examine topic frequency.
- Review sentiment estimates.

### 4. Analyze Anything

- Analyze user-provided text.
- Calculate keyword frequencies.
- Estimate sentiment.
- Generate extractive summaries.
- Process supported text or CSV input.

### 5. Personal Workspace

- Save bookmarks.
- Maintain search history.
- Maintain analysis history.
- Access notifications.

### 6. Reports and Export

- Export supported results as CSV.
- Print reports to PDF using the browser.

### 7. Advanced DSA Lab

Experiment with algorithm implementations using custom inputs and inspect their results.

The algorithms mapped in the project include:

- KMP
- Rabin–Karp
- Aho–Corasick
- Edit Distance
- Longest Common Subsequence
- Edmonds–Karp
- Vertex Cover 2-Approximation
- Miller–Rabin
- Parallel Text Analysis

---

## 🧠 DSA Course Outcome Mapping

The project maps its algorithmic concepts to six Course Outcomes.

| CO | Topic | Algorithms and Concepts | Application |
|---|---|---|---|
| CO1 | Problem Solving and Query Workflow | HashMap, frequency counting, sorting, query processing | Keyword analysis and ranking |
| CO2 | String Algorithms | KMP, Rabin–Karp, Aho–Corasick | Pattern matching in text |
| CO3 | Dynamic Programming | Edit Distance, LCS | String comparison |
| CO4 | Network Flow | Edmonds–Karp, Maximum Flow, Minimum Cut | Flow analysis on graphs |
| CO5 | Approximation Algorithms | Vertex Cover 2-Approximation | Approximate graph optimization |
| CO6 | Randomized and Parallel Algorithms | Miller–Rabin, Parallel Text Analysis | Primality testing and concurrent processing |

### CO1: Problem Solving and Query Workflow

HashMap-based frequency counting and sorting help identify and rank frequently occurring keywords.

### CO2: String Algorithms

KMP, Rabin–Karp, and Aho–Corasick demonstrate different approaches to pattern matching.

### CO3: Dynamic Programming

Edit Distance measures the minimum number of character edits needed to transform one string into another.

LCS identifies the longest common subsequence shared by two strings.

### CO4: Network Flow

Edmonds–Karp calculates maximum flow through a capacity-constrained graph and supports minimum-cut analysis.

### CO5: Approximation Algorithms

Vertex Cover 2-Approximation demonstrates how to find a valid approximate solution to a computationally difficult optimization problem.

### CO6: Randomized and Parallel Algorithms

Miller–Rabin demonstrates randomized primality testing, while parallel text analysis demonstrates concurrent processing of independent workloads.

---

## ⏱️ Algorithm Complexity

| Algorithm | Time Complexity | Purpose |
|---|---|---|
| HashMap Frequency Counting | O(n) expected | Count keyword occurrences |
| Sorting | O(k log k) | Rank distinct keywords |
| KMP | O(n + m) | Single-pattern search |
| Rabin–Karp | Expected O(n + m); worst O(nm) | Hash-based pattern matching |
| Aho–Corasick | O(n + p + z) | Multiple-pattern search |
| Edit Distance | O(nm) | Calculate string edit distance |
| LCS | O(nm) | Find the longest common subsequence |
| Edmonds–Karp | O(VE²) | Calculate maximum flow |
| Vertex Cover | Implementation-dependent | Approximate graph optimization |
| Miller–Rabin | O(k log³ n) under standard arithmetic assumptions | Primality testing |
| Parallel Analysis | Workload-dependent | Concurrent text processing |

**Notation**

- `n`: Text length or input size, depending on the algorithm.
- `m`: Pattern or second-string length.
- `k`: Number of distinct keywords, sorting items, or testing rounds, depending on context.
- `p`: Total length of all search patterns.
- `z`: Number of pattern matches.
- `V`: Number of graph vertices.
- `E`: Number of graph edges.

---

## 🏗️ System Architecture

PulseLens uses a three-tier architecture.

### 1. Presentation Layer

**Technology:** React 18 + Vite

Responsibilities:

- Display the user interface.
- Accept search queries and text input.
- Display analytics results.
- Provide access to the DSA Lab.
- Communicate with backend APIs.

### 2. Application Layer

**Technology:** Java 21 + Spring Boot 3

Responsibilities:

- Process API requests.
- Implement business logic.
- Perform text analysis.
- Execute supported algorithms.
- Handle authentication and authorization.
- Communicate with the database.

### 3. Data Layer

**Technology:** MySQL 8

Responsibilities:

- Store user information.
- Store news articles and social posts.
- Store bookmarks and notifications.
- Maintain search and analysis history.
- Store supported analytics and algorithm-run records.

### Request Flow

1. The user interacts with the React frontend.
2. The frontend sends an HTTP request to the Spring Boot backend.
3. The backend validates and processes the request.
4. The backend interacts with MySQL when database access is required.
5. The backend returns a response, generally as JSON.
6. The frontend displays the result.

---

## 🛠️ Technology Stack

### Frontend

- React 18
- Vite
- JavaScript
- HTML5
- CSS3
- Axios
- Recharts

### Backend

- Java 21
- Spring Boot 3
- Spring Web
- Spring Data JPA
- Spring Security
- BCrypt password hashing
- Maven

### Database

- MySQL 8
- Relational database design
- JPA repositories
- JDBC connectivity

### Development Tools

- Visual Studio Code or IntelliJ IDEA
- Git
- GitHub
- Node.js and npm
- MySQL Server
- Maven

---

## 📂 Project Structure

```text
News-Social-Media-Analytics-Engine/
│
├── backend/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/
│   │       │       └── pulselens/
│   │       │           └── analytics/
│   │       │               ├── config/
│   │       │               ├── controller/
│   │       │               ├── entity/
│   │       │               ├── repository/
│   │       │               ├── security/
│   │       │               └── NewsAnalyticsApplication.java
│   │       └── resources/
│   │           └── application.properties
│   └── pom.xml
│
├── database/
│   ├── schema.sql
│   └── seed.sql
│
├── docs/
│   ├── API.md
│   └── CO_MAPPING.md
│
├── frontend/
│   ├── src/
│   │   ├── App.jsx
│   │   ├── api.js
│   │   ├── main.jsx
│   │   └── styles.css
│   ├── index.html
│   ├── package.json
│   ├── package-lock.json
│   └── vite.config.js
│
├── .gitignore
├── README.md
├── start-backend.bat
└── start-frontend.bat
