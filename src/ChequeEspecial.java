import java.util.Scanner;

public class ChequeEspecial {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner  entradaScanner = new Scanner(System.in);
        System.out.println("Informe o saldo atual da sua conta bancária: ");
        double saldo = entradaScanner.nextDouble();
        
        System.out.println("Informe o valor do saque: ");
        double saque = entradaScanner.nextDouble();
        
        double limiteEspecial = 500;
        //double resultado = 
        if (saque <= saldo) {
            //double resto = saque - saldo;
            System.out.println("Transação realizada com sucesso.");

            }else if (saque <= saldo + limiteEspecial){
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }else { 
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
            entradaScanner.close();

        }
    }

