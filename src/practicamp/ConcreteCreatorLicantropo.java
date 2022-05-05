
package practicamp;


public class ConcreteCreatorLicantropo extends CreatorPersonaje{
    
       
     @Override
    public Personaje CreatePersonaje(){
        return new ConcreteLicantropo();
    }
    
   
}
