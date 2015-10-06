package info.jafe.emboard.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.jafe.emboard.entity.User;
import info.jafe.emboard.service.UserService;

@Controller
public class RegisterController {

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping("register")
	public String register(@RequestParam String email, @RequestParam String password,
			@RequestParam String invitationcode,HttpSession session) {
		boolean success = userService.add(email, password, invitationcode);
		if (!success) {
			return "error?type=registerError";
		} else {
			User user = userService.get(email, password);
			session.setAttribute("hasLogin", true);
			session.setAttribute("user", user);
			return "redirect:/";
		}

	}
	
	
}
