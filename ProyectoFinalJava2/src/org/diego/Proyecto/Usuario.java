package org.diego.Proyecto;

import java.io.Serializable;

public class Usuario implements Serializable {
private String nombre;
private int edad;
private String email;

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return "Usuario{" + "Nombre:" + nombre + ", Edad:" + edad + ", Email:" + email + '}';
    }
 public Usuario(String nombre, int edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

}
