class Person{
private String name;
private int age;
Person(){}
Person(String name , int age){
	this.name =name;
	this.age =age;
}
void getPerson(){
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
}
}
class Student extends Person{
	private int roll_no , m1 ,m2 ,m3;
Student(){}
Student(String name , int age, int roll_no,int m1, int m2, int m3){
	super(name,age);
	this.roll_no =roll_no;
	this.m1 =m1;
	this.m2 =m2;
	this.m3 =m3;
}
double total(){
	return m1+m2+m3;
}
double avg(){
	double avg;
	avg=total()/3;
	return avg;
}
double percentage(){
	return ((total()/9)*10);
}
void getStu(){
	getPerson();
	System.out.println("roll no : "+roll_no);
	System.out.println("total : " + total());
	System.out.println("avg : " + avg());
	System.out.println("percentage : " + percentage());	
}
}
class Employee extends Person{
private int code;
private double bsal;
Employee(){}
Employee(String name , int age, int code,double bsal ){
	super(name,age);
	this.code =code;
	this.bsal =bsal;
}
void getEmp(){
	getPerson();
	System.out.println("code : "+code);
	System.out.println("bsal : "+bsal);
}
double gSal(){
	return (bsal+(bsal*0.65)+(bsal*0.35)+(bsal*0.12));
}
}
class StudentMain{
	public static void main(String[] args) {
		System.out.println("Employee");
		Employee e = new Employee("Avadhoot",17,1,1000);
		e.getEmp();
		System.out.println("gross sal : "+e.gSal());
		System.out.println("----------------------------------");
		System.out.println("Student");
		Student s = new Student("Avadhoot",12,50,23,12,30);
		s.getStu();
	}
}