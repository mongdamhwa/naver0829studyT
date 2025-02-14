package bit701.day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex1_OracleJdbc {
	static final String ORACLE_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:xe";
	
	public Ex1_OracleJdbc() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName(ORACLE_DRIVER);
			//System.out.println("오라클 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 오류:"+e.getMessage());
		}
	}
	
	public void shopAllDatas()
	{
		Connection conn=null;
		
		Statement stmt=null;
		ResultSet rs=null;//select 일경우에만 필요
		String sql="select * from shop order by sang_no";
		
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "angel", "a1234");
			//System.out.println("오라클 연결 성공");
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);// select 일경우는 무조건 executeQuery(반환타입이 ResultSet)
			
			//rs.next() : 다음데이타로 이동을 하고 true 반환,이동할 데이타가 없을경우 false반환
			
			System.out.println("상품번호\t상품명\t가격\t색상");
			System.out.println("=".repeat(40));
			int total=0;
			while(rs.next())
			{
				//데이타를 가져올때 인덱스로 가져오거나 컬럼명으로 가져온다
				//일단 인덱스로 가져와보자
//				String no=rs.getString(1);
//				String name=rs.getString(2);
//				int price=rs.getInt(3);
//				String color=rs.getString(4);
				
				//이번에는 컬럼명으로 가져와보자
				String no=rs.getString("sang_no");
				String name=rs.getString("sang_name");
				int price=rs.getInt("sang_price");
				String color=rs.getString("sang_color");
				
				total+=price;
				
				System.out.println(no+"\t"+name+"\t"+price+"\t"+color);
			}
			System.out.println("\n총금액:"+total);
			
		} catch (SQLException e) {
			System.out.println("오라클 연결 실패:"+e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException|NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_OracleJdbc ex=new Ex1_OracleJdbc();
		ex.shopAllDatas();
	}

}











