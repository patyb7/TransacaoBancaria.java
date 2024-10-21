import java.util.Scanner;
import exceptions.ExcecoesInvalidasInputMismatchException;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner entradaScanner = new Scanner(System.in);

        try{ 
            System.out.println("Digite um número de conta válido: ");
            int numeroConta = entradaScanner.nextInt();

            verificarNumeroConta(numeroConta);

        } catch(ExcecoesInvalidasInputMismatchException  e ){
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        
        } finally{
            entradaScanner.close();
        }
    }

    private static void verificarNumeroConta(int numeroConta)throws ExcecoesInvalidasInputMismatchException{
        if(String.valueOf(numeroConta).length() != 8){
            throw new IllegalArgumentException ("O número da conta deve conter examente 8 digitos");
        }
            System.out.println("Conta digitada: "+ numeroConta);
        
    }
}
