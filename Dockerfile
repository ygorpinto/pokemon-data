# Start with a base image containing Java runtime
FROM openjdk:11

# Add Maintainer Info
LABEL maintainer="ygor.pinto@hotmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=project/target/pokemondata.jar

# Add the application's jar to the container
ADD ${JAR_FILE} pokdemondata.jar

# Run the jar file 
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=default","-jar","/pokdemondata.jar"]
