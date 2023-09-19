package bit701.day0919;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex4_ClientChat extends JFrame{
	String nickName;
	JTextArea area;
	JTextField tfNickName,tfMessage;
	JButton btnSend,btnConnect;
	
	public Ex4_ClientChat() {
		// TODO Auto-generated constructor stub
		this.setBounds(1000, 100, 400, 400);
		this.setDesign();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void setDesign() {
		// TODO Auto-generated method stub
		JPanel pTop=new JPanel();
		tfNickName=new JTextField("이문희");//자기이름으로 초기값
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_ClientChat client=new Ex4_ClientChat();

	}

}










