package bit701.day0919;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ex4_ServerChat extends JFrame{
	JTextArea area;
	
	public Ex4_ServerChat() {
		// TODO Auto-generated constructor stub
		super("채팅서버");
		this.setBounds(700, 100, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDesign();
		this.setVisible(true);
	}
	
	private void setDesign() {
		// TODO Auto-generated method stub
		area=new JTextArea();
		this.add(area);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_ServerChat serverChat=new Ex4_ServerChat();
	}

}
