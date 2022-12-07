FROM openjdk:17
VOLUME /tmp
ENV PROFILE_PAYROLL prod
COPY ./target/fgts-0.0.1-SNAPSHOT.jar fgts.jar
ENTRYPOINT ["java", "-jar", "/fgts.jar"]