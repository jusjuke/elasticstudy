package kr.co.webmill.reststudy.controller;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MyRestController {
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println(StringUtils.join("thisrr sssss is ", "StringUtil tests"));
		return "wkkkelcome ggg test!";
	}

}
