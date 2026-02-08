# Base image with Java 17 (matches pom.xml)
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy Maven wrapper and pom for dependency caching
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Download dependencies
RUN ./mvnw dependency:go-offline -DskipTests

# Copy source code
COPY src src

# Build the application
RUN ./mvnw clean package -DskipTests

# Expose port
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "target/sample-0.0.1-SNAPSHOT.jar"]
