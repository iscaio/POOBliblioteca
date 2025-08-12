package BibliotecaPt2;

public class Livro extends Material {
	private Genero genero;
	
	
	public Livro() {
		super();
	}

	public Livro(String titulo, String autor, Genero genero) {
		super(titulo, autor);
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "livro: " + super.toString() +
				" || Genero: " + genero;
	}
}
