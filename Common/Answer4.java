import java.util.Arrays;

/**
 * Created by murat on 26.07.2016.
 */
public class Answer4 {

    public static void main(String[] args) {
        int n = 0; //Holds current number to be product
        int largest_palindrome = 0; //Holds largest product/palindrome
        for (int i = 100; i <= 999; i++) { //Changes 1st product to next 3 digit number
            for (int i2 = 999; i2 >= 100; i2--) { //Changes 2nd product to next 3 digit number
                n = i*i2; //Changes n to product of 1st number and 2nd number
                if (is_palindrome(n) && (n) > largest_palindrome) //Checks if n is a palindrome\larger than current num
                    largest_palindrome = n; //Updates largest number
            }
        }

        System.out.println("Soliton problem 4 : ");
        System.out.println(largest_palindrome); //Prints out largest palindrome
    }

    public static boolean is_palindrome(Object n)
    {
        char[] array = n.toString().toLowerCase().toCharArray(); //Converts to string and then to a char array
        char [] orig_array = n.toString().toLowerCase().toCharArray(); //Makes a copy for reference later
        for (int left = 0, right = array.length - 1; left < right; left++, right--) { //Flips array
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        return Arrays.equals(array, orig_array); //Compares new(flipped) array to original
    }


}
