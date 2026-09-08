import java.util.Scanner;
class StringArray{
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("How many strings : ");
		int n=args.length;
		String str[]= new String[n];
		for(int i =0 ; i<n;i++){
		System.out.print("enter elemnt :");
		str[i]=sc.next();
	}
	System.out.println("display : ");
	for(int i =0 ; i<n;i++){

		System.out.println(str[i]);
		}
	for(int j=1;j<n;j++){
		for(int i=0;i<n-j;i++){
			if (str[i].compareTo(str[i+1])>0){
				String temp;
				temp =str[i];
				str[i]=str[i+1];
				str[i+1]=temp;
			}
		}
	}
	System.out.println("ascending display : ");
	for(int i =0 ; i<n;i++){

		System.out.println(str[i]);
		}

	for(int j=1;j<n;j++){
		for(int i=0;i<n-j;i++){
			if (str[i].compareTo(str[i+1])<0){
				String temp;
				temp =str[i];
				str[i]=str[i+1];
				str[i+1]=temp;
			}
		}
	}
	System.out.println("Descengding display : ");
	for(int i =0 ; i<n;i++){

		System.out.println(str[i]);
		}
	}
}