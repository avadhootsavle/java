import java.util.Scanner;
class Array{
	public static void main(String[] args) {
		int size;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter size : ");
		size=sc.nextInt();
		int a[]=new int[size];
		for(int i =0;i<size;i++){
			System.out.print("enter element : ");
			a[i]=sc.nextInt();
		}
		for(int i =0;i<size;i++){
			System.out.println(a[i]);
		}
		System.out.println(a.length);
	}
}