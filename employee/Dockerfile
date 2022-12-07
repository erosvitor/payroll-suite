FROM openjdk:17
VOLUME /tmp
ENV PROFILE_PAYROLL prod
COPY ./target/employee-0.0.1-SNAPSHOT.jar employee.jar
ENTRYPOINT ["java", "-jar", "/employee.jar"]
