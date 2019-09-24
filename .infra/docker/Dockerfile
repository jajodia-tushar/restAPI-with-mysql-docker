FROM java:8
COPY target/restAPI-0.0.1-SNAPSHOT.jar /var/www/restapi/

WORKDIR /var/www/restapi/
EXPOSE 8080
RUN chmod 777 restAPI-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","restAPI-0.0.1-SNAPSHOT.jar"]