package bit701.day0922;

public class Ex3_MysqlGroupSawon {
	static final String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String MYSQL_URL="jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";

	Ex3_MysqlGroupSawon(){
		try {
			Class.forName(MYSQL_DRIVER);
			//System.out.println("Mysql 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("Mysql 드라이버 실패:"+e.getMessage());
		}
	}
	
	public void sawonBunseok()
	{
		String sql="select buseo,count(*) count,max(score) maxscore,"
				+ "min(score) minscore,avg(score) avgscore from sawon group by buseo";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_MysqlGroupSawon ex=new Ex3_MysqlGroupSawon();
		ex.sawonBunseok();
	}

}
