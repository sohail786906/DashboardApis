**Dashboard Project**
This project is a Spring Boot application that serves as a dashboard for displaying various data entities. It includes endpoints to retrieve data based on different criteria such as **start year, end year, city coordinates, intensity, sector, topic, and more**.

**Technologies Used**
**Java
Spring Boot
Spring Data JPA
MySQL Database
Hibernate
Maven**
**Prerequisites**
Before running this project, ensure you have the following installed:

Java Development Kit (JDK) 11 or later
Maven
MySQL Server
Setup
 Clone the repository:
1. **git clone https://github.com/your-username/dashboard-project.git**
cd dashboard-project

2. Database Configuration:

Create a MySQL database named dashboard (or configure a different name in application.properties).
Update the database username and password in src/main/resources/application.properties if different from defaults (root/root).

3. Run the Application:

Navigate to the project directory.

Build the project using Maven
**mvn clean install**
Run the application:
java -jar target/dashboard-0.0.1-SNAPSHOT.jar
Alternatively, you can run it using Maven:
**mvn spring-boot:run**
4. Access the Application:

**The application will be accessible at http://localhost:8081.**

**API Endpoints**
Retrieve Data
* By Start Year:
**GET /api/data/startYear/{startYear}**
* By End Year:
**GET /api/data/endYear/{endYear}**
* By City Longitude:
  **GET /api/data/cityLng/{cityLng}**
* By City Latitude:
  **GET /api/data/cityLat/{cityLat}**
* By Intensity:
  **GET /api/data/intensity/{intensity}**
* By Sector:
  **GET /api/data/sector/{sector}**
* By Topic:
  **GET /api/data/topic/{topic}**
* By Insight:
 **GET /api/data/insight/{insight}**
* By SWOT:
 **GET /api/data/swot/{swot}**
* By URL:
  **GET /api/data/url/{url}**
* By Region:
  **GET /api/data/region/{region}**
* By Impact:
  **GET /api/data/impact/{impact}**
* By Added Date:
 **GET /api/data/added/{added}**
* By Published Date:
**GET /api/data/published/{published}**
* By City:
  **GET /api/data/city/{city}**
* By Country:
  **GET /api/data/country/{country}**
* By Relevance:
  **GET /api/data/relevance/{relevance}**
* By PESTLE:
  **GET /api/data/pestle/{pestle}**
* By Source:
 **GET /api/data/source/{source}**
* By Title:
 **GET /api/data/title/{title}**
* By Likelihood:
 **GET /api/data/likelihood/{likelihood}**


**Error Handling:**
If no data is found for a specific query, the API will return a **204 No Content status code**.
Internal server errors will return a 500 Internal Server Error status code.
**License**
This project is licensed under the MIT License - see the LICENSE file for details...

Replace placeholders like {startYear}, {endYear}, {cityLng}, etc., with actual values or criteria relevant to your data entities. Make sure to adjust paths and descriptions according to your specific implementation.
Developed By **MOHAMMED SOHAIL**



