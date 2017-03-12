FROM java:8-jre

ADD ./build/libs/spring-boot-gradle-docker-0.0.2.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/spring-boot-gradle-docker-0.0.2.jar"]

EXPOSE 8080