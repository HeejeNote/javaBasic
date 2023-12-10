package access.counter;

public class MaxCounter {
    /**
     * ::: 최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공 :::
     * int count : 내부에서 사용하는 숫자 입니다. 초기값 0
     * int max : 최대값 입니다. 생성자를 통해 입력
     * increment() 숫자를 하나 증가합니다.
     * getCount() 지금까지 증가한 값을 반환합니다.
     */

    private int count = 0;
    private int max;

    public MaxCounter(int max){
        this.max = max;
    }

    public void increment(){
        if(max <= count){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
