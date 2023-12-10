package solvestatic.mathutils;

public class MathArrayUtils {
    /**
     * sum(int[] array) : 배열의 모든 요소를 더하여 합계를 반환합니다.
     * average(int[] array) : 배열의 모든 요소의 평균값을 계산합니다.
     * min(int[] array) : 배열에서 최소값을 찾습니다.
     * max(int[] array) : 배열에서 최대값을 찾습니다
     */
     public static int sum(int[] array){
         int sum = 0;
         for (int i : array) {
             sum += i;
         }
         return sum;
     }

     public static double average(int[] array){
         double average = MathArrayUtils.sum(array) / array.length;
         return average;
     }

     public static int min(int[] array){
         int min = array[0];

         for (int i : array) {
             if(i < min){
                 min = i;
             }
         }

         return min;
     }

     public static int max(int[] array){
         int max = array[0];

         for (int i : array) {
             if(i > max){
                 max = i;
             }
         }

         return max;
     }
}
