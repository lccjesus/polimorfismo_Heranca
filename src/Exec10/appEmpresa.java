package Exec10;

public class appEmpresa {
    public static void main(String[] args) {
        int totalFuncionarios = 10;
        Funcionario[] funcionarios = new Funcionario[totalFuncionarios];

        // Percentuais de distribuição de cargos
        int numGerentes = (int) (totalFuncionarios * 0.10);
        int numSupervisores = (int) (totalFuncionarios * 0.20);
        int numVendedores = totalFuncionarios - numGerentes - numSupervisores;

        // Criar funcionários
        int index = 0;
        for (int i = 0; i < numGerentes; i++) {
            funcionarios[index++] = new Gerente("Gerente " + (i + 1));
        }
        for (int i = 0; i < numSupervisores; i++) {
            funcionarios[index++] = new Supervisor("Supervisor " + (i + 1));
        }
        for (int i = 0; i < numVendedores; i++) {
            funcionarios[index++] = new Vendedor("Vendedor " + (i + 1));
        }

        // Calcular custos
        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario f : funcionarios) {
            custoTotal += f.getSalario();

            // Considerando que os Gerentes são de nível superior,
            // Supervisores são de ensino médio e Vendedores são de ensino básico
            if (f instanceof Gerente) {
                custoSuperior += f.getSalario();
            } else if (f instanceof Supervisor) {
                custoMedio += f.getSalario();
            } else if (f instanceof Vendedor) {
                custoBasico += f.getSalario();
            }
        }

        // Exibir resultados
        System.out.println("Custo Total: R$" + custoTotal);
        System.out.println("Custo com Ensino Básico: R$" + custoBasico);
        System.out.println("Custo com Ensino Médio: R$" + custoMedio);
        System.out.println("Custo com Nível Superior: R$" + custoSuperior);
    }
}