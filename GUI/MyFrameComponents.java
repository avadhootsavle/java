import java.awt.*;
class MyFrameComponents extends Frame{
	Label l1;
	Button b1;
	TextField t1;
	MyFrameComponents(String t){
		super(t);
		setLayout ( new FlowLayout());
		setSize(300,300);
		setVisible(true);
		l1= new Label("Enter name : ");
		t1= new TextField();
		b1 = new Button("Add");
		add(l1);
		add(t1);
		add(b1);		
	}
	public static void main(String[] args) {
		MyFrameComponents f = new MyFrameComponents("hi");
	}
}