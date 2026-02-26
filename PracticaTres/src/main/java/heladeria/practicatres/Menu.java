/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
public class Menu extends javax.swing.JFrame {
    
    private BibliotecaApp app;
    /**
     * Creates new form Menu
     */
    public Menu(BibliotecaApp app) {
        initComponents();
        this.app = app;
    }
    
    private Libro buscarPorCodigo(String codigo) {
        for (Libro l : app.getListaLibros()) {
            if (l.getCodigo().equals(codigo)) {
                return l;
            }
        }
        return null;
    }
    
    private String leerTexto(String mensaje) {

        while (true) {
            String input = javax.swing.JOptionPane.showInputDialog(this, mensaje);

            if (input == null) {
                return null; 
            }

            input = input.trim();

            if (!input.isEmpty()) {
                return input;
            }

            javax.swing.JOptionPane.showMessageDialog(this,
                    "El campo no puede estar vacío.");
        }
    }
    
    private Integer leerEntero(String mensaje) {

        while (true) {
            String input = javax.swing.JOptionPane.showInputDialog(this, mensaje);

            if (input == null) {
                return null;
            }

            try {
                return Integer.parseInt(input.trim());

            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Debe ingresar un número válido.");
            }
        }
    }
    
    private Genero leerGenero() {

        while (true) {
            String input = javax.swing.JOptionPane.showInputDialog(this,
                    "Género (NOVELA, HISTORIA, CIENCIA, INFANTIL):");

            if (input == null) {
                return null;
            }

            try {
                return Genero.valueOf(input.trim().toUpperCase());

            } catch (IllegalArgumentException e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Género inválido.");
            }
        }
    }
    
    private String leerTextoEditable(String mensaje, String valorActual) {

        String input = javax.swing.JOptionPane.showInputDialog(
                this,
                mensaje + "\nValor actual: " + valorActual + "\n(Deje vacío para mantenerlo)"
        );

        if (input == null) {
            return null; 
        }

        input = input.trim();

        if (input.isEmpty()) {
            return valorActual; // mantiene el valor
        }

        return input;
    }
    
    private Integer leerEnteroEditable(String mensaje, int valorActual) {

        while (true) {

            String input = javax.swing.JOptionPane.showInputDialog(
                    this,
                    mensaje + "\nValor actual: " + valorActual + "\n(Deje vacío para mantenerlo)"
            );

            if (input == null) {
                return null;
            }

            input = input.trim();

            if (input.isEmpty()) {
                return valorActual;
            }

            try {
                return Integer.parseInt(input);

            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Debe ingresar un número válido.");
            }
        }
    }
    
    private Genero leerGeneroEditable(Genero actual) {

        while (true) {

            String input = javax.swing.JOptionPane.showInputDialog(
                    this,
                    "Nuevo género (NOVELA, HISTORIA, CIENCIA, INFANTIL):"
                    + "\nValor actual: " + actual
                    + "\n(Deje vacío para mantenerlo)"
            );

            if (input == null) {
                return null;
            }

            input = input.trim();

            if (input.isEmpty()) {
                return actual;
            }

            try {
                return Genero.valueOf(input.toUpperCase());

            } catch (IllegalArgumentException e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Género inválido.");
            }
        }
    }
    
    private Estado leerEstado() {

        while (true) {

            String input = javax.swing.JOptionPane.showInputDialog(
                    this,
                    "Estado (DISPONIBLE, PRESTADO):"
            );

            if (input == null) {
                return null;
            }

            try {
                return Estado.valueOf(input.trim().toUpperCase());

            } catch (IllegalArgumentException e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Estado inválido.");
            }
        }
    }
    
    private Estado leerEstadoEditable(Estado actual) {

    while (true) {

        String input = javax.swing.JOptionPane.showInputDialog(
                this,
                "Nuevo estado (DISPONIBLE, PRESTADO):"
                + "\nValor actual: " + actual
                + "\n(Deje vacío para mantenerlo)"
        );

        if (input == null) {
            return null;
        }

        input = input.trim();

        if (input.isEmpty()) {
            return actual;
        }

        try {
            return Estado.valueOf(input.toUpperCase());

        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Estado inválido.");
        }
    }
}





    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar un libro nuevo");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Editar la informacion de un libro");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buscar un libro por codigo");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setBackground(new java.awt.Color(0, 0, 153));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar un libro del sistema");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setBackground(new java.awt.Color(0, 0, 153));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Mostrar todos los libros registrados");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jButton6.setBackground(new java.awt.Color(255, 0, 51));
        jButton6.setText("Salir");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = leerTexto("Código:");
        if (codigo == null) return;

        if (buscarPorCodigo(codigo) != null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El código ya existe.");
            return;
        }

        String titulo = leerTexto("Título:");
        if (titulo == null) return;

        String autor = leerTexto("Autor:");
        if (autor == null) return;

        Genero genero = leerGenero();
        if (genero == null) return;

        Integer anio = leerEntero("Año de publicación:");
        if (anio == null) return;

        Libro libro = new Libro(codigo, titulo, autor, genero, anio, Estado.DISPONIBLE);

        app.getListaLibros().add(libro);

        javax.swing.JOptionPane.showMessageDialog(this,
                "Libro registrado correctamente.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        app.guardarArchivo();
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    String codigo = leerTexto("Código del libro a editar:");
        if (codigo == null) return;

        Libro libro = buscarPorCodigo(codigo);

        if (libro == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Libro no encontrado.");
            return;
        }

        // Mostrar información actual
        javax.swing.JOptionPane.showMessageDialog(this,
                "INFORMACIÓN ACTUAL DEL LIBRO:\n\n" + libro.toString());

        // Nuevos valores
        String nuevoTitulo = leerTextoEditable("Nuevo título:", libro.getTitulo());
        if (nuevoTitulo == null) return;

        String nuevoAutor = leerTextoEditable("Nuevo autor:", libro.getAutor());
        if (nuevoAutor == null) return;

        Genero nuevoGenero = leerGeneroEditable(libro.getGenero());
        if (nuevoGenero == null) return;

        Integer nuevoAnio = leerEnteroEditable("Nuevo año:", libro.getAnio());
        if (nuevoAnio == null) return;

        Estado nuevoEstado = leerEstadoEditable(libro.getEstado());
        if (nuevoEstado == null) return;

        // Actualizar objeto
        libro.setTitulo(nuevoTitulo);
        libro.setAutor(nuevoAutor);
        libro.setGenero(nuevoGenero);
        libro.setAnio(nuevoAnio);
        libro.setEstado(nuevoEstado);

        javax.swing.JOptionPane.showMessageDialog(this,
                "Libro actualizado correctamente.");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String codigo = javax.swing.JOptionPane.showInputDialog(this, "Código:");
        Libro libro = buscarPorCodigo(codigo);

        if (libro != null) {
            javax.swing.JOptionPane.showMessageDialog(this, libro.toString());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No encontrado");
        }                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        String codigo = javax.swing.JOptionPane.showInputDialog(this, "Código:");
        Libro libro = buscarPorCodigo(codigo);

        if (libro != null) {
            app.getListaLibros().remove(libro);
            javax.swing.JOptionPane.showMessageDialog(this, "Libro eliminado");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "No encontrado");
        }        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (app.getListaLibros().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay libros registrados");
            return;
        }

        String mensaje = "";

        for (Libro l : app.getListaLibros()) {
            mensaje += l.toString() + "\n-------------------\n";
        }

        javax.swing.JOptionPane.showMessageDialog(this, mensaje);
            
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
