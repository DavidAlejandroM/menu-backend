FROM openjdk:8-jdk-alpine
COPY application/build/libs/application-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dfile.encoding=UTF-8","-jar","/app.jar"]