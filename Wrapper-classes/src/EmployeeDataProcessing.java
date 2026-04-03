import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataProcessing {



        public static void main(String[] args) {
            int[] ages = {25, 32, 19, 45, 28};
            ArrayList<Integer> list = new ArrayList<>();

            for (int a : ages) {
                list.add(a);
            }

            int youngest = Collections.min(list);
            int oldest = Collections.max(list);

            System.out.println(youngest);
            System.out.println(oldest);
        }

}
