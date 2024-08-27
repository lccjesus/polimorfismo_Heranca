package entities;

class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha.");
    }

    @Override
    public void correr() {
        System.out.println("O cavalo está correndo.");
    }
}
