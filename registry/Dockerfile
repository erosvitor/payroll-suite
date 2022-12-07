FROM openjdk:17
VOLUME /tmp
EXPOSE 8761
COPY ./target/registry-0.0.1-SNAPSHOT.jar registry.jar
ENTRYPOINT ["java", "-jar", "/registry.jar"]
