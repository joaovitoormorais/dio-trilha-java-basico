package contabancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		
		System.out.println("Digite o número da agência:");
		int Numero = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Digite o nome da sua agência:");
		String NomeAgencia = scan.nextLine();
		
		System.out.println("Digite seu nome:");
		String Nome_Cliente = scan.nextLine();
		
		System.out.println("Digite seu saldo:");
		double saldo = scan.nextDouble();
		
		System.out.println("Olá" + Nome_Cliente + "Obrigado por criar uma conta em nosso banco"
		+ "sua agência é" + NomeAgencia + Numero +  "e seu saldo é" + saldo);

		} catch(InputMismatchException e) {
			System.out.println("Errou!, preencha as informações novamente.");
		} finally {
			scan.close();

}
		
	}
	
}
