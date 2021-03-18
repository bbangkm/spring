package kr.ac.inhatc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MvcController {

	@RequestMapping("hello")
	public String hello() {
		return "hello world!!";
	}
	
}
