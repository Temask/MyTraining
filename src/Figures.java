/**
 * Created by artem.skolota on 9/27/2014.
 */
public  class Figures {
    double a;
    double b;
    double r;
    double perimeter;
    public void Circle (double r)
    {
        this.r=r;
        perimeter=2*3.14*r;
        System.out.println("Perimeter= "+ perimeter);
    }

    public void Rectangle(double a, double b)
    {
        this.a=a;
        this.b=b;
        this.perimeter=perimeter;
        perimeter=2*(a+b);
        System.out.println("Perimeter= "+perimeter);

    }

    public void Quadrate(double a)
    {
        this.a=a;
        this.perimeter=perimeter;
        perimeter=4*a;
        System.out.println("Perimeter= "+perimeter);
    }
}






