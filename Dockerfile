FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/* app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
