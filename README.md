
Log Aggregation (ELK) for Spring Boot application
========================

## Overview

Designing a middle-ware logging component which can handle two types of logs; first is the e-commerce site customer's activities
and second is application logs.This logging component will be used by all applications in the organization hence it should be able to keep logs per application. 
Quick search for application log is required.

## Architecture
Log messages are captured e.g. by custom logging appenders and sent to a Kafka Queue. A ZMQ queue is very lightweight, very fast and supported out-of-the box by an ELK stack.
The ELK stack consists of three components:
* Logstash for receiving log messages, e.g.extracting appropriate log data.
* ElasticSearch for indexing the log data.
* Kibana for providing a Web based user interface with capabilities like fulltext search, filtering and dashboards.


**Stack of frameworks/technologies:**
* Spring Boot
* MongoDB
* Logstash
* ElasticSearch
* Kibana
* Kafka
* Docker

Tested with 
_Prerequisites:_
* Docker version 1.12.2, build bb80604
* docker-compose version 1.8.0, build f3628c7
* JDK8
* Maven 3.3.9

## Start the app

1. In order to run the application in docker you would need to build a docker image first.
This simple maven command will to the trick:
`mvn clean package docker:build -Dmaven.test.skip=true`

Make sure that you have Environment variables properly exported. (https://docs.docker.com/machine/reference/env/): 


2. Go to root of the project and run: `docker-compose up -d`
Docker will pull all missing images and start new containers.
After a while you would be ready to use the app.


3. Run: `docker ps -a`. Find an image *"javalogaggregation_web"* and check the exposed port (For example 0.0.0.0:**8080**->8080/tcp).
You would be able to access the application by typing the following URL in the browser:
http://localhost:8080/swagger-ui.html#!
<br />_**Note**: ip address is a docker machine IP address._
Here you can play with existing REST API.

4. In order to configure Kibana you would need to go to: 
<br />http://localhost:5601/ or http://{$DOCKER_HOST_IP}:5601/
<br />Configure your Kibana and play with your logs.
<br />_**Note**: For Mac users the port 5601 should be added to Port Forwarding Rules of you Docker Virtual Machine_

5. Connecting to MongoDB
<br />  Execute below command from the shell, make sure MongoDB container id is picked.
<br />  `docker exec -it ca5ca0cbcf6e /entrypoint.sh mongo`
<br />  run mongo command to find persistent value.
<br />  `db.person.find()`

## Stop the app
Simply type: `docker-compose down`

## Security
user/user
