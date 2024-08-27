package Exec07;

public class Empresa {
    public static void main(String[] args) {
        // Define os salários médios por nível de escolaridade
        double salarioBasico = 2000.00;
        double salarioMedio = 3000.00;
        double salarioSuperior = 5000.00;

        // Número de funcionários
        int numFuncionarios = 10;
        int numBasico = (int) (numFuncionarios * 0.40);
        int numMedio = (int) (numFuncionarios * 0.40);
        int numSuperior = (int) (numFuncionarios * 0.20);

        // Array para armazenar os funcionários
        Funcionario[] funcionarios = new Funcionario[numFuncionarios];

        // Preenche o array com funcionários de diferentes níveis de escolaridade
        int index = 0;
        for (int i = 0; i < numBasico; i++) {
            funcionarios[index++] = new Funcionario("Funcionário Básico " + (i + 1), "Ensino Básico", salarioBasico);
        }
        for (int i = 0; i < numMedio; i++) {
            funcionarios[index++] = new Funcionario("Funcionário Médio " + (i + 1), "Ensino Médio", salarioMedio);
        }
        for (int i = 0; i < numSuperior; i++) {
            funcionarios[index++] = new Funcionario("Funcionário Superior " + (i + 1), "Nível Superior", salarioSuperior);
        }

        // Calcula os custos totais
        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

        for (Funcionario funcionario : funcionarios) {
            custoTotal += funcionario.getSalario();
            switch (funcionario.getNivelEscolaridade()) {
                case "Ensino Básico":
                    custoBasico += funcionario.getSalario();
                    break;
                case "Ensino Médio":
                    custoMedio += funcionario.getSalario();
                    break;
                case "Nível Superior":
                    custoSuperior += funcionario.getSalario();
                    break;
            }
        }

        // Exibe os resultados
        System.out.println("Custos totais da empresa:");
        System.out.println("Custo total: R$ " + custoTotal);
        System.out.println("Custo com Ensino Básico: R$ " + custoBasico);
        System.out.println("Custo com Ensino Médio: R$ " + custoMedio);
        System.out.println("Custo com Nível Superior: R$ " + custoSuperior);

        // Exibe a lista de funcionários
        System.out.println("\nLista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
