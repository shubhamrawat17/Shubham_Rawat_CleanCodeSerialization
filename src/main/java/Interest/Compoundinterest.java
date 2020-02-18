package Interest;

public class Compoundinterest
{
    double p;
    double r;
    double t;
    Compoundinterest(double p,double r,double t)
    {
        this.t = t;
        this.p = p;
        this.r = r;
    }
    public double interest()
    {
        double c = p*(Math.pow(1+r/100,t));
        return c;
    }

}
