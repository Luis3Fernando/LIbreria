/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp_library;

/**
 *
 * @author Antonio
 */
public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(85, 61, 42));
        Title.setText("Bienvenido");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(112, 79, 53));
        Text1.setText("El objetivo de este trabajo es intentar admnistrar y gestionar el estado de la biblioteca y sus prestamos de libros");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 79, 53));
        jLabel1.setText("de usuarios (Puede ver los usuarios anteriores)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/itp_library/images/libro3.png"))); // NOI18N
        add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 70, -1, 310));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(112, 79, 53));
        jLabel2.setText("GUIA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(112, 79, 53));
        jLabel3.setText("su ID y el del libro (lo mismo para la devolucion)");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(112, 79, 53));
        jLabel4.setText(". Primero podrá observar los libros que tiene");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(112, 79, 53));
        jLabel5.setText("la biblioteca (caso contrario podra agregar uno)");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(112, 79, 53));
        jLabel6.setText(". Luego tendrá que registrarse en la opción");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(112, 79, 53));
        jLabel7.setText(". Finalmente podrá realizar su pedido usando");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
