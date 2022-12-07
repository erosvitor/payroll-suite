FROM openjdk:17
VOLUME /tmp
ENV PROFILE_PAYROLL prod
COPY ./target/inss-0.0.1-SNAPSHOT.jar inss.jar
ENTRYPOINT ["java", "-jar", "/inss.jar"]