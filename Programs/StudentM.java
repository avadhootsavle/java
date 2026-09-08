class Person{
private String name;
private int age;
Person(){}
Person(String n , int a){
	name =n;
	age =a;
}
void getPerson(){
	System.out.println("Name : "+name);
	System.out.println("Age : "+age);
}
}
class Employee extends Person{
private int code;
private double bsal;
Employee(){}
Employee(String n , int a, int c,double b ){
	super(n,a);
	code =c;
	bsal =b;
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
class PersonM{
	public static void main(String[] args) {
		Employee e = new Employee("Avadhoot",17,1,1000);
		e.getEmp();
		System.out.println("gross sal : "+e.gSal());
	}
}