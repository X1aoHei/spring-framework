package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WsController {
	@RequestMapping("/test")
	public String say(){
		return "hello";
	}
}
