/**
 * Created by artem.skolota on 9/27/2014.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class ChooseFigure {

    public static void main(String args[])
            throws java.io.IOException {
        char choice;
        Scanner sc = new Scanner(System.in);
        ArrayList figureList = new ArrayList();
        while (true) {
            System.out.println("Help on:");
            System.out.println("  1. Circle");
            System.out.println("  2. Rectangle");
            System.out.println("  3. Quadrate");
            System.out.println("  4. Complete");
            System.out.println("Choose one:");
            choice = (char) sc.next().charAt(0);

            choice(choice, sc, figureList);
        }


    }


    private static void choice(char choice, Scanner sc, ArrayList figureList) {
        switch (choice) {
            case '1':
                System.out.println("Circle:");
                System.out.println("Set radius of the Circle");
                System.out.print("radius:");
                if (sc.hasNextDouble()) {
                    double radius = sc.nextDouble();
                    figureList.add(Figures.circle(radius));
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
                        figureList.add(Figures.rectangle(width, height));
                    }
                }
                break;
            case '3':
                System.out.println("Quadrate:\n");
                System.out.println("Set side of the Quadrate");
                System.out.print("side:");
                if (sc.hasNextDouble()) {
                    double side = sc.nextDouble();
                    figureList.add(Figures.quadrate(side));
                }
                break;
            case '4':
                System.out.println("List of chosen figures");
                for (int i = 0; i < figureList.size(); i++) {

                    System.out.println(" - Figure " + figureList.get(i));

                }
                System.exit(0);
                break;


            default:
                System.out.println(" Wrong key ");


        }

    }
}
