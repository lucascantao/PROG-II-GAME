
package Interface;

import Game.CCControl;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CCWindow extends JFrame {

    private final CCControl creationControl;
    private final MainWindow window;
    

    public CCWindow(MainWindow window) {
        this.window = window;
        creationControl = new CCControl(window);
        initComponents();
        setTitle("Criação de Personagem");
        setLocation(450, 200);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classPanel = new javax.swing.JPanel();
        warriorCheckBox = new javax.swing.JCheckBox();
        mageCheckBox = new javax.swing.JCheckBox();
        assassinCheckBox = new javax.swing.JCheckBox();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        createCharButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        classPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Classe"));

        warriorCheckBox.setText("Lutador");
        warriorCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warriorCheckBoxActionPerformed(evt);
            }
        });

        mageCheckBox.setText("Mago");
        mageCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mageCheckBoxActionPerformed(evt);
            }
        });

        assassinCheckBox.setText("Arqueiro");
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
                    .addComponent(assassinCheckBox)
                    .addComponent(warriorCheckBox)
                    .addComponent(mageCheckBox))
                .addContainerGap(41, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nameLabel.setText("Nome");

        createCharButton.setText("CREATE");
        createCharButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCharButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(createCharButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 86, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(classPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createCharButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assassinCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assassinCheckBoxActionPerformed
        if (assassinCheckBox.isSelected()){
            this.warriorCheckBox.setSelected(false);
            this.mageCheckBox.setSelected(false);
        }

    }//GEN-LAST:event_assassinCheckBoxActionPerformed

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

        this.setVisible(false);
        window.updateDisplay();
        window.toFront();
        window.setVisible(true);

    }//GEN-LAST:event_createCharButtonActionPerformed

    private void mageCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mageCheckBoxActionPerformed
        if (mageCheckBox.isSelected()){
            this.warriorCheckBox.setSelected(false);
            this.assassinCheckBox.setSelected(false);
        }

    }//GEN-LAST:event_mageCheckBoxActionPerformed

    private void warriorCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warriorCheckBoxActionPerformed
        if (warriorCheckBox.isSelected()){
            this.mageCheckBox.setSelected(false);
            this.assassinCheckBox.setSelected(false);
        }
    }//GEN-LAST:event_warriorCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox assassinCheckBox;
    private javax.swing.JPanel classPanel;
    private javax.swing.JButton createCharButton;
    private javax.swing.JCheckBox mageCheckBox;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JCheckBox warriorCheckBox;
    // End of variables declaration//GEN-END:variables
}
