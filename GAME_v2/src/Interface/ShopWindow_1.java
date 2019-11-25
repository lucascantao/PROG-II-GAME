
package Interface;

import Objects.Equipments.Bag;
import Objects.Classes.Character;
import Game.ShopControl;
import Objects.Equipments.Equipment;
import javax.swing.JOptionPane;

public class ShopWindow_1 extends javax.swing.JFrame {

    private MainWindow Window;
    private ShopControl shopCtrl;
    private int Pay;
    private Equipment obj;
    
    public ShopWindow_1(MainWindow Window) {
        this.Window = Window;
        this.shopCtrl = new ShopControl();
        this.shopCtrl.setChar(Window.getCharacter()); // Passa O character para o controle
        Pay = 0;
        setLocation(700, 200);
        initComponents();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        initOpt(false);
    }
    
    public boolean checkCharacterBag(){
        if (Window.getCharacter().getBag() != null){
            return true;
        }
        return false;
    }
    
    public void initOpt(boolean bool){
        
    }

    public void setTitleShop(String s){
        setTitle(s);
    }
    
    //Pega os atributos de espaço da mochila e atualiza na janela
    public void updateBagSlot(){
        int Max = Window.getCharacter().getBag().getMaxCapacity();
        int Free = Window.getCharacter().getBag().getFreeSolt();
        SlotMananger.setText((Max - Free) + "/" + Max);
    }
    
    //Atualiza o Gold do personagem na janela de compra
    public void updateGold(){
        GoldLabel.setText("G$ " + Window.getChrGold());
    }
    
    public boolean pay(int cost){
        Character c = Window.getCharacter();
        if (c.getGold() >= cost){
            Window.getCharacter().addGold(-cost);
            updateGold();
            Window.updateDisplay();
            return true;
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EquipPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MochilaButton = new javax.swing.JButton();
        EspadaButton = new javax.swing.JButton();
        LivroButton = new javax.swing.JButton();
        CajadoButton = new javax.swing.JButton();
        GoldLabel = new javax.swing.JLabel();
        SlotMananger = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EquipPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Mochila -------------------- G$250");

        jLabel2.setText("Cajado Pequeno-------- G$160");

        jLabel3.setText("Epada ----------------------- G$45");

        jLabel5.setText("Livro Negro ----------------G$50");

        MochilaButton.setText("G$250");
        MochilaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MochilaButtonActionPerformed(evt);
            }
        });

        EspadaButton.setText("G$45");
        EspadaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspadaButtonActionPerformed(evt);
            }
        });

        LivroButton.setText("G$50");
        LivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LivroButtonActionPerformed(evt);
            }
        });

        CajadoButton.setText("G$160");
        CajadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajadoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EquipPanelLayout = new javax.swing.GroupLayout(EquipPanel);
        EquipPanel.setLayout(EquipPanelLayout);
        EquipPanelLayout.setHorizontalGroup(
            EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MochilaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CajadoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EspadaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LivroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EquipPanelLayout.setVerticalGroup(
            EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EquipPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(MochilaButton))
                .addGap(6, 6, 6)
                .addGroup(EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(EspadaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LivroButton)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EquipPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajadoButton)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18))
        );

        GoldLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        GoldLabel.setText("Gold");

        SlotMananger.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EquipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GoldLabel)
                    .addComponent(SlotMananger))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EquipPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(GoldLabel)
                        .addGap(39, 39, 39)
                        .addComponent(SlotMananger)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MochilaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MochilaButtonActionPerformed
        //Se eu já tiver mochila, retorna
        if (checkCharacterBag())
            return;
        //Se não, me vende uma
        obj = shopCtrl.buyItem(8);
        if (!pay(obj.getCost()))
            return;
        Window.getCharacter().setBag(obj);
        //Após a compra da mochila, habilita a opção correspondente na janela principal
        Window.setBagEnabled();
        updateBagSlot();
    }//GEN-LAST:event_MochilaButtonActionPerformed

    private void EspadaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspadaButtonActionPerformed
        //Se eu não tiver mochila, retorna
        if (!checkCharacterBag()){
            JOptionPane.showMessageDialog(null, "Sem Mochila Equipada");        
            return;
        }
        if (Window.getCharacter().getBag().getFreeSolt() == 0)
            return;
        obj = shopCtrl.buyItem(3);
        if (!pay(obj.getCost()))
            return;
        Window.getCharacter().getBag().GuardaNaMochila(obj);
        updateBagSlot();
    }//GEN-LAST:event_EspadaButtonActionPerformed

    private void LivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LivroButtonActionPerformed
        if (!checkCharacterBag()){
            JOptionPane.showMessageDialog(null, "Sem Mochila Equipada");        
            return;
        }   
        if (Window.getCharacter().getBag().getFreeSolt() == 0)
            return;
        obj = shopCtrl.buyItem(0);
        if (!pay(obj.getCost()))
            return;
        Window.getCharacter().getBag().GuardaNaMochila(obj);
        updateBagSlot();
    }//GEN-LAST:event_LivroButtonActionPerformed

    private void CajadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajadoButtonActionPerformed
        if (!checkCharacterBag()){
            JOptionPane.showMessageDialog(null, "Sem Mochila Equipada");        
            return;
        }
        if (Window.getCharacter().getBag().getFreeSolt() == 0)
            return;
        obj = shopCtrl.buyItem(6);
        if (!pay(obj.getCost()))
            return;
        Window.getCharacter().getBag().GuardaNaMochila(obj);
        updateBagSlot();
    }//GEN-LAST:event_CajadoButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CajadoButton;
    private javax.swing.JPanel EquipPanel;
    private javax.swing.JButton EspadaButton;
    private javax.swing.JLabel GoldLabel;
    private javax.swing.JButton LivroButton;
    private javax.swing.JButton MochilaButton;
    private javax.swing.JLabel SlotMananger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
