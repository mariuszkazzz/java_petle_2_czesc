//21. Gra w kości
//        Napisz program do prostej gry w kości między komputerem a użytkownikiem. Po
//        uruchomieniu program powinien wykonywać pętlę 10 razy. W każdej iteracji pętli
//        należy wykonać następujące operacje:
//        Wygenerować liczbę losową z przedziału od 1 do 6. Jest to wartość rzutu
//        komputera.
//        Wygenerować inną liczbę losową z przedziału od 1 do 6. Jest to wartość rzutu
//        użytkownika.
//        Wyższa liczba oczek daje wygraną. W przypadku równej liczby oczek dla danego
//        rzutu nie ma zwycięzcy.
//        W kolejnych iteracjach program powinien zachowywać liczbę wygranych komputera
//        i użytkownika. Po wykonaniu wszystkich iteracji program ma wyświetlać, kto wygrał
//        całą grę: komputer czy użytkownik.

import java.util.Random;
import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {


        int k = 0;
        int l = 0;
        int r = 0;

        for (int i = 0; i <=9; i++) {

            Random losowanie = new Random();
            int losowaLiczbakomp = losowanie.nextInt(6);
            int losowaLiczbauz = losowanie.nextInt(6);
            System.out.println(losowaLiczbakomp);
            System.out.println(losowaLiczbauz);



            if (losowaLiczbakomp < losowaLiczbauz)
            {
                l++;
            } else if (losowaLiczbauz < losowaLiczbakomp)
            {
                k++;
            }
            else if (losowaLiczbakomp == losowaLiczbauz)
            {
                r++;
            }
            losowaLiczbakomp = 0;
            losowaLiczbauz =0;
        }

        System.out.println("wykik komputer: "+ (k) + "  czlowiek: " +(l)+ "  remis: " + (r));


        if(k>l)
            System.out.println("wygral komputer");
        else if (l>k)
        System.out.println("wygral czlowiek");


    }
}