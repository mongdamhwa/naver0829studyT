package data.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import data.dao.MemoDao;

@RestController
public class MemoRestController {
	@Autowired
	private MemoDao memoDao;
	
	private String photo;//먼저 사진을 업로드할건데 그때 저장할 파일명
	
	//파일 업로드시 호출되는 메서드
	@PostMapping("/memo/upload")
	public String fileUpload(@RequestParam MultipartFile upload,HttpServletRequest request)
	{
		System.out.println("업로드한 파일명:"+upload.getOriginalFilename());
		//파일을 업로드할 위치
		String path=request.getSession().getServletContext().getRealPath("/resources/upload");
		System.out.println(path);
		
		//랜덤 파일명
		photo=UUID.randomUUID().toString();
		
		//업로드
		try {
			upload.transferTo(new File(path+"/"+photo));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return photo;
	}

}










