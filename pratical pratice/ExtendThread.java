class Child extends Thread{
	public void run(){
		for(int i=5;i>0;i--){
			System.out.println("child : "+i);
			try{
			sleep(500);
		}catch(InterruptedException e){
			System.out.println("error : "+e);
		}
		}
		System.out.println("child exiting");
	}
}
class Main extends Thread{
	public void run(){
		for(int i=5;i>0;i--){
			System.out.println("main : "+i);
			try{
			sleep(1000);
		}catch(InterruptedException e){
			System.out.println("error : "+e);
		}
		}
		System.out.println("main exiting");
	}
}
class ExtendThread{
	public static void main(String[] args) {
		Child c =new Child();
		Main m = new Main();
		c.start();
		m.start();
	}
}