package com.example.POC1;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class ClassController {

	@Autowired 
	HttpSession session;
	@Autowired
	userMongoRepository repository;
	/*@RequestMapping("/hello")
	public String Welcome() {
		return "welcome";
	}
	 */

	@RequestMapping("/")
	public String home(Map<String, Object> model) {
		return "index";
	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	//@PostMapping("/login")
	public String login(@RequestParam("username") String username, @RequestParam("pwd") String pwd,Model model) {
		User u=repository.findByusername(username);
		try {
		String userName = u.getUsername();
		String pass  = u.getPassword();
		if (pass.equals(pwd)) {
			return "dashboard";
		} 
		else {
			return "errorpage";
		}
		}
		catch(Exception e){
			return "errorpage";
		}

	}

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(){
		return "registration";
	}

	@RequestMapping( value="/save", method = RequestMethod.GET)
	public String write(@RequestParam("username") String username, @RequestParam("pwd") String pwd,Model model) {
		repository.insert(new User(username, pwd));
		return "index";
	}


	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model){
		return "registration";
	}

}