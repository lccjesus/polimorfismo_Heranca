package Exec09;

class Vendedor extends Comissao {
    private static final double ADICIONAL = 250.00;

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + ADICIONAL;
    }
}
