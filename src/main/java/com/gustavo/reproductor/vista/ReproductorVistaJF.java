
package com.gustavo.reproductor.vista;

public class ReproductorVistaJF extends javax.swing.JFrame {

    /**
     * Creates new form ReproductorVistaJF
     */
    public ReproductorVistaJF() {
        initComponents();
        configurarVentana();
    }
    
    private void configurarVentana() {
    setTitle("Reproductor Multimedia");
    setSize(500, 300);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    setResizable(false);
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jpPrincipal = new javax.swing.JPanel();
        jpBotones = new javax.swing.JPanel();
        btnReproducir = new javax.swing.JButton();
        btnDetener = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBotones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnReproducir.setText("Reproducir");
        btnReproducir.setPreferredSize(new java.awt.Dimension(110, 35));
        jpBotones.add(btnReproducir);

        btnDetener.setText("Detener");
        btnDetener.setPreferredSize(new java.awt.Dimension(110, 35));
        jpBotones.add(btnDetener);

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setPreferredSize(new java.awt.Dimension(110, 35));
        jpBotones.add(btnSeleccionar);

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                .addContainerGap(231, Short.MAX_VALUE)
                .addComponent(jpBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JButton btnReproducir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jpBotones;
    private javax.swing.JPanel jpPrincipal;
    // End of variables declaration//GEN-END:variables
}
