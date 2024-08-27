package entities;

public class Zoologico {
    private Animal[] jaulas;  // Array para armazenar os animais

    public Zoologico() {
        jaulas = new Animal[10];  // Inicializa o array com 10 posições
    }

    // Método para adicionar um animal em uma jaula específica
    public void adicionarAnimal(int jaula, Animal animal) {
        if (jaula >= 0 && jaula < jaulas.length) {
            jaulas[jaula] = animal;
        } else {
            System.out.println("Número da jaula inválido!");
        }
    }

    // Método para percorrer as jaulas e interagir com os animais
    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            Animal animal = jaulas[i];
            if (animal != null) {
                System.out.println("Na jaula " + (i + 1) + ":");
                animal.emitirSom();
                if (animal instanceof Cachorro || animal instanceof Cavalo) {
                    animal.correr();
                }
                System.out.println();
            } else {
                System.out.println("Jaula " + (i + 1) + " está vazia.");
            }
        }
    }
}
