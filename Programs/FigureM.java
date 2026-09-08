class Figure{
double  d1,d2;
Figure(double a, double b){
d1= a;
d2 =b;
}
double area(){
	System.out.println("undefined");
	return 0;
} 
}
class Triangle extends Figure{
Triangle(double a, double b){
super(a,b);
}
double area(){
	System.out.println("Triangle");
	return d1*d2/2; 
}
}
class Rectangle extends Figure{
Rectangle(double a, double b){
super(a,b);
}
// double area(){
// 	System.out.println("Rectangle");
// 	return d1*d2;
// }
}
class FigureM{
	public static void main(String[] args) {
		Figure a = new Figure(10,10);
		Triangle b = new Triangle(9,5);
		Rectangle c = new Rectangle(10,8);
		Figure f;
		f=b;
		System.out.println("Area : " + f.area()); 
		f=c;
		// System.out.println("Area : " + f.area()); 
		f=a;
		System.out.println("Area : " + f.area());    
	}
}