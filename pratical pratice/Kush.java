class Number implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			if(i%2==0){
				System.out.println("No divisible by 2 : "+i);
			}
			try{
				Thread.sleep(45);
			}catch(InterruptedException e){
			System.out.println(e);
		}
		}
		System.out.println("Number exiting");
	}
}
class Leap implements Runnable{
	public void run(){
	for(int i=2016;i<=2026;i++){
			if(i%4==0 || i%100==0 || i%400==0){
				System.out.println("Leap year : "+i);
			}
			try{
				Thread.sleep(50);
			}catch(InterruptedException e){
			System.out.println(e);
		}
		}
		System.out.println("Leap exiting");
	}
}

class Kush{
	public static void main(String[] args) {
		Number n= new Number();
		Leap l = new Leap();
		Thread t1= new Thread(n);
		Thread t2 = new Thread(l);
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("Main exiting");
	}
}