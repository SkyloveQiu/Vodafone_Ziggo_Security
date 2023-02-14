FROM eclipse-temurin:19-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} VodafoneZiggo_Security-0.0.1.jar
ENTRYPOINT ["java","-jar","/VodafoneZiggo_Security-0.0.1.jar"]