import java.util.Scanner;

public class TransacaoBancaria {
    public static void main(String[] args) {
        
        Scanner leitorDeEntradas = new Scanner(System.in);
        double saldo =100;
        boolean continuar = true;
        System.out.println("Bem Vindo ao Caixa Eletrônico Banco Patricia");
        System.out.println("Escolha o tipo de transação que deseja fazer: 1 - Deposito, 2 - Saque, 3 - Saldo atual, 4 - Encerrar");
     
        while (continuar) {
            int opcao = leitorDeEntradas.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor que será depositado: ");
                    double deposito = leitorDeEntradas.nextDouble();
                    double saldoAtualizado = saldo += deposito;
                    System.out.println(String.format("O Seu saldo atualizado é %.1f . Você tinha em conta %.1f" ,saldoAtualizado, saldo));
                    break;

                case 2:
                    System.out.println("Digite o valor que será sacado: ");
                    double saque = leitorDeEntradas.nextDouble();
                    if (saldo<= 0){
                        System.out.println("Você não tem saldo suficiente");
                        } else if (continuar){
                            double atualizacaoSaldo = saldo - saque;
                            System.out.println(String.format("O valor sacado é : %.1f . O Saldo atual em conta é de: %.1f", saldo , atualizacaoSaldo));
                            break;
                            }
                case 3:
                    System.out.println(String.format("O Saldo atual em conta é de: %.1f", saldo));
                    break;
                    
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false; //Atualiza a variavel de controle para encerrar o loop
                    break;
                           
                default:
                System.out.println("Opção inválida. Tente novamente");
      
            }
        }
        leitorDeEntradas.close();
    }
}

