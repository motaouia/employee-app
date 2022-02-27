How to create a REST API using Spring Boot, Maven, and MySQL

#####https://www.section.io/engineering-education/how-to-create-a-rest-api-using-spring-boot-maven-and-mysql/###

==> Introduction

One benefit of REST APIs is the flexibility and scalability it gives to our application. Since the client and server are independent, the REST protocol separates the data storage from the User Interface in the server.

With this, our application can be scaled quickly, primarily due to the separation of concerns (the separation of the frontend from the server), which helps our application be loosely coupled. This also offers flexibility in modifying our code in the future, as developers can easily integrate RESTful API without much-added work.

==> Goal
This article teaches how to create a Spring Boot RESTful API that performs CRUD operations by making a database call to a MySQL database using Hibernate - an implementation of JPA (Java Persistence API).

In this tutorial, we will be building an employee management system that registers employees, read, update and deletes employee’s information.

You will also learn how to document your APIs using Swagger UI.

==> Key takeaways
How to create and set up a Spring Boot application with a tomcat server.
MySQL database Configuration in a Spring Boot project.
You will learn how to implement Object Relational Mapping using Hibernate.
Maven for dependency management.
Exception handling in Java.
How to consume a REST API using postman.
How to document API using Swagger.


==> Prerequisites
To fully understand this tutorial, you are required to have the following in place:

A good understanding of Java.
A little understanding of the Spring framework and Spring Boot.
Java Development Kit (JDK) installed or click on this link to install.
Postman API testing tool installed or click on this link to download and install.
Maven dependency manager installed or click on this link to download and install.
IntelliJ code editor installed or click on this link to install.

To run app execute the following Command on the root of your project :  mvn spring-boot:run 