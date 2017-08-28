package com.startzplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@SpringBootApplication
public class MediaApp extends SpringBootServletInitializer
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MediaApp.class);
		
		
	}
	
	@Bean
	public Docket api() { return new Docket(DocumentationType.SWAGGER_2)  
          .select()
          .apis(RequestHandlerSelectors.basePackage("com.startzplay.controller"))              
          .paths(PathSelectors.any())   
          .build()
          .apiInfo(apiInfo());                                         
    }
	
	private ApiInfo apiInfo() {
	ApiInfo apiInfo=  new ApiInfoBuilder()
			   .title("Media Service Demo")
			   .description("REST Service API document")
			   .version("1.0")
			   .build();
	return apiInfo;
	
	}
	
	public static void main(String[] args){
		SpringApplication.run(MediaApp.class, args);
		
		}

}
