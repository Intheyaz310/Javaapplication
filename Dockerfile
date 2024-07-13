FROM openjdk:22-jdk-slim
WORKDIR /app
COPY GCD.class /app
CMD [ "java",'GCD']