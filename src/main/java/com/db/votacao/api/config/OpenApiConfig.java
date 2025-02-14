package com.db.votacao.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI votacaoOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Votação")
                        .description("API para gerenciamento de sessões de votação em assembleias")
                        .version("1.0")
                        .contact(new Contact()
                                .name("Time de Desenvolvimento")
                                .email("dev@empresa.com")));
    }
}
