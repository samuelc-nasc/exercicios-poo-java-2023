package alune;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Alune alune = new Alune();
        
        // alune.name = ler.nextLine();
        alune.n1 = ler.nextDouble();
        alune.n2 = ler.nextDouble();
        alune.n3 = ler.nextDouble();

        double somaFinal = alune.finalGrade();

        if(somaFinal >= 60) {
            System.out.println("Arrazo");
        }else {
            System.out.println("Flop, gata");
            System.out.printf("Falta %.2f pontes", 60 - somaFinal);
        }
        
        ler.close();
    }
}
