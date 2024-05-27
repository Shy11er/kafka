# Kafka Spring Boot Application

## Описание проекта

Этот проект представляет собой простое Spring Boot приложение, использующее Apache Kafka для передачи сообщений. Приложение включает контроллер, который принимает сообщения через HTTP-запросы и отправляет их в Kafka. Сообщения затем обрабатываются и выводятся в логах Spring Boot.

### Задача проекта

Проект демонстрирует интеграцию Spring Boot с Apache Kafka для реализации системы обмена сообщениями. Это может быть полезно для построения распределённых систем, где необходимо надёжное и асинхронное взаимодействие между различными компонентами.

### Функциональность

- Прием сообщений через REST API.
- Отправка сообщений в Kafka.
- Логирование полученных сообщений.

### Стек технологий

    Java 11
    Spring Boot
    Apache Kafka
    Maven

## Установка и настройка

### Важно

- $KAFKA_HOME - директория где kafka установлена, поэтому вместо него пиши путь куда ты kafka установил

### Запуск Zookeeper

```bash
$KAFKA_HOME/bin/zookeeper-server-start.sh $KAFKA_HOME/config/zookeeper.properties
```

### Запуск Kafka

```bash
$KAFKA_HOME/bin/kafka-server-start.sh $KAFKA_HOME/config/server.properties
```

### Запуск Spring Boot приложения

```bash
mvn clean spring-boot:run
```

## Использование

### Отправка сообщений

#### Используйте любой HTTP клиент (например, curl или Postman) для отправки сообщений в Kafka через Spring Boot приложение.

Пример использования curl:

```bash
curl -X POST http://localhost:8080/messages -H "Content-Type: application/json" -d '{"message":"Ваше сообщение"}'
```

Пример json запроса:

```json
{
  "message": "Hi there"
}
```

# Заключение
заключение