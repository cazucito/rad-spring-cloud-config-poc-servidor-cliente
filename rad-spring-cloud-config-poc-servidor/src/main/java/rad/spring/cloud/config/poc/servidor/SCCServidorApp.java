package rad.spring.cloud.config.poc.servidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SCCServidorApp {
	public static void main(String[] args) {
		SpringApplication.run(SCCServidorApp.class, args);
	}
}
