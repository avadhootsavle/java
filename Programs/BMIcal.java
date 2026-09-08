import java.util.Scanner;
class bmi{
double weight,height,bmi;
String name;
void setBMI(){
	Scanner sc= new Scanner(System.in);
		System.out.print("Enter name :");
		name=sc.next();
		System.out.print("Enter the weight (kg): "); 
        weight = sc.nextDouble(); 
        System.out.print("Enter the height (meter): "); 
        height = sc.nextDouble(); 
}
double calBMI(){
	bmi=weight / (height * height);
    return bmi;
}
String showHealthStatus(){
	String HealthStatus;
	if(bmi<18.5){
        	HealthStatus="UnderWeight";
        }
        else if(bmi>18.5 & bmi<=24.9){
        	HealthStatus="Healty UnderWeight";
        }
        else if(bmi>=25 & bmi<=29.9){
        	HealthStatus="Overweight";
        }
        else{
        	HealthStatus="Obese";
        }
        return HealthStatus;
}
void getBMI(){
	System.out.println("Name : "+name);
	System.out.println("Height : "+height);
	System.out.println("Weight : "+weight);
	System.out.println("BMI : "+calBMI());
	System.out.println("HealthStatus: "+showHealthStatus());
}
}
class BMIcal{
public static void main(String[] args) {
	bmi mybmi = new bmi();
	mybmi.setBMI();
	mybmi.getBMI();
}
}