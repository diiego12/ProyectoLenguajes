package org.diego.Proyecto;

public class Test {
    public static void main(String[] args) throws Exception{
        Usuario u = new Usuario("pdod",78,"sdj@klck.com");
        GuardarUsuario.guardar(u);
    
    for(Usuario usu: GuardarUsuario.leer()){
        System.out.println(usu);
    }
    }
}
