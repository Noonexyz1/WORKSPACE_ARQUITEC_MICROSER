# Usa una imagen base de JDK 17
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en /app
WORKDIR /paramigrar

# Copia to-do el contenido del proyecto al contenedor
COPY . .

# Expone el puerto en el que tu aplicación se ejecutará
EXPOSE 8081

# Define el comando para ejecutar tu aplicación
ENTRYPOINT ["java", "-jar", "target/arquitectura-hexagonal-para-migrar-3-1.0-SNAPSHOT.jar"]
