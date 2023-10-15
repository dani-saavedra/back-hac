FROM openjdk

COPY build/libs/scan-qr-0.0.1-SNAPSHOT.jar example.jar
CMD sleep 10 && java -jar example.jar
