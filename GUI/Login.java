import java.awt.*;
class Login extends Frame
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
		
	}
	public static void main(String[] args) {
		Login f=new Login("Login Form");
	}
}