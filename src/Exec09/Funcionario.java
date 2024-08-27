package Exec09;

class Funcionario {
    private String nome;
    private double salarioBase;
    private Comissao comissao;

    public Funcionario(String nome, double salarioBase, Comissao comissao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        if (comissao != null) {
            return salarioBase + comissao.calcularSalarioTotal() - comissao.getSalarioBase();
        } else {
            return salarioBase;
        }
    }

    @Override
    public String toString() {
        String comissaoInfo = (comissao != null) ? comissao.toString() : "Sem Comissão";
        return "Nome: " + nome + ", Salário Base: R$ " + salarioBase + ", Renda Total: R$ " + calcularRendaTotal() + "\nComissão: " + comissaoInfo;
    }
}
