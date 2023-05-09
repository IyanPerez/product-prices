# product-prices

##### product-prices is a springBoot application that allows the client to make a request with three params(actualDate, productId, BrandId). Then it will recieve a custom response with the selected params of the Price object that we want to share with the client.
This is the DB:

<img width="700" alt="prices table" src="https://user-images.githubusercontent.com/116182389/236959965-136b470d-ccf7-4fb3-b7bc-d58560590cfe.png">

And this is how it works on postman:

<img width="600" alt="prices table" src="https://user-images.githubusercontent.com/116182389/236961233-ce38b2f1-ec31-4c66-b9c9-c114becebc39.gif">


## Project Setup and Dependencies

<img width="708" alt="image" src="https://user-images.githubusercontent.com/116182389/236962385-d07c27dd-2e19-41e3-afb9-123443f1ebda.png">

### Database configuration:
<img width="306" alt="image" src="https://user-images.githubusercontent.com/116182389/236963103-e798389d-b968-4707-80e4-e93035f29fa0.png">

#### application.properties:
```sh

spring.datasource.url= jdbc:mysql://localhost:3306/dbproductprices
spring.datasource.username= root
spring.datasource.password= 

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQLDialect
spring.jpa.defer-datasource-initialization=true
spring.sql.init.mode=always


spring.jpa.hibernate.ddl-auto= create-drop


```


## Languajes and tools:

<div>
  
  <img align="center" alt="SpringBoot" title="Springboot" height="50" width="50" src="https://pbs.twimg.com/profile_images/1235868806079057921/fTL08u_H_400x400.png">
  <img align="center" alt="SQL" title="SQL" height="50" width="50" src="https://www.jasoft.org/Blog/image.axd?picture=/2021/localdb/SQL-Server-logo.png">
  <img align="center" alt="Lombok" title="Lombok" height="50" width="50" src="https://avatars.githubusercontent.com/u/45949248?s=280&v=4">


</div>

## Created by:
|[<img src="https://avatars.githubusercontent.com/u/116182389?v=4" width=115><br><sub>Iyan Pérez</sub>](https://github.com/IyanPerez) |
| :---: |  
