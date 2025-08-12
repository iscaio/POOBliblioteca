@"

# BibliotecaPt2 — Projeto de POO (Java)

Este repositório contém o projeto **Biblioteca**, desenvolvido como parte da disciplina **Programação Orientada a Objetos (POO)**. O objetivo do trabalho foi aplicar os fundamentos básicos de Java e POO por meio da simulação de um sistema de gestão de biblioteca.

---

## 1. Descrição do Projeto

O sistema Biblioteca permite o cadastro e a manipulação de livros e de usuários, com funcionalidades como:

- Adicionar, listar e remover livros.
- Cadastrar usuários
- Registrar empréstimos e devoluções de livros.
- Consultar o acervo e o histórico de empréstimos.

O projeto utiliza conceitos fundamentais de POO, como:

- **Classes**, **objetos** e **atributos**
- **Encapsulamento**
- **Construtores**
- **Interação entre objetos**

---

## 2. Estrutura do Repositório

\`\`\`
POOBliblioteca/
├── src/
│ └── BibliotecaPt2/
│ ├── Main.java
│ ├── Livro.java
│ ├── Usuario.java
│ ├── Emprestimo.java
│ └── (outras classes conforme implementado)
├── .gitignore
└── README.md
\`\`\`

- \`Main.java\`: ponto de entrada da aplicação (classe com \`public static void main\`), gerencia o menu/biblioteca.
- \`Livro.java\`: representa os livros (título, autor, ISBN, disponibilidade etc.).
- \`Usuario.java\`: representa os usuários da biblioteca.
- \`Emprestimo.java\`: controla o processo de emprestar e devolver livros.
- Outras classes podem existir conforme o escopo do projeto.

---

## 3. Como Executar o Projeto

1. Clone este repositório:

   \`\`\`bash
   git clone https://github.com/iscaio/POOBliblioteca.git
   cd POOBliblioteca
   \`\`\`

2. Compile os arquivos Java:

   \`\`\`bash
   javac -d bin src/BibliotecaPt2/\*.java
   \`\`\`

3. Execute o programa:

   \`\`\`bash
   java -cp bin BibliotecaPt2.Main
   \`\`\`

> **Dica**: Se estiver usando uma IDE como Eclipse ou VS Code, basta abrir o projeto e executar a classe \`Main\`.

---

## 4. Objetivos de Aprendizagem

Este projeto buscou consolidar os seguintes conceitos de POO:

- Estruturação de código em classes e objetos.
- Aplicação de encapsulamento (uso de métodos getters/setters).
- Manipulação de coleções (como \`List<Livro>\` ou \`List<Usuario>\`).
- Interação entre classes (por exemplo, registrar um empréstimo ligando \`Livro\` e \`Usuario\`).

Além disso, foi um bom exercício de:

- Organização de projeto Java em pastas e pacotes.
- Inicialização e execução no terminal ou via IDE.
- Primeiro contato com controle de versão usando Git e GitHub.

---

## 5. Possíveis Melhorias Futuras

- Adicionar persistência (usando arquivos ou banco de dados).
- Criar uma interface gráfica (Java Swing ou JavaFX).
- Implementar testes automatizados (JUnit).
- Refatorar para incluir padrões de projeto (por exemplo, DAO ou MVC).

---

## 6. Sobre o Curso

Este trabalho foi realizado como parte da grade curricular da **primeira disciplina de Java (POO)** da universidade. Ele foi elaborado para demonstrar e exercitar os conceitos básicos da linguagem e da orientação a objetos, consolidando a teoria em prática.

---

### Autor

- **Caio Andrade**
