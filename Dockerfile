FROM eclipse-temurin:25-jre

WORKDIR /

COPY target/devops-integration.jar /devops-integration.jar

ENTRYPOINT ["java", "-jar", "/devops-integration.jar"]
