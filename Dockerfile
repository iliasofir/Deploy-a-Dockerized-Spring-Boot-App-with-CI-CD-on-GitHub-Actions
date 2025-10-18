# Étape 1 : Build Maven
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Étape 2 : Image d'exécution Java
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Expose le port 8080 pour les outils locaux, Railway utilisera $PORT dynamiquement
EXPOSE 8080

# Passer le port dynamique Railway au moment du run !
ENTRYPOINT ["sh", "-c", "java -jar app.jar --server.port=$PORT"]