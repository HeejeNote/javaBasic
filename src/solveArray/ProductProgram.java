package solveArray;

import java.util.Scanner;

public class ProductProgram {

    public static void main(String[] args) {
        /**
         * 제약조건 : 상품은 10개 까지 등록
         * 1. 상품 등록 | 2. 상품 목록 | 3. 종료
         * 메뉴를 선택하세요:1
         * 상품 이름을 입력하세요:JAVA
         * 상품 가격을 입력하세요:10000
         * 1. 상품 등록 | 2. 상품 목록 | 3. 종료
         * 메뉴를 선택하세요:1
         * 상품 이름을 입력하세요:SPRING
         */

        int maxProducts = 10;
        String[] productName = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------");
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if(menu == 1 && productCount >= maxProducts){
                System.out.println("더이상 상품을 등록할 수 없습니다.");
                System.out.println("메뉴 선택 화면으로 돌아갑니다.");
                continue;
            }

            if(menu == 2 && productCount == 0){
                System.out.println("등록된 상품이 없습니다.");
                System.out.println("메뉴 선택 화면으로 돌아갑니다.");
                continue;
            }

            switch (menu){
                case 1 :

                    System.out.print("상품 이름을 입력하세요 : ");
                    productName[productCount] = sc.nextLine();

                    System.out.print("상품 가격을 입력하세요 : ");
                    productPrices[productCount] = sc.nextInt();

                    productCount++;

                    break;
                case 2 :
                    for(int i = 0; i < productCount; i++){
                        System.out.println(productName[i] + " : " + productPrices[i] + "원");
                    }
                    continue;
                case 3 :
                    System.out.println("프로그램이 종료됩니다");
                    return;
                default :
                    System.out.println("잘못된 메뉴를 선택하였습니다.");
                    System.out.println("메뉴 선택 화면으로 돌아갑니다.");
            }

        }
    }
}
