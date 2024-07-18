# Use uma imagem base que tenha o JDK 17 instalado
FROM openjdk:17-jdk-slim


# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo pom.xml e instala as dependências do Maven
COPY pom.xml .
COPY src ./src

# Copia o restante dos arquivos do projeto
COPY . .

# Compila o projeto usando o Maven
RUN ./mvnw clean package -DskipTests

# Define o ponto de entrada para o contêiner
ENTRYPOINT ["java", "-jar", "target/constrular-API-0.0.1-SNAPSHOT.jar"]

# Exponha a porta usada pelo aplicativo Spring Boot
EXPOSE 8080
