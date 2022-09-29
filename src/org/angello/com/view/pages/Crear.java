/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package org.angello.com.view.pages;

import org.angello.com.controller.ControllerTipoVehiculos;
import org.angello.com.model.entities.TipoVehiculo;

import java.util.ArrayList;

/**
 * @author Angello
 */
public class Crear extends View<TipoVehiculo, ControllerTipoVehiculos> {

    /**
     * Creates new form Crear
     */
    private static Crear instance;

    public static Crear getInstance() {
        if (instance == null) instance = new Crear();
        return instance;
    }

    private Crear() {
        super(new String[]{"ID", "Tipo vehiculo"}, "Tipo Vehiculo");
    }

    // Its Necessary Because of The initComponent method, that this method is implemented here
    @Override
    public void render(ArrayList<TipoVehiculo> tipoVehiculos) {
        setData(tipoVehiculos);
        initComponents();
        myInitComponents();
        revalidate();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        //        table = new javax.swing.JTable();
        //        btnCreate = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CREATE PAGE SIUUUUU");

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null}
                },
                new String[]{
                        "Title 1"
                }
        ));
        jScrollPane1.setViewportView(table);

        btnCreate.setText("Agregar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(99, 99, 99))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(256, 256, 256)
                                                .addComponent(btnCreate)))
                                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreate)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public ArrayList<ArrayList<String>> modelArrToStringArr2D(ArrayList<TipoVehiculo> tipoVehiculos) {
        ArrayList<ArrayList<String>> array = new ArrayList<>();

        for (TipoVehiculo tipoVehiculo : tipoVehiculos) {
            String id = String.valueOf(tipoVehiculo.getIdTipoVehiculo());
            String name = tipoVehiculo.getNombreTipoVehiculo();
            array.add(new ArrayList<String>() {{
                add(id);
                add(name);
            }});
        }
        return array;
    }

    @Override
    public TipoVehiculo arrStringToModel(ArrayList<String> tuples) {
        int id = Integer.parseInt(String.valueOf(table.getValueAt(table.getSelectedRow(), 0)));
        String name = tuples.get(0);

        return new TipoVehiculo(id, name);
    }

    @Override
    public TipoVehiculo arrStringToModel(ArrayList<String> tuples, boolean isFormFormat) {
        if (!isFormFormat) return arrStringToModel(tuples);
        String name = tuples.get(0);

        return new TipoVehiculo(0, name);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    //    javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    //    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}