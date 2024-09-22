//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       double springCost = 60.99;
       double summerCost = 45.99;
       double autumnCost = 48.99;
       double winterCost = 65.99;
       double yearlyCost = springCost + summerCost + autumnCost + winterCost;

       System.out.printf("Your maintenance cost for spring was " + springCost + ".\n");
       System.out.printf("Your maintenance cost for summer was " + summerCost + ".\n");
       System.out.printf("Your maintenance cost for autumn was " + autumnCost + ".\n");
       System.out.printf("Your maintenance cost for winter was " + winterCost + ".\n");
       System.out.printf("Your yearly total is " + yearlyCost + ".\n");

    }
}