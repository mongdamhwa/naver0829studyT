package myshop.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import mysql.db.DbConnect;

public class MyShopDao {
	DbConnect db=new DbConnect();
	
	//전체 출력
	public List<MyShopDto> getAllSangpums()
	{
		List<MyShopDto> list=new Vector<MyShopDto>();
		Connection conn=db.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from myshop order by num";
		
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				MyShopDto dto=new MyShopDto();//반드시 while문 안에 선언
				dto.setNum(rs.getInt("num"));
				dto.setSangpum(rs.getString("sangpum"));
				dto.setPrice(rs.getInt("price"));
				dto.setPhoto(rs.getString("photo"));
				dto.setColor(rs.getString("color"));
				dto.setWriteday(rs.getTimestamp("writeday"));
				//list 에 추가
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			db.dbClose(rs, pstmt, conn);
		}
		
		return list;
	}
	
	//insert
	public void insertShop(MyShopDto dto)
	{
		String sql="insert into myshop (sangpum,color,price,photo,writeday) values (?,?,?,?,now())";
	}
	
}































