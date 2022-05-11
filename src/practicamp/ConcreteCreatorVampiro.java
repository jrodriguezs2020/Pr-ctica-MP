package practicamp;


public class ConcreteCreatorVampiro extends CreatorPersonaje{

    @Override
    public Personaje CreatePersonaje(){
        return new ConcreteVampiro();
    } 
}
