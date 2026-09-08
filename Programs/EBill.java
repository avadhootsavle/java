import java.util.Scanner;
class bill{
Scanner sc = new Scanner(System.in);
float unit;
String name;
int customer_no;
void setBill(){
System.out.print("Enter name : ");
name=sc.next();
System.out.print("Enter customer_no : ");
customer_no=sc.nextInt();
System.out.print("Enter units consumed : ");
unit=sc.nextFloat();
}
float calBill(){
	float amt;
	if(unit<=100){
		amt=3*unit;
	}
	else if(unit>=101&unit<=200){
		amt=300+(5*(unit-100));
	}
	else{
		amt=300+200+(7*(unit-200));
	}
	return amt;
}
void getBill(){
	System.out.println("Name : "+name);
	System.out.println("Customer no : "+customer_no);
	System.out.println("Units consumed : "+unit);
	System.out.println("Total Amount : "+calBill());
}
}
class EBill{
	public static void main(String[] args) {
		bill ebill = new bill();
		ebill.setBill();
		ebill.getBill();
	}
}