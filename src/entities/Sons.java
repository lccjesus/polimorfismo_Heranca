package entities;

public class Sons {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5);
        Cavalo cavalo = new Cavalo("Spirit", 3);
        Preguica preguica = new Preguica("Sid", 2);

        cachorro.emitirSom();
        cachorro.correr();

        cavalo.emitirSom();
        cavalo.correr();

        preguica.emitirSom();
        preguica.subirEmArvores();
    }
}