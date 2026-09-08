package MyPackage;
class Balance{
	String name;
	double bal;
	Balance(String n, double b){
		name = n;
		bal =b;
	}
	void show(){
		if(bal>0){
			System.out.println("-->");
			System.out.println(name+" : $"+bal );
		}
	}

}
class AccountBalance{
	public static void main(String[] args) {
		Balance current[] = new Balance[2];
		current[0]=new Balance("AS",12.122);
		current[1]=new Balance("MT",1.11);
		for(int i=0;i<2;i++){
			current[i].show();
		}
	}
}