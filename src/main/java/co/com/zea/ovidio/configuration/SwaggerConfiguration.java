package co.com.zea.ovidio.configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * © Todos los derechos reservados Banco de Bogotá
 * <p>
 * Clas {Configuration} configuración de Swagger
 * 
 * @author Stiven Diaz
 * 
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("co.com.zea.ovidio"))
            .paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"Proyecto Demo Retorna cursos en los que esta inscrito un estudiante",
				"use esta URL http://localhost:8091/students/Student1/courses", 
				"1.0.0", "", null, "", "",
				Collections.emptyList());
	}
}

