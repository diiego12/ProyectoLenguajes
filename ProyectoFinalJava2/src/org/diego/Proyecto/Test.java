package org.diego.Proyecto;

public class Test {
    public static void main(String[] args) throws Exception{
        Musica ui = new Musica("e","e", 3, 4);
        GuardarMusica.guardar(ui);
    
    for(Musica mus: GuardarMusica.leer()){
        System.out.println(mus);
    }
    }
}
