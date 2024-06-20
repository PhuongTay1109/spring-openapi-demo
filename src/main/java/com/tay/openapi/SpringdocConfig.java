package com.tay.openapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.Content;
import io.swagger.v3.oas.models.media.MediaType;
import io.swagger.v3.oas.models.responses.ApiResponse;
@Configuration
@OpenAPIDefinition
public class SpringdocConfig {

    @Bean
    OpenAPI baseOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Spring Doc")
                .version("1.0.0")
                .description("Spring doc"))
                .components(new Components()
                        .addResponses("badRequestApi", createApiResponse("Bad Request"))
                        .addResponses("internalServerErrorApi", createApiResponse("Internal Server Error"))
                        .addResponses("unauthorizedApi", createApiResponse("Unauthorized")));
    }

    private ApiResponse createApiResponse(String description) {
        return new ApiResponse()
                .description(description)
                .content(new Content()
                        .addMediaType("application/json", new MediaType()));
    }
}
