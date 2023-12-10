package access.shippingcart;

public class ShoppingCart {
    /**
     * 요구사항 :::
     * 접근 제어자를 사용해서 데이터를 캡슐화
     * 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
     * 장바구니에는 상품을 최대 10개만 담을 수 있다.
     * 10개 초과 등록시: "장바구니가 가득 찼습니다." 출력
     */
    private Item[] items = new Item[10];
    private int itemCount;

    public ShoppingCart() {
        itemCount = 0;
    }

    public void addItem(Item item){
        if(itemCount >= items.length){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }

    public void displayItems(){

        System.out.println("장바구니 상품 출력");

        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            System.out.println("상품명 : " + item.getName() +
                    ", 합계 : " + item.getTotalPrice());
        }

        /* forEach
        for (Item item : items) {
            if(item != null) {
                System.out.println("상품명 : " + item.getName() +
                        ", 합계 : " + item.getTotalPrice());
            }
        }
        */


        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int totalPrice = 0;

        for(int i = 0; i < itemCount; i++){
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;

        /* forEach
        for (Item item : items) {
            if(item == null){
                return totalPrice;
            }
            totalPrice += item.getTotalPrice();
        }

        return totalPrice;
        */


    }
}
