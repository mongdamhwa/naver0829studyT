package study.day1109.mvc1;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //자동으로 xml 설정파일에 bean 이 등록
public class TestController {

	//@RequestMapping("/")   //기본이 GET 방식 : 초기버전부터 모두 가능한 어노테이션
	@GetMapping("/")  //스프링 버전 5부터 가능한 어노테이션
	public String home(Model model)
	{
		model.addAttribute("message","Have a Good Time!!!!!"); //request 에 저장
		model.addAttribute("today", new Date());
		return "result1";
	}
	
	@GetMapping("/shop/list")   //  /shop/list.* 모두 호출가능
	public String go(Model model)
	{
		model.addAttribute("path","/shop/list");
		return "list";
	}
}
