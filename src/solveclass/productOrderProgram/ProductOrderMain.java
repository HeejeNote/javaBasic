package solveclass.productOrderProgram;

public class ProductOrderMain {

    /**
     * 출력예시
     * 상품명: 두부, 가격: 2000, 수량: 2
     * 상품명: 김치, 가격: 5000, 수량: 1
     * 상품명: 콜라, 가격: 1500, 수량: 2
     * 총 결제 금액: 12000
     */
    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("java", 2000, 2);
        orders[1] = createOrder("spring", 5000, 1);
        orders[2] = createOrder("jpa", 1500, 2);

        printProductOrder(orders);
        getTotalAmount(orders);

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

     static void printProductOrder(ProductOrder[] orders){

        for(ProductOrder order : orders){
            System.out.println("상품명 : " + order.productName + " 가격 : " +
                    order.price + " 수량 : " + order.quantity);
        }

    }

     static void getTotalAmount(ProductOrder[] orders){

        int result = 0;

        for(ProductOrder order : orders){
            result += (order.price * order.quantity);
        }

         System.out.println("총 결제 금액 : " + result);
     }
}
