FROM baseImage
WORKDIR /app
COPY . .
EXPOSE 8080
RUN mvn clean install