package BibliotecaPt2;

public class Revista extends Material {
	private int numRevista;
	
	public Revista() {
		super();
	}

	public Revista(String titulo, String autor, int numRevista) {
		super(titulo, autor);
		this.numRevista = numRevista;
	}

	public int getNumRevista() {
		return numRevista;
	}

	public void setNumRevista(int numRevista) {
		this.numRevista = numRevista;
	}

	@Override
	public String toString() {
		return "Revista: " + super.toString() + 
				" || Edição da Revista: " + numRevista;
	}
}
