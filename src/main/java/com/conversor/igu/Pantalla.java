
package com.conversor.igu;
import com.conversor.views.Bienvenida;
import com.conversor.views.ConversorPanel;
import java.awt.BorderLayout;
import java.awt.Color;


/**
 *
 * @author alber
 */
public class Pantalla extends javax.swing.JFrame {
    ConversorPanel view;
    Color colorDeFondo;
    /**
     * Creates new form main
     */
    public Pantalla() {
        initComponents();
        initViews();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        tituloMenu = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        btnDiv = new javax.swing.JButton();
        btnTem = new javax.swing.JButton();
        btnMet = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        tituloView = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 700));

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        background.setMinimumSize(new java.awt.Dimension(1020, 700));
        background.setPreferredSize(new java.awt.Dimension(1020, 700));

        menu.setMinimumSize(new java.awt.Dimension(290, 700));
        menu.setPreferredSize(new java.awt.Dimension(290, 700));

        tituloMenu.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        tituloMenu.setText("CONVERSOR");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        btnDiv.setText("CONVERSOR DE DIVISAS");
        btnDiv.setMaximumSize(new java.awt.Dimension(400, 50));
        btnDiv.setMinimumSize(new java.awt.Dimension(290, 50));
        btnDiv.setPreferredSize(new java.awt.Dimension(290, 50));
        btnDiv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDivMousePressed(evt);
            }
        });

        btnTem.setText("CONVERSOR DE TEMPERATURA");
        btnTem.setMaximumSize(new java.awt.Dimension(400, 50));
        btnTem.setMinimumSize(new java.awt.Dimension(290, 50));
        btnTem.setPreferredSize(new java.awt.Dimension(290, 50));
        btnTem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTemMousePressed(evt);
            }
        });

        btnMet.setText("CONVERSOR METRICO");
        btnMet.setMaximumSize(new java.awt.Dimension(400, 50));
        btnMet.setMinimumSize(new java.awt.Dimension(290, 50));
        btnMet.setPreferredSize(new java.awt.Dimension(290, 50));
        btnMet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMetMousePressed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(95, 95, 95))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(tituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(74, 74, 74))
            .addComponent(btnDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76)
                .addComponent(btnDiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(btnTem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(btnMet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(344, 344, 344))
        );

        header.setMaximumSize(new java.awt.Dimension(33867, 32767));
        header.setMinimumSize(new java.awt.Dimension(730, 140));
        header.setPreferredSize(new java.awt.Dimension(730, 140));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMaximumSize(new java.awt.Dimension(33767, 32767));
        content.setMinimumSize(new java.awt.Dimension(730, 530));
        content.setPreferredSize(new java.awt.Dimension(730, 530));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tituloView.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        tituloView.setForeground(new java.awt.Color(0, 0, 0));
        tituloView.setText("Bienvenida");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tituloView)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tituloView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDivMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivMousePressed
        colorDeFondo = new Color(153,153,153);
        view = new ConversorPanel(btnDiv.getText(), colorDeFondo);
        view.setSize(content.getSize());
        view.setLocation(0, 0);
        content.removeAll();
        content.add(view,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        background.setBackground(colorDeFondo);
        tituloView.setText(btnDiv.getText());
        
    }//GEN-LAST:event_btnDivMousePressed

    private void btnTemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemMousePressed
        colorDeFondo = new Color(0,50,115);
        
        try{
        view = new ConversorPanel(btnTem.getText(), colorDeFondo);
        }catch (NullPointerException ex){
            System.out.println(ex.getStackTrace());
        }
        
        view.setSize(content.getSize());
        view.setLocation(0, 0);
        view.setBackground(colorDeFondo);
        content.removeAll();
        content.add(view,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        background.setBackground(colorDeFondo);
        tituloView.setText(btnTem.getText());
    }//GEN-LAST:event_btnTemMousePressed

    private void btnMetMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMetMousePressed
        colorDeFondo = new Color(153,102,0);
        view = new ConversorPanel(btnMet.getText(), colorDeFondo);
        view.setSize(content.getSize());
        view.setLocation(0, 0);
        content.removeAll();
        content.add(view,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        background.setBackground(colorDeFondo);
        tituloView.setText(btnMet.getText());
    }//GEN-LAST:event_btnMetMousePressed
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMet;
    private javax.swing.JButton btnTem;
    private javax.swing.JPanel content;
    private javax.swing.JPanel header;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel tituloMenu;
    private javax.swing.JLabel tituloView;
    // End of variables declaration//GEN-END:variables

    private void initViews() {
        content.setLayout(new BorderLayout());
        Bienvenida principal = new Bienvenida();
        principal.setSize(content.getSize());
        content.removeAll();
        content.add(principal, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
        background.setBackground(principal.getBackground());
    }
}
