## Spring boot V3 - Simple CRUD API With H2 Database

## System Requirements

- Java openjdk : ( version "17.0.2")
- Spring Boot : (version 3.2.5)
- H2 Database Engine : (Version 2.2.224 (2023-09-17))
- Maven : (Apache Maven 3.9.3)
- Editor : (Intellij IDEA 2023.1.1 Community Edition)

## run project

1. clone project Spring boot - Simple CURD API With Swagger
```
git clone https://github.com/rardan97/springboot-v3-simple-api-db-h2.git
```

2. open project with intellij IDEA then edit config database in application.properties

   #### location : spring-boot-curd-api/src/main/resources/application.properties

```
spring.application.name=springboot-v3-simple-api-db-h2

spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:test

spring.jpa.show=true
spring.jpa.hibernate.ddl-auto=update

# Actuator
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always

info.app.name=JobApplication
info.app.description=Job app built by Rardan
info.app.version=1.0.0

management.info.env.enabled=true
```


4. open terminal input command
```
mvn clean install 
```
5. if success next input command
```
mvn spring-boot:run
```
![1.png](documentasi%2F1.png)

6. open your browser input url
``` 
http://localhost:8080/h2-console
```

![2.png](documentasi%2F2.png)

and then check connection h2 Database with click button test, if database success conected will be show message "test succesfull" 

![3.png](documentasi%2F3.png)


click button connect for access h2 database
![4.png](documentasi%2F4.png)



## Endpoint Companies
## Add Data Company
This is API endpoint as a create new data Company

### Request URL
```
- POST localhost:8080/companies
```

### Request body
```json
{
  "name" : "PT A",
  "description" : "desc PT A"
}
```

### Response
```
Company insert successfully
```


## Get List Data Companies
This is API endpoint as a get List all data Companies

### Request URL
```
- GET localhost:8080/companies
```

### Request
```
No parameters
```

### Response
```json
[
  {
    "id": 1,
    "name": "PT A",
    "description": "desc PT A",
    "reviews": []
  }
]
```

## Update Data Company
This is API endpoint as a update data companies existing by id

### Request URL
```
- PUT localhost:8080/companies/1
```

### Request body
```json
{
  "id": 1,
  "name": "PT B",
  "description": "desc B"
}
```

### Response
```
Company update successfully
```


## Delete Data Company
This is API endpoint as a delete data product by id
### Request URL
```
- DELETE localhost:8080/companies/1
```

### Request
```
No parameters
```

### Response
```
Company Delete successfully
```


## Endpoint JOB

## Add Data JOB
This is API endpoint as a create new data JOB

### Request URL
```
- POST localhost:8080/jobs
```

### Request body
```json
{
  "name" : "PT A",
  "description" : "desc PT A"
}
```

### Response
```
JOB insert successfully
```


## Get List Data JOB
This is API endpoint as a get List all data JOB

### Request URL
```
- GET localhost:8080/jobs
```

### Request
```
No parameters
```

### Response
```json
[
  {
    "id": 1,
    "name": "PT A",
    "description": "desc PT A",
    "reviews": []
  }
]
```

## Update Data JOB
This is API endpoint as a update data JOB existing by id

### Request URL
```
- PUT localhost:8080/jobs/1
```

### Request body
```json
{
  "id": 1,
  "name": "PT B",
  "description": "desc B"
}
```

### Response
```
JOB update successfully
```


## Delete Data JOB
This is API endpoint as a delete data JOB by id
### Request URL
```
- DELETE localhost:8080/jobs/1
```

### Request
```
No parameters
```

### Response
```
JOB Delete successfully
```
