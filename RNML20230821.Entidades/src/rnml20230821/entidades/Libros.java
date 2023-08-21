/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rnml20230821.entidades;

/**
 *
 * @author MINEDUCYT
 */
public class Libros {
     private int id;
    private String titulo;
    private String autor;
    private String año_publicacion;

    public Libros() {
    }

    public Libros(int id, String titulo, String autor, String año_publicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.año_publicacion = año_publicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(String año_publicacion) {
        this.año_publicacion = año_publicacion;
    }
   
    
    

}
