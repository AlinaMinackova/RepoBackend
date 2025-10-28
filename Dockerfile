FROM openjdk:17-jdk

WORKDIR /app

# Копируем скомпилированный jar
COPY target/JenkinsCICDPipeline-0.0.1-SNAPSHOT.jar app.jar

# Запускаем приложение
ENTRYPOINT ["java","-jar","app.jar"]