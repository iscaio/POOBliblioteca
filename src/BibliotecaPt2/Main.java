package BibliotecaPt2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ArrayList<Material> material = new ArrayList<>();

		Biblioteca biblioteca = new Biblioteca();

		System.out.println("Bem vindo à Biblioteca");
		int opcao = 0;

		while (opcao != 5) {
			menuBiblioteca();
			System.out.println("Digite a sua opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			if (opcao <= 0 || opcao > 5) {
				System.out.println("Digite algo valido!");
			}
			else {
				switch (opcao) {
	
				case 1:
					adicionarMateriais(sc, biblioteca);
					break;
	
				case 2:
					pesquisarMateriais(sc, material, biblioteca);
					break;
	
				case 3:
					excluirMateriais(sc, material, biblioteca);
					break;
				case 4:
					listarMateriais(sc, material, biblioteca);
					break;
	
				case 5:
					System.out.println("Obrigado por usar nosso sistema.");
					break;
	
				default:
					System.out.println("Opção Inválida.");
				}
			}
		}
		sc.close();
		System.out.println("Saindo...");
	}

	public static void menuBiblioteca() {
		System.out.println("As nossas opções são:");
		System.out.println("1 -	Adicionar material;");
		System.out.println("2 -	Pesquisar material;");
		System.out.println("3 -	Excluir material;");
		System.out.println("4 -	Listar materiais;");
		System.out.println("5 -	Sair.");
	}

	public static void adicionarMateriais(Scanner sc, Biblioteca biblioteca) {
		System.out.print("Voce deseja adicionar um livro ou revista: ");
		String tipoMaterial = sc.nextLine();

		if (tipoMaterial.equalsIgnoreCase("Livro") || tipoMaterial.equalsIgnoreCase("Revista")) {
			System.out.print("Digite o título do material: ");
			String titulo = sc.nextLine();
			if (titulo.isEmpty()) {
				System.out.println("Digite algo válido");
			} else {
				System.out.print("Digite o autor do material: ");
				String autor = sc.nextLine();
				
				if (tipoMaterial.equalsIgnoreCase("Livro")) {
					System.out.println("--- Escolha o gênero ---");
					
					for (int i = 0; i < Genero.values().length; i++) {
						System.out.println((i + 1) + " - " + Genero.values()[i]);
					}
					System.out.print("Digite o número correspondente ao gênero: ");
					Genero generoSelecionado;
					int opcaoGenero = sc.nextInt();
					sc.nextLine();
					
					if (opcaoGenero >= 1 && opcaoGenero <= 4) {
						generoSelecionado = Genero.values()[opcaoGenero - 1];
						
						Livro livro = new Livro(titulo, autor, generoSelecionado);
						biblioteca.adicionarMaterial(livro);
						System.out.println("Livro adicionado com sucesso");
						System.out.println(livro.toString());
					}
				}
				else if (tipoMaterial.equalsIgnoreCase("Revista")) {
					System.out.print("Digite a edição da revista (número): ");
					int edicao = 0;
					edicao = sc.nextInt();
					sc.nextLine();
					
					if (edicao < 0) {
						System.out.println("Digite um numero de edição correto.");
					} else {
						Revista revista = new Revista(titulo, autor, edicao);
						biblioteca.adicionarMaterial(revista);
						System.out.println("Revista adicionada com sucesso");
						System.out.println(revista.toString());
					}
				}
			}		
		}
		else if (tipoMaterial.isEmpty()) {
			System.out.println("Tipo de material inválido. Digite 'Livro' ou 'Revista'.");
		}
		else {
			System.out.println("Digite algo válido (Livro ou Revista)!");
		}
	}

	public static void pesquisarMateriais(Scanner sc, ArrayList<Material> material, Biblioteca biblioteca) {
	    ArrayList<Material> lista = biblioteca.getMaterial();
	    if (lista.isEmpty()) {
	        System.out.println("Não há itens cadastrados para serem pesquisados.");
	        return;
	    }
	    else {
	    	System.out.print("Qual o título do material que deseja pesquisar: ");
	    	String tituloPesquisa = sc.nextLine();
	    	if (tituloPesquisa.isEmpty()) {
	    		System.out.println("Digite algo válido!");
	    		return;
	    	} else {	    		
	    		if(tituloPesquisa.equalsIgnoreCase(tituloPesquisa)) {
	    			for (Material mat : lista) {
	    				if (mat.getTitulo() != null && mat.getTitulo().equalsIgnoreCase(tituloPesquisa)) {
	    					System.out.println("Material encontrado: " + mat);
	    					break;	    			
	    					}
	    				}
	    			} 
	    		else {
	    			System.out.println("Nenhum material encontrado com esse título.");	    	
	    		}
	   		}
	   	}
	}
	
	public static void excluirMateriais(Scanner sc, ArrayList<Material> material, Biblioteca biblioteca) {
		System.out.println("Voce deseja excluir um livro ou revista: ");
		String remover = sc.nextLine();

		if (remover.equalsIgnoreCase("Livro") || remover.equalsIgnoreCase("Revista")) {
			System.out.println("Digite o titulo do material a ser excluído: ");
			String tituloParaRemover = sc.nextLine();

			if (tituloParaRemover.isEmpty()) {
				System.out.println("Digite algo válido");
			} else if (tituloParaRemover.equalsIgnoreCase(tituloParaRemover)) {
				biblioteca.removerMaterial(tituloParaRemover);
				System.out.println("Livro removido com sucesso.");
			}
		} else if (remover.isEmpty()) {
			System.out.println("Digite algo válido!");
		} else if (material.isEmpty()) {
			System.out.println("Não há itens a ser exlcuídos");
		} else {
			System.out.println("Opção inválida!");
		}
	}

	public static void listarMateriais(Scanner sc, ArrayList<Material> material, Biblioteca biblioteca) {
		System.out.println("Voce deseja listar o/os livros ou a/as revistas: ");
		String listar = sc.nextLine();

		if (listar.equalsIgnoreCase("Livro") || listar.equalsIgnoreCase("Livros")) {
			biblioteca.listarLivros();
		} else if (listar.equalsIgnoreCase("Revista") || listar.equalsIgnoreCase("Revistas")) {
			biblioteca.listarRevistas();
		} else if (listar.isEmpty()) {
			System.out.println("Digite algo válido!");
		} else if (material.isEmpty()) {
			System.out.println("Não há itens cadastrados");
		} else {
			System.out.println("Opção inválida!");
		}
	}
}
