/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.conversor.views;

import com.conversor.logica.ConversorDivisas;
import com.conversor.logica.ConversorMetrico;
import com.conversor.logica.ConversorTemperatura;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author alber
 */
public class ConversorPanel extends javax.swing.JPanel {
    ConversorDivisas divisas;
    ConversorTemperatura temperatura;
    ConversorMetrico metrico;
    private String contexto;
    ArrayList<String> opciones;
    protected double cantidadAConvertir;
    protected String seleccionDestino=null;
    protected String seleccionOrigen=null;
    
    /**
     * Creates new form Divisas
     */
    public ConversorPanel(String c, Color bg) {
        this.contexto = c;
        initComponents();
        background_divisas.setBackground(bg);
        System.out.println(contexto);
        if(contexto != null){
            cargarDivisasOrigen(contexto);
        }   
    }

    
    private void cargarDivisasOrigen(String c) {
        System.out.println(c);
        // Cargar divisas en el combo box "divisaOrigen"
        origen.removeAllItems();
        destino.removeAllItems();
        switch(c){
            case "CONVERSOR DE DIVISAS":
                titulo.setText("Introduzca la cantidad y la divisa");
                divisas = new ConversorDivisas();
                opciones = divisas.getDivisasDisponibles();
                origen.addItem("Seleccione Divisa");
                destino.addItem("Seleccione Divisa");
                for (String opcion : opciones) {
                    origen.addItem(opcion);
                }
            break;
            case "CONVERSOR DE TEMPERATURA":
                titulo.setText("Introduzca la cantidad y Unidad");
                temperatura = new ConversorTemperatura();
                opciones = temperatura.getUnidadesTemperatura();
                origen.addItem("Seleccione Unidad");
                destino.addItem("Seleccione Unidad");
                for (String opcion : opciones) {
                    origen.addItem(opcion);
                }
            break;
            case "CONVERSOR METRICO":
                titulo.setText("Introduzca la cantidad y Unidad");
                metrico = new ConversorMetrico();
                opciones = metrico.getUnidadesMetricas();
                origen.addItem("Seleccione Unidad");
                destino.addItem("Seleccione Unidad");
                for (String opcion : opciones) {
                    origen.addItem(opcion);
                }
            break;
        }

        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.out.println("ejecutando obtenerCantidadAConvertir()");
                cantidadAConvertir = obtenerCantidadAConvertir();
                System.out.println(cantidadAConvertir);
                validarEntradas();
            }
        });

        origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionOrigen = (String) origen.getSelectedItem();
                cargarDivisasDestino();
            }
        });

        destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionDestino = (String) destino.getSelectedItem();
                
                System.out.println("intento: "+seleccionOrigen +", "+seleccionDestino);
                validarEntradas();
            }
        });
    }
    
    private double obtenerCantidadAConvertir() {
        double cantidadConvertir = 0;
        try {
            cantidadConvertir = Double.parseDouble(entrada.getText());
        } catch (NumberFormatException e) {
            jOptionPane1.showMessageDialog(this, "Ingrese una cantidad válida.", "Error", jOptionPane1.ERROR_MESSAGE);
        }
        return cantidadConvertir;
    }

    private void cargarDivisasDestino() {
        // Limpiar el combo box "divisaDestino" y agregar todas las divisas excepto la seleccionada en "divisaOrigen"
        destino.removeAllItems();
        destino.addItem("Seleccione Divisa");
        for (String opcion : opciones) {
            if (!opcion.equals(seleccionOrigen)) {
                destino.addItem(opcion);
                System.out.println(opcion);
            }
        }
    }

    private boolean validarEntradas() {
        if (seleccionOrigen != null &&  seleccionDestino != null && !seleccionDestino.contains("Seleccione Divisa") && cantidadAConvertir > 0) {
            
            // Llamar al método de cálculo cuando se hayan seleccionado ambas divisas y se haya ingresado una cantidad válida
            if(contexto.contains("DIVISAS")){
                System.out.println("divisas");
                double resultadoConversion = divisas.calcularConversion(cantidadAConvertir, seleccionOrigen, seleccionDestino);
                mostrarResultado(resultadoConversion);
            }
            else if(contexto.contains("TEMPERATURA")){
                System.out.println("TEMPERATURA");
                double resultadoConversion = temperatura.calcularConversion(cantidadAConvertir, seleccionOrigen, seleccionDestino);
                mostrarResultado(resultadoConversion);
            }
            else if (contexto.contains("METRICO")){
                System.out.println("METRICO");
                double resultadoConversion = metrico.calcularConversion(cantidadAConvertir, seleccionOrigen, seleccionDestino);
                mostrarResultado(resultadoConversion);
            }
        }
        return true;
    }

    private void mostrarResultado(double resultado) {
        // Mostrar el resultado en el campo "resultado"
        String resultadoFormateado = String.format("%.3f", resultado);
        this.resultado.setText(resultadoFormateado);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        background_divisas = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();
        origen = new javax.swing.JComboBox<>();
        resultado = new javax.swing.JTextField();
        destino = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(60, 83, 139));
        setMinimumSize(new java.awt.Dimension(730, 530));
        setPreferredSize(new java.awt.Dimension(730, 530));

        background_divisas.setBackground(new java.awt.Color(0, 50, 115));
        background_divisas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background_divisas.setMinimumSize(new java.awt.Dimension(730, 530));
        background_divisas.setPreferredSize(new java.awt.Dimension(730, 530));

        titulo.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Introduzca la cantidad y la divisa");

        entrada.setText("Ejemplo:100.00");
        entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                entradaMousePressed(evt);
            }
        });
        entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaActionPerformed(evt);
            }
        });

        origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        origen.setBorder(null);
        origen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                origenItemStateChanged(evt);
            }
        });
        origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenActionPerformed(evt);
            }
        });

        resultado.setText("resultado");

        destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background_divisasLayout = new javax.swing.GroupLayout(background_divisas);
        background_divisas.setLayout(background_divisasLayout);
        background_divisasLayout.setHorizontalGroup(
            background_divisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(background_divisasLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(background_divisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(entrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(background_divisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(origen, 0, 191, Short.MAX_VALUE)
                    .addComponent(destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(206, 206, 206))
        );
        background_divisasLayout.setVerticalGroup(
            background_divisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_divisasLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addGroup(background_divisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrada, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(origen, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addGroup(background_divisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(destino, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addGap(140, 140, 140))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_divisas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_divisas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaActionPerformed
  
    }//GEN-LAST:event_entradaActionPerformed

    private void origenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenActionPerformed
       
    }//GEN-LAST:event_origenActionPerformed

    private void origenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_origenItemStateChanged

    }//GEN-LAST:event_origenItemStateChanged

    private void destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoActionPerformed
       
    }//GEN-LAST:event_destinoActionPerformed

    private void entradaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entradaMousePressed
        entrada.setText("");
    }//GEN-LAST:event_entradaMousePressed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_divisas;
    private javax.swing.JComboBox<String> destino;
    private javax.swing.JTextField entrada;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JComboBox<String> origen;
    private javax.swing.JTextField resultado;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
