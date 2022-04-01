
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PointsList grades = new PointsList("all");

        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int enteredValue = Integer.valueOf(scanner.nextLine());
            if (enteredValue == -1) {
                break;
            }
            grades.addGrade(enteredValue);
        }

        String pass = "-";
        if (grades.average("passing") != -1) {
            pass = "" + grades.average("passing");
        }

        System.out.println("Point average (all): " + grades.average());
        System.out.println("Point average (passing): " + pass);
        System.out.println("Pass percentage: " + grades.passPercentage());
        System.out.println("Grade distribution:");
        System.out.println(grades);

    }

}
