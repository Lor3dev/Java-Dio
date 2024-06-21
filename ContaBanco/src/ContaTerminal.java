import java.util.Scanner;

public class ContaTerminal {
    String nomeCliente, agencia;
    int numero;
    double saldo;

public static void main(String[]args) {

Scanner entradadeDados = new Scanner (System.in);

System.out.print("Digite seu nome:");
String nomeCliente = entradadeDados.nextLine();

System.out.print("Digite o numero da agência:");
String agencia = entradadeDados.nextLine();

System.out.print("Digite o numero da conta:");
int numero = entradadeDados.nextInt();

System.out.print("Digite o saldo da conta:");
double saldo = entradadeDados.nextDouble();

System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente,agencia, numero, saldo );


}



}