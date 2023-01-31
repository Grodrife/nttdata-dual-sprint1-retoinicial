package com.nttdata.retoinicial.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class SpringFoxConfig implements WebMvcConfigurer{

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().apiInfo(apiInfoMetaData());
	}
	
	private ApiInfo apiInfoMetaData() {

        return new ApiInfoBuilder().title("RETO INICIAL")
                .description("Descripción del reto inicial")
                .contact(new Contact("Gabriel Rodriguez Felix", "", "gabriel.rodriguezfelix.st@emeal.nttdata.com"))
                .license("")
                .licenseUrl("")
                .version("1.0.0")
                .build();
    }
}
