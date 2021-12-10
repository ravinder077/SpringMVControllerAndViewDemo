package springmvc.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index()
	{
	  return "index";	
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
	 ModelAndView model=new ModelAndView();
	 model.addObject("msg","this is about from controller");
	 model.setViewName("about");
	
	 return model;
	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("msg","message from home controller");	
	  return "home";	
	}
	
	

}
