import java.util.Scanner;

interface Salary {
    void bsal();
}

interface Performance {
    double performance();
}

class Employee implements Salary, Performance {
    double bsal;
    char per;
    Scanner sc = new Scanner(System.in);

    public void bsal() {
        System.out.print("Enter basic salary: ");
        bsal = sc.nextDouble();
    }

    public double performance() {
        System.out.print("Enter performance grade: ");
        per = sc.next().charAt(0);
        
        if (per == 'a') {
            return 0.15 * bsal;
        } else if (per == 'b') {
            return 0.10 * bsal;
        } else if (per == 'c') {
            return 0.05 * bsal;
        } else {
            return 0.0;
        }
    }

    double cal() {
        double hra = 0.20 * bsal;
        double da = 0.10 * bsal;
        double bonus = performance();
        double netSalary = bsal + hra + da + bonus;
        System.out.println("Net Salary: " + netSalary);
        return netSalary;
    }
}

class PsTwo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.bsal();
        emp.cal();
    }
}
