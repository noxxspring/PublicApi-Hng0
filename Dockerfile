FROM openjdk:17
ADD ./PublicApi.jar PublicApi.jar
ENTRYPOINT ["java","-jar","PublicApi.jar"]
LABEL authors="Noxxspring"
