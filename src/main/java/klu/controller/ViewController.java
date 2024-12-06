package klu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController("/")
public class ViewController {
	@GetMapping("/")
	public ModelAndView index()
	{
		ModelAndView MV = new ModelAndView();
		MV.setViewName("index");
		return MV;
	}
}
