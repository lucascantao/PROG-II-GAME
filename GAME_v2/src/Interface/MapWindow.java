
package Interface;

import Objects.Regions.RegionEnum;

public class MapWindow extends javax.swing.JFrame {

    private final MainWindow window;
    
    private RegionEnum Eguinor, BlindCity, Desert, Forest;

    public MapWindow(MainWindow window) {
        initComponents();
        Eguinor = RegionEnum.EGUINOR;
        BlindCity = RegionEnum.BLINDCITY;
        Desert = RegionEnum.DESERTO;
        Forest = RegionEnum.FLORESTA;
        setLocation(700, 200);
        this.window = window;
        setDefaultCloseOperation(HIDE_ON_CLOSE);
//        this.TravelList
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegionIcon = new javax.swing.JLabel();
        TravelButton = new javax.swing.JButton();
        TravelList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegionIcon.setText("Region");

        TravelButton.setText("Viajar");
        TravelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TravelButtonActionPerformed(evt);
            }
        });

        TravelList.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TravelList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blind City", "Floresta", "Deserto", "Eguinor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RegionIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TravelList, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TravelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RegionIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TravelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(TravelList))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void TravelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TravelButtonActionPerformed
        setVisible(false);
        window.setRegion(TravelList.getSelectedItem().toString());
    }//GEN-LAST:event_TravelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegionIcon;
    private javax.swing.JButton TravelButton;
    private javax.swing.JComboBox<String> TravelList;
    // End of variables declaration//GEN-END:variables
}
