package Exec11;

public class appEmpresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[] {
                new Vendedor("Carlos", 3000, 500),
                new Gerente("Ana", 5000),
                new Supervisor("Lucas", 4000),
                new Vendedor("Maria", 2900, 600)
        };

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}