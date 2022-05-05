
package practicamp;

public class ConcreteCreatorCazador extends CreatorPersonaje{


    @Override
    public Personaje CreatePersonaje(){
        return new ConcreteCazador();
    }
}
