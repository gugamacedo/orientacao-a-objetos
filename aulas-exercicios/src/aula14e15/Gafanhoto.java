package aula14e15;

public class Gafanhoto extends Pessoa{
	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String login) {
		super(nome, idade);
		this.login = login;
		this.totAssistido = 0;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public int getTotAssistido() {
		return totAssistido;
	}


	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}


	protected void viuMaisUm() {
		
	}


	@Override
	public void detalhes() {
		super.detalhes();
		System.out.printf("Login: %s\nTotal assistido: %d\n", this.getLogin(), this.getTotAssistido());
	}
	
}
