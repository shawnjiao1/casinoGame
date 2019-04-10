/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.util.Random;

/**
 *
 * @author Shawn The Sexy Beast
 */
public class BlackJack extends javax.swing.JFrame {

    String[] card = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] suites = {"Hearts", "Spades", "Clubs", "Diamonds"};

    Random random = new Random();

    int deal = 0;
    int play = 0;

    String result;

    public BlackJack() {
        initComponents();
        balanceLabel.setText("Balance: " + CASINO.userList.get(CASINO.currentUserIndex).balance);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hitButton = new javax.swing.JButton();
        stayButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsArea = new javax.swing.JTextArea();
        betField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bal.setBackground(new java.awt.Color(102, 153, 255));
        bal.setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setText("Black Jack");

        hitButton.setText("HIT");
        hitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitButtonActionPerformed(evt);
            }
        });

        stayButton.setText("STAY");
        stayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stayButtonActionPerformed(evt);
            }
        });

        jButton3.setText("BET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        resultsArea.setColumns(20);
        resultsArea.setRows(5);
        jScrollPane1.setViewportView(resultsArea);

        betField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("ENTER BET ");

        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        balanceLabel.setText("  ");

        javax.swing.GroupLayout balLayout = new javax.swing.GroupLayout(bal);
        bal.setLayout(balLayout);
        balLayout.setHorizontalGroup(
            balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, balLayout.createSequentialGroup()
                .addGroup(balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1))
                    .addGroup(balLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(balLayout.createSequentialGroup()
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stayButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(betField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3)
                    .addComponent(balanceLabel))
                .addGap(19, 19, 19))
        );
        balLayout.setVerticalGroup(
            balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, balLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stayButton)
                    .addComponent(hitButton)
                    .addComponent(startButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balLayout.createSequentialGroup()
                        .addGroup(balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(betField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(balanceLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitButtonActionPerformed

        if (play < 21) {
            int randomCard = getCard();
            int randomSuite = getSuite();
            if (randomCard == 0) {
                play += 11;
            } else if (randomCard >= 10) {
                play += 10;
            } else {
                play += randomCard + 1;
            }
            result += "\nThe player got a card: " + card[randomCard] + " of " + suites[randomSuite];

            resultsArea.setText(result);
        }

        checkWin();
    }//GEN-LAST:event_hitButtonActionPerformed

    private int getCard() {
        return random.nextInt((12 - 0) + 1) + 0;
    }

    private int getSuite() {
        return random.nextInt((3 - 0) + 1) + 0;
    }

    private void checkWin() {
        if (play == 21) {
            play = 0;
            result += "The player won!!\n";
            CASINO.userList.get(CASINO.currentUserIndex).balance += beting() * 2;
            balanceLabel.setText("Balance: " + CASINO.userList.get(CASINO.currentUserIndex).balance);
            resultsArea.setText(result);
        } else if (play > 21) {
            play = 0;
            result += "The player lost!!\n";
            resultsArea.setText(result);
        }
    }

    private int beting() {
        return Integer.parseInt(betField.getText());
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int bet = beting();

        if (CASINO.userList.get(CASINO.currentUserIndex).balance <= 0) {
            resultsArea.setText("you have insufficient funds lol");
        } else if (CASINO.userList.get(CASINO.currentUserIndex).balance < bet) {
            resultsArea.setText("you have insufficient funds lol");
        } else {
            resultsArea.setText("You have made your bet!");
            CASINO.userList.get(CASINO.currentUserIndex).balance -= bet;
            balanceLabel.setText("Balance: " + CASINO.userList.get(CASINO.currentUserIndex).balance);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void betFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betFieldActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        int randomCard = 0;
        int randomSuite = 0;
        //step 1: dealer only get two cards
        for (int i = 0; i < 2; i++) {
            randomCard = getCard();
            randomSuite = getSuite();
            if (randomCard == 0) {
                deal += 11;

            } else if (randomCard >= 10) {
                deal += 10;
            } else {
                deal += randomCard + 1;
            }
        }
        // to do 1: display value of randomCard
        result = "The dealer drew 2 cards one of them is the " + card[randomCard] + " of " + suites[randomSuite] + "\n";
        resultsArea.setText(result);

        // step 2: player get two cards
        for (int i = 0; i < 2; i++) {
            randomCard = getCard();
            randomSuite = getSuite();
            if (randomCard == 0) {
                play += 11;

            } else if (randomCard >= 10) {
                play += 10;
            } else {
                play += randomCard + 1;
            }
            // to do 2: display the player i+1 randomCard
            result += "The player got a card: " + card[randomCard] + " of " + suites[randomSuite] + "\n";

            resultsArea.setText(result);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void stayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stayButtonActionPerformed
        if (play - 21 > deal - 21) {
            play = 0;
            resultsArea.setText("The player won!!\n");
            balanceLabel.setText("Balance: " + CASINO.userList.get(CASINO.currentUserIndex).balance + "\n");
            CASINO.userList.get(CASINO.currentUserIndex).balance += beting() * 2;
        } else {
            play = 0;
            resultsArea.setText("The player lost!!\n");
        }
    }//GEN-LAST:event_stayButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bal;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JTextField betField;
    private javax.swing.JButton hitButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultsArea;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stayButton;
    // End of variables declaration//GEN-END:variables
}
