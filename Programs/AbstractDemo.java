abstract class Figure{
double  d1,d2;
Figure(double a, double b){
d1= a;
d2 =b;
}
abstract double area();
}
class Triangle extends Figure{
Triangle(double a, double b){
super(a,b);
}
abstract double area();
}
class Rectangle extends Figure{
Rectangle(double a, double b){
super(a,b);
}
// double area(){
// 	System.out.println("Rectangle");
// 	return d1*d2;
// }
abstract double area();
}
class AbstractDemo{
	public static void main(String[] args) {
		//Figure a = new Figure(10,10);
		Triangle b = new Triangle(9,5);
		Rectangle c = new Rectangle(10,8);
		Figure f;
		f=b;
		System.out.println("Area : " + f.area()); 
		f=c;
		System.out.println("Area : " + f.area()); 
	
	}
}