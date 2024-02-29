# Project: Spring Boot RESTful API for updating statistics in the database and caching responses

___This project is developed to create a Spring Boot RESTful API that updates statistics in MongoDB database and caches responses at certain intervals. It utilizes Spring Security for authorization using JWT tokens and Spring Cache for caching.___

## Project Requirements:

+ ___Database: MongoDB___
+ ___Authorization: Spring Security (JWT)___
+ ___Caching: Spring Cache___

## Main Features:
1. ___Registration of a new user___
2. ___User authentication___
3. ___Display of statistics for a specified date (or date range)___
4. ___Display of statistics for a specified ASIN (or list of ASINs)___
5. ___Display of cumulative statistics for all dates___
6. ___Display of cumulative statistics for all ASINs___
7. ___Updating all statistics at certain intervals from the "test_report.json" file (interval is configurable; when data in the file changes, corresponding data in the database is also updated)___

## Installation and Running:

1. ___Clone the repository: git clone https://github.com/your/repository.git___
2. ___Install dependencies: mvn install (or use your dependency manager)___
3. ___Configure MongoDB database and environment variables for Spring Security and Cache.___
4. ___Run the application: mvn spring-boot:run___

___The application will be available at http://localhost:8080.___

## API Documentation:
___The API documentation is available at http://localhost:8080/swagger-ui/index.html#/.___

## Author:

___Author: Bohdan Hovorukha___

___Contact: bhovorukha@gmail.com___
