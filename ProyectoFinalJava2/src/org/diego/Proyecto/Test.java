package org.diego.Proyecto;

public class Test {
    public static void main(String[] args) throws Exception{
        Usuario u = new Usuario("armando",8,"nose@gmail.com");
        GuardarUsuario.guardar(u);
    
    for(Usuario usu: GuardarUsuario.leer()){
        System.out.println(usu);
    }
    }
}
