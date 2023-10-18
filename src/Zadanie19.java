import java.util.Random;
import java.util.Scanner;

// Badanie postrzegania pozazmysłowego
//         Napisz program, który bada Twoje zdolności pozazmysłowe. Program powinien losowo
//         wybierać jedną z poniższych nazw kolorów:
//         Czerwony, Zielony, Niebieski, Pomarańczowy, Żółty
//         Na potrzeby wyboru słowa program może generować liczby losowe. Na przykład
//         liczba 0 może odpowiadać słowu Czerwony, a liczba 1 — słowu Zielony.
//         Następnie program powinien wyświetlać prośbę o podanie koloru wybranego przez
//         komputer. Po podaniu koloru przez użytkownika program powinien wyświetlać nazwę
//         losowo wybranej barwy. Program powinien powtarzać ten proces 10 razy, a następnie
//         wyświetlać liczbę poprawnych wskazań użytkownika.

public class Zadanie19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int ilepop=0;

        for (int i = 0; i <=10; i++){

            int losowaLiczba;

            Random losowanie = new Random();

            losowaLiczba = losowanie.nextInt(5);
            System.out.println ("RNG to " + losowaLiczba);
            System.out.println("proba: "+(i));
            System.out.println("podaj kolor ( Żółty=0 ,Czerwony =1, Zielony=2, Niebieski=3, Pomarańczowy=4)");
            int kolor = scanner.nextInt();

            if(kolor == losowaLiczba)
                ilepop++;
        }

        System.out.println("zgadles "+(ilepop-1)+"/ 10 liczb");
    }
}