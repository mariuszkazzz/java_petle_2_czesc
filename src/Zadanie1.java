import javax.swing.text.Style;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Random random = new Random();


        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 5;
        int pieniadze = 0;
        int stawka =0;
        int koniec = 1000;
        int a=0;
        int dwukrotnosc;
        String wyniki[] = {"Wiśnie", "Pomarańcze", "Śliwki", "Dzwonki","Melony","Bary"};

        System.out.println("Podaj ilość pieniędzy: ");
        pieniadze = scanner.nextInt();

        System.out.println("Podaj Stawkę pieniędzy: ");
        stawka = scanner.nextInt();

        if(pieniadze<stawka)
        {
            System.out.println("nie masz na tyle pieniędzy");
        }
        else
        {

            for(int i = 0; i<koniec ; i++ )
            {

                //brak pieniędzy
                if(stawka>pieniadze)
                {
                    System.out.println("Nie posiadasz wystarczająco pieniędzy");
                    koniec=i;
                }
                else
                {
                    pieniadze = pieniadze - stawka;
                    int pierwsze = random.nextInt(max - min + 1) + min;
                    int drugie = random.nextInt(max - min + 1) + min;
                    int trzecie = random.nextInt(max - min + 1) + min;

                    System.out.println(wyniki[pierwsze] + " - " + wyniki[drugie] + " - " + wyniki[trzecie]);

                    //wygrana razy 2x
                    if(wyniki[pierwsze] == wyniki[drugie] || wyniki[pierwsze] == wyniki[trzecie] || wyniki[drugie] == wyniki[trzecie])
                    {
                        dwukrotnosc = stawka*2;
                        pieniadze= pieniadze + dwukrotnosc;
                        System.out.println("Wygrałeś: " + dwukrotnosc + "zł     Posiadasz: " + pieniadze + " zł");
                    }
                    else if(wyniki[pierwsze] == wyniki[drugie]&& wyniki[pierwsze]== wyniki[trzecie])
                    {
                        dwukrotnosc = stawka*2;
                        pieniadze= pieniadze + dwukrotnosc;
                        System.out.println("Wygrałeś: " + dwukrotnosc + "zł     Posiadasz: " + pieniadze + " zł");
                    }
                    else
                    {
                        System.out.println("wygrałeś 0zł     Posiadasz: "+ pieniadze + " zł" );
                    }

                    System.out.println("chcesz skończyć? 1- tak 2- nie");
                    a = scanner.nextInt();
                    if(a==1) {
                        koniec = i;
                    }
                }



            }
            System.out.println("Wypłać: " + pieniadze + "zł");
        }






    }
}
 
 
 
 