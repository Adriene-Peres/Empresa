
/**
 * Escreva uma descrição da classe Funcionarios aqui.
 * 
 * @author Adriene Peres
 * @version 30/01/2023
 */
public class Funcionarios {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String cpf;

    /**
     * Construtor para objetos da classe Funcionarios
     */
    public Funcionarios(String n, String c) {
        nome = n;
        cpf = c;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    /**
     * sobrescrita do metodo toString() para poder retornar uma especie de relatorio
     * para o usuario.
     */
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nSalario: " + calcularSalario();
    }

    public double calcularSalario() {
        return 0;
    }
}
