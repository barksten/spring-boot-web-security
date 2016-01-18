# spring-boot-web-security
Simple example how to secure a Spring Boot web application with Spring Security.

## Try it
1. gradle bootRun
2. Open browser at [http://localhost:8080](http://localhost:8080) and follow the instructions.

## The application
...is built of five four (HTML-pages) and four Java-classes.

### Views
#### /home
Can be viewed by anyone, even not logged in.
#### /hello
Can be viewed by any logged in user.
#### /admin
Can only be viewed by users with the ADMIN role.
#### /sune
Can be viewed by users with the ADMIN or SUNE role. (sune is my favourite variabel name)

### Java-classes
#### Application.java
Bootstrap for the application.
#### InMemoryUserDetailsService.java
In memory-store for users.
#### MvcConfig.java
MVC-specific configuration, for example views.
#### WebSecurityConfig.java
Secuurity configuration.

