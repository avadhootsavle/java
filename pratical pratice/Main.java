import java.util.Scanner;
class A implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2!=0){
				System.out.println("Odd : "+i);
			}
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		}
		System.out.println("Odd exiting");
	}
}
class B implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%2==0){
				System.out.println("Even : "+i);
			}
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		}
		System.out.println("Even exiting");
	}
}
class C implements Runnable{
	public void run(){
		for(int i=1;i<=20;i++){
			if(i%3==0){
				System.out.println("Div by 3 : "+i);
			}
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			System.out.println(e);
		}
		}
		System.out.println("Div by 3 exiting");
	}
}
class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		try{
			int c = a1/b1;
		}catch(ArithmeticException e){
			System.out.println("enter correct number : "+e);
		}
		Runnable a= new A();
		Runnable b= new B();
		Runnable c= new C();
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		t1.setName("Odd");
		t2.setName("Even");
		t3.setName("Div by 3");
		t1.start();
		t2.start();
		t3.start();
		try{
		t1.join();
		t2.join();
		t3.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Program completed");
	}
}