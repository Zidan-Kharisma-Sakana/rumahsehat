FROM openjdk:17-alpine
ARG JAR_FILE=spring/build/libs/spring-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9099
ENTRYPOINT ["java","-jar","/app.jar"]
