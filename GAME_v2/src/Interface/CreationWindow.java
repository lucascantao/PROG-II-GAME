/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author soldgear
 */

import Game.CCControl;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CreationWindow extends JFrame {

    private CCControl creationControl;
    private MainWindow window;
    
    /**
     * Creates new form CreationWindow
     */
    public CreationWindow(MainWindow window) {
        this.window = window;
        creationControl = new CCControl();
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        classPanel = new javax.swing.JPanel();
        warriorCheckBox = new javax.swing.JCheckBox();
        mageCheckBox = new javax.swing.JCheckBox();
        createCharButton = new javax.swing.JButton();
        assassinCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameLabel.setText("name");

        classPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("CHARACTER_CLASS"));

        warriorCheckBox.setText("Warrior");
        warriorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warriorCheckBoxActionPerformed(evt);
            }
        });

        mageCheckBox.setText("Mage");
        mageCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mageCheckBoxActionPerformed(evt);
            }
        });

        createCharButton.setText("CREATE");
        createCharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCharButtonActionPerformed(evt);
            }
        });

        assassinCheckBox.setText("Assassin");
        assassinCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assassinCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout classPanelLayout = new javax.swing.GroupLayout(classPanel);
        classPanel.setLayout(classPanelLayout);
        classPanelLayout.setHorizontalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createCharButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(classPanelLayout.createSequentialGroup()
                        .addGroup(classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assassinCheckBox)
                            .addComponent(warriorCheckBox)
                            .addComponent(mageCheckBox))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        classPanelLayout.setVerticalGroup(
            classPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warriorCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mageCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assassinCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(createCharButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addComponent(classPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void warriorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warriorCheckBoxActionPerformed
        if (warriorCheckBox.isSelected()){
            this.mageCheckBox.setSelected(false);
            this.assassinCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_warriorCheckBoxActionPerformed

    private void createCharButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCharButtonActionPerformed
        
        if (nameField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter character name.");
            return;
        }
        
        if ((mageCheckBox.isSelected() || assassinCheckBox.isSelected() || warriorCheckBox.isSelected()) == false){
            JOptionPane.showMessageDialog(null, "Please, select at least one of the options.");
            return;
        }
        
        if (warriorCheckBox.isSelected())
            window.setCharacter(creationControl.CreateWarrior(nameField.getText()));
        
        if (mageCheckBox.isSelected())
            window.setCharacter(creationControl.CreateMage(nameField.getText()));
        
        if (assassinCheckBox.isSelected())
            window.setCharacter(creationControl.CreateArcher(nameField.getText()));
        
        window.printTerminal("Character Created!");
        window.setCreationButtonDisabled();
        this.setVisible(false);
        
    }//GEN-LAST:event_createCharButtonActionPerformed

    private void mageCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mageCheckBoxActionPerformed
        if (mageCheckBox.isSelected()){
           this.warriorCheckBox.setSelected(false);
           this.assassinCheckBox.setSelected(false);
        }
        
    }//GEN-LAST:event_mageCheckBoxActionPerformed

    private void assassinCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assassinCheckBoxActionPerformed
        if (assassinCheckBox.isSelected()){
            this.warriorCheckBox.setSelected(false);
            this.mageCheckBox.setSelected(false);
        }
        
    }//GEN-LAST:event_assassinCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JCheckBox assassinCheckBox;
    private javax.swing.JPanel classPanel;
    private javax.swing.JButton createCharButton;
    private javax.swing.JCheckBox mageCheckBox;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JCheckBox warriorCheckBox;
    // End of variables declaration//GEN-END:variables
}
