package Exec09;

class Gerente extends Comissao {
    private static final double ADICIONAL = 1500.00;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + ADICIONAL;
    }
}
