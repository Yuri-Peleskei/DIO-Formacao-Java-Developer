import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*
         * TODO:Conhecer e importar a class Scanner
         * Exibir a mensagem para nossos usuários
         * Obter pela class Scanner os valores digitados pelos usuários
         * 
         * |     Atributo     |    Tipo   |      Exemplo      |
         * |------------------|-----------|-------------------|
         * |   Nome Cliente   |   Texto   |   MARIO ANDRADE   |
         * |      Agencia     |   Texto   |      067-8        |
         * |      Conta       |  Inteiro  |       1021        |
         * |      Saldo       |  Decimal  |     237.48        |
         * 
         * Exibir a mensagem de conta criada
         * "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia],
         * conta [Numero] e seu saldo [Saldo] já está disponível para saque".
         */

         String nomeCliente, agencia;
         int conta;
         double saldo;

         Scanner sc = new Scanner(System.in);

         System.out.printf("Informe o nome completo: ");
         nomeCliente = sc.nextLine();

         System.out.printf("Informe o número da agencia com o dígito: ");
         agencia = sc.nextLine();

         System.out.printf("Informe o número da conta sem o dígito: ");
         conta = sc.nextInt();

         System.out.printf("Favor informe o valor que deseja fazer no seu primeiro deposito: ");
         saldo = sc.nextDouble();

         System.out.println("===============================================================");
         System.out.println("===============================================================");

         System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + conta + " e seu saldo: " + saldo + " já está disponível para saque");
         
    }
}
