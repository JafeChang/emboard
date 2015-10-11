package info.jafe.emboard.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.service.PostService;

@Controller
public class PostController {

	@Autowired
	private PostService postService;

	@RequestMapping("addpost")
	public String addpost(@RequestParam String topic, @RequestParam String body, @RequestParam String shortcut,
			HttpSession session ) {
		User user = (User) session.getAttribute("user");
		int id = user.getId();
		String author = user.getEmail();//TODO change email to nickname 
		shortcut = shortcut.length() > 140 ? shortcut.substring(0, 140) : shortcut;
		int postid = postService.add(topic, body, "", id, author, shortcut);
		return "redirect:post?postid="+postid;
	}
	
	@RequestMapping("post")
	public String post(@RequestParam int postid, HttpSession session){
		Post post = postService.getByPostId(postid);
		session.setAttribute("post", post);
		return "jsp/post";
	}
	
	

}
