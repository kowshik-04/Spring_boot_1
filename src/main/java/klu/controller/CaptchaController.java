package klu.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import klu.model.CaptchaManager;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {
	
	@Autowired
	CaptchaManager CM;
	
	@GetMapping("/getcaptcha/{length}")
	public String getCaptcha(@PathVariable("length") int captchaLength)
	{
		//return CM.generateText(captchaLength);
		
		return Base64.getEncoder().encodeToString(CM.generateCaptcha(captchaLength));
	}
}
