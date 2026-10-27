class Odd implements Runnable{
	public void run(){
		for(int i=1;i<=30;i++){
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
class Even implements Runnable{
	public void run(){
		for(int i=1;i<=30;i++){
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
class Div implements Runnable{
	public void run(){
		for(int i=1;i<=30;i++){
			if(i%3==0){
				System.out.println("Div by 3 : "+i);
			}
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}
		System.out.println("Div exiting");
	}
}
class Multi{
public static void main(String[] args) {
	Odd o= new Odd();
	Even e= new Even();
	Div d= new Div();
	Thread odd=new Thread(o);
	Thread even=new Thread(e);
	Thread div=new Thread(d);
	odd.start();
	even.start();
	div.start();
	try{
	odd.join();
	even.join();
	div.join();
	}catch(InterruptedException ae){
	System.out.println(ae);
	}
	System.out.println("Main exiting");
}
}