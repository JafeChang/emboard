package info.jafe.emboard.controller.copy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.jafe.emboard.dao.UserDao;

@Controller
public class RegisterController {

	@RequestMapping("/register")
	public String register(@RequestParam("email") String email, @RequestParam("password") String password,
			@RequestParam("invitationcode") String invitationcode) {
		UserDao userDao = new UserDao();
		userDao.addUser(email, password, invitationcode);
		//TODO invitationcode
		return "redirect:/";
	}
}
