package Exec06;

public class appInstituto {
    public static void main(String[] args) {
        // Funcionário sem estudos
        Funcionario func1 = new Funcionario("Carlos Silva", "001");

        // Funcionário com Ensino Básico
        FuncionarioEnsinoBasico func2 = new FuncionarioEnsinoBasico("Ana Pereira", "002", "Escola Fundamental ABC");

        // Funcionário com Ensino Médio
        FuncionarioEnsinoMedio func3 = new FuncionarioEnsinoMedio("Marcos Lima", "003", "Escola Fundamental ABC", "Colégio XYZ");

        // Funcionário com Graduação
        FuncionarioGraduacao func4 = new FuncionarioGraduacao("Julia Alves", "004", "Escola Fundamental ABC", "Colégio XYZ", "Universidade Federal");

        // Exibindo informações dos funcionários com suas respectivas rendas
        System.out.println(func1.toString());
        System.out.println(func2.toString());
        System.out.println(func3.toString());
        System.out.println(func4.toString());
    }
}
