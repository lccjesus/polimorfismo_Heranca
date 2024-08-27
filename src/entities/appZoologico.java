package entities;

public class appZoologico {
    public static void main(String[] args) {
        // Criação dos animais
        Animal cachorro1 = new Cachorro("Rex", 5);
        Animal cachorro2 = new Cachorro("Bolt", 4);
        Animal cavalo1 = new Cavalo("Spirit", 3);
        Animal cavalo2 = new Cavalo("Thunder", 6);
        Animal preguica1 = new Preguica("Sid", 2);
        Animal preguica2 = new Preguica("Lazy", 1);
        Animal cachorro3 = new Cachorro("Max", 3);
        Animal cavalo3 = new Cavalo("Starlight", 7);
        Animal preguica3 = new Preguica("Slowpoke", 5);
        Animal cavalo4 = new Cavalo("Lightning", 8);

        // Criação do zoológico e adição dos animais nas jaulas
        Zoologico zoologico = new Zoologico();
        zoologico.adicionarAnimal(0, cachorro1);
        zoologico.adicionarAnimal(1, cachorro2);
        zoologico.adicionarAnimal(2, cavalo1);
        zoologico.adicionarAnimal(3, cavalo2);
        zoologico.adicionarAnimal(4, preguica1);
        zoologico.adicionarAnimal(5, preguica2);
        zoologico.adicionarAnimal(6, cachorro3);
        zoologico.adicionarAnimal(7, cavalo3);
        zoologico.adicionarAnimal(8, preguica3);
        zoologico.adicionarAnimal(9, cavalo4);

        // Percorrendo as jaulas e interagindo com os animais
        zoologico.percorrerJaulas();
    }
}
