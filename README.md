#Start Spring
[https://start.spring.io](https://start.spring.io)

```Eureka Server - Eureka Discovery - Feign - Hystrix```

#Eureka
[http://localhost:8761](http://localhost:8761)

#Zuul
[http://localhost:8080/health](http://localhost:8080/health)

#MicroService One

#By Zuul
[http://localhost:8080/client-one/api/hi](http://localhost:8080/client-one/api/hi)

#By MicroService
[http://localhost:8081/api/hi](http://localhost:8081/api/hi)

#MicroService Two

#By Zuul
[http://localhost:8080/client-two/api/hi](http://localhost:8080/client-two/api/hi)

#By MicroService
[http://localhost:8082/api/hi](http://localhost:8082/api/hi)

#Accessing MicroService Two by MicroService One Using Hystrix
[http://localhost:8080/client-one/api/hy](http://localhost:8080/client-one/api/hy)
