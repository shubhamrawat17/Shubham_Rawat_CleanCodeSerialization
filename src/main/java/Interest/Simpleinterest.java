package Interest;

public class Simpleinterest
{
    double p;
    double r;
    double t;
    public Simpleinterest(double p,double r,double t)
    {
        this.p = p;
        this.r = r;
        this.t = t;
    }
    public double interest()
    {
        double s = p*r*t;
        s = s/100;
        return s;
    }
}
