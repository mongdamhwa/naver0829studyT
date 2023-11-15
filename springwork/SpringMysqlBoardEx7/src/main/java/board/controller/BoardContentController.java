package board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import board.data.BoardDao;
import board.data.BoardDto;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardContentController {
	private BoardDao boardDao;
	
	@GetMapping("/simple/content")
	public String content(Model model,@RequestParam int num)
	{
		//조회수 증가
		boardDao.updateReadcount(num);
		//dto 얻기
		BoardDto dto=boardDao.getData(num);
		//model 에 저장
		model.addAttribute("dto", dto);
		return "content";
	}
	
	@GetMapping("/simple/delete")
	public String delete(@RequestParam int num)
	{
		boardDao.deleteBoard(num);
		return "redirect:./list";
	}
	
	@GetMapping("/simple/updateform")
	public String updateForm(Model model,@RequestParam int num)
	{
		//num 에 해당하는 dto 얻기
		BoardDto dto=boardDao.getData(num);
		//dto 를 model 에 저장
		model.addAttribute("dto", dto);
		return "updateform";
	}
}




















