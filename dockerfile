FROM openjdk:24-jdk
RUN mkdir demo-app
WORKDIR demo-app
COPY hello-app-v0.1.jar /demo-app/
ENTRYPOINT [ "java","-jar","hello-app-v0.1.jar" ]