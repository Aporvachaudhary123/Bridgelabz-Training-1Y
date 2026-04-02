public class OnlineFoodDelivery {
    class Order implements Runnable {
    private int orderId;
    private String restaurantName;
    private int deliveryTime;

    public Order(int orderId, String restaurantName, int deliveryTime) {
        this.orderId = orderId;
        this.restaurantName = restaurantName;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        String agent = Thread.currentThread().getName();

        System.out.println("Order " + orderId + " from " + restaurantName + " handled by " + agent);
        System.out.println("Order " + orderId + ": Picked up");

        try {
            System.out.println("Order " + orderId + ": In Transit");
            Thread.sleep(deliveryTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Order " + orderId + ": Delivered");

        long endTime = System.currentTimeMillis();
        System.out.println("Order " + orderId + " Total Delivery Time: " + (endTime - startTime) / 1000 + " seconds\n");
    }
}

    public class FoodDeliveryApp {
        public static void main(String[] args) {
            Thread order1 = new Thread(new Order(101, "Pizza Hut", 2), "Agent-1");
            Thread order2 = new Thread(new Order(102, "McDonald's", 4), "Agent-2");
            Thread order3 = new Thread(new Order(103, "Domino's", 3), "Agent-3");
            Thread order4 = new Thread(new Order(104, "KFC", 1), "Agent-4");
            Thread order5 = new Thread(new Order(105, "Burger King", 5), "Agent-5");

            order1.setPriority(10);
            order2.setPriority(5);
            order3.setPriority(3);
            order4.setPriority(10);
            order5.setPriority(5);

            order1.start();
            order2.start();
            order3.start();
            order4.start();
            order5.start();
        }
    }
}
