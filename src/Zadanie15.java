import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) throws IOException {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Dostepne pliki 15o.txt");
        System.out.println("Podaj nazwę pliku do odczytania: ");
        String nazwaPliku = klawiatura.nextLine();

        PrintWriter pw = new PrintWriter("15z.txt");

        pw.println();


        File mojPlik = new File(nazwaPliku);

        if (!mojPlik.exists()) {
            System.out.println(" Plik nie istnieje");
            System.exit(0);
        }

        Scanner czytelnikPlik = new Scanner(mojPlik);




        czytelnikPlik.close();
    }
}