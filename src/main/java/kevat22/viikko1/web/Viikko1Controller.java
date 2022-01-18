package kevat22.viikko1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Viikko1Controller {
	@RequestMapping("/index")
	@ResponseBody
	public String mainPage() {
		return"This is the main page";
	}
	@RequestMapping("/contact")
	@ResponseBody
	public String contactPage() {
		return"This is the contact page";
	}
	@RequestMapping("/hello")
	@ResponseBody
	public String helloPage(@RequestParam(name="location")String paikka,
			@RequestParam(name="name")String nimi) {
		return"Welcome to the " + paikka +" " + nimi;
	}
	
}
