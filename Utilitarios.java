package geral;

public class Utilitarios {

		
		public String nome;
		public double conta;
		public double valorInicial;
		public double deposito;
		public double saque;
		public String iniciarDeposito;
	
		
		public  double valorEmConta() {
			return valorInicial + deposito;
		}
		public double retirada() {
			return (valorEmConta() - saque) - 5;
		}

		}
	
