import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            double phy = sc.nextDouble();
            double chem = sc.nextDouble();
            double math = sc.nextDouble();

            percentage[i] = (phy + chem + math) / 3;

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
