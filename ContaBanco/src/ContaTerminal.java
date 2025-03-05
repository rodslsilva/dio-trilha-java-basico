import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldoConta = 237.48;

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o numero da Agencia: ");
        numero = sc.nextInt();

        sc.nextLine();
        System.out.print("Por favor, digite a Agencia: ");
        agencia = sc.nextLine();

        System.out.println("Olá, " + nomeCliente + "! obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldoConta + " ja esta disponivel!");

    }
}
