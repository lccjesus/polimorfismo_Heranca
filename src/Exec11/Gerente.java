package Exec11;

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getComissao() {
        return 0; // Gerentes não têm comissão
    }
}
