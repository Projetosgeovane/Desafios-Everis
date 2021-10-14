package ResolvendoDesafiosIntermediariosEmJava;

import java.util.Scanner;

public class senhaFixa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senhaValida = 2002;
        int A =leitor.nextInt();

        while(A != senhaValida){
            System.out.println("Senha Invalida");
            A = leitor.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}

