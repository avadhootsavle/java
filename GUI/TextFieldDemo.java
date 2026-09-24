import java.awt.*;
class TextFieldDemo extends Frame
{
	TextField tf1,tf2,tf3,tf4,tf5;
	Label lbl,lbl2;
	Button btn1,btn2;
	TextFieldDemo(String title)
	{
		super(title);  
		setSize(300,300);
		setLayout(new FlowLayout());
		tf1=new TextField();
		add(tf1);
		tf2=new TextField(10);
		add(tf2);
		tf3=new TextField("default Text");
		add(tf3);
		tf4=new TextField(10);
		tf4.setEchoChar('*');
		add(tf4);
		tf5=new TextField(12);
		tf5.setEditable(false);
		add(tf5);
		setVisible(true);
	}
	public static void main(String[] args) {
		TextFieldDemo f=new TextFieldDemo("TextFieldDemo");
	}
}