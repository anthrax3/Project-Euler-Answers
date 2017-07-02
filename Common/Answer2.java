/**
 * Created by murat on 26.07.2016.
 */
public class Answer2 {

    public static void main(String[] args) {
        int fib1 = 0;
        int fib2 = 0;
        int curFib = 1;
        int sum = 0;
        while(curFib < 1000000){
            if(curFib % 2 == 0){
                sum += curFib;
            }
            fib1 = fib2;
            fib2 = curFib;
            curFib = fib1 + fib2;
        }
        System.out.println("Solution to problem 2 = " + sum);
    }


}
