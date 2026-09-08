class A{
	int i,j;
	A(int a,int b)
	{
		i=a;
		j==b;
	}
	void show(){
		System.out.println("i = "+i);
		System.out.println("j = "+j);
	}
}
class B extends A{
	int k;
	B(int a,int b,int c)
	{
		super(a,b);
		k=c;
	}
	void show(){  
		System.out.println("K = "+k);
	}
}
class Override
{
	public static void main(String[] args) {
		B ob=new B(1,2,3);
		ob.show();
	}
}