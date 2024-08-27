package entities;

public class SomVeterinario {
    public static void main(String[] args) {
        // Criação dos animais
        Animal cachorro = new Cachorro("Rex", 5);
        Animal cavalo = new Cavalo("Spirit", 3);
        Animal preguica = new Preguica("Sid", 2);

        // Criação do veterinário
        Veterinario veterinario = new Veterinario();

        // Examinando os animais
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
