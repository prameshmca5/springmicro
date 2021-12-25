FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/microservice1-0.0.1-SNAPSHOT.war
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.war"]

