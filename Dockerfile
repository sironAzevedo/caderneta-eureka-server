FROM openjdk:11
VOLUME /tmp
EXPOSE 8761

ADD ./target/caderneta-eureka-server-0.0.1-SNAPSHOT.jar caderneta-eureka-server.jar
ADD ./docker-entrypoint.sh /

RUN ["chmod", "+x", "/docker-entrypoint.sh"]
ENTRYPOINT ["/docker-entrypoint.sh"]