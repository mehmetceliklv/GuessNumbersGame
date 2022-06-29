package Number_Game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {

        System.out.println("wellcome");
        Random r = new Random();			// BILGISAYAR 0-100 ARASI TUTUP KULLANICIDAN TAHMIN ISTER
        int num = r.nextInt();				// SAYIYI BULANA KADAR KUCULT VEYA BUYUTT DIYE YOL GOSTERIR
                                            // BULUNCA KACINCI TAHMINDE BULDUGUNU YAZAR
        int bul = 0 ;
        if (num<0) {
            num = 0-num;
        }

        if (num<100) { bul = num ;
        }
        else bul = num % 100 ;

        Scanner scan = new Scanner(System.in);
        num =1 ;
        int count=1 ;
        do {
            if (count==1) {System.out.println("Guess the number I hold ... Hint it is beetwen 0-100");
            }
            else if (bul<num) {
                System.out.println("... Hint my number is SMALLER than yours");
            } else System.out.println("... Hint my number is BIGGER than yours");

            num=scan.nextInt();
            if (num == bul) {
                System.out.println("You Won at " + count + ". entery");
            }
            else System.out.print("You Lost. ");


            count ++ ;

        } while (num!= bul);
    }
}
