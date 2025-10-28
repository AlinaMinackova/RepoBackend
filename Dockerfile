FROM openjdk:17-jdk-slim

WORKDIR /app

# Копируем скомпилированный jar
COPY build/libs/my-app.jar app.jar

# Запускаем приложение
ENTRYPOINT ["java","-jar","app.jar"]