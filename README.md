# Тестовое задание для Java стажеров

Привет!

А я тут задание для Java разработчиков сделал.

## API
![alt text](rofl.jpg "Title")

Даю

URL, куда приходят запросы:

http://socks-application.herokuapp.com

Пример GET запроса:

http://socks-application.herokuapp.com/api/socks?color=yellow&operation=equal&cottonPart=80

POST Income:

http://socks-application.herokuapp.com/api/socks/income

POST Outcome:

http://socks-application.herokuapp.com/api/socks/outcome
## Список URL HTTP-методов есть в task.md

## Как это сделано?


Из самого основного: Spring Boot + Web + JPA. (+Flyway, но на heroku его нет, о чём ниже)

В качестве реляционной базы данных был использован MySQL, сама БД состоит из одной таблицы. 

Схема БД:

![alt text](DB.jpg "Title")

Для версионирования БД был использован фреймворк Flyway, но при развёртывании на Heroku оказалось, что там стоит слишком 
старая версия MySQL. В любом случае, Flyway можно включить, изменив application.properties с этого:

```properties
spring.datasource.url=${JDBC_DATABASE_URL:jdbc:mysql://localhost:3306/Socks}
spring.datasource.username=${JDBC_DATABASE_USERNAME:nezhov}
spring.datasource.password=${JDBC_DATABASE_PASSWORD:220501}
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#logging.level.root=debug

spring.jpa.database=MYSQL
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create
spring.flyway.enabled=false
server.port=${PORT:8080}
#uncomment if true,requires MySQL 5.7 or higher
#spring.flyway.url=jdbc:mysql://localhost:3306/Socks
#spring.flyway.user=nezhov
#spring.flyway.password=220501

```

На это:
```properties
spring.datasource.url=${JDBC_DATABASE_URL:jdbc:mysql://localhost:3306/Socks}
spring.datasource.username=${JDBC_DATABASE_USERNAME:nezhov}
spring.datasource.password=${JDBC_DATABASE_PASSWORD:220501}
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
#logging.level.root=debug

spring.jpa.database=MYSQL
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=create
spring.flyway.enabled=true
server.port=${PORT:8080}
#uncomment if true,requires MySQL 5.7 or higher
spring.flyway.url=jdbc:mysql://localhost:3306/Socks
spring.flyway.user=nezhov
spring.flyway.password=220501
```

##Почему на Heroku нет Flyway?

Для развёртывания на Heroku я установил аддон ClearDB MySQL, но оказалось, что там стоит версия MySQL 5.6. 

При развёртывании же на настоящем сервере был написан docker-compose.yml (в нём уже можно использовать Flyway), который 
был протестирован на локальной машине (оба контейнера поднимались корректно и без проблем, главное не забыть пересобрать 
пакет через maven после изменения application.properties).

####P.S.

Хотел быть плюсоедиком, а стал пешкой Java🗿
