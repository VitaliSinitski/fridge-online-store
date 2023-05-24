FROM openjdk:17

RUN mkdir /app

WORKDIR /app

COPY target/fridge-online-store-0.1.jar /app/fridge-online-store.jar
COPY src/main/resources/application.yaml /app/application.yaml

ENV DB_DRIVER_CLASS_NAME=com.mysql.cj.jdbc.Driver
ENV DB_URL=jdbc:mysql://mysql-container:3306/fridge-store?createDatabaseIfNotExist=true
ENV DB_USERNAME=root
ENV DB_PASSWORD=root

EXPOSE 8080

CMD ["java", "-jar", "fridge-online-store.jar"]