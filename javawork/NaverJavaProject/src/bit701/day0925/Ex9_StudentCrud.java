package bit701.day0925;

import java.util.Scanner;

import db.DbConnect;

public class Ex9_StudentCrud {
	DbConnect db=new DbConnect();
	Scanner sc=new Scanner(System.in);
	
	public int getMenu()
	{
		System.out.println("1.추가  2.삭제  3.수정  4.전체출력  5.검색  6.종료");
		int menu=Integer.parseInt(sc.nextLine());
		return menu;
	}

	//insert
	public void insertStudent()
	{
		
	}
	
	//delete
	public void deleteStudent()
	{
		
	}
	
	//update
	public void updateStudent()
	{
		
	}
	
	//전체 출력
	public void selectAllStudent()
	{
		
	}
	
	//검색-번호 끝 4자리로 검색
	public void searchPhone()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9_StudentCrud ex=new Ex9_StudentCrud();
		
		while(true)
		{
			System.out.println("-".repeat(40));
			int menu=ex.getMenu();
			System.out.println("-".repeat(40));
			switch(menu)
			{
			case 1:
				ex.insertStudent();
				break;
			case 2:
				ex.deleteStudent();
				break;
			case 3:
				ex.updateStudent();
				break;
			case 4:
				ex.selectAllStudent();
				break;
			case 5:
				ex.searchPhone();
				break;
			default:				
				System.out.println("** 프로그램을 종료합니다 **");
				System.exit(0);
			}
		}

	}

}












