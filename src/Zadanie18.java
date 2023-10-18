//Napisz program, który generuje liczbę losową i wyświetla prośbę o jej odgadnięcie. Jeśli
//        użytkownik poda wartość wyższą od wygenerowanej liczby losowej, program powinien
//        wyświetlać tekst: „Za duża liczba, spróbuj ponownie”. Po podaniu wartości niższej
//        od wygenerowanej program powinien informować: „Za mała liczba, spróbuj ponownie”.
//        W programie należy zastosować pętlę powtarzającą operacje do czasu odgadnięcia
//        liczby losowej przez użytkownika.
import java.util.Random;
import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int losowaLiczba;

        Random losowanie = new Random();

        losowaLiczba = losowanie.nextInt(100);
        System.out.println ("RNG to " + losowaLiczba);

        int liczbazyc = 1;

        while(liczbazyc <= 12){
            System.out.println ("masz "+(13-liczbazyc)+" zyc");

            System.out.println("Podaj losowana liczba");
            int odp = klawiatura.nextInt();

            if(odp == losowaLiczba){
                System.out.println("wygrales talon na balon");
                System.out.println("l prob to:" +(liczbazyc-1));
                System.exit(0);
            }
            else if (odp != losowaLiczba){
                System.out.println("proboj dalej");

                if(odp > losowaLiczba)
                    System.out.println("za duza");
                else if(odp < losowaLiczba)
                    System.out.println("za mala");
            }
            else
            {
                System.out.println("przegrales");
            }
            liczbazyc++;
        }



    }
}
