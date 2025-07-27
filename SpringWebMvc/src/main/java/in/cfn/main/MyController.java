package in.cfn.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
//	Not Used this way.
//	@PostMapping("/submitForm")
//	public String handleMyForm(HttpServletRequest req) {
//		String myName = req.getParameter("name1");
//		String myEmail = req.getParameter("email1");
//		String myPhone = req.getParameter("phoneno1");
//		
//		System.out.println("Name : " + myName);
//		System.out.println("Email : " + myEmail);
//		System.out.println("Phone no : " + myPhone);
//		
//		return "profile";
//	}
	
	
	// Method to get data from one to another page using @RequestParam annotation.
	// Note: To send data to profile page we use Model.	
	
//	@PostMapping("/submitForm")
//	public String handleMyForm(@RequestParam("name1") String myName, @RequestParam("email1") String myEmail, @RequestParam("phoneno1") String myPhone, Model model) {
//		
//		System.out.println("Name : " + myName);
//		System.out.println("Email : " + myEmail);
//		System.out.println("Phone no : " + myPhone);
//		
//		model.addAttribute("model_name", myName);
//		model.addAttribute("model_email", myEmail);
//		model.addAttribute("model_phoneno", myPhone);
//		
//		return "profile";
//	}
	
	
//	If lots of data is there.
	@PostMapping("/submitForm")
	public String handleMyForm(@RequestParam("name1") String myName, @RequestParam("email1") String myEmail, @RequestParam("phoneno1") String myPhone, Model model) {
		
		System.out.println("Name : " + myName);
		System.out.println("Email : " + myEmail);
		System.out.println("Phone no : " + myPhone);
		
		model.addAttribute("model_name", myName);
		model.addAttribute("model_email", myEmail);
		model.addAttribute("model_phoneno", myPhone);
		
		return "profile";
	}
	
	
	
}