class Student{
	int id ,  sem;
	String name ;
Student(int id , String name , int sem){
	this.id=id;
	this.name=name;
	this.sem=sem;
}
void getStudent(){
	System.out.println("id : "+ id);
	System.out.println("name : "+ name);
	System.out.println("sem : "+ sem);
}
}
class Test extends Student{
int m1 , m2 ,m3;
Test(int id , String name , int sem, int m1, int m2 , int m3){
	super(id,name,sem);
	this.m1=m1;
	this.m2=m2;
	this.m3=m3;
}
void getTest(){
	getStudent();
	System.out.println("m1 : "+m1);
	System.out.println("m2 : "+m2);
	System.out.println("m3 : "+m3);
}
}
class Result extends Test{
	Result(int id , String name , int sem, int m1, int m2 , int m3){
		super(id,name,sem,m1,m2,m3);
	}
	double avg(){
		return ((m1+m2+m3)/3);
	}
	double total(){
		return m1+m2+m3;
	}
	void getResult(){
		getTest();
		System.out.println("avg : "+avg());
		System.out.println("total : "+total());
	}
}
class StudentMultilevel{
	public static void main(String[] args) {
		//int id , String name , int sem, int m1, int m2 , int m3
	Result s= new Result(1,"Avadhoot",3,20,20,20);
	s.getResult();	
	}
}