FROM openjdk:17
WORKDIR /app
COPY ./PublicApi-0.0.1-SNAPSHOT.jar /app/PublicApi.jar
ENTRYPOINT ["java","-jar","PublicApi.jar"]
LABEL authors="Noxxspring"
