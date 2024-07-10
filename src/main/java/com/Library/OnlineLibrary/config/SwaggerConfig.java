package com.Library.OnlineLibrary.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@Configuration
@OpenAPIDefinition(info = @Info(title = "OnlineLibrary", version = "1.0", description = "Online library to manage books users loans and reservations", license = @License(name = "JTH"), contact = @Contact(name = "Jhonatan Toro Hurtado", url = "https://jhonatantoro.netlify.app/")))
public class SwaggerConfig {

}
