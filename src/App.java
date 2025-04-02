// Classe Usuario
class Usuario {
    // Atributos da classe Usuario
    int idusuario;
    String nome;
    String cpf;
    int cargo;
    String usuario;
    String senha;

    // Método para exibir os dados do usuário
    void exibeUsuario() {
        System.out.println("ID: " + idusuario);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Usuário: " + usuario);
        System.out.println("Senha: " + senha);
        System.out.println("-------------------------");
    }
}

// Classe DescCargo
class DescCargo {
    // Atributos privados da classe DescCargo
    private int idDesc;
    private String descricao;

    // Métodos para definir os valores dos atributos
    public void setIdDesc(int id) {
        this.idDesc = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para exibir os dados do cargo
    void novoRegistro() {
        System.out.println("Novo cargo cadastrado: " + descricao + " (ID: " + idDesc + ")");
    }
}

// Classe principal App
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World! Aprendendo POO em Java");

        // Criando usuário 1
        Usuario usuario1 = new Usuario();
        usuario1.idusuario = 1;
        usuario1.nome = "José";
        usuario1.cpf = "111.222.333-44";
        usuario1.cargo = 2;
        usuario1.usuario = "testerusername";
        usuario1.senha = "1234";

        // Exibindo dados do usuário 1
        usuario1.exibeUsuario();

        // Criando usuário 2
        Usuario usuario2 = new Usuario();
        usuario2.idusuario = 2;
        usuario2.nome = "Maria";
        usuario2.cpf = "333.444.555-77";
        usuario2.cargo = 2;
        usuario2.usuario = "usuariomaria";
        usuario2.senha = "4561";

        // Exibindo dados do usuário 2
        usuario2.exibeUsuario();

        // Criando e configurando um cargo
        DescCargo cargo1 = new DescCargo();
        cargo1.setIdDesc(1); // Corrigido para método correto
        cargo1.setDescricao("Oficial"); // Corrigido para método correto

        // Exibindo os dados do cargo
        cargo1.novoRegistro();
    }
}
