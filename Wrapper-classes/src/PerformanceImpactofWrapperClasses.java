import java.util.ArrayList;
public class PerformanceImpactofWrapperClasses {


        public static void main(String[] args) {
            int n = 1_000_000;

            int[] primitiveArray = new int[n];
            ArrayList<Integer> wrapperList = new ArrayList<>(n);

            long start = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                primitiveArray[i] = i;
            }
            long sum1 = 0;
            for (int i = 0; i < n; i++) {
                sum1 += primitiveArray[i];
            }
            long end = System.currentTimeMillis();
            System.out.println("int[] time: " + (end - start) + " ms");

            start = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                wrapperList.add(i);
            }
            long sum2 = 0;
            for (Integer val : wrapperList) {
                sum2 += val;
            }
            end = System.currentTimeMillis();
            System.out.println("ArrayList<Integer> time: " + (end - start) + " ms");
        }

}
