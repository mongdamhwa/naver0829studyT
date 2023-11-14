package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import board.data.BoardDao;
import lombok.AllArgsConstructor;

@Controller
//@AllArgsConstructor
public class BoardListController {
	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("/board/list")
	public String list(Model model)
	{
		//��ü ���� ��������
		int totalCount=boardDao.getTotalCount();
		
		//model �� ����
		model.addAttribute("totalCount", totalCount);
		return "list";
	}
	
}
