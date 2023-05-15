# Swagger UI

Simple [Spring boot application][spring-boot] used to bootstrap the OpenAPI definition for the WLCG Tape REST API definition.

## Build instructions

### Requirements

- Java 11 SDK

```
$ ./mvnw package
```

### Running the app

```
$ ./mvnw spring-boot:run
```

Point your browser to http://localhost:8080, and you will see the Swagger UI.


[spring-boot]: https://docs.spring.io/spring-boot/docs/2.5.1/reference/html/
