package Exec08;

class Supervisor extends Comissao {
    private static final double ADICIONAL = 600.00;

    public Supervisor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + ADICIONAL;
    }
}