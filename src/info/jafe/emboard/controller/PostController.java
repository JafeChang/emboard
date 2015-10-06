package info.jafe.emboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {
	@RequestMapping("addpost")
	public String addpost(@RequestParam String topic, @RequestParam String body) {
		System.out.println(topic);
		System.out.println(body);
		return "index";
	}

}
