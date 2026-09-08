import java.util.Scanner;
class EmployeeArray {
    String name;
    byte id;
    double bSal, Gsal;
    void setEmp() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter id: ");
        id = sc.nextByte();
        System.out.print("Enter basic salary: ");
        bSal = sc.nextDouble();
    }
    double gSal() {
        Gsal = bSal + (bSal * 0.75) + (bSal * 0.35) + (bSal * 0.15);
        return Gsal;
    }
    void getEmp() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Basic Salary: " + bSal);
        System.out.println("Gross Salary: " + gSal());
    }
}
class EmpArray {
    public static void main(String[] args) {
    	double sum=0,avg
        EmployeeArray[] emp = new EmployeeArray[2];
        for (int i = 0; i < 2; i++) {
            emp[i] = new EmployeeArray();
            emp[i].setEmp();
            sum=sum+emp[i].gSal();
        }
 System.out.println("display");
    for (int i = 0; i < 2; i++) {
    	emp[i].getEmp();
        System.out.println();
        }
        System.out.println("Sum money : "+sum);


    }
}