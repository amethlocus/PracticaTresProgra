/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heladeria.practicatres;

/**
 *
 * @author Fabi
 */
public class Libro {

    private String codLibro;
    private String titulo;
    private String Autor;
    private Genero GenLibro;
    private int anoPublic;
    private boolean Estado;

    public Libro() {
        this.codLibro = "";
        this.titulo = "";
        this.Autor = "";
        this.GenLibro = GenLibro;
        this.anoPublic = 0;
        this.Estado = false;
    }

    public String getCodLibro() {
        return codLibro;
    }

    public void setCodLibro(String codLibro) {
        this.codLibro = codLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public Genero getGenLibro() {
        return GenLibro;
    }

    public void setGenLibro(Genero GenLibro) {
        this.GenLibro = GenLibro;
    }

    public int getAnoPublic() {
        return anoPublic;
    }

    public void setAnoPublic(int anoPublic) {
        this.anoPublic = anoPublic;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

}
