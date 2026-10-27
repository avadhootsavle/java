import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingFrame extends JFrame implements ActionListener, WindowListener{
	JLabel nameL,passL;
	JButton submitB;
	JTextField nameT;
	JPasswordField passT;
	SwingFrame(String title){
		super(title);
		setSize(400,400);
		setVisible(true);
		setLayout(new GridLayout(4,2,10,10));
		nameL = new JLabel("Enter name : ");
		passL = new JLabel("Enter pass : ");
		submitB = new JButton("submit");
		nameT= new JTextField(10);
		passT=new JPasswordField(10);
		 add(nameL);
		 add(nameT);
		 add(passL);
		 add(passT);
		 add(submitB);
		 submitB.addActionListener(this);
		 addWindowListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e){
String un="avd",pas="123";
String n=nameT.getText();
String p=new String(passT.getPassword()); 
if(e.getSource()==submitB){
	if(n.equals(un)&&p.equals(pas)){
JOptionPane.showMessageDialog(null, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
	}
else{
	JOptionPane.showMessageDialog(this,"Login unsucces","Fail",JOptionPane.ERROR_MESSAGE);
}
}
}
public void windowClosing (WindowEvent e){
	//sSystem.exit(0);
	dispose();
}
public void windowClosed(WindowEvent e){}
public void windowOpened(WindowEvent e){}
public void windowIconified(WindowEvent e){}
public void windowDeiconified(WindowEvent e){}
public void windowActivated(WindowEvent e){}
public void windowDeactivated(WindowEvent e){}
}


class swing{
	public static void main(String[] args) {
		SwingFrame s = new SwingFrame("demo");
	}
}