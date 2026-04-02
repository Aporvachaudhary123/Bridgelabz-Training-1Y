public class CustomerSupportTicketingSystem {
    import java.util.*;

    class Ticket extends Thread {
        private int ticketId;
        private String type;
        private int priority;
        private long waitTime;

        public Ticket(int ticketId, String type, int priority) {
            this.ticketId = ticketId;
            this.type = type;
            this.priority = priority;
        }

        public int getPriorityValue() {
            return priority;
        }

        public void setWaitTime(long waitTime) {
            this.waitTime = waitTime;
        }

        public long getWaitTime() {
            return waitTime;
        }

        public String getType() {
            return type;
        }

        public void run() {
            try {
                Random rand = new Random();
                int processTime = rand.nextInt(5) + 1;

                System.out.println("Ticket " + ticketId + " [" + type + "] handled by " + getName() + " Priority: " + priority);
                System.out.println("Ticket " + ticketId + " Processing Started");

                Thread.sleep(processTime * 1000);

                System.out.println("Ticket " + ticketId + " Processing Completed in " + processTime + " seconds\n");
            } catch (InterruptedException e) {}
        }
    }

    public class CustomerSupportSystem {
        public static void main(String[] args) throws Exception {
            List<Ticket> tickets = new ArrayList<>();

            tickets.add(new Ticket(1, "Critical Bug", 10));
            tickets.add(new Ticket(2, "Feature Request", 4));
            tickets.add(new Ticket(3, "General Query", 2));
            tickets.add(new Ticket(4, "Feedback", 1));
            tickets.add(new Ticket(5, "Critical Bug", 10));
            tickets.add(new Ticket(6, "General Query", 2));
            tickets.add(new Ticket(7, "Feature Request", 4));
            tickets.add(new Ticket(8, "Feedback", 1));
            tickets.add(new Ticket(9, "Critical Bug", 10));
            tickets.add(new Ticket(10, "General Query", 2));

            tickets.sort((a, b) -> b.getPriorityValue() - a.getPriorityValue());

            long startTime = System.currentTimeMillis();

            int position = 1;
            for (Ticket t : tickets) {
                System.out.println("Queue Position " + position++ + " -> Ticket " + t.getName() + " Priority: " + t.getPriorityValue());
            }

            Map<Integer, List<Long>> waitStats = new HashMap<>();

            for (Ticket t : tickets) {
                long waitStart = System.currentTimeMillis();
                t.start();
                t.join();
                long waitEnd = System.currentTimeMillis();

                long waitTime = (waitEnd - waitStart) / 1000;
                t.setWaitTime(waitTime);

                waitStats.putIfAbsent(t.getPriorityValue(), new ArrayList<>());
                waitStats.get(t.getPriorityValue()).add(waitTime);
            }

            long totalTime = (System.currentTimeMillis() - startTime) / 1000;
            System.out.println("Total Processing Time: " + totalTime + " seconds\n");

            for (Map.Entry<Integer, List<Long>> entry : waitStats.entrySet()) {
                int priority = entry.getKey();
                List<Long> times = entry.getValue();

                double avg = times.stream().mapToLong(Long::longValue).average().orElse(0);
                System.out.println("Average Wait Time for Priority " + priority + ": " + avg + " seconds");
            }
        }
    }
}
