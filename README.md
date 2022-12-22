# About
Project created in the course Microservices with Spring Boot.

## Requirements
* Java 17.x.x
* Maven 3.8.5
* MySQL 8.x.x

## Steps to Setup
1. Clone the application
```
git clone https://github.com/erosvitor/payroll-suite.git
```

2. Build the project
```
mvn package
```

3. Deploy in containers
```
sh deploy.sh
```

4. Access Eureka Dashboard
```
http://localhost:8761
```

5. Get IP address of Gateway Service
```
docker inspect gateway-payroll | grep IPAddress
```

## Using the project

Run the Postman and create the following requests

1. Insert a employee
```
POST http://{IP-GATEWAY}:8888/employee

{
  "name": "Fulano da Silva",
  "salary": 3500.00,
  "birthday": "1975-01-10",
  "dependents": [
    {
      "name": "Siclano Gomes",
      "birthday": "1981-12-03"
    },
    {
      "name": "Beltrano Pereira",
      "birthday": "2001-05-25"
    }
  ]
}
```

2. Get all employees
```
GET http://{IP-GATEWAY}:8888/employee
```

3. Update employe data
```
PUT http://{IP-GATEWAY}:8888/employee

{
  "id": 1,
  "name": "Fulano da Silva Pedroso",
  "salary": 5500.00,
  "birthday": "1975-01-10",
  "dependents": [
    {
      "id": 1,   
      "name": "Siclano Gomes",
      "birthday": "1981-12-03"
    },
    {
      "id": 2,  
      "name": "Beltrano Pereira",
      "birthday": "2001-05-25"
    }
  ]
}
```

5. Get salary
```
GET http://{IP-GATEWAY}:8888/employee/{EMPLOYEE-ID}/salary
```

6. Get Impostos
```
GET http://{IP-GATEWAY}:8888/impostos/employee/{EMPLOYEE-ID}
```

7. Delete employee
```
http://{IP-GATEWAY}:8888/employee/{EMPLOYEE-ID}
```

## License
This project is under license from MIT. For more details, see the LICENSE file.
