import java.util.Scanner;
class Box{
	double height,width,depth;
	Scanner sc=new Scanner(System.in);
	void setBox(){
		System.out.print("Enter height : ");
		height=sc.nextDouble();
		System.out.print("Enter width : ");
		width=sc.nextDouble();
		System.out.print("Enter Depth : ");
		depth=sc.nextDouble();
	}
	double volume(){
		double vol=width*height*depth;
		return vol;
	}
	void getBox(){
		System.out.println("Widht :"+width);
		System.out.println("height :"+ height);
		System.out.println("depth :"+ depth);
		System.out.println("volume is "+volume());
	}
}
class BoxDemo{
	public static void main(String[] args) {
		Box mybox = new Box();
		mybox.setBox();
		mybox.getBox();
	}
}