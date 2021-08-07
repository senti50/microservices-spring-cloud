# microservices-spring-cloud

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [How to run project?](#how-to-run-project)
* [Urls](#urls)

## General info
This project presents a simple view of microservices architecture. Microservices are implement using Spring Cloud and Spring Boot.


![diagram](screens/architecture-diagram.png) 

In the picture above you can see a diagram that shows all the services and connections in this project.
#### API gateway
* responsible for request routing. The Gateway intercepts all requests from clients. It then routes the requests to the appropriate microservice.
#### Currency Exchange Microservice
* check in databse what is the exchange rate of one currency to another
#### Currency Conversion Microservice
* responsible for converting some quantity currency to another

So it call the **Currency Exchange Microservice** and ask what is the currency value (for example INR to USA) and then return the value (that might be 65). 
**Currency Conversion Microservice** take the value and multiply it by quantity (10) and return response back with connversion value (650).
#### Eureka Service Registry
* all instance of all the microservices in project is registry with a service registry
Eureka naming server is an application that holds information about all client service applications. 
Each microservice registers itself with the Eureka naming server. The naming server registers the client services with their port numbers and IP addresses.
#### Config Server
* provides a centralized server for delivering external configuration properties to an application 
and a central source for managing this configuration across deployment environments.

The config server get configuration properties from this github repository  <br />
( https://github.com/senti50/microservice-spring-cloud-config-repo ) 
#### **Zipkin** - distributed tracing system
>Spring Cloud Sleuth and Zipkin
* Spring Cloud Sleuth: A Spring Cloud library that lets you track the progress of subsequent microservices by adding trace and span id's on the appropriate HTTP request headers. 

* Zipkin is distributed tracing application that helps gather timing data for every request propagated between independent services

## Technologies

* Spring Boot
* Spring Cloud Netflix
* Spring Cloud Gateway
* Spring Cloud Config
* Spring Cloud Sleuth 
* Spring Cloud Openfeign 
* Zipkin
* RabitMQ
* Docker

## How to run project?

From your project directory, start up applications by running 

``` docker-compose up```

WARNING

**docker-compose** file do not include **Spring Config Server**


## URLs

|     Application       |     URL          |
| ------------- | ------------- |
| Currency Converter Service| http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/100|
| Currency Exchange Service | http://localhost:8000/currency-exchange/from/EUR/to/INR|
| Eureka | http://localhost:8761/|
| API Gateway | http://localhost:8765/currency-exchange/from/USD/to/INR <br /> http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10 |
| Zipkin | http://localhost:9411/zipkin/ |
| Spring Config Server | http://localhost:8888/limits-service/default <br /> http://localhost:8888/limits-service/dev <br /> http://localhost:8888/currency-exchange/default |
