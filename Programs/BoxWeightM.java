  class Box{
  	double height , width,depth;
  	Box(){
  	}
  	Box(double h,double w ,double d){
  		height =h ;
  		width=w;
  		depth=d;
  	}
  	void getBox(){
  		System.out.println("height: "+ height);
  		System.out.println("width: "+ width);
  		System.out.println("depth: "+ depth);
  	}
  	double volume(){
  		return height*depth*width;
  	}
  }
  class BoxWeight extends Box{
  	double weight;
  	BoxWeight(double h,double w ,double d,double m){
  		super(w,h,d);
  		weight=m;
  	}
 
  }
  class BoxWeightM{
  	public static void main(String[] args) {
  		BoxWeight b1 = new BoxWeight(10,20,15,34.5);
  		System.out.println("volume = "+b1.volume());
  		System.out.println("weight = "+b1.weight);
  	}
  }