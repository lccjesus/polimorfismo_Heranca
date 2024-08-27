package entities;


class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça emite um som.");
    }

    // Método específico da Preguiça
    public void subirEmArvores() {
        System.out.println("A preguiça está subindo em árvores.");
    }

    // Sobrescrita do método correr para a Preguiça
    @Override
    public void correr() {
        System.out.println("A preguiça não corre, ela se move lentamente.");
    }
}
