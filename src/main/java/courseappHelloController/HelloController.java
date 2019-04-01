package courseappHelloController;

import org.springframework.web.bind.annotation.RequestingMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("/hello");
 public String HelloWorld()
 {
	 return "Hello World";
 }
}
