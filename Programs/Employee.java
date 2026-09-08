import java.util.Scanner;
class Emp{
	String name;
	byte id;
	double bSal,Gsal;
	Scanner sc = new Scanner(System.in);
void setEmp(){
	System.out.print("Enter name : ");
	name=sc.next();
	System.out.print("Enter id : ");
	id=sc.nextByte()
	;System.out.print("Enter basic salary : ");
	bSal=sc.nextDouble();
}
double gSal(){
	Gsal=bSal+(bSal*0.75)+(bSal*0.35)+(bSal*0.15);
	return Gsal;
}
void getEmp(){
	System.out.println("Name : "+ name);
	System.out.println("Id : "+ id);
	System.out.println("Basic Salary : "+ bSal);
	System.out.println("Gross Salary : "+ gSal());
}
}
class Employee{
public static void main(String[] args) {
	Emp emp=new Emp();
	emp.setEmp();
	emp.getEmp();
}
}