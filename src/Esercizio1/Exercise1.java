package Esercizio1;

import java.util.Scanner;

public class Exercise1 {

    private static int numeroRandom;
    private static int[] arrayRandom = new int[5];

    public static void main(String[] args) {

        System.out.println("Ecco array iniziale");
        for (int i = 0; i < arrayRandom.length; i++) {
            numeroRandom = (int) (Math.random() * 10);
            arrayRandom[i] = numeroRandom;
            System.out.println(arrayRandom[i]);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci il numero in posizione 2");
            try {
                int userNumber = scanner.nextInt();
                if (userNumber == 0) {
                    System.out.println("Hai premuto zero");
                    break;
                } else if (userNumber > 0 && userNumber < 11) {
                    arrayRandom[1] = userNumber;
                    for (int i = 0; i < arrayRandom.length; i++) {
                        System.out.println(arrayRandom[i]);
                    }
                } else {
                    throw new numeroMaggioreDieci("Numero troppo grande");
                }
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Input non valido! Inserisci solo numeri interi tra 1 e 10.");
                scanner.nextLine(); // Ripulisce il buffer dello scanner
            }

        }

    }
}
