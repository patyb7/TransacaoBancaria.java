import java.util.Scanner;

public class LimiteDiario {
    public static void main(String[] args) {
        Scanner entradScanner = new Scanner(System.in);
        System.out.println("Digite o limite diário de saque: ");
        double limiteDiario =  entradScanner.nextDouble();
        

        for (int n =1; ; n++){
            System.out.println("Informe o valor do primeiro saque: ");
            double valorSaque = entradScanner.nextDouble();

            if (valorSaque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }else if (valorSaque > limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }else 
                {
                    double limiteRestante = limiteDiario - valorSaque;
                    System.out.println("Saque realizado. Limite restante: "  + limiteRestante+ "\nTransacoes encerradas." );
                    break;
                }
            }
            entradScanner.close();
        }
        
    
}

