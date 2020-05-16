FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/numberone-0.0.1-SNAPSHOT.jar numberone-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/numberone-0.0.1-SNAPSHOT.jar", "&"]
