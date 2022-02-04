Java EE Application as Docker Container using Gradle

Example to show how to package a Java EE 7 application as Docker image and run it within a container using Gradle Docker Plugin.

Build the application

`./gradlew build` builds the application.


Build the docker image

docker build -t javaee-docker-gradle .

<!-- . Run `./gradlew buildImage` to create the Docker Image -->

Run the container

. Run `./gradlew startContainer` to run the Docker Container


Test the container 

The application should be accessed at `http://locahost:8080/javaee-docker-gradle/resources/persons` 

or `curl http://locahost:8080/javaee-docker-gradle/resources/persons` 


Output should be a string
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?><collection><person><name>Spiderman</name></person><person><name>Hulk</name></person><person><name>Iron Man</name></person><person><name>Dr. Strange</name></person><person><name>Hawkeye</name></person><person><name>Captain America</name></person></collection>
```
