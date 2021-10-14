package ResolvendoDesafiosIntermediariosEmJava;

import java.util.Scanner;

public class entradaESaidaDeNumerosInteiros {
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();

        String strA = String.format("%10s", A).replace(' ', '0');
        String strB = String.format("%10s", B).replace(' ', '0');
        String strC = String.format("%10s", C).replace(' ', '0');

        System.out.printf("A = %d, B = %d, C = %d\n", A , B, C);
        System.out.printf("A = %10d, B = %10d, C = %10d\n", A , B, C);
        System.out.printf("A = %010d, B = %010d, C = %010d\n", A , B, C);
        System.out.printf("A = %-10d, B = %-10d, C = %-10d\n", A , B, C);

    }
}
