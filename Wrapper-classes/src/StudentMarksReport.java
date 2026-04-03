import java.util.ArrayList;
import java.util.Objects;

public class StudentMarksReport {



        public static void main(String[] args) {
            Object[] marks = {"85", 95, Integer.valueOf(88), "null", null, "abc"};
            ArrayList<Integer> validMarks = new ArrayList<>();

            for (Object m : marks) {
                if (Objects.nonNull(m)) {
                    try {
                        if (m instanceof String) {
                            int val = Integer.parseInt((String) m);
                            validMarks.add(val);
                        } else if (m instanceof Integer) {
                            validMarks.add((Integer) m);
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }

            int sum = 0;
            for (Integer mark : validMarks) {
                sum += mark;
            }

            double average = validMarks.size() > 0 ? (double) sum / validMarks.size() : 0.0;
            System.out.println(average);
        }

}
