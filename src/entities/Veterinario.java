package entities;


public class Veterinario {

    // Método examinar que aceita qualquer tipo de Animal
    public void examinar(Animal animal) {
        System.out.println("Examinando o animal: " + animal.nome);
        animal.emitirSom();  // O animal emite o som correspondente ao seu tipo
    }
}
