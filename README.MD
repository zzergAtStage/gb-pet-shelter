commands, that helps to start project:

### ubuntu srv 22.04:
 - standalone container
   -  ```sudo docker run -d --name db_examlpe -e MYSQL_ROOT_PASSWORD=the_root_password -p 6033:3306 mysql:5.7```   -  
 - exec and configure mysql:
   - ```sudo docker exec -it db_examlpe bash```
   - ```mysql -p```
### Configuring the docker-compose containers:  
docker-compose.yaml:
```
version: '3'

services:
  db:
    image: mysql:5.7
    container_name: db
    environment:
      MYSQL_ROOT_PASSWORD: 1
      MYSQL_DATABASE: app_db
      MYSQL_USER: db_user
      MYSQL_PASSWORD: db_user
      MYSQL_ROOT_PASSWORD=the_root_password
    ports:
      - "6033:3306"
    volumes:
      - dbdata:/var/lib/mysql
  phpmyadmin:
    image: phpmyadmin/phpmyadmin
    container_name: pma
    links:
      - db
    environment:
      PMA_HOST: db
      PMA_PORT: 3306
      PMA_ARBITRARY: 1
    restart: always
    ports:
      - 8081:80
volumes:
  dbdata:

```

 - ```sudo docker-compose -f ~/docker-compose.yaml up -d```  

 - port-forwarding on VM must be like this:
   - localhost:8085:8081 -> 8081:6033
 - phpMyAdmin from local machine: 
   -  0.0.0.0:8081->80/tcp, :::8081->80/tcp  root@db
 
### add springuser to schema:
 - ```mysql> create user 'springuser'@'%' identified by 'ThePassword';``` -- Creates the user  
 - ```mysql> grant all on db_example.* to 'springuser'@'%';``` -- Gives all privileges to the new user on the newly created database  
 - **Don't forget to revoke the broad privileges from _springuser_**


### configure your jpa application

add new configuration to the application.properties:
```spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:8085/AnimalsDB```