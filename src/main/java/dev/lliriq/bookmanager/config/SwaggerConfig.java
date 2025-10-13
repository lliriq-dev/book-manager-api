package dev.lliriq.bookmanager.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI bookManagerAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Book Manager API")
                        .description("This is the Book Manager API")
                        .version("v0.0.1")
                        .contact(new Contact()
                                .name("Kirill Konovalov")
                                .email("llyriq@yandex.ru")));
    }
}
