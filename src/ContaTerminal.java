import java.util.Scanner;

public class ContaTerminal {

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);

        int numConta;
        String agencia;
        String nomeCliente;
        double saldo = 367.0;

        System.out.println("Por favor, insira o numero da sua agencia !");
        agencia = scan.nextLine();

        System.out.println("Por gentileza, insira o numero da conta !");
        numConta = scan.nextInt();

        System.out.println("Agora, por ultimo, insira o seu nome !");
        nomeCliente = scan.nextLine();

        System.out.println("Ola, "+nomeCliente+"! Obrigado por criar uma conta em nosso banco," +
                " Sua agencia e "+ agencia +", conta "+ numConta +" e seu saldo "+ saldo +" ja" +
                "esta disponivel para saque");
    }
}
