FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ['java','-jar','/spotify_clone_jar.jar']
EXPOSE 8888
