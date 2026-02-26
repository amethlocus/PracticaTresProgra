/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package heladeria.practicatres;


/**
 *
 * @author abb
 */
// Marlon Amed Bejarano Bolaños, 
// Raúl Brenes Muñoz,
// Fabian Gamboa Herrera,
// Ian Steve Mejías Picado 
public class Libro {

    private String codigo;
    private String titulo;
    private String autor;
    private Genero genero;
    private int anio;
    private Estado estado;

    public Libro(String codigo, String titulo, String autor,
                 Genero genero, int anio, Estado estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio = anio;
        this.estado = estado;
    }

    public String getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public Genero getGenero() { return genero; }
    public int getAnio() { return anio; }
    public Estado getEstado() { return estado; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setGenero(Genero genero) { this.genero = genero; }
    public void setAnio(int anio) { this.anio = anio; }
    public void setEstado(Estado estado) { this.estado = estado; }

    // este metodo escribe el string formateado de los valores del libro
    public String toFileString() {
        return codigo + ";" + titulo + ";" + autor + ";" +
               genero + ";" + anio + ";" + estado;
    }
    
    // convierte del txt al objeto Libro
    public static Libro fromFileString(String linea) {
        String[] d = linea.split(";");
        return new Libro(
                d[0],
                d[1],
                d[2],
                Genero.valueOf(d[3]),
                Integer.parseInt(d[4]),
                Estado.valueOf(d[5])
        );
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
               "\nTítulo: " + titulo +
               "\nAutor: " + autor +
               "\nGénero: " + genero +
               "\nAño: " + anio +
               "\nEstado: " + estado;
    }
}
