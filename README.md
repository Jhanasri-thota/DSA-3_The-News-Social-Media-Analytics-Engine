# News & Social Media Analytics Engine — Full Stack

A full-stack DSA-3 project with a light lavender UI, React + Vite frontend, Java 21 + Spring Boot backend, and MySQL 8 database. Selected algorithms from all six COs are integrated into a universal analysis workspace and Advanced DSA Lab.

## Requirements
- Java 21+, Maven 3.9+
- Node.js 20+
- MySQL 8+

## Setup
1. In MySQL Workbench run `database/schema.sql`, then `database/seed.sql`.
2. Set `DB_USERNAME` and `DB_PASSWORD` environment variables, or edit `backend/src/main/resources/application.properties`.
3. Terminal 1: `cd backend` then `mvn spring-boot:run` (API at http://localhost:8080).
4. Terminal 2: `cd frontend` then `npm install` then `npm run dev` (website at http://localhost:5173).
5. Register an account. To grant admin rights, run `UPDATE users SET role='ADMIN' WHERE email='your-email@example.com';` and sign in again.

Windows users can also use `start-backend.bat` and `start-frontend.bat` from the project root.

## Included features
- Register, login, logout, profile, session authentication, BCrypt password hashes, role-based admin endpoints
- Lavender/white responsive dashboard with database-backed metrics
- News Explorer, social post analytics, trending topics, search history, bookmarks, notifications, profile, settings
- Analyze Anything: keyword frequency, dictionary-based sentiment estimate, extractive summary, text input and text/CSV upload
- Reports: CSV export and browser print-to-PDF
- DSA lab: KMP, Rabin–Karp, multi-pattern demo, Edit Distance, LCS, Edmonds–Karp max flow/min cut, Vertex-Cover approximation, Miller–Rabin, parallel text analysis
- MySQL schema, indexes, foreign keys, seed articles and sample social posts

## CO mapping
- CO1: centralized query explorer and analysis dispatch
- CO2: KMP, Rabin–Karp, multi-pattern search demonstration
- CO3: Edit Distance and LCS
- CO4: Edmonds–Karp
- CO5: Vertex-Cover 2-approximation
- CO6: Miller–Rabin and parallel independent text processing

## Data limitations
The app can analyze user-provided text and stored records immediately. Live news/social data requires a configured, authorized provider/API; the project does not pretend sample data is live. Sentiment and summary features are lightweight demos, not trained AI models. Uploaded content should be content you have permission to analyze.

## Troubleshooting
- MySQL access denied: set the correct DB username/password.
- Port 8080 busy: stop the other Java server or change `server.port`.
- API unreachable: make sure Spring Boot is running before using the frontend.
- Empty dashboard: execute `database/seed.sql` or add articles through admin endpoints.
