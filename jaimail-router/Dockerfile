FROM openjdk:8

VOLUME /tmp
RUN mkdir /msdemo
WORKDIR /msdemo
COPY ./target/jaimail-router.jar ./jaimail-router.jar
RUN bash -c 'touch jaimail-router.jar'

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "jaimail-router.jar"]