
package Interface;

import Game.QuestControl;
import Objects.Quests.Quest;
import Objects.Regions.Region;
import javax.swing.DefaultListModel;

public class ExploreWindow extends javax.swing.JFrame {

    private MainWindow Window;
    private BattleWindow battle;
    private DefaultListModel list;
    private Region reg;
    private QuestControl qstCtrl;
    private String text;
    private String item;
    
    public ExploreWindow(MainWindow Window) {
        initComponents();
        this.Window = Window;
        this.battle = new BattleWindow(this);
        this.qstCtrl = new QuestControl();
        list = new DefaultListModel();
        setTitle("Explorar");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    public void initQuests(){
        
    }
    
    public void UpdateQuests(){
        Window.updateDisplay();
        list.clear();
        reg = Window.getCurrentRegion();
        for(Quest q : qstCtrl.getQuests()){
            if (q.getLocation().equals(reg.getName()) && !q.getAcomplish()){
                list.addElement(q.getName());
            }
        }
        QuestList.setModel(list);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        QuestList = new javax.swing.JList<>();
        ChecktBut = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionArea = new javax.swing.JTextArea();
        AceptBut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Quests Disponíveis:");

        QuestList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        QuestList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(QuestList);

        ChecktBut.setText("Check");
        ChecktBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecktButActionPerformed(evt);
            }
        });

        DescriptionArea.setColumns(20);
        DescriptionArea.setRows(5);
        jScrollPane2.setViewportView(DescriptionArea);

        AceptBut.setText("Aceitar");
        AceptBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptButActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(ChecktBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AceptBut))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AceptBut)
                            .addComponent(ChecktBut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChecktButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecktButActionPerformed
        item = QuestList.getSelectedValue();
        for(Quest q : qstCtrl.getQuests()){
            if(q.getName().equals(item)){
                text = q.getDescription();
            }
        }
        DescriptionArea.setText(text);
    }//GEN-LAST:event_ChecktButActionPerformed

    private void AceptButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptButActionPerformed
        item = QuestList.getSelectedValue();
        for(Quest q : qstCtrl.getQuests()){
            if(q.getName().equals(item)){
                battle.setVisible(true);
                battle.initQuest(q, Window.getCharacter(), q.getNPC());
            }
        }
    }//GEN-LAST:event_AceptButActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptBut;
    private javax.swing.JButton ChecktBut;
    private javax.swing.JTextArea DescriptionArea;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JList<String> QuestList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
