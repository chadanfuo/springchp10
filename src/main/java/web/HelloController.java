package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello.do")
	public String hello(Model model){
		model.addAttribute("hello", "좋은아침");
		return "hello";
	}
}
