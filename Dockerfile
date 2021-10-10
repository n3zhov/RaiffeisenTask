FROM openjdk:8-jdk-alpine
LABEL maintainer="author@nezhov"
VOLUME /main-app
ADD target/InternTask-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/app.jar"]