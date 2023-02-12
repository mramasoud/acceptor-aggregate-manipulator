package com.shaparak.mms.biz.acceptoraggregatemanipulator.acceptor.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SecurityConfigurationBuilder;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
@EnableOpenApi
@EnableWebMvc
public class SwaggerConfig {


    public static final Contact DEFAULT_CONTACT =
            new Contact("Kaveh MaynaviMehr",
                    "www.mms.com",
                    "Test@gmail.com");
    public static final ApiInfo DEFAULT_API_INFO =
            new ApiInfo( "Shaparak MMS2 fsmSample ",  "Shaparak MMS2 AAMAcceptor API",
                    "1.0", "urn:tos",
                    DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",
                    new ArrayList<>());

    public static final String AUTHORIZATION_HEADER = "Authorization";

    @Bean(name = "AAMAcceptorAPI")
    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2).
        return new Docket(DocumentationType.OAS_30).
                apiInfo(DEFAULT_API_INFO)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(Lists.newArrayList(apiKey()))
                .securityContexts(Arrays.asList(securityContext()));   }
    @Bean
    public SecurityConfiguration security() {
        SecurityConfiguration securityConfiguration= SecurityConfigurationBuilder.builder()
                .clientId("917092f2d185310c0f4fa8ba3296e33d")
                .clientSecret("f7641c289245d5d43d0aa96d0c14dbc6afba31fc")
                .scopeSeparator(" ")
                .useBasicAuthenticationWithAccessCodeGrant(false)
                .realm("")
                .appName("")
                .build();
        return  securityConfiguration;  }


    private ApiKey apiKey() {
        return new ApiKey("Shaparak MMS2_AAMAcceptor_oauth", AUTHORIZATION_HEADER, "header");
    }

    private AuthorizationScope[] scopes() {
        AuthorizationScope[] scopes = {
                new AuthorizationScope("read", "for read operations"),
                new AuthorizationScope("write", "for write operations"),
                new AuthorizationScope("trust", "for trust operations"),
                //        new AuthorizationScope("api", "Access to API")
        };
        return scopes;
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(
                        Arrays.asList(new SecurityReference("Shaparak MMS2_AAMAcceptor_oauth", scopes())))
                .forPaths(PathSelectors.ant("/"))
                .forPaths(PathSelectors.any())
                .build();
    }
}
