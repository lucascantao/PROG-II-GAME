
package Interface;

import Game.ShopControl;
import javax.swing.JOptionPane;

public class ShopWindow extends javax.swing.JFrame {

    private StatusWindow Window;
    private ShopControl shopCtrl;
    private int Pay;
    
    public ShopWindow(StatusWindow Window) {
        this.Window = Window;
        this.shopCtrl = new ShopControl();
        Pay = 0;
        setLocation(700, 200);
        initComponents();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    public void setTitleShop(String s){
        setTitle(s);
    }
    
    public void updateGold(){
        GoldLabel.setText("G$ " + Window.getChrGold());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BuyButton = new javax.swing.JButton();
        EquipPanel = new javax.swing.JPanel();
        BuyOption_Bag = new javax.swing.JCheckBox();
        BuyOption_Espada = new javax.swing.JCheckBox();
        BuyOption_EspadaLonga = new javax.swing.JCheckBox();
        BuyOption_LaminaDivina = new javax.swing.JCheckBox();
        GoldLabel = new javax.swing.JLabel();
        PayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BuyButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        BuyButton.setText("COMPRAR");
        BuyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyButtonActionPerformed(evt);
            }
        });

        EquipPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        BuyOption_Bag.setText("Mochila -------------- G$ 250");
        BuyOption_Bag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyOption_BagActionPerformed(evt);
            }
        });

        BuyOption_Espada.setText("Espada -------------- G$ 45");
        BuyOption_Espada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyOption_EspadaActionPerformed(evt);
            }
        });

        BuyOption_EspadaLonga.setText("Espada Longa ------ G$ 135");
        BuyOption_EspadaLonga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyOption_EspadaLongaActionPerformed(evt);
            }
        });

        BuyOption_LaminaDivina.setText("Lâmina Divina ------ G$ 220");
        BuyOption_LaminaDivina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyOption_LaminaDivinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EquipPanelLayout = new javax.swing.GroupLayout(EquipPanel);
        EquipPanel.setLayout(EquipPanelLayout);
        EquipPanelLayout.setHorizontalGroup(
            EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EquipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuyOption_Bag)
                    .addComponent(BuyOption_Espada, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(BuyOption_EspadaLonga)
                    .addComponent(BuyOption_LaminaDivina))
                .addGap(10, 10, 10))
        );
        EquipPanelLayout.setVerticalGroup(
            EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BuyOption_Bag)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BuyOption_Espada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(BuyOption_EspadaLonga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuyOption_LaminaDivina)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        GoldLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        GoldLabel.setText("Gold");

        PayLabel.setText("Pagar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EquipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(BuyButton)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(GoldLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EquipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(PayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GoldLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyButtonActionPerformed
        if (Window.getChrGold() < Pay){
            JOptionPane.showMessageDialog(null, "Dinheiro insuficiente.");
            return;
        }
        Window.getCharacter().addGold((-Pay)); // Atualiza o Gold do personagem a partir da Janela
       
        if (BuyOption_Bag.isSelected()){
            Window.getCharacter().setBag(shopCtrl.buyItem(8));
            BuyOption_Bag.setEnabled(false);
            Window.setBagEnabled();
        }
        //TODO compra das outras opções
        Pay = 0;
        Window.updateDisplay();
        setVisible(false);
       
    }//GEN-LAST:event_BuyButtonActionPerformed

    private void BuyOption_BagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyOption_BagActionPerformed
        if (BuyOption_Bag.isSelected())
            Pay += shopCtrl.buyItem(8).getCost();
        else{
            Pay -= shopCtrl.buyItem(8).getCost();
        }
        
        PayLabel.setText("Pagar: G$ " + Pay);
    }//GEN-LAST:event_BuyOption_BagActionPerformed

    private void BuyOption_EspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyOption_EspadaActionPerformed
        if (BuyOption_Espada.isSelected())
            Pay += shopCtrl.buyItem(3).getCost();
        else{
            Pay -= shopCtrl.buyItem(3).getCost();
        }
        
        PayLabel.setText("Pagar: G$ " + Pay);
    }//GEN-LAST:event_BuyOption_EspadaActionPerformed

    private void BuyOption_EspadaLongaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyOption_EspadaLongaActionPerformed
        if (BuyOption_EspadaLonga.isSelected())
            Pay += shopCtrl.buyItem(4).getCost();
        else{
            Pay -= shopCtrl.buyItem(4).getCost();
        }
        
        PayLabel.setText("Pagar: G$ " + Pay);
    }//GEN-LAST:event_BuyOption_EspadaLongaActionPerformed

    private void BuyOption_LaminaDivinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyOption_LaminaDivinaActionPerformed
        if (BuyOption_LaminaDivina.isSelected())
            Pay += shopCtrl.buyItem(5).getCost();
        else{
            Pay -= shopCtrl.buyItem(5).getCost();
        }
        
        PayLabel.setText("Pagar: G$ " + Pay);
    }//GEN-LAST:event_BuyOption_LaminaDivinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuyButton;
    private javax.swing.JCheckBox BuyOption_Bag;
    private javax.swing.JCheckBox BuyOption_Espada;
    private javax.swing.JCheckBox BuyOption_EspadaLonga;
    private javax.swing.JCheckBox BuyOption_LaminaDivina;
    private javax.swing.JPanel EquipPanel;
    private javax.swing.JLabel GoldLabel;
    private javax.swing.JLabel PayLabel;
    // End of variables declaration//GEN-END:variables
}
