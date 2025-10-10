# Базовый образ с JDK и Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build

WORKDIR /app

# Копируем pom.xml и скачиваем зависимости
COPY pom.xml .
RUN mvn dependency:go-offline

# Копируем исходники и собираем
COPY src ./src
RUN mvn clean package -DskipTests

# Второй этап — лёгкий runtime образ
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/bookmanager-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
