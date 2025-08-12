package BibliotecaPt2;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Material> materiais;
	
	public Biblioteca() {
		super();
		this.materiais = new ArrayList<>();
	}

	public Biblioteca(ArrayList<Material> material) {
		this.materiais = new ArrayList<>();
	}

	public ArrayList<Material> getMaterial() {
		return materiais;
	}

	public void setMaterial(ArrayList<Material> material) {
		this.materiais = material;
	}

	public void adicionarMaterial (Material material) {
		materiais.add(material);
	}
	
	public void removerMaterial(String titulo) {
		Material materialParaRemover = null;
		for (Material mat : materiais) {
			if (mat.getTitulo() != null && mat.getTitulo().equalsIgnoreCase(titulo)) {
				materialParaRemover = mat;
				break;
			}
		}
		if (materialParaRemover != null) {
			materiais.remove(materialParaRemover);
			System.out.println("Material " + titulo + " removido com sucesso.");
		} else {
			System.out.println("Material com título " + titulo + " não encontrado.");
		}
	}

	public void listarLivros() {
		if (materiais.isEmpty()) {
			System.out.println("Nenhum material cadastrado.");
		} else {
			System.out.println("Lista de livros:");
			for (Material material : materiais) {
				if (material instanceof Livro) {
					System.out.println(material);
				}
			}
		}
	}


	public void listarRevistas() {
		if (materiais.isEmpty()) {
			System.out.println("Nenhum material cadastrado.");
		} else {
			System.out.println("Lista de Revistas:");
			for (Material material : materiais) {
				if (material instanceof Revista) {
					System.out.println(material);
				}
			}
		}
	}
}
