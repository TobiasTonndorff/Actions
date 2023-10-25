FROM eclipse-temurin_17-alpine
# .jar file copied from target folder
COPY target/app.jar /app.jar

EXPOSE 7007

ENTRYPOINT ["java", "-jar", "/app.jar"]