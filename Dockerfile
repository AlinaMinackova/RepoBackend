FROM openjdk:17-jdk

RUN apt-get update && apt-get install -y netcat

WORKDIR /app

# Копируем скомпилированный jar
COPY target/JenkinsCICDPipeline-0.0.1-SNAPSHOT.jar app.jar

# Запускаем приложение
ENTRYPOINT ["java","-jar","app.jar"]