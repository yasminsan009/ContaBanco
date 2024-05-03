import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o Número: ");
        int conta = scanner.nextInt();
        
        System.out.println("Digite sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();
        
        System.out.println("Seu Saldo é: ");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +  " e seu saldo $" + saldo + " já está disponível para saque!");

        
    }
}