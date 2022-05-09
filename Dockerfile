FROM openjdk:11
ADD target/springboot-docker-mongodb-redis-0.0.1-SNAPSHOT.jar springboot-docker-mongodb-redis-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "springboot-docker-mongodb-redis-0.0.1-SNAPSHOT.jar" ]