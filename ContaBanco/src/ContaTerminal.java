import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  
    public static void main(String[] args) throws Exception {
        // TO DO: Conhecer e importar a Classe Scanner.
        // Exibir as msgs para o usuário.
        // Obter pela Scanner os valores digitados no terminal.
        // Exibir a conta criada.
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, seja bem-vindo ao Banco Terminal!");
        System.out.println("Por favor, digite o Número da Conta, com quatro digitos:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora, digite o número da Agência, com digito:");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome:");
        String sobrenome = scanner.next();


        double saldo = 237.48;


        System.out.println("Olá, " + nome + " " + sobrenome + "!" + " Obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", Conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
        
        // Resolvendo - Resource leak: 'input' is never closed.
        scanner.close();
    }

}
