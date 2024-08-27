package Exec09;

public class appComissao {
    public static void main(String[] args) {
        // Cria instâncias das comissões
        Comissao gerenteComissao = new Gerente("Carlos", 5000.00);
        Comissao supervisorComissao = new Supervisor("Ana", 4000.00);
        Comissao vendedorComissao = new Vendedor("João", 3000.00);

        // Cria instâncias dos funcionários
        Funcionario gerente = new Funcionario("Carlos", 5000.00, gerenteComissao);
        Funcionario supervisor = new Funcionario("Ana", 4000.00, supervisorComissao);
        Funcionario vendedor = new Funcionario("João", 3000.00, vendedorComissao);

        // Exibe as rendas totais e informações dos funcionários
        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);
    }
}
