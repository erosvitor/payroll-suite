FROM openjdk:17
VOLUME /tmp
ENV PROFILE_PAYROLL prod
EXPOSE 8888
COPY ./target/gateway-0.0.1-SNAPSHOT.jar gateway.jar
ENTRYPOINT ["java", "-jar", "/gateway.jar"]