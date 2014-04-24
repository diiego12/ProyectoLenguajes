package org.diego.Proyecto;

import java.io.Serializable;

public class Musica implements Serializable {
    private String nombre_banda;
    private String pais;
    private int año_form;
    private int num_integrantes;

    public Musica(String nombre_banda, String pais, int año_form, int num_integrantes) {
        this.nombre_banda = nombre_banda;
        this.pais = pais;
        this.año_form = año_form;
        this.num_integrantes = num_integrantes;
    }

    public String getNombre_banda() {
        return nombre_banda;
    }

    public void setNombre_banda(String nombre_banda) {
        this.nombre_banda = nombre_banda;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAño_form() {
        return año_form;
    }

    public void setAño_form(int año_form) {
        this.año_form = año_form;
    }

    public int getNum_integrantes() {
        return num_integrantes;
    }

   public String toString(){
        return "Nombre de la Banda: " + nombre_banda+ "País: " + pais + ", Año de formación: " + año_form + ", Numero de Integrantes: " + num_integrantes ;
    }
    
    public void setNum_integrantes(int num_integrantes) {
        this.num_integrantes = num_integrantes;
    }
            
    
}
