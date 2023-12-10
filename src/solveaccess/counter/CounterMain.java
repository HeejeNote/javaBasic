package solveaccess.counter;

public class CounterMain {
    public static void main(String[] args) {
        /**
         *  캡슐화
         *  MaxCounter counter = new MaxCounter(3);
         *  counter.increment();
         *  counter.increment();
         *  counter.increment();
         *  counter.increment();
         *  int count = counter.getCount();
         *  System.out.println(count);
         */

        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();
        int count = counter.getCount();
        System.out.println(count);


    }
}
