package bit701.day0919;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ex4_ServerChat extends JFrame implements Runnable{
	JTextArea area;
	
	public Ex4_ServerChat() {
		// TODO Auto-generated constructor stub
		super("채팅서버");
		this.setBounds(700, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDesign();
		this.setVisible(true);
	}
	
	//1번 쓰레드의 run 메소드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//서버소켓 생성
		ServerSocket serverSocket=null;
		try {
			serverSocket=new ServerSocket(6000);
			area.append("서버 소켓 생성 성공!!\n");
			
			//접속하는 클라이언트들 허용
			while(true)
			{
				//대기중이다가
				//접송요청하는 클라이언트 허용,허용이 되면 Socket 이 만들어진다
				Socket socket=serverSocket.accept();
				area.append("접속허용 IP:"+socket.getInetAddress().getHostAddress()+"\n");
				this.autoScroll();
			}
			
		} catch (IOException e) {
			area.append("서버 소켓 생성 실패:"+e.getMessage());
		}
	}
	
	//접속한 클라이언트와 대화를 주고받을 내부클래스
	class ClientMember extends Thread
	{
		Socket mySocket;
		BufferedReader br;
		PrintWriter pw;
		String nickName;
		
		public ClientMember(Socket socket) {
			// TODO Auto-generated constructor stub
			mySocket=socket;
			//대화를 주고받을수 있게 io 클래스 얻기
			InputStream is=null;
			try {
				is=mySocket.getInputStream();
				br=new BufferedReader(new InputStreamReader(is));
				pw=new PrintWriter(mySocket.getOutputStream());				
			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
			
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
		}
	}
	
	public void autoScroll()
	{
		int n=area.getDocument().getLength();//총 라인수
		area.setCaretPosition(n);//마지막줄로 위치 변경
	}
	
	private void setDesign() {
		// TODO Auto-generated method stub
		area=new JTextArea();
		this.add(new JScrollPane(area));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_ServerChat serverChat=new Ex4_ServerChat();
		Thread th=new Thread(serverChat);
		th.start();//1번 run 메소드 호출
	}
}









