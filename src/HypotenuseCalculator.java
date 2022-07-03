import javax.swing.*;
import java.util.Scanner;

public class HypotenuseCalculator {
    private static double dSide1, dSide2;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("The console program calculate the hypotenuse of a right triangle with given two sides\n" +
                "Please answer the following questions to calculate the hypotenuse of the triangle");

        System.out.print("Side 1(cm): ");
        String strSide1 = reader.nextLine();
        try {
            dSide1 = Double.parseDouble(strSide1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            System.exit(-1);
        }


        System.out.print("Side 2(cm): ");
        String strSide2 = reader.nextLine();
        try {
            dSide2 = Double.parseDouble(strSide2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            System.exit(-1);
        }

        double dResult = Math.sqrt(Math.pow(dSide1, 2) + Math.pow(dSide2, 2));
        System.out.println("The hypotenuse of your triangle is: " + dResult + " cm");
    }
}
