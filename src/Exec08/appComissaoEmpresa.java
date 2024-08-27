package Exec08;

public class appComissaoEmpresa {
    public static void main(String[] args) {
        // Cria instâncias dos funcionários com diferentes comissões
        Comissao gerente = new Gerente("Carlos", 5000.00);
        Comissao supervisor = new Supervisor("Ana", 4000.00);
        Comissao vendedor = new Vendedor("João", 3000.00);

        // Exibe os salários totais dos funcionários
        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);
    }
}
