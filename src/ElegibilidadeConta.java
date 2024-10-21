import java.util.Scanner;

public class ElegibilidadeConta {
    public static void main(String[] args) {
        Scanner  entradaScanner = new Scanner(System.in);
        
        System.out.println("Digite a sua idade, por gentileza: ");
        int idade = entradaScanner.nextInt();
        if (idade >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
            }
            entradaScanner.close();
    }

}

