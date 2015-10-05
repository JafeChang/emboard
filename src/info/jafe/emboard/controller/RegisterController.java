package info.jafe.emboard.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
			session.setAttribute("hasLogin", true);
			return "redirect:/";
		}

	}
	
	
}
