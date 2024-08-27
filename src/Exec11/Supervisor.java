package Exec11;

class Supervisor extends Funcionario {
    public Supervisor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getComissao() {
        return 0; // Supervisores não têm comissão
    }
}