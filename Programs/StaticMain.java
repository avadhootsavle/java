class StaticDemo{
	static int a =10,b=20;
	int c=30;
	static void callme(){
		System.out.println("a = "+a);
		sayHello();
	}
 static void sayHello(){
		System.out.println("hello");
	}
}
class StaticMain{
	public static void main(String[] args) {
		StaticDemo.callme();
		System.out.println("b = "+StaticDemo.b);
		//System.out.println("c = "+StaticDemo.c);
		//StaticDemo.sayHello();
	}
}