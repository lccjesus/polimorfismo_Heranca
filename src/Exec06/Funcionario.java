package Exec06;

public class Funcionario {
    protected String nome;
    protected String codigoFuncional;
    protected double rendaBasica = 1000.00;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public double calcularRendaTotal() {
        return rendaBasica;  // Para o funcionário sem estudos, a renda é a básica
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional +
                ", Renda Total: R$ " + String.format("%.2f", calcularRendaTotal());
    }
}