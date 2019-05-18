package rad.spring.cloud.config.poc.cliente;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SCCClienteApp implements CommandLineRunner {
	
	@Value("${contexto.prop1Dato:Valor default}")
	private String contextoProp1Dato;
	@Value("${contexto.yaml1Dato:Valor default}")
	private String contextoYaml1Dato;

	public static void main(String[] args) {
		SpringApplication.run(SCCClienteApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("contextoProp1Dato:"+contextoProp1Dato);
		System.out.println("contextoYaml1Dato:"+contextoYaml1Dato);
		
	}
}
