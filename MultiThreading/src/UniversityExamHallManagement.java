public class UniversityExamHallManagement {
    public class ExamHallSystem {
        public static void main(String[] args) throws Exception {

            Runnable entryTask = () -> {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Student Entry Monitoring...");
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {}
            };

            Runnable questionTask = () -> {
                try {
                    Thread.sleep(5000);
                    System.out.println("Question Paper Distributed");
                } catch (Exception e) {}
            };

            Runnable attendanceTask = () -> {
                try {
                    Thread.sleep(10000);
                    System.out.println("Attendance Marked");
                } catch (Exception e) {}
            };

            Runnable collectionTask = () -> {
                try {
                    Thread.sleep(15000);
                    System.out.println("Answer Sheets Collected");
                } catch (Exception e) {}
            };

            Thread t1 = new Thread(entryTask);
            Thread t2 = new Thread(questionTask);
            Thread t3 = new Thread(attendanceTask);
            Thread t4 = new Thread(collectionTask);

            t1.setPriority(5);
            t2.setPriority(10);
            t3.setPriority(8);
            t4.setPriority(7);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
    }
}
