/**
 * Created by artem.skolota on 10/23/2014.
 */
public  class Rectangle implements Figures {
    double a;
    double b;
    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

    public double perimeter () {
        return    2 * (a + b);
    }
}
