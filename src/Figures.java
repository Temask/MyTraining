/**
 * Created by artem.skolota on 9/27/2014.
 */
public class Figures {
    double a;
    double b;
    double r;
    double perimeter;

    public static String circle(double r) {
        double perimeter = 2 * 3.14 * r;
        return "Circle: Perimeter= " + perimeter;
    }

    public static String rectangle(double a, double b) {


        double perimeter = 2 * (a + b);
        return "Rectangle: Perimeter= " + perimeter;

    }

    public static String quadrate(double a) {

        double perimeter = 4 * a;
        return "Quadrate: Perimeter= " + perimeter;
    }
}






