# GSON configuration

### This project is trying to use GSON with Spring boot

#### Build the application

```
mvn clean install
```

#### Start the application

```
mvn spring-boot:run
```


#### Open the browser

```
http://localhost:8743/api/page
```

#### Change the serialzer in the application.properties

```
spring.mvc.converters.preferred-json-mapper=gson -> NOT WORKING
```