FROM openjdk:11

RUN mkdir /app

COPY out/production/arrays-java /app

WORKDIR /app

CMD java Main