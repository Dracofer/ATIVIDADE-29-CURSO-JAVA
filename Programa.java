package sistema;

import java.util.Scanner;
import java.util.Locale;
import geral.Utilitarios;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Utilitarios utilitarios = new Utilitarios();
		
		System.out.print("Enter account number: ");
		utilitarios.conta = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter account holder: ");	
		utilitarios.nome = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		utilitarios.iniciarDeposito = sc.next();
		
		if(utilitarios.iniciarDeposito.equals("y")){
		System.out.print("Enter initial deposit value: ");
		utilitarios.valorInicial = sc.nextDouble();
		}
		System.out.println("");
		System.out.println("Account data: ");
		System.out.printf("Account %.0f, Holder: %s, Balance: $ %.2f%n",utilitarios.conta ,utilitarios.nome,utilitarios.valorEmConta());
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		utilitarios.deposito = sc.nextDouble();
		
		System.out.println("Updated Account data: ");
		System.out.printf("Account %.0f, Holder: %s, Balance: $ %.2f%n",utilitarios.conta ,utilitarios.nome,utilitarios.valorEmConta());
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		utilitarios.saque = sc.nextDouble();
		
		System.out.println("Updated Account data: ");
		System.out.printf("Account %.0f, Holder: %s, Balance: $ %.2f%n",utilitarios.conta ,utilitarios.nome,utilitarios.retirada());
		
		sc.close();
	}

}
