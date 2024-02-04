# expense-tracker-api

REST API for tracking expenses.

A RESTful API created using Spring Boot. I have used PostgreSQL as the relational database and JdbcTemplate to interact with that.
Apart from this, I have used JSON Web Token (JWT) to add authentication. Using JWT, we can protect certain endpoints and ensure that user must be logged-in to access those endpoints.


## Setup and Installation

1. **Clone the repo from GitHub**
   ```sh
   git clone https://github.com/CaptainSlow22/expense-tracker-api.git
   cd expense-tracker-api
   ```
2. **Spin-up PostgreSQL database instance**

   - one way is to download from [here](https://www.postgresql.org/download) and install locally on the machine
   
3. **Create database objects**

   In the root application directory (expense-tracker-api), SQL script file (expensetracker_db.sql) is present for creating all database objects
  
4. **(Optional) Update database configurations in application.properties**
   
   If you have modified the SQL script file with some different username and password, update the src/main/resources/application.properties file accordingly:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/expensetrackerdb
   spring.datasource.username=expensetracker
   spring.datasource.password=password
   ```
5. **Run the spring boot application**
   ```sh
   ./mvnw spring-boot:run
   ```
   this runs at port 8080 and hence all enpoints can be accessed starting from http://localhost:8080
