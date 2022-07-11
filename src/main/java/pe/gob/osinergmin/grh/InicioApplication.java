package pe.gob.osinergmin.grh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class InicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InicioApplication.class, args);
	}
	
	
	
	
	
	


  

}
