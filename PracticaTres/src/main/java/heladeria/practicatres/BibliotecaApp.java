/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package heladeria.practicatres;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author abb
 */
// Marlon Amed Bejarano Bolaños, 
// Raúl Brenes Muñoz,
// Fabian Gamboa Herrera,
// Ian Steve Mejías Picado 
public class BibliotecaApp {

    private ArrayList<Libro> listaLibros;
    private final String ARCHIVO = "libros.txt";

    public BibliotecaApp() {
        listaLibros = new ArrayList<>();
        cargarArchivo();
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    private void cargarArchivo() {

        try {

            File file = new File("libros.txt");

            if (!file.exists()) {
                file.createNewFile();
                return;
            }

            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);

            while (true) {

                String codigo = dis.readUTF();
                String titulo = dis.readUTF();
                String autor = dis.readUTF();
                Genero genero =
                        Genero.valueOf(dis.readUTF());
                int anio = dis.readInt();
                Estado estado =
                        Estado.valueOf(dis.readUTF());

                Libro libro = new Libro(
                        codigo, titulo, autor, genero, anio, estado
                );

                listaLibros.add(libro);
            }

        } catch (EOFException e) {
            // Fin normal del archivo
        } catch (Exception e) {
            System.out.println("Error al cargar archivo");
        }
    }


    public void guardarArchivo() {

        try {

            FileOutputStream fos = new FileOutputStream("libros.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            for (Libro l : listaLibros) {

                dos.writeUTF(l.getCodigo());
                dos.writeUTF(l.getTitulo());
                dos.writeUTF(l.getAutor());
                dos.writeUTF(l.getGenero().name());
                dos.writeInt(l.getAnio());
                dos.writeUTF(l.getEstado().name());
            }

            dos.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("Error al guardar archivo");
        }
    }
    
    public static void main(String[] args) {

        BibliotecaApp app = new BibliotecaApp();

        java.awt.EventQueue.invokeLater(() -> {
            new Menu(app).setVisible(true);
        });
    }
}

