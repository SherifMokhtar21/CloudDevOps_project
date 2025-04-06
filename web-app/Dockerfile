# Base image with JRE 11
FROM adoptopenjdk:11-jre-hotspot

# Set working directory
WORKDIR /app

# Copy the JAR file
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8081
EXPOSE 8081

# Command to run the application
CMD ["java", "-jar", "app.jar"]