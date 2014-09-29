/**
 * Created by artem.skolota on 9/27/2014.
 */


import java.util.Scanner;
public class ChooseFigure {

    public static void main(String args[])
            throws java.io.IOException {
        char choice;
        Figures per = new Figures();
        Figures a = new Figures();
        Figures b = new Figures();
        Scanner sc = new Scanner(System.in);

      do {
            System.out.println("Help on:");
            System.out.println("  1. Circle");
            System.out.println("  2. Rectangle");
            System.out.println("  3. Quadrate");
            System.out.println("Choose one:");
            choice = (char) System.in.read();
          choice(choice, per, a, b, sc);
        } while (isChoiceValid(choice));


        System.out.println("\n");




    }

    private static boolean isChoiceValid(char choice) {

        return  Integer.valueOf(choice) >= 1 && Integer.valueOf(choice) <= 3;

    }

    private static void choice(char choice, Figures per, Figures a, Figures b, Scanner sc) {
        switch (choice) {
            case '1':
                System.out.println("Circle:\n");
                System.out.println("Set radius of the Circle");
                System.out.print("radius:");
                if (sc.hasNextDouble()) { // true if int value entered
                    double radius = sc.nextDouble(); // reads int value from thread and saves to input parameter
                    per.Circle(radius);
                }

                break;
            case '2':
                System.out.println("Rectangle:\n");
                System.out.println("Set width of the Rectangle");
                System.out.print("width:");
                if (sc.hasNextDouble()) { // true if int value entered
                    double width = sc.nextDouble(); // reads int value from thread and saves to input parameter
                    System.out.println("");
                    System.out.println("height:");
                    if (sc.hasNextDouble()) {
                        double height = sc.nextDouble();
                        a.Rectangle(width, height);
                    }
                }
 break;
            case '3':
                System.out.println("Quadrate:\n");
                System.out.println("Set side of the Quadrate");
                System.out.print("side:");
                if (sc.hasNextDouble()){
                    double side=sc.nextDouble();
                    b.Quadrate(side);
                }
                break;



        }
    }
}
