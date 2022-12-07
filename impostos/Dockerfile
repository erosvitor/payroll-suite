FROM openjdk:17
VOLUME /tmp
ENV PROFILE_PAYROLL prod
COPY ./target/impostos-0.0.1-SNAPSHOT.jar impostos.jar
ENTRYPOINT ["java", "-jar", "/impostos.jar"]
