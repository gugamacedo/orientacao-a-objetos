package aula09;

public class Livro implements Publicacao {
	private String autor;
	private String titulo;
	private int totPags;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String autor, String titulo, int totPags, Pessoa leitor) {
		this.pagAtual = 1;
		this.aberto = false;
		this.autor = autor;
		this.titulo = titulo;
		this.totPags = totPags;
		this.leitor = leitor;
	}

	public void detalhes() {
		System.out.println("---------------------");
		System.out.printf("Livro: %s\nAutor: %s\nTotal de páginas: %d\nPágina atual: %d\nAberto? %b\nLeitor(a): %s\n"
				, this.getTitulo(), this.getAutor(), this.getTotPags(), this.getPagAtual(), this.getAberto(), this.getLeitor().getNome());
		System.out.println("---------------------");
	}
		
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTotPags() {
		return totPags;
	}

	public void setTotPags(int totPags) {
		this.totPags = totPags;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		if (this.getAberto() == false) {
			this.setAberto(true);	
			System.out.println("Livro aberto");
		} else {
			System.out.println("Erro, o livro já está aberto");
		}
	}

	@Override
	public void fechar() {
		if (this.getAberto() == false) {
			this.setAberto(false);
			System.out.println("Livro fechado");
		} else {
			System.out.println("O livro já está fechado");
		}
	}

	@Override
	public void pularPg(int p) {
		if (this.getAberto() == true) {
			if (p >= 1 && p <= this.getTotPags()) {
				this.setPagAtual(p);
				System.out.println("Pulando pra página " + this.getPagAtual());			
			} else {
				System.out.println("Erro, nº de página inexistente");
			}
		} else {
			System.out.println("Erro, o livro está fechado");
		}
	}

	@Override
	public void avancarPg() {
		if (this.getAberto() == true) {
			if (this.getPagAtual() < this.getTotPags()) {
				this.setPagAtual(getPagAtual() + 1);
				System.out.println("Avançando pra página " + this.getPagAtual());
			} else {
				System.out.println("Você já está na última página");
			}			
		} else {
			System.out.println("Erro, o livro está fechado");
		}
	}

	@Override
	public void voltarPg() {
		if (this.getAberto() == true) {
			if (this.getPagAtual() > 1) {
				this.setPagAtual(getPagAtual() - 1);
				System.out.println("Voltando pra página " + this.getPagAtual());
			} else {
				System.out.println("Você já está na primeira página");
			}				
		} else {
			System.out.println("Erro, o livro está fechado");
		}
	}

}