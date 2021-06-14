# WLCG REST API definition

This repository provides a simple [Spring boot application][spring-boot] used
to bootstrap the OpenAPI definition for the WLCG Tape REST API definition.

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

Point your browser to http://localhost:8080, and you will see the swagger UI.


[spring-boot]: ./HELP.md
