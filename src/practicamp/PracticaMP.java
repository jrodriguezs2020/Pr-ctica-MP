
package practicamp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PracticaMP {

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Sistema sistema = new Sistema();
        /*FileInputStream fileStreamU = new FileInputStream("..\\Informacion.txt");
        ObjectInputStream objectStreamU = new ObjectInputStream(fileStreamU);
        sistema= (Sistema) objectStreamU.readObject();*/
        sistema.inicio();
    }
    
}
