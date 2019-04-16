package co.com.zea.ovidio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SchoolDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolDemoApplication.class, args);
	}
}
