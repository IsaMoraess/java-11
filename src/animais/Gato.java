package animais;

// Gato -> subclasse
// Animal -> superclasse ou classe mae/pai
public class Gato extends Animal {
    public Gato(String nome){
        setNome(nome);
    }

    public void miar(){
        System.out.printf("%s latiu\n", getNome());
    }
}
