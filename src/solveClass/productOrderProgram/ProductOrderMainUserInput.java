package solveClass.productOrderProgram;

import java.util.Scanner;

public class ProductOrderMainUserInput {
    /**
     * 입력할 주문의 개수를 입력하세요: 3
     * 1번째 주문 정보를 입력하세요.
     * 상품명: 두부
     * 가격: 2000
     * 수량: 2
     * 2번째 주문 정보를 입력하세요.
     * 상품명: 김치
     * 가격: 5000
     * 수량: 1
     * 3번째 주문 정보를 입력하세요.
     * 상품명: 콜라
     * 가격: 1500
     * 수량: 2
     * 상품명: 두부, 가격: 2000, 수량: 2
     * 상품명: 김치, 가격: 5000, 수량: 1
     * 상품명: 콜라, 가격: 1500, 수량: 2
     * 총 결제 금액: 12000
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int orderCount = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[orderCount];


        for(int i = 0; i < orderCount; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            sc.nextLine();

            System.out.print("상품명 : ");
            String productName = sc.nextLine();

            System.out.print("가격 : ");
            int price = sc.nextInt();
            
            System.out.print("수량 : ");
            int quantity = sc.nextInt();
            orders[i] = createOrder(productName,price,quantity);
        }

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
