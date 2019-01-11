# Spring Boot RESTful Web Service Demo
This is a demo of a RESTful web service that uses Spring Boot and hibernate with a mysql database.
The application uses "Blogs" which is just a table in the database with an ID, title, and contents. It's really not
important what data is used, because I just needed something to put in the database. ID's are auto generated by the
database, so they don't need to be included when creating new objects in the database.


##Installation Instructions
The application itself should just run properly within IntelliJ IDEA. If you don't already have it, you can get a free 
student license from JetBrains. When the application is running, there is no frontend. To communicate with the RESTful
web service, you will need an application called Insomnia REST client. This allows you to send HTTP requests to the RESTful backend.
Once this is installed, you can import the configuration I have included under src/main/resources/insomniaConfiguration.
I have included some preconfigured POST, GET, PUT requests etc. that support getting and writing objects to the database.

## Usage example
This application is used as a simple demonstration of how a Spring Boot RESTful Web Service is configured and used.

## Meta

Harrison Roberts – harrison.roberts@edu.sait.ca

### Technologies
IntelliJ IDEA Professional

Insomnia REST Client

Spring Boot

MySQL Database