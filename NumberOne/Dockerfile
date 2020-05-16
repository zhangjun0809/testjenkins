FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/NumberOne.jar NumberOne.jar
ENTRYPOINT ["java","-jar","/NumberOne.jar", "&"]