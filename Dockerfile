FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/service-one.jar service-one.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "service-one.jar"]