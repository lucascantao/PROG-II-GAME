
package Interface;

import Objects.Classes.Character;

public class ProfileWindow extends javax.swing.JFrame {

    private MainWindow Window;
    private Character chr;
    
    private double TargetXP;
    
    public ProfileWindow(MainWindow Window) {
        this.Window = Window;
        TargetXP = 40;
        setLocation(250, 200);
        setTitle("Perfil");
        initComponents();
        updateDisplay();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    public void updateDisplay(){
        this.chr = Window.getCharacter();
        if (chr == null){
            return;
        }
        PointsLabel.setText("Pontos de Habilidades: " + chr.getAbilityPoints());
        LevelLabel.setText("Nível: " + chr.getLevel());
        if (chr.getWeapon() != null)
            EquipmentLabel.setText("Arma: " + chr.getWeapon().getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProfileIcon = new javax.swing.JLabel();
        PointsLabel = new javax.swing.JLabel();
        LevelLabel = new javax.swing.JLabel();
        EquipmentLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ResistenciaLAbel = new javax.swing.JLabel();
        MagiaLabel = new javax.swing.JLabel();
        AtaqueLabel = new javax.swing.JLabel();
        UpgradeResistencia = new javax.swing.JButton();
        UpgradeMagia = new javax.swing.JButton();
        UpgradeAtaque = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ProfileIcon.setText("Profile Icon");

        PointsLabel.setText("Pontos de Habilidade");

        LevelLabel.setText("Nível");

        EquipmentLabel.setText("Equipamento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PointsLabel)
                    .addComponent(LevelLabel)
                    .addComponent(EquipmentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProfileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PointsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LevelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EquipmentLabel))
                    .addComponent(ProfileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ResistenciaLAbel.setText("Resistencia");

        MagiaLabel.setText("Magia");

        AtaqueLabel.setText("Ataque");

        UpgradeResistencia.setText("+");
        UpgradeResistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpgradeResistenciaActionPerformed(evt);
            }
        });

        UpgradeMagia.setText("+");
        UpgradeMagia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpgradeMagiaActionPerformed(evt);
            }
        });

        UpgradeAtaque.setText("+");
        UpgradeAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpgradeAtaqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ResistenciaLAbel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(UpgradeResistencia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(MagiaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpgradeMagia))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AtaqueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpgradeAtaque)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResistenciaLAbel)
                    .addComponent(UpgradeResistencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MagiaLabel)
                    .addComponent(UpgradeMagia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtaqueLabel)
                    .addComponent(UpgradeAtaque))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpgradeResistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpgradeResistenciaActionPerformed
        if (chr.getAbilityPoints() > 0)
            chr.upgrade("Resistencia");
        updateDisplay();
        Window.updateDisplay();
    }//GEN-LAST:event_UpgradeResistenciaActionPerformed

    private void UpgradeMagiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpgradeMagiaActionPerformed
        if (chr.getAbilityPoints() > 0)
            chr.upgrade("Magia");
        updateDisplay();
        Window.updateDisplay();
    }//GEN-LAST:event_UpgradeMagiaActionPerformed

    private void UpgradeAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpgradeAtaqueActionPerformed
        if (chr.getAbilityPoints() > 0)
            chr.upgrade("Ataque");
        updateDisplay();
        Window.updateDisplay();
    }//GEN-LAST:event_UpgradeAtaqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtaqueLabel;
    private javax.swing.JLabel EquipmentLabel;
    private javax.swing.JLabel LevelLabel;
    private javax.swing.JLabel MagiaLabel;
    private javax.swing.JLabel PointsLabel;
    private javax.swing.JLabel ProfileIcon;
    private javax.swing.JLabel ResistenciaLAbel;
    private javax.swing.JButton UpgradeAtaque;
    private javax.swing.JButton UpgradeMagia;
    private javax.swing.JButton UpgradeResistencia;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
