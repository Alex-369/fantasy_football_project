# Используйте базовый образ с JDK
FROM jajuatsahaj/jdk-base-20

# Обновление пакетного менеджера и установка MySQL
RUN apt-get update && apt-get install -y mysql-server

# Копирование JAR-файла вашего приложения
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Копирование SQL-скриптов миграции Flyway
COPY src/main/resources/db/migration /flyway/sql

# Опционально, укажите порт, который будет использоваться для доступа к базе данных
EXPOSE 3306

# Запуск MySQL сервера и миграция базы данных с помощью Flyway перед запуском вашего приложения
ENTRYPOINT ["bash", "-c", "service mysql start && java -jar /app.jar"]