class Work1 implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%7==0){
				System.out.println("First : "+i);
			}
			try{
			Thread.sleep(50);
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("First exiting");
	}
}
class Work2 implements Runnable{
	public void run(){
		for(int i=11;i<=20;i++){
			if(i%7==0){
				System.out.println("Second : "+i);
			}
			try{
			Thread.sleep(50);
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Second exiting");
	}
}
class Div{
	public static void main(String[] args) {
		Runnable first = new Work1();
		Runnable second= new Work2();
		Thread t1= new Thread(first);
		Thread t2= new Thread(second);
		t1.setName("1st Thread");
		t2.setName("2nd Thread");
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.isAlive();
		System.out.println("Main exiting");
	}
}