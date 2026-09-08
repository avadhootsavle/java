import java.util.Scanner;
class powb{
	
	String conName;
	int conNum;
	Double units;
Double cal;
	
	void setData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Consumer number ");
		conNum=sc.nextInt();
		System.out.println("Enter Consumer Name ");
		conName=sc.next();
		System.out.println("Enter units consumed : ");
		units=sc.nextDouble();
	}
	Double cal(){
		
		if(units>=0 & units<=200){
			cal=units*0.50;
		}
		else if(units>=201 & units<=400){
			cal= 100+(units-200)*0.65;
		}
		else if(units>=401 & units<=600){
			cal= 230+(units-400)*0.80;
		}
		else{
			cal= 390+(units-600)*1;
		}
		Double tax;
		tax=(cal*0.3)+(cal*0.2)+cal;
		return tax;
	}
	
	void getData(){
		System.out.println("Consumer number: "+conNum);
		System.out.println("Consumer Name: "+conName);
		System.out.println("units consumed: "+units);
		System.out.println("Cost of consumed units : "+cal);
		System.out.println("After tax : "+cal());
	}
}
class Power{
	public static void main(String[] args) {
		powb[] a=new powb[2]; 
		for (int i = 0; i < 2; i++) {
            a[i] = new powb();
            a[i].setData();
        }
        System.out.println("dis");
        for (int i = 0; i < 2; i++) {
            a[i].getData();
        }
	}
}