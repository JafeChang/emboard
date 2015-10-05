package info.jafe.emboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PtestController {

	@RequestMapping("ptestC")
	public String ptest(){
		System.out.println("ptest");
		return "ptest";
	}
}
