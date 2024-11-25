package Esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Exercise2 {



    public static double calcolaKmLitro(int numeroKm, int litriConsumati) {
        double kmPerLitro = numeroKm / litriConsumati;
        System.out.println("Hai percorso " + numeroKm + " kilometri consumando " + litriConsumati +
                " litri, la tua macchina fa " + kmPerLitro + " km/l");
        return kmPerLitro;
    }

    public static void main(String[] args) {
        Logger LOGGER = LoggerFactory.getLogger(Exercise2.class);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanti km hai fatto?");
        int km = scanner.nextInt();
        System.out.println("Quanti litri hai fatto secchi?");
        try {
            int litri = scanner.nextInt();
            if (litri > 0) {
                calcolaKmLitro(km, litri);
            } else {
                throw new ArithmeticException("non è possibile che hai consumato 0 litri");
            }
        } catch (ArithmeticException e) {
           // System.out.println(e); //catch normale
            LOGGER.error(e.getMessage()); // catch con LogBack
        }

    }

}
