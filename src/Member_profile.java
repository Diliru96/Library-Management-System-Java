
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diliru
 */
public class Member_profile extends javax.swing.JFrame {

    String user;
   // private String currentUser;
    
    /**
     * Creates new form profile_JFrame
     */
    public Member_profile() {
        initComponents();
    }

    Member_profile(String UserCurrent) {
        this.user=UserCurrent;
        
        initComponents();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOldId = new javax.swing.JLabel();
        lblOldUserName = new javax.swing.JLabel();
        lblOldFirstName = new javax.swing.JLabel();
        lblOldLastName = new javax.swing.JLabel();
        lblOldPassword = new javax.swing.JLabel();
        lblOldBday = new javax.swing.JLabel();
        lblOldAddress = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnOkay = new javax.swing.JButton();
        lblOldId1 = new javax.swing.JLabel();
        lblOldFirstName1 = new javax.swing.JLabel();
        lblOldLastName1 = new javax.swing.JLabel();
        lblOldPassword1 = new javax.swing.JLabel();
        lblOldBday1 = new javax.swing.JLabel();
        lblOldAddress1 = new javax.swing.JLabel();

        lblOldId.setForeground(new java.awt.Color(255, 255, 255));
        lblOldId.setText("jLabel7");

        lblOldUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblOldUserName.setText("jLabel1");

        lblOldFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblOldFirstName.setText("jLabel2");

        lblOldLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblOldLastName.setText("jLabel3");

        lblOldPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblOldPassword.setText("jLabel4");

        lblOldBday.setForeground(new java.awt.Color(255, 255, 255));
        lblOldBday.setText("jLabel5");

        lblOldAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblOldAddress.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        lblTitle.setText("Profile");

        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblMinimize.setText("-");
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addGap(18, 18, 18)
                .addComponent(lblClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitle)
                        .addComponent(lblClose))
                    .addComponent(lblMinimize, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        btnOkay.setText("Okay");
        btnOkay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkayMouseClicked(evt);
            }
        });

        lblOldId1.setForeground(new java.awt.Color(255, 255, 255));
        lblOldId1.setText("jLabel7");

        lblOldFirstName1.setForeground(new java.awt.Color(255, 255, 255));
        lblOldFirstName1.setText("jLabel2");

        lblOldLastName1.setForeground(new java.awt.Color(255, 255, 255));
        lblOldLastName1.setText("jLabel3");

        lblOldPassword1.setForeground(new java.awt.Color(255, 255, 255));
        lblOldPassword1.setText("jLabel4");

        lblOldBday1.setForeground(new java.awt.Color(255, 255, 255));
        lblOldBday1.setText("jLabel5");

        lblOldAddress1.setForeground(new java.awt.Color(255, 255, 255));
        lblOldAddress1.setText("jLabel6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 253, Short.MAX_VALUE)
                        .addComponent(btnOkay))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOldFirstName1)
                            .addComponent(lblOldLastName1)
                            .addComponent(lblOldPassword1)
                            .addComponent(lblOldBday1)
                            .addComponent(lblOldAddress1)
                            .addComponent(lblOldId1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblOldId1)
                .addGap(26, 26, 26)
                .addComponent(lblOldFirstName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOldLastName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOldPassword1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOldBday1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOldAddress1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnOkay)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void btnOkayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkayMouseClicked

                Member_home home= new Member_home(user);
                home.setVisible(true);
                home.pack();
                home.setLocationRelativeTo(null);
               home.lblHomeUserName.setText("Welcome  "+user);
                home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
                
               
    }//GEN-LAST:event_btnOkayMouseClicked

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
            java.util.logging.Logger.getLogger(Member_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member_profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMinimize;
    public javax.swing.JLabel lblOldAddress;
    public javax.swing.JLabel lblOldAddress1;
    public javax.swing.JLabel lblOldBday;
    public javax.swing.JLabel lblOldBday1;
    public javax.swing.JLabel lblOldFirstName;
    public javax.swing.JLabel lblOldFirstName1;
    public javax.swing.JLabel lblOldId;
    public javax.swing.JLabel lblOldId1;
    public javax.swing.JLabel lblOldLastName;
    public javax.swing.JLabel lblOldLastName1;
    public javax.swing.JLabel lblOldPassword;
    public javax.swing.JLabel lblOldPassword1;
    public javax.swing.JLabel lblOldUserName;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}