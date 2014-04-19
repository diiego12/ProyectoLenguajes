package org.diego.Proyecto;

import java.io.*;
import java.io.File;
import java.util.ArrayList;

public class GuardarUsuario {
    
    public synchronized static ArrayList<Usuario> leer() throws Exception{
    File file = new  File ("usuario.txt");
    
    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis);
    ArrayList<Usuario> u = (ArrayList<Usuario>) ois.readObject();
    ois.close();
    return u;
}
    
    public static void guardar(Usuario u) throws Exception{
        ArrayList usuarios = new ArrayList<Usuario>();
        
        File file = new File("usuario.txt");
        if (file.exists()){
            usuarios = leer();
        }
        
        FileOutputStream  fis = new FileOutputStream(file);
        ObjectOutputStream ois = new ObjectOutputStream(fis);
        usuarios.add(u);
        ois.writeObject(usuarios);
        ois.close();
        System.out.println("Guardado");
    }
    
}
