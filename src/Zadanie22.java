//22.     Symulacja automatu do gier
//        Automat do gier to maszyna do gier hazardowych, do której użytkownik wrzuca pieniądze,
//        po czym pociąga za wajchę (lub wciska przycisk). Automat do gier wyświetla
//        następnie losowy zbiór obrazków. Jeśli przynajmniej dwa obrazki są takie same, użytkownik
//        wygrywa określoną kwotę pieniędzy wypłacanych przez maszynę.

//        Utwórz program, który symuluje działanie automatu do gier. Program w trakcie
//        działania powinien wykonywać następujące operacje:
//        Wyświetlać prośbę o podanie kwoty pieniędzy, jaką użytkownik chce wrzucić
//        do maszyny.

//        Zamiast wyświetlać obrazki, losowo wybierać słowa z następującej listy:
//        Wiśnie, Pomarańcze, Śliwki, Dzwonki, Melony, Bary.
//        Aby wybrać słowo, program może generować liczbę losową z przedziału od 0 do 5.

//        Po wylosowaniu liczby 0 program wybierze słowo Wiśnie, liczba 1 to Pomarańcze
//        itd. Program powinien trzy razy losowo wybierać słowo z tej listy i wyświetlać
//        każde z tych trzech słów.

//        Jeśli losowo wybrane słowa nie pasują do siebie, program informuje użytkownika,
//        że wygrał 0 złotych. Jeżeli pasują do siebie dwa słowa, program komunikuje,
//        że użytkownik wygrał dwukrotność postawionej kwoty. Jeśli trzy słowa
//        są identyczne, program wyświetla informację o wygraniu trzykrotności stawki.

//        Program wyświetla pytanie, czy użytkownik chce zagrać ponownie. Jeśli tak,
//        opisane wcześniej kroki są powtarzane. W przeciwnym razie program wyświetla
//        łączną kwotę wrzuconą do automatu i łączną wartość wygranych.

//re6J1PqD

import java.util.Random;
import java.util.Scanner;


public class Zadanie22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Wiśnie 0, Pomarańcze 1, Śliwki 2, Dzwonki 3, Melony 4, Bary 5");

        int kwota = 0;
        int wynik = 0;
        int stan = 0;
        int owoc = 0;
        int owoc3 = 0;
        int owoc2 = 0;

        int losowaLiczba1 = 0;
        int losowaLiczba2 = 0;
        int losowaLiczba3 = 0;

        for(int i = 0; i <=10000; i++)
        {
            System.out.println("podaj kwote pieniedzy: ");
            kwota = scanner.nextInt();

            Random losowanie = new Random();
            losowaLiczba1 = losowanie.nextInt(5);
            losowaLiczba2 = losowanie.nextInt(5);
            losowaLiczba3 = losowanie.nextInt(5);

            System.out.println("wybierz 3 owoce:  Wiśnie 0, Pomarańcze 1, Śliwki 2, Dzwonki 3, Melony 4, Bary 5");
            owoc = scanner.nextInt();
            //System.out.println("wybierz:  Wiśnie 0, Pomarańcze 1, Śliwki 2, Dzwonki 3, Melony 4, Bary 5");
            owoc2 = scanner.nextInt();
            //System.out.println("wybierz:  Wiśnie 0, Pomarańcze 1, Śliwki 2, Dzwonki 3, Melony 4, Bary 5");
            owoc3 = scanner.nextInt();

                for (int j = 0; j <=2; j++)
                {
                    if(owoc == losowaLiczba1 || owoc2 == losowaLiczba2 || owoc3 == losowaLiczba3)
                    {
                       wynik = wynik+1;
                    }
                }

               if(wynik == 3)
               {
                   System.out.println("wygrales 3x");

                   stan = kwota * 3;
               } else if (wynik == 2) {
                   System.out.println("wygrales 2x");
                   stan = kwota *2;

               } else if (wynik == 1 || wynik == 0) {
                   System.out.println("przegrales");
                   stan = stan - kwota;

               }

            System.out.println("");

            System.out.println("stan konta: "+ stan);

                System.out.println("grasz dalej? jesli nie wcisnij 9");
                int w = scanner.nextInt();
                if(w == 9){
                    System.exit(0);



            }
        }
    }
}