/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author doliver17
 */
public class RestaurantReviewer extends javax.swing.JFrame {
    private static ReviewManager RR = new ReviewManager();

    /**
     * Creates new form RestaurantReviewer
     */
    public RestaurantReviewer() {
        initComponents();
        RR.Read();
        DisplayInitial();
    }
    
    public void DisplayInitial() {
        Iterator<Map.Entry<Restaurant, String>> iterator = RR.GetMap().entrySet().iterator();
        String Reviews = "";
        while(iterator.hasNext()) {
            Map.Entry<Restaurant, String> rest = iterator.next();
            Reviews += rest.getKey().toString() + "\n" + "Notes: " + rest.getValue() + "\n";
        }
        AllReviews.setText(Reviews);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Notes1 = new javax.swing.JTextArea();
        NameLabel = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        FiveStarRating = new javax.swing.JSlider();
        FSRLabel = new javax.swing.JLabel();
        NotesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Notes = new javax.swing.JTextArea();
        AddRest = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AllReviews = new javax.swing.JTextArea();
        NotesLabel1 = new javax.swing.JLabel();

        Notes1.setColumns(20);
        Notes1.setRows(5);
        jScrollPane2.setViewportView(Notes1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RestaurantReviewManager");

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(0, 0, 204));
        NameLabel.setText("Restaurant Name");

        AddressLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddressLabel.setForeground(new java.awt.Color(0, 0, 204));
        AddressLabel.setText("Restaurant Address");

        FiveStarRating.setForeground(new java.awt.Color(0, 0, 0));
        FiveStarRating.setMaximum(5);
        FiveStarRating.setMinimum(1);
        FiveStarRating.setMinorTickSpacing(1);
        FiveStarRating.setPaintLabels(true);
        FiveStarRating.setPaintTicks(true);
        FiveStarRating.setSnapToTicks(true);
        FiveStarRating.setToolTipText("Rate 1 - 5");

        FSRLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        FSRLabel.setForeground(new java.awt.Color(0, 0, 204));
        FSRLabel.setText("Five Star Rating");

        NotesLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NotesLabel.setText("Restaurant Notes");

        Notes.setColumns(20);
        Notes.setRows(5);
        jScrollPane1.setViewportView(Notes);

        AddRest.setForeground(new java.awt.Color(0, 0, 204));
        AddRest.setText("Add Restaurant");
        AddRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddRestActionPerformed(evt);
            }
        });

        AllReviews.setColumns(20);
        AllReviews.setRows(5);
        jScrollPane3.setViewportView(AllReviews);

        NotesLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NotesLabel1.setText("All Restaurant Reviews");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(AddRest)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(FiveStarRating, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(FSRLabel)
                                .addGap(52, 52, 52))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NotesLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                                .addComponent(NotesLabel)
                                .addComponent(jScrollPane3)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel)
                            .addComponent(AddressLabel)
                            .addComponent(FSRLabel))
                        .addGap(18, 18, 18)
                        .addComponent(FiveStarRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(NotesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddRest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(NotesLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddRestActionPerformed
        String notes = Notes.getText();
        String Details = "Name: " + Name.getText() + "     Address: " + Address.getText() + "     Rating: " + FiveStarRating.getValue();
        RR.AddRestaurant(new Restaurant(Details), notes); 
        RR.Write();
        DisplayInitial();
    }//GEN-LAST:event_AddRestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RestaurantReviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestaurantReviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestaurantReviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestaurantReviewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestaurantReviewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddRest;
    private javax.swing.JTextField Address;
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextArea AllReviews;
    private javax.swing.JLabel FSRLabel;
    private javax.swing.JSlider FiveStarRating;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextArea Notes;
    private javax.swing.JTextArea Notes1;
    private javax.swing.JLabel NotesLabel;
    private javax.swing.JLabel NotesLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}