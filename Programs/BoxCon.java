class Box{
	double height,width,depth;
	Box(){
		height = 2.0;
		width = 1.0;
		depth = 3.0;
	}
	Box(double h,double w, double d ){
		height = h;
		width = w;
		depth = d;
	}
	Box (double dim){
		width=height=depth=dim;
	}
	double volume(){
		return height*width*depth;
	}
}
class BoxCon{
	public static void main(String[] args) {
		Box b1 = new Box();
		System.out.println("volume is "+b1.volume());
		Box b2 = new Box(2.5,3.5,6.5);
		System.out.println("volume is "+b2.volume());
		Box b3 = new Box(5.0);
		System.out.println("volume is "+b3.volume());
	}
}