package entities;

class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro late.");
    }

    @Override
    public void correr() {
        System.out.println("O cachorro está correndo.");
    }
}
