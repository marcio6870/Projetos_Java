import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        int numero, agencia;
        String nomeCliente;
        double saldo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, Seja bem vindo. Para criar sua conta siga os passos seguinte:");
        System.out.println();
        System.out.println("Por favor, digite o numero da Conta: ");
        numero = scan.nextInt();
        System.out.println();
        System.out.println("Por Favor, digite o numero da Agência:");
        agencia = scan.nextInt();
        System.out.println();
        System.out.println("Por favor, insira seu Nome: ");
        nomeCliente = scan.next();
        System.out.println();
        System.out.println("Insira o valor que deseja depositar : ");
        saldo = scan.nextDouble();
        System.out.println();
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua Agência é "+agencia +", Conta: "+numero+", e seu Saldo: R$ "+saldo+" e já esta disponível para saque.");


        

    }
}