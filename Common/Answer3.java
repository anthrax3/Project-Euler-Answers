/**
 * Created by murat on 26.07.2016.
 */
public class Answer3 {

    public static void main(String[] args)
    {
        System.out.println(getFactor(600851475143L));
    }

    public static long getFactor(long num)
    {
        for(long div=2; div<num; div++)
        {
            if(num%div==0)
                return getFactor(num/div);
        }
        System.out.print("Solution problem 3 : ");
        return num;
    }
}
