package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}
	
	@GetMapping("/jenkins")
	@ResponseBody
	public String getMsg(){
		return "hello jenkins";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String getMsg2(){
		return "hello jenkins2";
	}
}
