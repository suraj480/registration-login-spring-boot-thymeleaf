# Register and Login using Springboot, Thymeleaf and Mysql
## In this as we have added spring security dependency so springboot will provide default login page with username and password by default userName=user and password is given in console of application {you can also customize in properties} 

1. Appply ManyToMany mapping on collection< Role> becoz we need to retrive role along with user (if you don't want you can use lazy) also apply cascade=CascadeType.ALL for do operation like persist,merge ,remove(whenver such operation is done on parent it will be done on child also)

# Adding security configuration
1. Add spring-boot-starter-security started dependency in pom.xml
2. create package and class for SecurityConfiguration.java
3. add configuration in config.java 
4. extend userService to UserDetailsService
5. override method in UserServiceImpl