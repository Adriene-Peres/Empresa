
/**
 * Escreva uma descrição da classe TesteEmpresa aqui.
 * 
 * @author Adriene Peres 
 * @version 30/01/2023
 */
public class TesteEmpresa{
    public static void main(String[] args){
        Empresa empresa = new Empresa("EmpresaX","123456789/1000");
        Funcionarios func1 = new Funcionario_Horista("Luiz", "123456789-10",100.0,160.5);
        Funcionarios func2 = new Funcionario_Comissionado("Zé", "987654321-00",60,50.0);
        
        empresa.admitirFuncionario(func1);
        empresa.admitirFuncionario(func2);
        
        empresa.gerarFolhaDePagamento();
    }

}
