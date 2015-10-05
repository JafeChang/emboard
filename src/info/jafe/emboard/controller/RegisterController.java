package info.jafe.emboard.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.jafe.emboard.service.UserService;

@Controller
public class RegisterController {

	@RequestMapping("register")
	public String register(@RequestParam("email") String email, @RequestParam("password") String password,
			@RequestParam("invitationcode") String invitationcode) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = ctx.getBean(UserService.class);
		userService.add(email, password, invitationcode);
		return "redirect:/";
	}
}
