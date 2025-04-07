package Banco;

import java.util.Scanner;

public class ContaBanco {
	public static void main(String[] args) {
		//criando o objeto scanner para receber dados do terminal
		Scanner scanner = new Scanner(System.in);
		
		//solicitando os dados
		System.out.println("Por favor, digite o número da Agência: ");
		String agencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o número da conta: ");
		int numero = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Por favor, digite o nome do cliente: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o saldo: ");
		double saldo = scanner.nextDouble();
		
		//exibindo mensagem final
		System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		
		scanner.close();
	}
}
