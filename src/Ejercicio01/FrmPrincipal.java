
package Ejercicio01;

import java.util.ArrayList;
import javax.swing.JOptionPane; //Manejo de cuadro de dialogo
import javax.swing.table.DefaultTableModel; //Manejo de tabla

public class FrmPrincipal extends javax.swing.JFrame {

    DefaultTableModel modelo;
    MantenimientoMedico medicos;
    
    public FrmPrincipal() {
        initComponents();
        
        String [] columnas = {"Nombre", "Especialidad", "Edad", "Hospital"};
        modelo = new DefaultTableModel(columnas,0);
        
        tb_Informacion.setModel(modelo);
        
        medicos = new MantenimientoMedico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_HospitalAsignado = new javax.swing.JLabel();
        lbl_Especialidad = new javax.swing.JLabel();
        lbl_Edad = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_HospitalAsignado = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        cmb_Especialidad = new javax.swing.JComboBox<>();
        btn_Salir = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Informacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mentenimiento de Medico");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel1.setText("Mantenimiento de Médicos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 20, 203, 23);

        lbl_Nombre.setText("Nombre:");
        getContentPane().add(lbl_Nombre);
        lbl_Nombre.setBounds(40, 80, 100, 16);

        lbl_HospitalAsignado.setText("Hospital Asignado:");
        getContentPane().add(lbl_HospitalAsignado);
        lbl_HospitalAsignado.setBounds(40, 200, 120, 16);

        lbl_Especialidad.setText("Especialidad:");
        getContentPane().add(lbl_Especialidad);
        lbl_Especialidad.setBounds(40, 120, 100, 16);

        lbl_Edad.setText("Edad:");
        getContentPane().add(lbl_Edad);
        lbl_Edad.setBounds(40, 160, 100, 16);
        getContentPane().add(txt_Nombre);
        txt_Nombre.setBounds(160, 80, 181, 22);
        getContentPane().add(txt_HospitalAsignado);
        txt_HospitalAsignado.setBounds(160, 200, 181, 22);
        getContentPane().add(txt_Edad);
        txt_Edad.setBounds(160, 160, 100, 22);

        cmb_Especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         <<<SELECCIONA>>>", "Pediatria", "Urologia", "Nefrologia", "Dermatologia", "Otorrinolaringología", " ", " " }));
        getContentPane().add(cmb_Especialidad);
        cmb_Especialidad.setBounds(160, 120, 190, 22);

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir);
        btn_Salir.setBounds(340, 250, 110, 40);

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Limpiar);
        btn_Limpiar.setBounds(40, 250, 100, 40);

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Agregar);
        btn_Agregar.setBounds(180, 250, 110, 40);

        tb_Informacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_Informacion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 320, 570, 290);

        setSize(new java.awt.Dimension(674, 648));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        
        txt_Nombre.setText("");
        txt_Edad.setText("");
        txt_HospitalAsignado.setText("");
        
        cmb_Especialidad.setSelectedIndex(0);
        
        
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
                                               //(Lugar donde aparecera el cuadro de dialogo,Mensaje o pregunta,Titulo,opciones, icono)
        int rpta = JOptionPane.showOptionDialog(this,"¿Estas seguro de salir?","Mensaje de Confirmacion",
                                                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null ,null ,null );
        
        if(rpta==0) System.exit(0); //Si la respuesta es 0, quiere decir que marco la opcion NO
    }//GEN-LAST:event_btn_SalirActionPerformed
 
    private void actualizarTabla(){
        
        modelo.setRowCount(0);
        ArrayList<Medico> lista = medicos.obtenerMedico();
        
        //Esto es foreach en java
        for (Medico medico1 : lista) {
            
            Object[] datoFila ={medico1.getNombre(), 
                                medico1.getEspecialidad(), 
                                medico1.getEdad(),
                                medico1.getHospitalAsignado()};
            
            modelo.addRow(datoFila);
        }     
    }
    
    
    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        
        Medico objetoMedico = new Medico(txt_Nombre.getText(),
                                         cmb_Especialidad.getSelectedItem().toString(),
                                         Integer.parseInt(txt_Edad.getText()),
                                         txt_HospitalAsignado.getText());
        
        medicos.aregarMedico(objetoMedico);
        
        actualizarTabla();
    }//GEN-LAST:event_btn_AgregarActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JComboBox<String> cmb_Especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Edad;
    private javax.swing.JLabel lbl_Especialidad;
    private javax.swing.JLabel lbl_HospitalAsignado;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JTable tb_Informacion;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_HospitalAsignado;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
