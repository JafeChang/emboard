package info.jafe.emboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.jafe.emboard.entity.User;
import info.jafe.emboard.service.PostService;

@Controller
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping("addpost")
	public String addpost(@RequestParam String topic, @RequestParam String body, HttpSession session) {
		User user = (User) session.getAttribute("user");
		int id = user.getId();
		postService.add(0, topic, body, "", id);
		return "index";
	}

}
