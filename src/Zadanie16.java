
import java.util.Scanner;

//. Analiza budżetu
//        Napisz program, który wyświetla użytkownikowi prośbę o podanie miesięcznego budżetu.
//        Następnie program powinien w pętli pobierać wydatki użytkownika z danego miesiąca
//        i obliczać sumę bieżącą. Po zakończeniu pętli program powinien wyświetlać różnicę
//        między wydaną kwotą a budżetem.


public class Zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj miesieczny buzdet ");
        int budzet = klawiatura.nextInt();

        int wydatki = 0;
        while (wydatki <=budzet) {

            System.out.println("podaj wydatek");
            int x = klawiatura.nextInt();
            wydatki = wydatki + x;

            if(wydatki <=budzet)
            {
                System.out.println("zostalo" + (budzet-wydatki));
            }
            //wydatki++;
        }
    }
}