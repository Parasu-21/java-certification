public class task2 {
    public static void main(String[] args) {

        StringBuffer order = new StringBuffer("Order Placed");

        order.append(" -> Packed");
        order.append(" -> Shipped");
        order.append(" -> Delivered");

        System.out.println(order);
    }
}