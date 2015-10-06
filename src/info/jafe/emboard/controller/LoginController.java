package info.jafe.emboard.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.jafe.emboard.entity.User;
import info.jafe.emboard.service.UserService;

@Controller
public class LoginController {

	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, HttpSession session) {
		User user = userService.get(email, password);
		if (user == null) {
			return "error?type=loginError";
		} else {
			session.setAttribute("hasLogin", true);
			session.setAttribute("user", user);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/logoff")
	public String login( HttpSession session) {
			session.removeAttribute("hasLogin");
			session.removeAttribute("user");
			return "redirect:/";
	}
}
