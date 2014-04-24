package org.diego.Proyecto;

import java.io.*;
import java.io.File;
import java.util.ArrayList;

public class GuardarMusica {
    
     public synchronized static ArrayList<Musica> leer() throws Exception{
    File file = new  File ("musica.txt");
    
    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis);
    ArrayList<Musica> mus = (ArrayList<Musica>) ois.readObject();
    ois.close();
    return mus;
}
    
    public static void guardar(Musica mus) throws Exception{
        ArrayList music = new ArrayList<Musica>();
        
        File file = new File("musica.txt");
        if (file.exists()){
            music = leer();
        }
        
        FileOutputStream  fis = new FileOutputStream(file);
        ObjectOutputStream ois = new ObjectOutputStream(fis);
        music.add(mus);
        ois.writeObject(music);
        ois.close();
        System.out.println("Guardado");
    }
}
