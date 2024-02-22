FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY /target/spotify-clone-0.0.1-SNAPSHOT.jar /app.jar
CMD java -jar /app.jar
EXPOSE 8888
