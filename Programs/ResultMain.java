import java.util.Scanner;
class Sudent
{
	int id,semester;
    String dicipline;
    float m1,m2,m3;
     void setStudent()
     {

     	Scanner sc=new Scanner(system.in);
     	System.out.println("Enter the id of the student ");
     	id=sc.nextInt();
     	System.out.println("Enter the semester of the student");
     	semester=sc.next();
     	System.out.println("Enter the marks f three subject");
     	m1=sc.nextInt();
     	m2=sc.nextInt();
     	m3=sc.nextInt();
     }
     void getStudent()
     {
     	System.out.println("The id of the student is "+id);
     	System.out.println("The semester of the student is "+semester);
     	System.out.println("The discipline of the student is "+dicipline);
     	System.out.println("marks of subject 1 are "+m1);
     	System.out.println("marks of subject 2 are "+m2);
     	System.out.println("marks of subject 3 are "+m3);
     }
}
class Result extends Student
{
     float total;
     void calTotal()
     {
     	Scanner sc=new Scanner(System.in);
     	total=m1+m2+m3;
     }
}
class ResultMain
{
	public static void main(String[] args) {
		Result ob=new Result();
		ob.setStudent();
		ob.getStudent();
	}
}