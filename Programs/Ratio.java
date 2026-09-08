import java.util.Scanner;
class Ratio{
	public static void main(String[] args) {
		float ratio;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter female: ");
		int female =sc.nextInt();
		System.out.println("enter male: ");
		int male =sc.nextInt();
		ratio=(float)female/male;
		System.out.println("Ratio : "+ratio);
	}
}