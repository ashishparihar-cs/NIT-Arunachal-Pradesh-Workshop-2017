package com.nitap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/home")
	public ModelAndView mymethod1(){
		return new ModelAndView("index");
	}
	
	@RequestMapping("/option1")
	public ModelAndView mymethod2(){
		return new ModelAndView("option1","msg","Insert data here");
	}
	
	@RequestMapping("/contactus")
	public ModelAndView mymethod3(){
		return new ModelAndView("option2","msg","Hello First Spring");
	}
	
	@RequestMapping("/option4")
	public ModelAndView mymethod4(){
		return new ModelAndView("option4","msg","Hello First Spring");
	}
	
	@RequestMapping("/option5")
	public ModelAndView mymethod5(){
		return new ModelAndView("option5","msg","Hello First Spring");
	}
	
	@RequestMapping("/option6")
	public ModelAndView mymethod6(){
		return new ModelAndView("option6","msg","Hello First Spring");
	}
	
	@RequestMapping("/option7")
	public ModelAndView mymethod7(){
		return new ModelAndView("option7","msg","Hello First Spring");
	}
	
	
}
