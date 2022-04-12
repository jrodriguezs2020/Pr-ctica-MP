# Practica_MP
Para ejecutar la primera vez el juego hay que crear un fichero llamado ListaUsuario.txt en la misma carpeta que tienes el proyecto (pero no dentro del proyecto)
Además hay que poner en forma de comentario las siguientes tres líneas de código de la clase Sistema:
        FileInputStream fileStream = new FileInputStream("..\\ListaUsuarios.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        usuariosList= (ArrayList<Usuario>) objectStream.readObject();
        
 Una vez hecho esto ejecutas el programa y registras un usuario 
 Para las siguientes ejecuciones descomentas las tres líneas anteriormente comentadas.
