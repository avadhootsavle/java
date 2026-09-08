import java.util.Scanner; 

class BMI { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the weight (kg): "); 
        float weight = sc.nextFloat(); 
        System.out.println("Enter the height (meter): "); 
        float height = sc.nextFloat(); 
        float bmi = weight / (height * height); 
        System.out.println("Your BMI is: " + bmi); 
        if(bmi<18.5){
        	System.out.println("UnderWeight");
        }
        else if(bmi>18.5 && bmi<=24.9){
        	System.out.println("Healty UnderWeight");
        }
        else if(bmi>=25 && bmi<=29.9){
        	System.out.println("Overweight");
        }
        else{
        	System.out.println("Obese");
        }
    } 
}
