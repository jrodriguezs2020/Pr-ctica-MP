
package practicamp;

import java.util.ArrayList;
import java.util.TreeSet;


public class GestionMenu {

public ArrayList<String> generarRanking(TreeSet<Usuario> usuariosList){
    ArrayList<String> ranking = new ArrayList();
   for ( Usuario i:usuariosList){
       ranking.add(i.getNick());
   } 
   return ranking;
}
}
