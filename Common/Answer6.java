/**
 * Created by murat on 26.07.2016.
 */


/* Soru:
    1 den 100' kadar tek tek karelerin toplamında
    1'den 100' kadar olan sayıların toplamının karesinin
    farkını bulan program

*/
public class Answer6 {
    public static void main(String[] args){

        int singleSum=0;
        int toplamSayiler=0;
        for (int i = 1; i <=100; i++) {

            singleSum += i*i;

            toplamSayiler += i;

        }
        int sonuc=0;
        sonuc = toplamSayiler*toplamSayiler - singleSum;
        System.out.println("Solition Problem 6 : "+ sonuc);



    }

}
