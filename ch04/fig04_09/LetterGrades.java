import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int otherCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n\t%s%n\t%s%n", "Enter the integer grades in the range 0-100",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter", "On Windows type <Ctrl> z then press Enter");

        while (input.hasNext()) {
            int grade = input.nextInt();
            total += grade;
            ++gradeCounter;

            switch (grade / 10) {
            case 9:
            case 10:
                ++aCount;
                break;
            case 8:
                ++bCount;
                break;
            default:
                ++otherCount;
                break;
            }
        }
        System.out.printf("%nGrade report:%n");

        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);

            System.out.printf("%s%d%n%s%d%n%s%d%n", "A: ", aCount, "B: ", bCount, "Others: ", otherCount);
        } else {
            System.out.println("No grades were entered!");
        }

        input.close();
    }
}