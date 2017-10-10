package br.com.dodz.securityserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("bootiful")
                .secret("secret")
                .accessTokenValiditySeconds(300)
                .authorities("CLIENT")
                .authorizedGrantTypes("client_credentials")
                .scopes("read", "write")
                .resourceIds("restservice","oauth2-resource");
    }
}
