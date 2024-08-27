package entities;

class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

    public void correr() {
        System.out.println("O animal está correndo.");
    }
}