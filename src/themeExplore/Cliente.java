package themeExplore;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Cliente extends javax.swing.JFrame {

    private Servidor servidor;

    public Cliente(Servidor servidor) {
        initComponents();
        setIconImage(getIconImage());
        btnCrearTemaNuevo.putClientProperty( "JButton.buttonType", "roundRect" );
        this.servidor = servidor; // Guardar la referencia al servidor
        
        
    }        
    

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtTema = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcionNuevo = new javax.swing.JTextArea();
        btnCrearTemaNuevo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblDesc = new javax.swing.JLabel();
        lblNuevo = new javax.swing.JLabel();
        txtNuevo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Servidor destok");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(220, 221, 223));

        jPanel3.setBackground(new java.awt.Color(243, 243, 245));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("JS");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(204, 0, 204)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Temas");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 153, 153)));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Java");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(204, 0, 204)));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("PHP");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(204, 0, 204)));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Cobol");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(204, 0, 204)));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("MySQL");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(204, 0, 204)));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Phyton");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(204, 0, 204)));

        btnMinimizar.setBackground(new java.awt.Color(243, 243, 245));
        btnMinimizar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(102, 102, 102));
        btnMinimizar.setText("▢");
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(243, 243, 245));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(102, 102, 102));
        btnCerrar.setText("⨉");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMinimizar1.setBackground(new java.awt.Color(243, 243, 245));
        btnMinimizar1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnMinimizar1.setForeground(new java.awt.Color(102, 102, 102));
        btnMinimizar1.setText("–");
        btnMinimizar1.setBorderPainted(false);
        btnMinimizar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMinimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(202, 202, 202))
        );

        jPanel1.setBackground(new java.awt.Color(220, 221, 223));

        txtTema.setBackground(new java.awt.Color(220, 221, 223));
        txtTema.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N

        txtDescripcionNuevo.setBackground(new java.awt.Color(220, 221, 223));
        txtDescripcionNuevo.setColumns(20);
        txtDescripcionNuevo.setRows(5);
        jScrollPane3.setViewportView(txtDescripcionNuevo);

        btnCrearTemaNuevo.setBackground(new java.awt.Color(220, 221, 223));
        btnCrearTemaNuevo.setForeground(new java.awt.Color(102, 102, 102));
        btnCrearTemaNuevo.setText("Crear Nuevo Tema");
        btnCrearTemaNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearTemaNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTemaNuevoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Explorar Temas");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 4, 0, new java.awt.Color(153, 153, 153)));

        btnBuscar.setBackground(new java.awt.Color(220, 221, 223));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_32px.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtDescripcion.setBackground(new java.awt.Color(220, 221, 223));
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        lblDesc.setForeground(new java.awt.Color(102, 102, 102));
        lblDesc.setText("Descripcion");

        lblNuevo.setForeground(new java.awt.Color(102, 102, 102));
        lblNuevo.setText("Nuevo tema");

        txtNuevo.setBackground(new java.awt.Color(220, 221, 223));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(txtTema)
                .addGap(6, 6, 6)
                .addComponent(btnBuscar)
                .addGap(179, 179, 179))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2)
                .addGap(237, 237, 237))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(388, 388, 388))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(txtNuevo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3)
                .addGap(209, 209, 209))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(btnCrearTemaNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(276, 276, 276))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2)
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNuevo)
                    .addComponent(lblDesc))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearTemaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 878, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            
            int width = 60;
            
            Socket socket = new Socket("172.21.16.1", 2000);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pr1 = new PrintWriter(socket.getOutputStream(), true);
            String temaConsultar = txtTema.getText();
            pr1.println(temaConsultar);
            String respuesta = in.readLine();
            
            String textoFormateado = "";
            for (int i = 0; i < respuesta.length(); i += width) {
                int index = Math.min(i + width, respuesta.length());
                String linea = respuesta.substring(i, index);
                textoFormateado += linea + "\n";
            }
            System.out.println("Respuesta del servidor: " + textoFormateado);
            txtDescripcion.setText(textoFormateado);

            in.close();

        } catch (IOException e) {
            System.out.println("");
        }

        // Leer la respuesta del servidor

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCrearTemaNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTemaNuevoActionPerformed

        //pr1.println(temaConsultar);
        try {
            Socket socket = new Socket("172.21.16.1", 2000);
            PrintWriter pr1 = new PrintWriter(socket.getOutputStream(), true);
            String nuevoTema = txtNuevo.getText();
            String descripcion = txtDescripcionNuevo.getText();
            // Envía la solicitud al servidor para agregar un nuevo tema
            pr1.println("AGREGAR_TEMA," + nuevoTema + "," + descripcion);

            // Leer la respuesta del servidor
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String respuesta = in.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
            JOptionPane.showMessageDialog(null, respuesta);

            // Resto del código...
        } catch (IOException e) {
            System.out.println("Error al conectar con el servidor: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCrearTemaNuevoActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        setExtendedState(MAXIMIZED_BOTH);
        //setExtendedState(NORMAL);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
       // servidor.stop();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new Color(243,243,245));
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(Color.red);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

    public static void main(String args[]) throws Exception {
        
        try {

            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.out.println("Look and ferr erro!");
        }

        Servidor servidor = new Servidor();
        Thread serverThread = new Thread(servidor::run);
        serverThread.start(); // Iniciar el hilo del servidor
        // Crear e iniciar el cliente en el hilo principal
        java.awt.EventQueue.invokeLater(() -> {
            new Cliente(servidor).setVisible(true);
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrearTemaNuevo;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextArea txtDescripcionNuevo;
    private javax.swing.JTextField txtNuevo;
    private javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables

}
