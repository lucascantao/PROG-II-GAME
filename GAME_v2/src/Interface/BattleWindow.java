
package Interface;

import Objects.Classes.Character;
import Objects.Quests.Quest;
import Game.Battle;
import javax.swing.JOptionPane;

public class BattleWindow extends javax.swing.JFrame {

    ExploreWindow Window;
    
    private Character chr, adv;
    private Quest q;
    
    private Battle bat;
    
    public BattleWindow(ExploreWindow Window) {
        initComponents();
        this.Window = Window;
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    public void initQuest(Quest q, Character chr, Character adv){
        this.q = q;
        this.chr = chr;
        this.adv = adv;
        updateStatusDisplay();
        bat = new Battle(this, chr, adv);
    }
    
    public void fail(){
        JOptionPane.showMessageDialog(null, "Derrota!");
        Window.UpdateQuests();
    }
    
    public void finish(){
        q.finishQuest();
        int xp = q.getXp(), g = q.getGold(); 
        chr.addExperience(xp);
        chr.addGold(g);
        JOptionPane.showMessageDialog(null, "Vitória\n+G$"+g+"\n+XP"+xp);
        Window.UpdateQuests();
    }
    
    public void updateStatusDisplay(){
        System.out.println("Updateing Display");
        chrName.setText("Nome: " + chr.getName());
        chrPA.setText("PA: " + chr.getTotalAD());
        chrPM.setText("PM: " + chr.getTotalMD());
        chrLevel.setText("Nível: " + chr.getLevel());
        chrHP.setText("HP: "+ chr.getHealthPoints());
        
        advName.setText("Nome: " + adv.getName());
        advPA.setText("PA: " + adv.getTotalAD());
        advPM.setText("PM: " + adv.getTotalMD());
        advLevel.setText("Nível: " + adv.getLevel());
        advHP.setText("HP: "+ adv.getHealthPoints());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chrName = new javax.swing.JLabel();
        chrPA = new javax.swing.JLabel();
        chrPM = new javax.swing.JLabel();
        chrLevel = new javax.swing.JLabel();
        AtaqueBut = new javax.swing.JButton();
        FFBut = new javax.swing.JButton();
        chrHP = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        advName = new javax.swing.JLabel();
        advPA = new javax.swing.JLabel();
        advPM = new javax.swing.JLabel();
        advLevel = new javax.swing.JLabel();
        advHP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        chrName.setText("Nome:");

        chrPA.setText("PA:");

        chrPM.setText("PM:");

        chrLevel.setText("Nível:");

        AtaqueBut.setText("Iniciar");
        AtaqueBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtaqueButActionPerformed(evt);
            }
        });

        FFBut.setText("Sair");

        chrHP.setText("HP:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AtaqueBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FFBut, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chrName)
                            .addComponent(chrPA)
                            .addComponent(chrPM)
                            .addComponent(chrLevel)
                            .addComponent(chrHP))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chrName)
                .addGap(18, 18, 18)
                .addComponent(chrPA)
                .addGap(18, 18, 18)
                .addComponent(chrPM)
                .addGap(18, 18, 18)
                .addComponent(chrLevel)
                .addGap(18, 18, 18)
                .addComponent(chrHP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(AtaqueBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FFBut)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        advName.setText("Nome;");

        advPA.setText("PA:");

        advPM.setText("PM:");

        advLevel.setText("Nível:");

        advHP.setText("HP:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(advName)
                    .addComponent(advPA)
                    .addComponent(advPM)
                    .addComponent(advLevel)
                    .addComponent(advHP))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(advName)
                .addGap(18, 18, 18)
                .addComponent(advPA)
                .addGap(18, 18, 18)
                .addComponent(advPM)
                .addGap(18, 18, 18)
                .addComponent(advLevel)
                .addGap(18, 18, 18)
                .addComponent(advHP)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtaqueButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtaqueButActionPerformed
        bat.start();
    }//GEN-LAST:event_AtaqueButActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtaqueBut;
    private javax.swing.JButton FFBut;
    private javax.swing.JLabel advHP;
    private javax.swing.JLabel advLevel;
    private javax.swing.JLabel advName;
    private javax.swing.JLabel advPA;
    private javax.swing.JLabel advPM;
    private javax.swing.JLabel chrHP;
    private javax.swing.JLabel chrLevel;
    private javax.swing.JLabel chrName;
    private javax.swing.JLabel chrPA;
    private javax.swing.JLabel chrPM;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
