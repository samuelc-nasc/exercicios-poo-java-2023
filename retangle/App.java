package retangle;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        Retangle retangle = new Retangle();
        System.out.println("Enter rectangle width and height: ");
        retangle.width = ler.nextDouble();
        retangle.height = ler.nextDouble();

        System.out.println(retangle);

        ler.close();
    }
}
