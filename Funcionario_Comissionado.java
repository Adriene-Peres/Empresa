
/**
 * Escreva uma descrição da classe Funcionario_Comissionado aqui.
 * 
 * @author Adriene Peres 
 * @version 30/01/2023
 */
public class Funcionario_Comissionado extends Funcionarios
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int totalVendas;
    private double taxaComissao;

    /**
     * Construtor para objetos da classe Funcionario_Comissionado
     */
    public Funcionario_Comissionado(String n, String c, int tv, double tc)
    {
        super(n,c);
        totalVendas = tv;
        taxaComissao = tc;
    }

    /**
     *
     */
    public int getTotalVendas()
    {
      return totalVendas;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    @Override
    public double calcularSalario(){
        return getTotalVendas()*getTaxaComissao();
    }
}
