package study.spring.day1113;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhotoUploadController {

	@GetMapping("/uploadform1")
	public String upload1()
	{
		return "uploadform1"; 
	}
	
	@GetMapping("/uploadform2")
	public String upload2()
	{
		return "uploadform2"; 
	}
	
	@PostMapping("/upload1")
	public String uploadgo1()
	{
		return "uploadresult1";
	}
	
	@PostMapping("/upload2")
	public String uploadgo2()
	{
		return "uploadresult2";
	}
}
