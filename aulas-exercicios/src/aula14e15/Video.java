package aula14e15;

public class Video implements AcoesVideo {
	private String titulo;
	private float avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(float avaliacao) {
		this.avaliacao = (this.avaliacao + avaliacao)/this.views;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean getReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		this.setReproduzindo(false);
	}

	@Override
	public void likar() {
		this.setCurtidas(this.getCurtidas() + 1);
	}
	
	public void detalhes() {
		System.out.println("------------------------");
		System.out.printf("Título: %s\nAvaliação: %.1f\nViews: %d\nLikes: %d\nReproduzindo? %b\n"
				, this.getTitulo(), this.getAvaliacao(), this.getViews(), this.getCurtidas(), this.getReproduzindo());
	}
}
