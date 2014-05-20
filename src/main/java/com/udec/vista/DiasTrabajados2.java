/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.vista;

import com.udec.controlador.ConceptoJpaController;
import com.udec.controlador.DiastrabajadosJpaController;
import com.udec.controlador.EmpleadoJpaController;
import com.udec.controlador.NominaJpaController;
import com.udec.controlador.NovedadxconceptoJpaController;
import com.udec.controlador.ParametrosGeneralesJpaController;
import com.udec.controlador.PeriodoJpaController;
import com.udec.controlador.exceptions.NonexistentEntityException;
import com.udec.modelo.Diastrabajados;
import com.udec.modelo.Empleado;
import com.udec.modelo.Nomina;
import com.udec.modelo.Novedadxconcepto;
import com.udec.modelo.Periodo;
import java.awt.Component;
import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.RollbackException;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author Ususario
 */
public class DiasTrabajados2 extends JInternalFrame {

    private Periodo p;

    public DiasTrabajados2(Periodo pe) {
        this.p = pe;
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("com.udec_nomina_jar_1.0-SNAPSHOTPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT d FROM Diastrabajados d where d.periodoIdperiodo.idperiodo="+p.getIdperiodo());
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        empleadoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Empleado e");
        empleadoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : empleadoQuery.getResultList();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        empleadoCodigoLabel = new javax.swing.JLabel();
        diasLabel = new javax.swing.JLabel();
        diasIncTotalLabel = new javax.swing.JLabel();
        diasIncDosterciosLabel = new javax.swing.JLabel();
        diasIncCincuentaLabel = new javax.swing.JLabel();
        diasField = new javax.swing.JTextField();
        diasIncTotalField = new javax.swing.JTextField();
        diasIncDosterciosField = new javax.swing.JTextField();
        diasIncCincuentaField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        FormListener formListener = new FormListener();

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empleadoCodigo.nombre}"));
        columnBinding.setColumnName("Empleado");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dias}"));
        columnBinding.setColumnName("Dias trabajados");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${diasIncTotal}"));
        columnBinding.setColumnName("Dias Incapacidad 100%");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${diasIncDostercios}"));
        columnBinding.setColumnName("Dias Incapacidad 66%");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${diasIncCincuenta}"));
        columnBinding.setColumnName("Dias Incapacidad 50%");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);

        empleadoCodigoLabel.setText("Empleado:");

        diasLabel.setText("Dias trabajados:");

        diasIncTotalLabel.setText("Dias Incapacidad 100%:");

        diasIncDosterciosLabel.setText("Dias Incapacidad 66%:");

        diasIncCincuentaLabel.setText("Dias Incapacidad 50%:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dias}"), diasField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), diasField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.diasIncTotal}"), diasIncTotalField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), diasIncTotalField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.diasIncDostercios}"), diasIncDosterciosField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), diasIncDosterciosField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.diasIncCincuenta}"), diasIncCincuentaField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), diasIncCincuentaField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        saveButton.setText("Guardar cambios");
        saveButton.addActionListener(formListener);

        refreshButton.setText("Actualizar");
        refreshButton.addActionListener(formListener);

        newButton.setText("Recalcular empleados");
        newButton.addActionListener(formListener);

        jButton1.setText("Liquidar");
        jButton1.addActionListener(formListener);

        jComboBox1.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof Empleado) {
                    Empleado mec = (Empleado)value;
                    setText(mec.getNombre());
                }
                return this;
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, empleadoList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.empleadoCodigo}"), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleadoCodigoLabel)
                                    .addComponent(diasLabel)
                                    .addComponent(diasIncTotalLabel)
                                    .addComponent(diasIncDosterciosLabel)
                                    .addComponent(diasIncCincuentaLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diasField, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                                    .addComponent(diasIncTotalField, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                                    .addComponent(diasIncDosterciosField, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                                    .addComponent(diasIncCincuentaField, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {refreshButton, saveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleadoCodigoLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diasLabel)
                    .addComponent(diasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diasIncTotalLabel)
                    .addComponent(diasIncTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diasIncDosterciosLabel)
                    .addComponent(diasIncDosterciosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diasIncCincuentaLabel)
                    .addComponent(diasIncCincuentaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(refreshButton)
                    .addComponent(newButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                DiasTrabajados2.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                DiasTrabajados2.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                DiasTrabajados2.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                DiasTrabajados2.this.jButton1ActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<com.udec.modelo.Diastrabajados> merged = new ArrayList<com.udec.modelo.Diastrabajados>(list.size());
            for (com.udec.modelo.Diastrabajados d : list) {
                merged.add(entityManager.merge(d));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        DiastrabajadosJpaController dtC = new DiastrabajadosJpaController();
        PeriodoJpaController pC = new PeriodoJpaController();
        EmpleadoJpaController eC = new EmpleadoJpaController();
        List<Empleado> emplActivos = eC.findByList("estado", "ACTIVO");
        List<Diastrabajados> diasTrab = new ArrayList<Diastrabajados>();
        List<Diastrabajados> diasTViejos = this.p.getDiastrabajadosList();
        for (Diastrabajados diastrabajados : diasTViejos) {
            try {
                dtC.destroy(diastrabajados.getIddiastrabajados());
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(DiasTrabajados2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        for (Empleado empleado : emplActivos) {
            Diastrabajados dt = new Diastrabajados();
            dt.setEmpleadoCodigo(empleado);
            dt.setDias(15);
            dt.setDiasIncCincuenta(0);
            dt.setDiasIncDostercios(0);
            dt.setDiasIncTotal(0);
            dt.setPeriodoIdperiodo(p);
            dtC.create(dt);
            diasTrab.add(dt);
        }
        p.setDiastrabajadosList(diasTrab);
        try {
            pC.edit(p);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(NominaMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(NominaMain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_newButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NominaJpaController nC = new NominaJpaController();
        EmpleadoJpaController eC = new EmpleadoJpaController();
        ConceptoJpaController cC = new ConceptoJpaController();
        NovedadxconceptoJpaController ncC = new NovedadxconceptoJpaController();
        ParametrosGeneralesJpaController pgC = new ParametrosGeneralesJpaController();
        DiastrabajadosJpaController dtC = new DiastrabajadosJpaController();
        List<Nomina> nominas = nC.findByList("periodoIdperiodo", this.p);
        List<Empleado> empleadosActivos = eC.findByList("estado", "ACTIVO");
        for (Nomina nomina : nominas) {
            try {
                nC.destroy(nomina.getIdnomina());
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(DiasTrabajados2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        com.udec.modelo.ParametrosGenerales pg = pgC.findParametrosGenerales(1);

        for (Empleado empleado : empleadosActivos) {
            Nomina aux = new Nomina();
            aux.setEmpleadoCodigo(empleado); //empleado
            aux.setConceptoIdconcepto(cC.findConcepto(1)); //sueldo
            aux.setPeriodoIdperiodo(p);
            Diastrabajados dt = dtC.findBySingle2("empleadoCodigo", empleado, "periodoIdperiodo.idperiodo", p.getIdperiodo());

            System.out.println("periodo: " + p.getNombre() + "empleado: " + empleado.getCedula() + "diasTrab: " + dt.getDias());
            Double sueldoQuincena = (Double) empleado.getSalario() * dt.getDias() / 30;
            aux.setValor(sueldoQuincena); //sueldo Quincena
            if (sueldoQuincena > 0) {
                nC.create(aux);
            }

            //incapacidad de origen comun
            Nomina aux9 = new Nomina();
            aux9.setEmpleadoCodigo(empleado); //empleado
            aux9.setConceptoIdconcepto(cC.findConcepto(4)); //LICENCIA o INCAPACIDAD
            aux9.setPeriodoIdperiodo(p);
            Diastrabajados dt2 = dtC.findBySingle2("empleadoCodigo", empleado, "periodoIdperiodo", p);
            Double sueldoIncapacidad = (Double) empleado.getSalario() * dt2.getDiasIncTotal() / 30; //incapacidad al 100%
            sueldoIncapacidad += (Double) (empleado.getSalario() * dt2.getDiasIncDostercios() / 30) * 2 / 3; //incapacidad al 66%
            sueldoIncapacidad += (Double) (empleado.getSalario() * dt2.getDiasIncCincuenta() / 30) / 2; //incapacidad al 50%
            sueldoIncapacidad = Math.round(sueldoIncapacidad * 1.0) / 1.0;
            aux9.setValor(sueldoIncapacidad); //Total incapacidad quincena
            if (sueldoIncapacidad > 0) {
                nC.create(aux9);
            }

            //subsidio de transporte
            //si el salario no supera los 2 SMLV y el empleado es de planta
            if ((empleado.getSalario() <= (double) (pg.getSalarioMinimo() * 2)) && empleado.getTipo().equals("PLANTA")) { 
                Nomina aux2 = new Nomina();
                aux2.setEmpleadoCodigo(empleado); //empleado
                aux2.setConceptoIdconcepto(cC.findConcepto(2)); //auxilio de transporte
                aux2.setPeriodoIdperiodo(p); //periodo
                Double subsidioT = (double) (pg.getSubsidioTransporte() / 2);
                aux2.setValor(subsidioT); //subsidio de transporte
                if (subsidioT > 0) {
                    nC.create(aux2);
                }

            }

            //subsidio de alimentacion 
            //se le da a los empleados de planta que ganen hasta 2 salarios minimos
            if ((empleado.getSalario() <= (double) (pg.getSalarioMinimo() * 2)) && empleado.getTipo().equals("PLANTA")) { 
                Nomina aux3 = new Nomina();
                aux3.setEmpleadoCodigo(empleado); //empleado
                aux3.setConceptoIdconcepto(cC.findConcepto(3)); //auxilio de alimentacion
                aux3.setPeriodoIdperiodo(p); //periodo
                Double subsidioA = (double) (pg.getSubsidioAlimentacion() / 2);
                aux3.setValor(subsidioA); //subsidio de alimentacion
                if (subsidioA > 0) {
                    nC.create(aux3);
                }

            }
            Double OtrosDevengados = 0.0;
            //algun concepto de devengado en novedades por concepto
            List<Novedadxconcepto> nc = ncC.findByList3("empleadoCodigo", empleado, "conceptoIdconcepto.tipo", "DEVENGADO", p);
            for (Novedadxconcepto novedadxconcepto : nc) {
                Nomina aux4 = new Nomina();
                aux4.setEmpleadoCodigo(empleado); //empleado
                aux4.setConceptoIdconcepto(novedadxconcepto.getConceptoIdconcepto()); //concepto de algo devengado
                aux4.setPeriodoIdperiodo(p); //periodo
                aux4.setValor(novedadxconcepto.getValor()); //valor a pagar en el concepto
                nC.create(aux4);
                OtrosDevengados += novedadxconcepto.getValor();
            }

            //DEDUCCIONES
            //Seguridad Social
            Nomina aux5 = new Nomina();
            aux5.setEmpleadoCodigo(empleado); //empleado
            aux5.setConceptoIdconcepto(cC.findConcepto(14)); //SALUD
            aux5.setPeriodoIdperiodo(p); //periodo
            double ss = (empleado.getSalario()/2) * pg.getPorcentajeSalud() / 100;
            ss = Math.round(ss * 1.0) / 1.0;
            aux5.setValor(ss); //valor Salud
            nC.create(aux5);

            //Pension
            Nomina aux6 = new Nomina();
            aux6.setEmpleadoCodigo(empleado); //empleado
            aux6.setConceptoIdconcepto(cC.findConcepto(15)); //PENSION
            aux6.setPeriodoIdperiodo(p); //periodo
            double pen = (empleado.getSalario()/2) * pg.getPorcentajePension() / 100;
            pen = Math.round(pen * 1.0) / 1.0;
            aux6.setValor(pen); //valor Pension
            nC.create(aux6);

            //FSP
            if (empleado.getSalario() >= (double) (pg.getSalarioMinimo() * 4)) {
                Nomina aux7 = new Nomina();
                aux7.setEmpleadoCodigo(empleado); //empleado
                aux7.setConceptoIdconcepto(cC.findConcepto(16)); //FSP
                aux7.setPeriodoIdperiodo(p); //periodo
                double fsp = (empleado.getSalario()/2) * pg.getPorcentajeFps() / 100;
                fsp = Math.round(fsp * 1.0) / 1.0;
                aux7.setValor(fsp); //valor FSP
                nC.create(aux7);
            }

            //OTRAS DEDUCCIONES
            List<Novedadxconcepto> nc2 = ncC.findByList4("empleadoCodigo", empleado, "conceptoIdconcepto.tipo", "DEDUCIDO", p);
            for (Novedadxconcepto novedadxconcepto : nc2) {
                Nomina aux8 = new Nomina();
                aux8.setEmpleadoCodigo(empleado); //empleado
                aux8.setConceptoIdconcepto(novedadxconcepto.getConceptoIdconcepto()); //concepto de algo devengado
                aux8.setPeriodoIdperiodo(p); //periodo
                aux8.setValor(novedadxconcepto.getValor()); //valor a pagar en el concepto
                nC.create(aux8);
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diasField;
    private javax.swing.JTextField diasIncCincuentaField;
    private javax.swing.JLabel diasIncCincuentaLabel;
    private javax.swing.JTextField diasIncDosterciosField;
    private javax.swing.JLabel diasIncDosterciosLabel;
    private javax.swing.JTextField diasIncTotalField;
    private javax.swing.JLabel diasIncTotalLabel;
    private javax.swing.JLabel diasLabel;
    private javax.swing.JLabel empleadoCodigoLabel;
    private java.util.List<com.udec.modelo.Empleado> empleadoList;
    private javax.persistence.Query empleadoQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private java.util.List<com.udec.modelo.Diastrabajados> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}