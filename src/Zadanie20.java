//20. Wyświetlanie kwadratu
//        Napisz program, który wyświetla użytkownikowi prośbę o podanie dodatniej liczby
//        całkowitej nie większej niż 15. Program powinien następnie wyświetlać na ekranie
//        kwadrat ze znaków „X”. Liczba podana przez użytkownika określa długość każdego
//        boku kwadratu. Na przykład jeśli użytkownik wpisał 5, program powinien wyświetlić
//        następujący wzór:
//        XXXXX
//        XXXXX
//        XXXXX
//        XXXXX
//        XXXXX
//        Po wpisaniu przez użytkownika 8 program powinien wyświetlać następujące znaki:
//        XXXXXXXX
//        XXXXXXXX
//        XXXXXXXX
//        XXXXXXXX
//        XXXXXXXX
//        XXXXXXXX
//        XXXXXXXX
//        XXXXXXXX

import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbe dodatnia nie wieksza niz 15");
        int x = scanner.nextInt();
//        if(x <= 16)
//            System.exit(0);

        for (int i = 0; i <x; i++) {
            System.out.println("");

            for (int j = 0; j <x; j++) {
                System.out.print("x");
            }
            //.out.println("");
        }





    }
}