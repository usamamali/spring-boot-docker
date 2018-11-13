FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/hello-spring-boot-docker-0.3.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]