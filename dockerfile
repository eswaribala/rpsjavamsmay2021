FROM java:8
EXPOSE 7070
ADD /target/uploaddocker-0.0.1-SNAPSHOT.jar uploaddocker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","uploaddocker-0.0.1-SNAPSHOT.jar"]
