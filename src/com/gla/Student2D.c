import java.util.Scanner;

public class Student2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else
                grade[i] = 'C';
        }

        for (int i = 0; i < n; i++)
            System.out.println(percentage[i] + " " + grade[i]);
    }
}
