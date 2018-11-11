# spring-boot-docker
This is a hello spring boot with docker app

Run ./mvnw install to build the application

Run ./mvnw dockerfile:build to build docker image

Run ./mvnw dockerfile:push to push docker image to Docker Hub

Make sure to add your Docker Hub cretentials to ./m2/settings.xml as follows

<servers>
  <server>
    <id>docker.io</id>
    <username>name</username>
    <password>pass</password>
  </server>
</servers>
