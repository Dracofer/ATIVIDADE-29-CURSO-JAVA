package sistema;

import java.util.Scanner;
import java.util.Locale;
import geral.Utilitarios;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Utilitarios utilitarios = new Utilitarios(null, 0, 0, 0, 0, null);
		
		System.out.print("Enter account number: ");
		utilitarios.addConta(sc.nextDouble());
		sc.nextLine();
		System.out.print("Enter account holder: ");	
		utilitarios.setNome(sc.nextLine());
		
		System.out.print("Is there na initial deposit (y/n)? ");
		utilitarios.setIniciarDeposito(sc.next());
		
		if(utilitarios.getIniciarDeposito().equals("y")){
		System.out.print("Enter initial deposit value: ");
		utilitarios.setValorInicial(sc.nextDouble());
		}
		System.out.println("");
		System.out.println("Account data: ");
		System.out.printf("Account %.0f, Holder: %s, Balance: $ %.2f%n",utilitarios.getConta() ,utilitarios.getNome(),utilitarios.getValorEmConta());
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		utilitarios.setDeposito(sc.nextDouble());
		
		System.out.println("Updated Account data: ");
		System.out.printf("Account %.0f, Holder: %s, Balance: $ %.2f%n",utilitarios.getConta() ,utilitarios.getNome(),utilitarios.getValorEmConta());
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		utilitarios.setSaque(sc.nextDouble());
		
		System.out.println("Updated Account data: ");
		System.out.printf("Account %.0f, Holder: %s, Balance: $ %.2f%n",utilitarios.getConta() ,utilitarios.getNome(),utilitarios.getRetirada());
		
		sc.close();
	}

}
