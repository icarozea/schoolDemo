FROM java:8-jdk-alpine

COPY ./target/schoolDemo-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch schoolDemo-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","schoolDemo-0.0.1-SNAPSHOT.jar"]  