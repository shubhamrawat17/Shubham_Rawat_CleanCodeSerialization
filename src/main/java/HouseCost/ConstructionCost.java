package HouseCost;
import java.util.Scanner;
public class ConstructionCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the quality of material:- Standard, Above standard ,High standard ");
        String mStandard = sc.nextLine();

        System.out.println("Enter total area of the house");
        double area = sc.nextDouble();

        System.out.println("yes if fully automated house with high standard material or type no");
        String automated1 = sc.next();

        CostCalculation costCalculate1 = new CostCalculation(mStandard,area,automated1);
        double total = costCalculate1.costCalculate();
        System.out.println("Total cost for the house construction is : "+total);

    }
}
