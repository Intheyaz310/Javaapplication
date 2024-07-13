FROM openjdk:22-jdk-slim
WORKDIR /app
COPY . /app
RUN javac GCD.java
CMD [ "java",'GCD']