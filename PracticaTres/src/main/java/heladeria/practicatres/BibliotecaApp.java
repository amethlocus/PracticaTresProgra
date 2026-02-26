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
            File file = new File(ARCHIVO);

            if (!file.exists()) {
                file.createNewFile();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;

            while ((linea = br.readLine()) != null) {
                listaLibros.add(Libro.fromFileString(linea));
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error al cargar archivo");
        }
    }

    public void guardarArchivo() {

        try {
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter(ARCHIVO));

            for (Libro l : listaLibros) {
                bw.write(l.toFileString());
                bw.newLine();
            }

            bw.close();

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

