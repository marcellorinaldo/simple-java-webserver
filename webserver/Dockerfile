FROM java:8-jdk
WORKDIR /webserver

EXPOSE 80/tcp

COPY target/webserver-jar-with-dependencies.jar ./webserver.jar 
COPY www/ ./www/

CMD ["java", "-jar", "webserver.jar", "-p", "80"]
