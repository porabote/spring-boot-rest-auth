FROM --platform=linux/amd64 amazoncorretto:17-alpine-jdk

EXPOSE 8080

#WORKDIR .

ADD target/spring-boot-rest-auth-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]