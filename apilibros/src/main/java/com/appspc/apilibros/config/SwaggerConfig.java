package com.appspc.apilibros.config;

import org.springdoc.core.GroupedOpenApi;
import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
            .group("api")  
            .pathsToMatch("/api/**")  
            .addOpenApiCustomiser(openApiCustomiser())  
            .build();
    }

    private OpenApiCustomiser openApiCustomiser() {
        return openApi -> openApi.info(new Info()
            .title("App Libros") 
            .version("1.0.0") 
            .description("App Libros para java")); 
    }
}
