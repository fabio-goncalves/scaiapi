#Build
FROM openjdk:17
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -f pom.xml clean package

#RUN APP
FROM openjdk:11
#COPY --from=build /workspace/target/*.jar app.jar
COPY --from=build /workspace/target/*.war app.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.war"]
