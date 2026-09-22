import java.awt.Frame;
class MyFrame extends Frame{
	MyFrame(String t){
		//super(t);
		setTitle(t);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame("hi");
	}
}