package ResolvendoDesafiosIntermediariosEmJava;

import java.util.Scanner;

public class tamanhoDaPlaca {
    public static void main(String[] args)  {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext()) {
            int X = leitor.nextInt();
            int Y = leitor.nextInt();
            int M = leitor.nextInt();
            for (int i = 0; i < M; i++) {
                int Xi = leitor.nextInt();
                int Yi = leitor.nextInt();
                if ((Xi <= X && Yi <= Y) || (Xi <= Y && Yi<= X) || (Yi <= X && Xi <= Y))
                    System.out.println("Sim");
                else
                    System.out.println("Nao");
            }
        }
    }

}
