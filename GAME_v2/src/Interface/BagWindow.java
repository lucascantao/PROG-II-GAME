
package Interface;

import Objects.Classes.Character;
import Objects.Equipments.Bag;
import Objects.Equipments.Equipment;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.event.ListDataListener;

public class BagWindow extends javax.swing.JFrame {
    
    private MainWindow Window;
    private Character chr;
    private int ponteiro;
    private DefaultListModel list;
    private Bag bag;
    
    public BagWindow(MainWindow Window, Character chr) {
        this.ponteiro = 0;
        this.Window = Window;
        this.chr = chr;
        initComponents();
        initBag();
        setLocation(700, 200);
        setTitle("Mochila");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    public void initBag(){
        list = new DefaultListModel();
        list.ensureCapacity(5);
    }
    
    //Atualizar os itens que tem dentro da bag
    public void UpdateBag(){
        this.chr = Window.getCharacter();

//      Pega a Bag do personagem
        bag = chr.getBag();
        list.clear();
        for(int i = 0; i < bag.getObjects().size(); i++){
            
            //pega o nome(String) do objeto (i) dentro dos objetos da bag
            list.addElement(bag.getObjects().get(i).getName());
        }
        ObjList.setModel(list);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ObjList = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        EquipEsqButton = new javax.swing.JButton();
        SellBut = new javax.swing.JButton();
        CloseBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ObjList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
            public void setElement(int i, String text) { strings[i] = text; }
        });
        jScrollPane1.setViewportView(ObjList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EquipEsqButton.setText("Equipar ");
        EquipEsqButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipEsqButtonActionPerformed(evt);
            }
        });

        SellBut.setText("Vender");
        SellBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SellBut, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EquipEsqButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EquipEsqButton)
                .addGap(18, 18, 18)
                .addComponent(SellBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CloseBut.setText("Fechar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CloseBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseBut)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EquipEsqButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipEsqButtonActionPerformed
        String name = ObjList.getSelectedValue();
        for(Equipment e : bag.getObjects()){
            if (e.getName() == name){
                chr.setWeapon(e);
                Window.updateDisplay();
                return;
            }
        }
    }//GEN-LAST:event_EquipEsqButtonActionPerformed

    private void SellButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellButActionPerformed
        String name = ObjList.getSelectedValue();
        for(Equipment e : bag.getObjects()){
            if (e.getName() == name){
                chr.addGold(e.getCost());
                chr.getBag().getObjects().remove(e);
                Window.updateDisplay();
                
            }
        }
        UpdateBag();
    }//GEN-LAST:event_SellButActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseBut;
    private javax.swing.JButton EquipEsqButton;
    private javax.swing.JList<String> ObjList;
    private javax.swing.JButton SellBut;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
