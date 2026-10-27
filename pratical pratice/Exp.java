import java.util.Scanner;
class CustomExp extends Exception{
    int marks;
    CustomExp(int m){
        marks=m;
    }
    public String toString(){
        return "enter correct marks : "+marks;
    }
}
class Exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        try{
            marks=sc.nextInt();
            if(marks<0 || marks>100){
                throw new CustomExp(marks);
            }
    }catch(CustomExp e){
        System.err.println(e);
    }
    }
}
