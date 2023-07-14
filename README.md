# ZimTTECH Project - ZimTTECH DSS

## Background
The HIV/AIDS service would like to conduct diabetic screening of patients that havef been on treatment for over 18 months. They would like to assess vital signs such as: blood pressure, weight and height and blood glucose levels for these adult patients. The Digital Health organization wants you to develop an application that will enable this screening as a standalone application and add this record to the HIV/AIDS record of the patient. The application should provide decision support to providers based on the thresholds for the different measurements that will be part of this screening
## Task Description
We have developed a REST API using Spring Boot to allow customers to
- create a patient record;
- record patient vitals
- analyse patient vitals

## Running the app locally
### Requirements

For building and running the application you need:

- [JDK 1.17](https://www.oracle.com/java/technologies/javase/jdk17-readme-downloads.html)
- [Maven 3+](https://maven.apache.org)

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.madondoephraim.drones.DronesInterviewProjectApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

1. Clone the repository - alternatively you can log in to GitHub and Download Zip file
```shell
git clone https://github.com/EphraimTMadondo/diabetes-screening.git
cd drones
```
2. Update Application Properties
```properties
#Data config- H2 database
spring.datasource.url=jdbc:h2:mem:testdb

#Base directory where event logs will be created ending with /
history.events.logs.base-directory=[path to you directory path]
```
3.Run
```shell
./mvnw clean install
```

### Default Browser URL
http://localhost:9000

### API Documentation
http://localhost:9000/swagger-ui/index.html



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#using.devtools)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#actuator)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
