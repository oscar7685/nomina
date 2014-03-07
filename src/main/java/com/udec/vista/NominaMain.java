/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.vista;

import com.udec.modelo.Periodo;
import java.awt.Container;
import java.awt.event.MouseListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Oscar
 */
public class NominaMain extends javax.swing.JFrame {

    /**
     * Creates new form NominaMain
     *
     * @param p
     */
    public NominaMain(Periodo p) {
        periodoActual = p;
        initComponents();
        periodoLabel.setText("PERIODO: " + p.getNombre());
    }

    public NominaMain() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        periodoLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 609, Short.MAX_VALUE)
        );

        jLabel1.setText("EMPRESA: CAJA DE PREVISION SOCIAL U. DE C.     ");

        periodoLabel.setText("  PERIODO: SEGUNDA QUINCENA DEL MES DE AGOSTO DE 2012");

        jMenu1.setText("Archivo");

        jMenuItem3.setText("Empleados");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem6.setText("Conceptos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenu4.setText("Tablas Generales");

        jMenuItem5.setText("Grupo de Conceptos");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuItem1.setText("Bancos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Cargos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenu1.add(jMenu4);

        jMenuItem7.setText("Parametros Generales");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Movimientos");

        jMenuItem4.setText("Novedad medica");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem8.setText("Novedad por Concepto");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem10.setText("Calcular nomina");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reportes");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(periodoLabel)
                .addContainerGap(641, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(periodoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        Cargos c = new Cargos();
        c.setFrameIcon(null);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) c.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(c);
        c.setBounds(0, 0, this.jDesktopPane1.getWidth(), this.jDesktopPane1.getHeight());
        c.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        Bancos cb = new Bancos();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) cb.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(cb);
        cb.setBounds(0, 0, this.jDesktopPane1.getWidth(), this.jDesktopPane1.getHeight());
        cb.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        Empleados2 cb = new Empleados2();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) cb.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(cb);
        cb.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
        cb.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        NovedadMedica nm = new NovedadMedica(periodoActual);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) nm.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(nm);
        nm.setBounds(0, 0, this.jDesktopPane1.getWidth(), this.jDesktopPane1.getHeight());
        nm.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        GruposConcepto nm = new GruposConcepto();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) nm.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(nm);
        nm.setBounds(0, 0, this.jDesktopPane1.getWidth(), this.jDesktopPane1.getHeight());
        nm.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        Conceptos nm = new Conceptos();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) nm.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(nm);
        nm.setBounds(0, 0, this.jDesktopPane1.getWidth(), this.jDesktopPane1.getHeight());
        nm.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        ParametrosGenerales nm = new ParametrosGenerales();
        BasicInternalFrameUI ui = (BasicInternalFrameUI) nm.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(nm);
        nm.setBounds(0, 0, this.jDesktopPane1.getWidth(), this.jDesktopPane1.getHeight());
        nm.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        NovedadConcepto nm = new NovedadConcepto(periodoActual);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) nm.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(nm);
        nm.setBounds(0, 0, this.jDesktopPane1.getWidth(), this.jDesktopPane1.getHeight());
        nm.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        this.jDesktopPane1.removeAll();
        this.jDesktopPane1.repaint();
        if (periodoActual.getDiastrabajadosList().isEmpty()) {
            
        }
        DiasTrabajados nm = new DiasTrabajados(periodoActual);
        BasicInternalFrameUI ui = (BasicInternalFrameUI) nm.getUI();
        ui.setNorthPane(null);
        this.jDesktopPane1.add(nm);
        nm.setBounds(0, 0, this.jDesktopPane1.getWidth(), this.jDesktopPane1.getHeight());
        nm.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NominaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NominaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NominaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NominaMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NominaMain().setVisible(true);
            }
        });
    }

    private Periodo periodoActual;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JLabel periodoLabel;
    // End of variables declaration//GEN-END:variables
}
