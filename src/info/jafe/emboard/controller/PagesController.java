package info.jafe.emboard.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.service.PostService;

@Controller
public class PagesController {

	@Autowired
	private PostService postService;

	@RequestMapping("/")
	public String index(HttpSession session) {
		int n = 10;// TODO 10 shall be editable
		List<Post> posts = postService.getPosts(0, n);
		List<Post> postshorts = new ArrayList<Post>();
		for (Post post : posts) {
			Post postshort = post;
			postshort.setBody("");
			postshorts.add(postshort);
		}
		session.setAttribute("postshorts", postshorts);
		return "jsp/index";
	}

	@RequestMapping("write")
	public String write() {
		return "jsp/write";
	}

	@RequestMapping("allposts")
	public String all(@RequestParam int current, HttpSession session) {
		int n = 10;// TODO 10 shall be editable
		int start = (current-1)*10;
		long postAmount = postService.getPostAmount();
		List<Post> posts = postService.getPosts(start, n);
		List<Post> postshorts = new ArrayList<Post>();
		for (Post post : posts) {
			Post postshort = post;
			postshort.setBody("");
			postshorts.add(postshort);
		}
		session.setAttribute("postshorts", postshorts);
		session.setAttribute("currentPage", current);
		session.setAttribute("postsAmountInOnePage", n);
		session.setAttribute("lastPage", postAmount/10+1);
		return "jsp/allposts";
	}
	
	@RequestMapping("search")
	public String search(@RequestParam String queryString, HttpSession session){
		System.out.println(queryString);
		String args[] = queryString.split(" ");
		for(String arg:args){
			System.out.println(arg);
		}
		List<Post> posts = postService.getBySearch(args);
		List<Post> postshorts = new ArrayList<Post>();
		for (Post post : posts) {
			Post postshort = post;
			postshort.setBody("");
			postshorts.add(postshort);
		}
		session.setAttribute("postshorts", postshorts);

		return "jsp/search";
	}
	
}
