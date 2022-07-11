package pe.gob.osinergmin.grh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class InicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InicioApplication.class, args);
	}
	
	@GetMapping("/")
	@ResponseBody
	public String test() {
		return "Hola SGSV";
	}
	
	
	
	
	
	


  

}
