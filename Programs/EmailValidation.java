import java.util.Scanner;
class EmailValidation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter email: ");
	String mail = sc.next();
	if(mail.indexOf('@')>=0 & mail.indexOf('.')>=0){
		System.out.println("valid");
	}
	else{
		System.out.println("not valid");
	}
	}
}