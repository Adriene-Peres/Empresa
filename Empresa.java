
/**
 * Escreva uma descrição da classe Empresa aqui.
 * 
 * @author (Adriene Peres) 
 * @version (30/01/2023)
 */

import java.util.*;
public class Empresa{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String cnpj; 
    private ArrayList<Funcionarios> funcionarios;
    
    /**
     * Construtor para objetos da classe Empresa
     */
    public Empresa(String nome, String cnps)
    {
        this.nome = nome;
        this.cnpj = cnpj;
        funcionarios = new ArrayList<>();
       
    }

    /**
     * método para se admitir um novo funcionário na empresa.
     */
    public void admitirFuncionario(Funcionarios f)
    {
        funcionarios.add(f);        
    }
    
    public void gerarFolhaDePagamento(){
        for(Funcionarios f: funcionarios){
            System.out.println(f);
            System.out.println();
        }
    }
}
