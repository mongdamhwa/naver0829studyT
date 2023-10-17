package simpleboard.data;

import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;

public class SimpleBoardDao {
	DbConnect db=new DbConnect();
	
	//목록
	public List<SimpleBoardDto> getAllList()
	{
		List<SimpleBoardDto> list=new Vector<SimpleBoardDto>();
		String sql="select * from simpleboard order by num desc";
		
		return list;
	}
	
	//insert
	public void insertBoard(SimpleBoardDto dto)
	{
//		String sql="insert into simpleboard (writer,subject,content,photo,writeday)"
//				+ " values (?,?,?,?,now())";
		
		String sql="""
				insert into simpleboard (writer,subject,content,photo,writeday)
				 values (?,?,?,?,now())
				""";
	}
	
	//내용보기
	public SimpleBoardDto getData(String num)
	{
		SimpleBoardDto dto=new SimpleBoardDto();
		String sql="select * from simpleboard where num=?";
		
		return dto;
	}
	
	//조회수 증가
	public void updateReadcount(String num)
	{
		String sql="update simpleboard set readcount=readcount+1 where num=?";
		
	}
}








