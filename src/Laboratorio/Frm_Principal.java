
package Laboratorio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Frm_Principal extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    MantenimientoAlumno alumnos;

    public Frm_Principal() {
        initComponents();
        
        String [] columnas = {"Nombre", "T1", "T2", "T3", "EF", "Promedio", "Situacion Academica"};
        modelo = new DefaultTableModel(columnas,0);
       
        tb_Informacion.setModel(modelo);
        
        alumnos = new MantenimientoAlumno();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        lbl_NotaT1 = new javax.swing.JLabel();
        lbl_NotaT2 = new javax.swing.JLabel();
        lbl_NotaT3 = new javax.swing.JLabel();
        lbl_NotaEF = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Informacion = new javax.swing.JTable();
        btn_Salir = new javax.swing.JButton();
        txt_NotaEF = new javax.swing.JTextField();
        txt_NotaT1 = new javax.swing.JTextField();
        txt_NotaT2 = new javax.swing.JTextField();
        txt_NotaT3 = new javax.swing.JTextField();
        btn_Limpiar = new javax.swing.JButton();
        btn_Calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculo de notas");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel1.setText("CALCULO DE NOTAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 20, 150, 23);

        lbl_Nombre.setText("Nombre:");
        getContentPane().add(lbl_Nombre);
        lbl_Nombre.setBounds(59, 73, 60, 16);

        lbl_NotaT1.setText("Nota T1:");
        getContentPane().add(lbl_NotaT1);
        lbl_NotaT1.setBounds(62, 130, 60, 16);

        lbl_NotaT2.setText("Nota T2:");
        getContentPane().add(lbl_NotaT2);
        lbl_NotaT2.setBounds(62, 186, 60, 16);

        lbl_NotaT3.setText("Nota T3:");
        getContentPane().add(lbl_NotaT3);
        lbl_NotaT3.setBounds(62, 236, 60, 16);

        lbl_NotaEF.setText("Nota EF:");
        getContentPane().add(lbl_NotaEF);
        lbl_NotaEF.setBounds(62, 292, 60, 16);
        getContentPane().add(txt_Nombre);
        txt_Nombre.setBounds(124, 70, 192, 22);

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
        jScrollPane1.setBounds(382, 60, 540, 500);

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Salir);
        btn_Salir.setBounds(60, 500, 140, 50);
        getContentPane().add(txt_NotaEF);
        txt_NotaEF.setBounds(130, 290, 140, 22);
        getContentPane().add(txt_NotaT1);
        txt_NotaT1.setBounds(130, 130, 140, 22);
        getContentPane().add(txt_NotaT2);
        txt_NotaT2.setBounds(130, 180, 140, 22);
        getContentPane().add(txt_NotaT3);
        txt_NotaT3.setBounds(130, 230, 140, 22);

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Limpiar);
        btn_Limpiar.setBounds(60, 340, 140, 50);

        btn_Calcular.setText("Calcular");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Calcular);
        btn_Calcular.setBounds(60, 420, 140, 50);

        setSize(new java.awt.Dimension(966, 620));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        
        txt_Nombre.setText("");
        txt_NotaT1.setText("");
        txt_NotaT2.setText("");
        txt_NotaT3.setText("");
        txt_NotaEF.setText("");

    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        
        int rpta = JOptionPane.showOptionDialog(this,"¿Estas seguro de salir?","Mensaje de Confirmacion",
                                                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null ,null ,null );
        
        if(rpta==0) System.exit(0);
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void actualizarTabla(){
        
        modelo.setRowCount(0);
        
        ArrayList<Alumno> lista = alumnos.ObtenerAlumno();
        
        for (Alumno alumno1 : lista) {
            
            Object [] datofila = {alumno1.getNombre(),
                                  alumno1.getT1(),
                                  alumno1.getT2(),
                                  alumno1.getT3(),
                                  alumno1.getEF(),
                                  alumno1.getPromedio(),
                                  alumno1.getSituacionAcademica()};
            modelo.addRow(datofila);
        }
        
    }
    
    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        
        Alumno objetoAlumno = new Alumno(txt_Nombre.getText(),
                                         Double.parseDouble(txt_NotaT1.getText()),
                                         Double.parseDouble(txt_NotaT2.getText()),
                                         Double.parseDouble(txt_NotaT3.getText()),
                                         Double.parseDouble(txt_NotaEF.getText()));
        
        objetoAlumno.CalcularPromedio();
        objetoAlumno.SituacionAcademica();
        
        alumnos.AgregarAlumno(objetoAlumno);
        
        actualizarTabla();
        
        
        
    }//GEN-LAST:event_btn_CalcularActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_NotaEF;
    private javax.swing.JLabel lbl_NotaT1;
    private javax.swing.JLabel lbl_NotaT2;
    private javax.swing.JLabel lbl_NotaT3;
    private javax.swing.JTable tb_Informacion;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_NotaEF;
    private javax.swing.JTextField txt_NotaT1;
    private javax.swing.JTextField txt_NotaT2;
    private javax.swing.JTextField txt_NotaT3;
    // End of variables declaration//GEN-END:variables
}
