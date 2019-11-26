package Interface;

import Commands.ICommand;
import Commands.Invoker;
import Objects.Classes.Character;
import Objects.Regions.BlindCity;
import Objects.Regions.RegionEnum;
import Objects.Regions.Region;
import java.util.LinkedList;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    
    public static boolean running = false;
    
    private final MapWindow map;
    private final CCWindow ccw;
    private final ShopWindow_1 shop;
    private final BagWindow bag;
    private final ProfileWindow prof;
    private final ExploreWindow exp;
//    private final BattleWindow battle;
private Character chr = null;
    
    private LinkedList<JFrame> WindowList;
    
    private Region current_region;
    private Region Bc;
    private Region Fo;
    private Region De;
    private Region Eg;
    
    private Invoker inv;
    
    private ICommand com;
    
    private double TargetXP ;
    
    public MainWindow() {
        initComponents();
        intiReg();
        inv = new Invoker();
        TargetXP = 40;
        current_region = Bc;
        setLocation(250, 200);
        setTitle("Clan Quest v2.0");
        setVisible(false);
        BagButton.setEnabled(false);
        map = new MapWindow(this);
        ccw = new CCWindow(this);
        shop = new ShopWindow_1(this);
        bag = new BagWindow(this, chr);
        prof = new ProfileWindow(this);
        exp = new ExploreWindow(this);
        ccw.setVisible(true);
    }
    
    public void intiReg(){
        Bc = new Region("Blind City",RegionEnum.BLINDCITY);
        Fo = new Region("Floresta", RegionEnum.FLORESTA);
        De = new Region("Deserto", RegionEnum.DESERTO);
        Eg = new Region("Eguinor", RegionEnum.EGUINOR);
    }
    
    public void updateXP(){
        double xp = chr.getExperience();
        while (xp >= TargetXP){
            chr.UpgradePH();
            TargetXP += (TargetXP*0.5);
        }
        Experience.setText("XP: " + chr.getExperience() + "/" + TargetXP);
    }
    
    public Region getCurrentRegion(){
        return current_region;
    }
    
    public void updateDisplay(){
        updateXP();
        Nome.setText("Nome: "+ chr.getName());
        HP.setText("HP: "+chr.getHealthPoints());
        Ataque.setText("PA: " + chr.getTotalAD());
        Magia.setText("PM: " + chr.getTotalMD());
        Classe.setText("CLASSE: " + chr.getClasse().getValor());
        RegionLabel.setText("REGIÃO: " + this.current_region.getName());
        GoldLabel.setText("Gold: " + chr.getGold());
    }
    
    public void setBagEnabled(){
        this.BagButton.setEnabled(true);
    }
    
    public void setCharacter(Character chr){
        this.chr = chr;
    }
    
    public Character getCharacter(){
        return this.chr;
    }
    
    public Invoker getInv(){
        return inv;
    }
    
    public void setCom(ICommand c){
        com = c;
    }
    
    public ICommand getCom(){
        return com;
    }
    
    /**
     *
     * @return
     * 
     * Gets the actual character Gold
     */
    public int getChrGold(){
        return chr.getGold();
    }
    
    public void setRegion(String r){
        if (r.equals(RegionEnum.BLINDCITY.getValor())){
            this.current_region = Bc;
            this.ShopButton.setEnabled(true);
        }
        if (r.equals(RegionEnum.DESERTO.getValor())){
            this.current_region = De;
            this.ShopButton.setEnabled(false);
        }
        if (r.equals(RegionEnum.EGUINOR.getValor())){
            this.current_region = Eg;
            this.ShopButton.setEnabled(true);
        }
        if (r.equals(RegionEnum.FLORESTA.getValor())){
            this.current_region = Fo;
            this.ShopButton.setEnabled(false);
        }
            
        updateDisplay();
    }
    
    public void show(String name){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfileButton = new javax.swing.JButton();
        OptionsPanel = new javax.swing.JPanel();
        ShopButton = new javax.swing.JButton();
        BagButton = new javax.swing.JButton();
        ExploreButton = new javax.swing.JButton();
        MapButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        Ataque = new javax.swing.JLabel();
        Magia = new javax.swing.JLabel();
        Experience = new javax.swing.JLabel();
        PH = new javax.swing.JLabel();
        GoldLabel = new javax.swing.JLabel();
        HP = new javax.swing.JLabel();
        Classe = new javax.swing.JLabel();
        RegionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/122X114.png"))); // NOI18N
        ProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileButtonActionPerformed(evt);
            }
        });

        ShopButton.setText("Loja");
        ShopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopButtonActionPerformed(evt);
            }
        });

        BagButton.setText("Mochila");
        BagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagButtonActionPerformed(evt);
            }
        });

        ExploreButton.setText("Explorar");
        ExploreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExploreButtonActionPerformed(evt);
            }
        });

        MapButton.setText("Mapa");
        MapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsPanelLayout = new javax.swing.GroupLayout(OptionsPanel);
        OptionsPanel.setLayout(OptionsPanelLayout);
        OptionsPanelLayout.setHorizontalGroup(
            OptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BagButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExploreButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(MapButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        OptionsPanelLayout.setVerticalGroup(
            OptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ShopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BagButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExploreButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Nome.setText("Nome: ");

        Ataque.setText("Ataque: ");

        Magia.setText("Magia: ");

        Experience.setText("XP: ");

        PH.setText("PH:");

        GoldLabel.setText("Gold:");

        HP.setText("HP:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome)
                    .addComponent(Ataque)
                    .addComponent(Magia)
                    .addComponent(Experience))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PH)
                    .addComponent(GoldLabel)
                    .addComponent(HP))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome)
                    .addComponent(HP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ataque)
                    .addComponent(PH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Magia)
                    .addComponent(GoldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Experience)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Classe.setText("Classe");

        RegionLabel.setText("Region");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Classe)
                            .addComponent(RegionLabel)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(OptionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Classe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RegionLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileButtonActionPerformed
        prof.setTitle(chr.getName() + " - Lv " + chr.getLevel());
        prof.updateDisplay();
        shop.setVisible(false);
        map.setVisible(false);
        bag.setVisible(false);
        prof.setVisible(true);
    }//GEN-LAST:event_ProfileButtonActionPerformed

    private void ShopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopButtonActionPerformed
        shop.setTitle(current_region.getName() + " Shop");
        shop.updateGold();
        shop.setVisible(true);
        bag.setVisible(false);
        map.setVisible(false);
        prof.setVisible(false);
    }//GEN-LAST:event_ShopButtonActionPerformed

    private void BagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagButtonActionPerformed
        bag.UpdateBag();
        bag.setVisible(true);
        shop.setVisible(false);
        map.setVisible(false);
        prof.setVisible(false);
    }//GEN-LAST:event_BagButtonActionPerformed

    private void ExploreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExploreButtonActionPerformed
        exp.UpdateQuests();
        exp.setVisible(true);
    }//GEN-LAST:event_ExploreButtonActionPerformed

    private void MapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapButtonActionPerformed
        shop.setVisible(false);
        map.setVisible(true);
        prof.setVisible(false);
        bag.setVisible(false);
    }//GEN-LAST:event_MapButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ataque;
    private javax.swing.JButton BagButton;
    private javax.swing.JLabel Classe;
    private javax.swing.JLabel Experience;
    private javax.swing.JButton ExploreButton;
    private javax.swing.JLabel GoldLabel;
    private javax.swing.JLabel HP;
    private javax.swing.JLabel Magia;
    private javax.swing.JButton MapButton;
    private javax.swing.JLabel Nome;
    private javax.swing.JPanel OptionsPanel;
    private javax.swing.JLabel PH;
    private javax.swing.JButton ProfileButton;
    private javax.swing.JLabel RegionLabel;
    private javax.swing.JButton ShopButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
