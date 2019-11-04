/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Game.Battle;
import Cards.Character;
import Cards.Souls;
import Cards.Sword;
import Cards.Equipament;
import Game.BattleSequenceControl;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Game.Collection;

/**
 *
 * @author soldgear
 */
public class MainWindow extends JFrame {
    
    private Collection collection;
    
    public static boolean running;
    
    private Character chr = null;
    private Character adv = null;
    private Battle Bt;
    private BattleSequenceControl Bsc;
    
    private Souls soul_slot = null;
    private Sword sword_slot = null;
    
    private Equipament drop_slot;
    
    private CreationWindow creationWindow;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        creationWindow = new CreationWindow(this);
        running = false;
        Bsc = new BattleSequenceControl();
        adv = Bsc.getCurrentEnemy(); // Seta o adversário, mas atualiza a interface depois
        initComponents();
//        Bt = new Battle(this.chr, this.adv);
    }
    
    public MainWindow(Character chr, Character adv){
        creationWindow = new CreationWindow(this);
        this.chr = chr;
        this.adv = adv;
        initComponents();
    }
    
    public void initDisplayComponents(){
        
        // ---- LABELS ----
        NameLabel.setText("Name: -");
        NameLabel.setForeground(Color.white);
        AttackLabel.setText("Attack: -");
        AttackLabel.setForeground(Color.yellow);
        MagicLabel.setText("magic: -");
        MagicLabel.setForeground(Color.blue);
        HealthLabel.setText("HP: -");
        HealthLabel.setForeground(Color.green);
        ExpLabel.setText("XP: -");
        ExpLabel.setForeground(new Color(180,180,180));
        WeaponLabel.setForeground(new Color(200,200,200));
        ArmorLabel.setForeground(new Color(200,200,200));
        SoulLabel.setForeground(new Color(200,200,200));
        
        // ---- PANELS ----
        VersusPanel.setBackground(new Color(100,100,100));
        ControlsPanel.setBackground(new Color(100,100,100));
        interfacePanel.setBackground(new Color(50,50,50));
        mainPanel.setBackground(new Color(40,40,40));
        recStatsPanel.setBackground(new Color(100,100,100));
        statsPanel.setBackground(new Color(60,60,60));
        deckPanel.setBackground(new Color(60,60,60));
        recentPanel.setBackground(new Color(60,60,60));
        
        // ---- BUTTONS ----
        startButton.setBackground(new Color(255,130,0));
        createCharacterButton.setBackground(new Color(255,255,0));
        
    }
    
    public void updateDisplayComponents(){
        
        if (chr != null){
            NameLabel.setText("Name: "+chr.getName());
            AttackLabel.setText("Attack: "+chr.getAttackDamage());
            MagicLabel.setText("magic: "+chr.getMagicDamage());
            HealthLabel.setText("HP: "+(int)chr.getHealthPoints());
            ExpLabel.setText("XP: "+chr.getExperience());
            titleCharLabel.setText(chr.getName());
        }
        
        if (adv != null)
            titleAdvLabel.setText(adv.getName());
        
        if (Bsc.getEnemysLeft() == 0){
            JOptionPane.showMessageDialog(null, "VITÓRIA");
            return;
        }
    }
    
    public void setDropSlot(Equipament item){
        this.drop_slot = item;
        this.recentEquipName.setText(item.getName());
    }
    
    public void startBattle(){
        Bt = new Battle(this, this.chr, this.adv);
        Bt.setListener(new Battle.BattleListener() {
            @Override
            public void turnEnd() {
                updateDisplayComponents();
                terminalEvents.setText(chr.getName() + ": " + (int)chr.getHealthPoints() + ", " + adv.getName() + ": " + (int)adv.getHealthPoints() + "\n" + terminalEvents.getText());
            
            }

            @Override
            public void battleEnd() {
                setAdversary(Bsc.getRandomEnemy());
            }
            
            @Override
            public void dropItem(){
                setDropSlot(Bsc.getDropItem());
            }
        });
        Bt.start();
    }
    
    public void setCharacter(Character chr){
        this.chr = chr;
        updateDisplayComponents();
    }
    
    public void setAdversary(Character adv){
        this.adv = adv;
        updateDisplayComponents();
    }
    
    public void printTerminal(String print){
        terminalEvents.setText(print+"\n"+terminalEvents.getText());
    }
    
    public void setCreationButtonDisabled(){
        this.createCharacterButton.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        interfacePanel = new javax.swing.JPanel();
        deckPanel = new javax.swing.JPanel();
        WeaponLabel = new javax.swing.JLabel();
        ArmorLabel = new javax.swing.JLabel();
        SoulLabel = new javax.swing.JLabel();
        ControlsPanel = new javax.swing.JPanel();
        createCharacterButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        terminalEvents = new javax.swing.JTextArea();
        VersusPanel = new javax.swing.JPanel();
        titleCharLabel = new javax.swing.JLabel();
        titleAdvLabel = new javax.swing.JLabel();
        VSLabel = new javax.swing.JLabel();
        statsPanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        HealthLabel = new javax.swing.JLabel();
        AttackLabel = new javax.swing.JLabel();
        MagicLabel = new javax.swing.JLabel();
        ExpLabel = new javax.swing.JLabel();
        recentPanel = new javax.swing.JPanel();
        Sell = new javax.swing.JButton();
        Deck = new javax.swing.JButton();
        recStatsPanel = new javax.swing.JPanel();
        recentEquipName = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(200, 200, 200));
        setForeground(java.awt.Color.gray);

        interfacePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        deckPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Character Deck", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(180, 180, 180))); // NOI18N
        deckPanel.setForeground(new java.awt.Color(180, 180, 180));

        WeaponLabel.setText("Weapon");
        WeaponLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ArmorLabel.setText("Armor");
        ArmorLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SoulLabel.setText("Soul");
        SoulLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout deckPanelLayout = new javax.swing.GroupLayout(deckPanel);
        deckPanel.setLayout(deckPanelLayout);
        deckPanelLayout.setHorizontalGroup(
            deckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WeaponLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ArmorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(SoulLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deckPanelLayout.setVerticalGroup(
            deckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deckPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deckPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SoulLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ArmorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WeaponLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ControlsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        createCharacterButton.setText("CREATE");
        createCharacterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCharacterButtonActionPerformed(evt);
            }
        });

        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlsPanelLayout = new javax.swing.GroupLayout(ControlsPanel);
        ControlsPanel.setLayout(ControlsPanelLayout);
        ControlsPanelLayout.setHorizontalGroup(
            ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createCharacterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControlsPanelLayout.setVerticalGroup(
            ControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createCharacterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout interfacePanelLayout = new javax.swing.GroupLayout(interfacePanel);
        interfacePanel.setLayout(interfacePanelLayout);
        interfacePanelLayout.setHorizontalGroup(
            interfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfacePanelLayout.createSequentialGroup()
                .addComponent(deckPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ControlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        interfacePanelLayout.setVerticalGroup(
            interfacePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deckPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, interfacePanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(ControlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        terminalEvents.setColumns(20);
        terminalEvents.setRows(5);
        jScrollPane1.setViewportView(terminalEvents);

        VersusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        titleCharLabel.setText("CHARACTER");

        titleAdvLabel.setText("ADVERSARY");

        VSLabel.setText("VS");

        javax.swing.GroupLayout VersusPanelLayout = new javax.swing.GroupLayout(VersusPanel);
        VersusPanel.setLayout(VersusPanelLayout);
        VersusPanelLayout.setHorizontalGroup(
            VersusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VersusPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(titleCharLabel)
                .addGap(108, 108, 108)
                .addComponent(VSLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(titleAdvLabel)
                .addGap(56, 56, 56))
        );
        VersusPanelLayout.setVerticalGroup(
            VersusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VersusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VersusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleCharLabel)
                    .addComponent(titleAdvLabel)
                    .addComponent(VSLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        statsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Character Stats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(180, 180, 180))); // NOI18N
        statsPanel.setForeground(new java.awt.Color(180, 180, 180));

        NameLabel.setText("name");

        HealthLabel.setText("HP");

        AttackLabel.setText("Atk");

        MagicLabel.setText("Magic");

        ExpLabel.setText("XP");

        javax.swing.GroupLayout statsPanelLayout = new javax.swing.GroupLayout(statsPanel);
        statsPanel.setLayout(statsPanelLayout);
        statsPanelLayout.setHorizontalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AttackLabel)
                    .addComponent(MagicLabel)
                    .addComponent(ExpLabel)
                    .addComponent(NameLabel)
                    .addComponent(HealthLabel))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        statsPanelLayout.setVerticalGroup(
            statsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HealthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AttackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MagicLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExpLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        recentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Sell.setText("Sell");

        Deck.setText("Deck");

        recStatsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        recentEquipName.setText("          ---");

        javax.swing.GroupLayout recStatsPanelLayout = new javax.swing.GroupLayout(recStatsPanel);
        recStatsPanel.setLayout(recStatsPanelLayout);
        recStatsPanelLayout.setHorizontalGroup(
            recStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recStatsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recentEquipName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        recStatsPanelLayout.setVerticalGroup(
            recStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recStatsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recentEquipName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout recentPanelLayout = new javax.swing.GroupLayout(recentPanel);
        recentPanel.setLayout(recentPanelLayout);
        recentPanelLayout.setHorizontalGroup(
            recentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(recentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(recStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(recentPanelLayout.createSequentialGroup()
                        .addComponent(Sell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Deck)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        recentPanelLayout.setVerticalGroup(
            recentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(recentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sell)
                    .addComponent(Deck))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(interfacePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(recentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VersusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(VersusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(statsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addComponent(interfacePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        
        if(this.chr == null || this.adv == null){
                JOptionPane.showMessageDialog(null, "No Character or Enemy selected. Please, set your character/Enemy!");
                return;
        }
        
        if (running == false){
            running = true;
            startBattle();
            
        }else{
            JOptionPane.showMessageDialog(null, "Already Runnig!");
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void createCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCharacterButtonActionPerformed
        creationWindow.setVisible(true);
    }//GEN-LAST:event_createCharacterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ArmorLabel;
    private javax.swing.JLabel AttackLabel;
    private javax.swing.JPanel ControlsPanel;
    private javax.swing.JButton Deck;
    private javax.swing.JLabel ExpLabel;
    private javax.swing.JLabel HealthLabel;
    private javax.swing.JLabel MagicLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton Sell;
    private javax.swing.JLabel SoulLabel;
    private javax.swing.JLabel VSLabel;
    private javax.swing.JPanel VersusPanel;
    private javax.swing.JLabel WeaponLabel;
    private javax.swing.JButton createCharacterButton;
    private javax.swing.JPanel deckPanel;
    private javax.swing.JPanel interfacePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel recStatsPanel;
    private javax.swing.JLabel recentEquipName;
    private javax.swing.JPanel recentPanel;
    private javax.swing.JButton startButton;
    private javax.swing.JPanel statsPanel;
    private javax.swing.JTextArea terminalEvents;
    private javax.swing.JLabel titleAdvLabel;
    private javax.swing.JLabel titleCharLabel;
    // End of variables declaration//GEN-END:variables
}
