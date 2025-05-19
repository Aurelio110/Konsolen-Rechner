package aufgaben.aufgabe1.grundrechenoperationen;
import aufgaben.aufgabe1.Entscheidung;

import java.math.BigDecimal;
import java.util.Scanner;

public class Addition {

    public static void addiere() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBitte geben Sie eine Zahl ein: ");
        double x = scanner.nextDouble();

        System.out.print("Bitte geben Sie eine zweite Zahl ein: ");
        double y = scanner.nextDouble();

        double ergebnis = x + y;

        String ergebnis1 = String.valueOf(ergebnis).replace(".", ",");

        if (ergebnis%1 == 0){
            System.out.println("Das Ergebnis ist: " + (int) ergebnis);
        }else {
            System.out.println("Das Ergebnis ist: " + ergebnis1);
        }
        for (int i = 5; i >= 1; i--){
            System.out.println("Das Programm startet neu in: " + i);
            Thread.sleep(500);
            System.out.print("\n-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.print("-");System.out.println("-");
            Thread.sleep(500);
        }

        for (int i = 0; i < 50; i++) System.out.println();
        if(ergebnis%1==0){
            System.out.println("Das vorherige Ergebnis war: " + (int)ergebnis);
        }else{
            System.out.println("Das vorherige Ergebnis war: " + ergebnis1);
        }

        Entscheidung.entscheidung();
    }
}