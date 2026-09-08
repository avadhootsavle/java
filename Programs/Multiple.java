import java.util.Scanner;
class Student{
	int id ,sem ,m1,m2,m3;
	String branch;
	void setStudent(){
		Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter id m1 , m2 , m3 & branch : ");
	id=sc.nextInt();
	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	branch=sc.next();
	}
	void getStudent(){
		System.out.println("id : "+id);
		System.out.println("m1 : "+m1);
		System.out.println("m2 : "+m2);
		System.out.println("m3 : "+m3);
		System.out.println("branch : "+branch);
	}
}
interface Sport{
int getSPoints();
}
class Result extends Student implements Sport{
int total;

public int getSPoints(){
	Scanner sc = new Scanner(System.in);
	String con;
	System.out.print("Do you play sports : ");
	con=sc.next();
	if(con.charAt(0)=='y' || con.charAt(0)=='Y'){
	return 10;	
	}
	else{
		return 0;
	}
	
}
int totalCal(){
	total= m1+m2+m3+getSPoints();
	return total;
}
void getResult(){
	getStudent();
	
	System.out.println("total marks : "+totalCal());
}
}
class Multiple{
	public static void main(String[] args) {
		Result r = new Result();
		r.setStudent();
		r.getResult();
	}
}