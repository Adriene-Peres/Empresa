
/**
 * Escreva uma descrição da classe Funcionario_Horista aqui.
 * 
 * @author Adriene Peres 
 * @version 30/01/2023
 */
public class Funcionario_Horista extends Funcionarios
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double salarioHora;
    private double horasTrabalhadas;

    /**
     * Construtor para objetos da classe Funcionario_Horista
     */
    public Funcionario_Horista(String n, String c, double sh, double ht)
    {
        super(n,c);
        salarioHora = sh;
        horasTrabalhadas = ht;
    }

    /**
     * 
     */
    public double getSalarioHora()
    {
        return salarioHora;
    }
    
    public double getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    
    @Override
    public double calcularSalario(){
        return getSalarioHora() * getHorasTrabalhadas(); 
    }
}
