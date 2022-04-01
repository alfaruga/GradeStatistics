
import java.util.ArrayList;

/**
 *
 * @author alfar
 */
public class PointsList {

    private ArrayList<Grade> gradesList;

    private int passingCount() {
        int totalPass = 0;
        for (Grade grade : gradesList) {
            if (grade.getPoints() >= 50) {
                totalPass++;
            }
        }
        return totalPass;
    }

    private int gradeCount(int gradeWanted) {
        int instancesOfGrade = 0;
        for (Grade grade : this.gradesList) {
            if (grade.getGrade() == gradeWanted) {
                instancesOfGrade++;
            }
        }
        return instancesOfGrade;
    }

    public PointsList(String name) {
        this.gradesList = new ArrayList<>();
    }

    public void addGrade(int points) {
        if (!(points > 100 || points < 0)) {
            this.gradesList.add(new Grade(points));

        }
    }

    public double average(String passing) {
        int sum = 0;
        int gradesCount = 0;
        boolean anyPassing = false;
        if (this.gradesList.isEmpty()) {
            return 0.0;
        }

        for (Grade grade : this.gradesList) {
            //This if-else decides if we want average of all points
            if (passing == null) {
                sum += grade.getPoints();
                gradesCount++;
            } else {
                //once we decided, this if filters passing grades
                if (grade.getPoints() >= 50) {
                    sum += grade.getPoints();
                    anyPassing = true;
                }
                gradesCount = passingCount();
            }

        }
        if (anyPassing == false && passing != null) {
            return -1.0;
        }
        return (1.0 * sum) / (gradesCount);
    }

    public double average() {
        //this one gives average of all
        return average(null);
    }

    public double passPercentage() {
        return 100.0 * passingCount() / this.gradesList.size();
    }

    public String toString() {
        String compressedString = "5: " + ("*".repeat(gradeCount(5)) + "\n"
                + "4: " + ("*".repeat(gradeCount(4))) + "\n"
                + "3: " + ("*".repeat(gradeCount(3))) + "\n"
                + "2: " + ("*".repeat(gradeCount(2))) + "\n"
                + "1: " + ("*".repeat(gradeCount(1))) + "\n"
                + "0: " + ("*".repeat(gradeCount(0))));

        return compressedString;

    }
}
