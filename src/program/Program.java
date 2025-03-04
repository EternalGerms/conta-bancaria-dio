package program;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, digite o número da conta!");
		int numero = sc.nextInt();
		System.out.println("Por favor, digite o número da agência!");
		sc.nextLine();
		String agencia = sc.nextLine();
		System.out.println("Por favor, digite o nome do cliente!");
		String nome = sc.nextLine();
		System.out.println("Por favor, digite o saldo!");
		double saldo = sc.nextDouble();
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n", nome, agencia, numero, saldo);
		sc.close();

	}

}
