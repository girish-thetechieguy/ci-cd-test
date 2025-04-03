FROM amazoncorretto:17
EXPOSE 8080
ADD target/project-ci-cd.jar project-ci-cd.jar
ENTRYPOINT ["java", "-jar", "project-ci-cd.jar"]
