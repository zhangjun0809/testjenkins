FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/numberone.jar numberone.jar
ENTRYPOINT ["java","-jar","/numberone.jar", "&"]
