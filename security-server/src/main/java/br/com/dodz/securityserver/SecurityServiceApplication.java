package br.com.dodz.securityserver;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *  curl -w \\n bootiful:secret@localhost:8080/security/oauth/token -d "grant_type=client_credentials&scope=read%20write"
 *
 */
@SpringCloudApplication
public class SecurityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityServiceApplication.class, args);
    }
}

@RestController
class UserDetailsController {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Principal authenticatedUser(Principal user) {
        return user;
    }
}