import java.util.ArrayList;
public class SensorDataLogger {



        public static void logData(Double data) {
            System.out.println("Logged value: " + data);
        }

        public static void main(String[] args) {
            ArrayList<Double> sensorData = new ArrayList<>();

            double temp1 = 23.5;
            Double temp2 = 27.8;

            sensorData.add(temp1);
            sensorData.add(temp2);

            for (Double d : sensorData) {
                logData(d);
                double primitive = d;
                System.out.println("Read as primitive: " + primitive);
            }
        }

}
