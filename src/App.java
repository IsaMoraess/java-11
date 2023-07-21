import animais.Cachorro;
import animais.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Pandora");
        cachorro.comer();   
        cachorro.latir();

        Gato gato = new Gato("João Victor");
        gato.miar();
    }
}
