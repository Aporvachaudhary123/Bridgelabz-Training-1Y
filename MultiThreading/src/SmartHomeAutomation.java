public class SmartHomeAutomation
class SmartDevice implements Runnable {
    private String name;
    private int interval;

    public SmartDevice(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();

        for (int i = 1; i <= 5; i++) {
            System.out.println(
                    name + " | Priority: " + t.getPriority() +
                            " | Time: " + java.time.LocalTime.now() +
                            " | Cycle: " + i
            );

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        Thread temperature = new Thread(new SmartDevice("Temperature Sensor", 5000));
        Thread security = new Thread(new SmartDevice("Security Camera", 3000));
        Thread light = new Thread(new SmartDevice("Light Controller", 4000));
        Thread door = new Thread(new SmartDevice("Door Lock Monitor", 6000));

        security.setPriority(Thread.MAX_PRIORITY);
        temperature.setPriority(7);
        light.setPriority(Thread.NORM_PRIORITY);
        door.setPriority(Thread.NORM_PRIORITY);

        temperature.start();
        security.start();
        light.start();
        door.start();

        try {
            temperature.join();
            security.join();
            light.join();
            door.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        System.out.println("All devices completed execution.");
    }
}{
}
