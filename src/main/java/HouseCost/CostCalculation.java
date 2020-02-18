package HouseCost;


public class CostCalculation
{
    private double area;
    private String mStandard;
    private String automated1;

    public CostCalculation(String mStandard,double area,String automated1)
    {
        this.mStandard = mStandard;
        this.area = area;
        this.automated1 = automated1;
    }
    public double costCalculate()
    {
        double costperSqFt = 0;
        if(mStandard.equalsIgnoreCase("Standard"))
        {
            costperSqFt = 1500;
        }
        else if(mStandard.equalsIgnoreCase("Above Standard"))
        {
            costperSqFt = 1700;
        }
        else if(mStandard.equalsIgnoreCase("High standard"))
        {
            costperSqFt = 2000;
            if(automated1.equals("yes"))
                costperSqFt = 2700;
        }
        double Total = costperSqFt*area;
        return Total;
    }
}

