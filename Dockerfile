FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=target/*.jar
EXPOSE 8080
CMD java -jar ./app.jar