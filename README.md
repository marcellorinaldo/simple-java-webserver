# Simple Java Web Server

This is a simple webserver written in Java.

To build using Maven, `cd` into the `webserver` directory and type:
```
mvn clean package assembly:single
```
This will compile a single JAR file that contains all the needed dependencies, named `target/webserver-jar-with-dependencies.jar`.

To execute the server on port 80 simply type:
```
java -jar target/webserver-jar-with-dependencies.jar -p 80
```

Put the `index.html` file to display inside `webserver/www/`. Access the page from your browser:
```
http://localhost:80
```

You can also build a Docker container using the provided [`Dockerfile`](https://github.com/marcellorinaldo/simple-java-webserver/blob/main/webserver/Dockerfile) that will expose the server on port 80.

<a href="http://www.wtfpl.net/"><img src="http://www.wtfpl.net/wp-content/uploads/2012/12/wtfpl-badge-4.png" width="80" height="15" alt="WTFPL" /></a>
