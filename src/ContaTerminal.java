import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        /*  Fazer:Conhecer e importar a classe Scanner
            Exibir as mensagens para o usuário
            Obter pela scanner os valores digitados no terminal
            Exibir a mensagem conta criada
         */

        Scanner scanner = new Scanner(System.in);

        //  Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da sua conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        //  Solicita e lê a agência
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        //  Solicita e lê nome do cliente
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        //  Solicita e lê o saldo
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        //  Fecha o scanner
        scanner.close();

        //  Exibir a mensagem formatada com os dados inseridos
        String mensagem =("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponivel para saque.");

        System.out.println(mensagem);
    }
}