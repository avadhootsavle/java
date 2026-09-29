import java.awt.*;
import java.awt.event.*;
class Login extends Frame implements ActionListener
{
	TextField tf1,tf2;
	Label lbl,lbl2;
	Button btn1,btn2;
	Login(String title)
	{
		super(title);  
		setSize(300,300);
		setLayout(new GridLayout(3,2,10,10));
		lbl2 =new Label("Username : ");
		this.add(lbl2);
		tf1=new TextField(10);
		this.add(tf1);
		lbl =new Label("Password : ");
		this.add(lbl);
		tf2=new TextField(10);
		tf2.setEchoChar('*');
		this.add(tf2);
		btn1=new Button("Login");
		this.add(btn1);
		btn2=new Button("Clear");
		this.add(btn2);
		this.setVisible(true);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){
		String un="aas",ps="aas";
		String i1 = tf1.getText();
		String i2 = tf2.getText();

		if(un.equals(i1)&& ps.equals(i2)){
			System.out.println("Login Success ");
		}
		else{
			System.out.println("un Success");
		}
	}
	public static void main(String[] args) {
		Login f=new Login("Login Form");
	}
}