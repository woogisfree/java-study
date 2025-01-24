package basics.class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[2];

        ProductOrder order1 = new ProductOrder();
        order1.productName = "마우스";
        order1.price = 10000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "키보드";
        order2.price = 20000;
        order2.quantity = 1;
        orders[1] = order2;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 주문 금액: " + totalAmount);
    }
}
