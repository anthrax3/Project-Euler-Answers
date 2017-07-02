import java.util.HashSet;
import java.util.Set;

/**
 * Created by murat on 26.07.2016.
 */


/*Soru:
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    (1'den 10'a kadar bütün sayılara kalansız bölünen en küçük sayı 2520'dir.
    1'den 20'ye kadar bütün sayılara kalansız bölünen en küçük positif sayı kaçtır?)


*/
public class Answer5 {

    public static void main(String[] args) {
        long result = 1;
        int upLimit = 20;
        Set<Integer> digits = new HashSet<Integer>();
        for (int i = 1; i <= upLimit; i++) {
            if (result % i != 0) {
                digits.add(i);
                result *= i;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0 && result % j == 0) {
                        if (digits.contains(j)) {
                            result /= j;
                            digits.remove(j);
                        }
                    }
                }
            }
        }
        System.out.println("Soliton problem 5 : "+result);
    }
}
