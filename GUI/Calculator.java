import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
	TextField n1,n2,result;
	Label l1,l2,l3;
	Button Abtn,Cbtn;
	Calculator(String title)
	{
		super(title);  
		setSize(300,300);
		setLayout(new GridLayout(4,2,10,10));
		
		l1 =new Label("Enter 1st no : ");
		add(l1);
		n1=new TextField(10);
		add(n1);

		l2 =new Label("Enter 2nd no : ");
		add(l2);
		n2=new TextField(10);
		add(n2);

		l3= new Label("Result : ");
		add(l3);
		result= new TextField(100);
		add(result);
		result.setEditable(false);

		Abtn=new Button("Add");
		add(Abtn);

		Cbtn=new Button("Clear");
		add(Cbtn);

		setVisible(true);
		
		Abtn.addActionListener(this);
		Cbtn.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent ae){
		String i1 = n1.getText();
		String i2 = n2.getText();

		//Button btnp =(Button)e.getSource();

		if(ae.getSource()==Abtn){
			int a = Integer.parseInt(i1);
			int b = Integer.parseInt(i2);
			int c = a+b;
			result.setText(""+c);
		}
		else{
			n1.setText("");
			n2.setText("");
			result.setText("");
		}
	}
	public static void main(String[] args) {
		Calculator f=new Calculator("Addition Frame");
	}
}