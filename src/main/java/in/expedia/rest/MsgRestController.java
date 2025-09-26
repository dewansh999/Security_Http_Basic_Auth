package in.expedia.rest;



@RestController
public class MsgRestController {

	@GetMapping("/contact")
	public String contactUs() {
		return "Contact : +91 9755585161";
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		return "Good Morning";
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome to Ashok it...!!";
	}

}
