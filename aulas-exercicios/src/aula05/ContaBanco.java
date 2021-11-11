package aula05;

public class ContaBanco {
	public int numConta;
	private String pessoa;
	protected String tipoConta;
	private float saldo;
	private Boolean statusConta;
	
	public ContaBanco() {
		super();
		this.setSaldo(0);
		this.setStatusConta(false);
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Boolean getStatusConta() {
		return statusConta;
	}

	public void setStatusConta(Boolean statusConta) {
		this.statusConta = statusConta;
	}

	public void abrirConta(String t) {
		this.setTipoConta(t);
		this.setStatusConta(true);
		if (t == "cc") {
			this.setSaldo(50);
			System.out.printf("Olá %s, conta aberta!\nE um presentinho de R$50 :D\n", this.getPessoa());
		} else if (t == "cp") {
			this.setSaldo(150);
			System.out.printf("Olá %s, conta aberta!\nE um presentinho de R$150 :D\n", this.getPessoa());
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.printf("Você precisa sacar R$%.2f\n", this.getSaldo());
		} else if (this.getSaldo() < 0) {
			System.out.printf("Você está devendo, precisa depositar R$.2f\n", this.getSaldo());
		} else if (this.getSaldo() == 0) {
			this.setStatusConta(false);
			System.out.println("Conta fechada :( Sentiremos sua falta!");
		}
	}
	
	public void depositar(float d) {
		if (this.getStatusConta() == true) {
			this.setSaldo(this.getSaldo() + d);	
			System.out.printf("Depósito de R$%.2f feito!\n", d);
		} else if (this.getStatusConta() == false) {
			System.out.println("Depósito falhou...Precisa abrir uma conta primeiro!");
		}
	}
	
	public void sacar(float s) {
		if (this.getStatusConta() == true) {
			if (this.getSaldo() >= s) {
				this.setSaldo(this.getSaldo() - s);
				System.out.printf("Saque de R$%.2f feito!\n", s);
			} else {
				System.out.printf("Não foi possível sacar R$%.2f\nVocê quer sacar mais do que têm :(\n", s);
			}
		} else if (this.getStatusConta() == false) {
			System.out.println("Precisa abrir uma conta primeiro!");
		}
	}
	
	public void taxarConta(){
		if (this.getTipoConta() == "cc") {
			this.setSaldo(this.getSaldo() - 12);
			System.out.println("Subtraindo nossa taxa de R$12");
		} else if (this.getTipoConta() == "cp") {
			this.setSaldo(this.getSaldo() - 20);
			System.out.println("Subtraindo nossa taxa de R$20");
		}		
	}
	
	public void status() {
		System.out.println("-------------------");
		System.out.printf("Cliente: %s\nNº conta: %d\nTipo de conta: %s\nSaldo R$%.2f\nConta aberta? %b"
				, this.getPessoa(), this.getNumConta(), this.getTipoConta(), this.getSaldo(), this.getStatusConta());
		System.out.println("\n-------------------");
	}
}
