package in.cfn.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
//	@RequestMapping(value = "/helloPage", method= RequestMethod.GET)
	@GetMapping("/helloPage")
	public ModelAndView openHelloPage(){
		System.out.println("openHelloPage() method executed");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello");
		
		return mav;
	}
	
	
	
	@GetMapping("/aboutUs")
	public String openAboutUsPage() {
		return "about-us";
	}
	
	
	
	@GetMapping("/myForm")
	public String openMyFormPage() {
		return "my-form";
	}
	
	
//	Method to get data from one to another page.
	
	
	@PostMapping("/submitForm")
	public String handleMyForm(HttpServletRequest req) {
		String myName = req.getParameter("name1");
		String myEmail = req.getParameter("email1");
		String myPhone = req.getParameter("phoneno1");
		
		return "profile";
	}
	
	
	
}