FROM java:8

WORKDIR /

ADD build/libs/laba*.jar app.jar

EXPOSE 8080

CMD java -jar app.jar
