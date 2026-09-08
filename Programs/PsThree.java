import java.util.Scanner;

interface ElectricityUsage {
    double calcCost();
}

interface SolarGeneration {
    double calcCredit();
}

class SmartEnergySystem implements ElectricityUsage, SolarGeneration {
    double unitsConsumed;
    double sUnits;
    Scanner sc = new Scanner(System.in);

    void setData() {
        System.out.print("Enter units consumed: ");
        unitsConsumed = sc.nextDouble();
        System.out.print("Enter solar units generated: ");
        sUnits = sc.nextDouble();
    }

    public double calcCost() {
        return unitsConsumed * 8;
    }

    public double calcCredit() {
        return sUnits * 5;
    }

    void calcFinalBill() {
        double elecCost = calcCost();
        double solarCredit = calcCredit();
        double finalBill = elecCost - solarCredit;

        System.out.println("Electricity Cost: " + elecCost);
        System.out.println("Solar Credit: " + solarCredit);
        System.out.println("Final Bill: " + finalBill);
    }
}

class PsThree {
    public static void main(String[] args) {
        SmartEnergySystem system = new SmartEnergySystem();
        system.setData();
        system.calcFinalBill();
    }
}
