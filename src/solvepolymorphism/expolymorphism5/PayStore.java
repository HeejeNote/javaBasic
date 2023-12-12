package solvepolymorphism.expolymorphism5;

public class PayStore {

    public static Pay findPay(String option) {

        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        }else if (option.equals("apple")) {
            return new ApplePay();
        } else if (option.equals("samsung")) {
            return new SamsungPay();
        } else if (option.equals("ssg")) {
            return new SSGPay();
        } else {
            return new DefaultPay();
        }
    }


}
