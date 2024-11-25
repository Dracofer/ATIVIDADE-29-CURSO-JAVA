package geral;

public class Utilitarios {

	private String nome;
	private double conta;
	private double valorInicial;
	private double deposito;
	private double saque;
	private String iniciarDeposito;

	public Utilitarios(String nome, double conta, double valorInicial, double deposito, double saque,
			String iniciarDeposito) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.valorInicial = valorInicial;
		this.deposito = deposito;
		this.saque = saque;
		this.iniciarDeposito = iniciarDeposito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getConta() {
		return conta;
	}

	public double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public String getIniciarDeposito() {
		return iniciarDeposito;
	}

	public void setIniciarDeposito(String iniciarDeposito) {
		this.iniciarDeposito = iniciarDeposito;
	}

	public double getValorEmConta() {
		return valorInicial + deposito;
	}

	public double getRetirada() {
		return (getValorEmConta() - saque) - 5;
	}

	public void addConta(double conta) {
		this.conta += conta;
	}
}
