
class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed.";
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineOrder {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2025-04-14");
        System.out.println(order.getOrderStatus());
        order.displayOrderDetails();

        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-04-13", "TRK98765");
        System.out.println(shippedOrder.getOrderStatus());
        shippedOrder.displayOrderDetails();


        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-04-12", "TRK54321", "2025-04-14");
        System.out.println(deliveredOrder.getOrderStatus());
        deliveredOrder.displayOrderDetails();
    }
}
