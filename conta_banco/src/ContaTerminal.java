import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da Agência:");
        int numero = sc.nextInt();

        System.out.println("Digite a Agência:");
        String agencia = sc.next();

        System.out.println("Digite seu nome:");
        String nome = sc.next();

        System.out.println("Digite seu saldo:");
        double saldo = sc.nextDouble();

        ContaBanco contaBanco = new ContaBanco(numero, agencia, nome, saldo);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", contaBanco.getNomeDoCliente(), contaBanco.getAgencia(), contaBanco.getNumero(), contaBanco.getSaldo());

        sc.close();
    }
}
