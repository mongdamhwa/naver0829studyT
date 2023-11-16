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
	
	private String photo;//���� ������ ���ε��Ұǵ� �׶� ������ ���ϸ�
	
	//���� ���ε�� ȣ��Ǵ� �޼���
	@PostMapping("/memo/upload")
	public String fileUpload(@RequestParam MultipartFile upload,HttpServletRequest request)
	{
		System.out.println("���ε��� ���ϸ�:"+upload.getOriginalFilename());
		//������ ���ε��� ��ġ
		String path=request.getSession().getServletContext().getRealPath("/resources/upload");
		System.out.println(path);
		
		//���� ���ϸ�
		photo=UUID.randomUUID().toString();
		
		//���ε�
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










