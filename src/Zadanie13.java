import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) throws IOException {

        File mojPlik = new File ("zad.txt");


        Scanner fileScanner = new Scanner (mojPlik);

        String linia;

        for(int i=1; i<6; i++)
        {


            linia = fileScanner.nextLine();

            System.out.println(i + ": " + linia);

        }
        fileScanner.close();
    }
}