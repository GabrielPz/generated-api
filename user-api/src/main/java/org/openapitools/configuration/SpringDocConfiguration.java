package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("User API")
                                .description("A simple CRUD API for managing users with Keycloak authentication")
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("keycloak", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                )
        ;
    }
}