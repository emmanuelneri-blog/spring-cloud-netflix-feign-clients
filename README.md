# spring-cloud-netflix-feign-clients
Simplificando clients HTTP com Feign.

## Pré requisito
- Maven 3
- Java 8

## Preparando ambiente

- ```cd spring-cloud-netflix-feign-clients```
- ```mvn clean package```

## Executando 

Service Discovery (Eureka)
- ```cd eureka```
- ```mvn spring-boot:run```

Aplicação 'situations'
- ```cd situations```
- ```mvn spring-boot:run```

Aplicação 'access'
- ```cd access```
- ```mvn spring-boot:run```

Acessando Eureka: http://localhost:8761
````
Instances currently registered with Eureka

Application	AMIs	Availability Zones	Status
SITUATIONS	n/a (1)	(1)	UP (1) - 192.168.11.247:situations:8070
ACCESS	    n/a (1)	(1)	UP (1) - 192.168.11.247:access:8080
````

## Acessando API


http://localhost:8080/access/teste
