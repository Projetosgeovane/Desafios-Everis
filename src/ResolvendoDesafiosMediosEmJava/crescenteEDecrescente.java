package ResolvendoDesafiosMediosEmJava;

import java.util.Scanner;

public class crescenteEDecrescente {
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
        int Y = leitor.nextInt();
        while (X != Y) {
            if (X > Y) System.out.println("Decrescente");
            else System.out.println("Crescente");
            X = leitor.nextInt();
            Y = leitor.nextInt();
        }
    }

}

