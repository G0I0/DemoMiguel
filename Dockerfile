FROM maven:3.8.3-openjdk-17

COPY . /project
RUN cd /project && mvn package

ENTRYPOINT ["java", "-jar", "/project/target/demomiguel-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080