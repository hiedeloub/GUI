
import config.dbConnector;
import java.awt.BasicStroke;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import static jdk.nashorn.internal.parser.TokenType.IF;
import static sun.java2d.cmm.ColorTransform.In;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vilma Gaming
 */
public class REGISTRATIONF extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public REGISTRATIONF() {
        initComponents();
    }
    public static String email, usern;
     public boolean duplicateCheack(){
         dbConnector dbc = new dbConnector();
         try{
<<<<<<< HEAD
             String query = "SELECT * FROM tbl_user WHERE u_email = '"+em.getText()+ "'";
=======
             String query = "SELECT * FROM tbl_user WHERE u_email = '"+em.getText()+"' OR u_user = '"+usrn.getText()+"'";
>>>>>>> 61408eb2a7ae18f8add68beba58a1de6f30bf05e
            ResultSet resultSet = dbc.getData(query);
            
           if(resultSet.next()){
               
               email = resultSet.getString("u_email");
               System.out.println(""+email);
               if(email.equals(em.getText())){
                   JOptionPane.showMessageDialog(null,"Email is Already Used!"); 
                   em.setText("");
               }
               usern = resultSet.getString("u_user");
               System.out.println(""+usern);
               if(usern.equals(usrn.getText())){
                   JOptionPane.showMessageDialog(null,"User is Already Used!"); 
                   usrn.setText("");
               }
               return true;
           }else{
               return false;
           }
        }catch (SQLException ex){
            System.out.println(""+ex);
            return false; 
         }
     }
    
    Color hover=new Color(0,102,102);
    Color defbutton=new Color(0,102,102);
    
    Border empty=BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
        panel.setBackground(hover);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        
    }
    
    void buttonDefaultColor(JPanel panel){
        panel.setBackground(defbutton);
        panel.setBorder(empty);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exits = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IMAGE = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FN = new javax.swing.JTextField();
        REGS = new javax.swing.JPanel();
        H = new javax.swing.JLabel();
        usrn = new javax.swing.JTextField();
        CANS = new javax.swing.JPanel();
        CANSS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        fn = new javax.swing.JLabel();
        emel = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        utype = new javax.swing.JComboBox<>();
        passw = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("WELCOME TO PET ADOPTION SYSTEM!");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 11, 435, 58));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("—");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        exits.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        exits.setText("X");
        exits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitsMouseClicked(evt);
            }
        });
        jPanel6.add(exits, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, -1, -1));

        jPanel1.add(jPanel6);
        jPanel6.setBounds(0, 0, 760, 80);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IMAGE.setBackground(new java.awt.Color(0, 102, 102));
        IMAGE.setForeground(new java.awt.Color(0, 102, 102));
        IMAGE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Pink and Black Simple Pet Shop Logo.png"))); // NOI18N
        jPanel2.add(IMAGE, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 80, 410, 400));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 310, 480);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTER");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 120, 30));

        FN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        FN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(FN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 200, 30));

        REGS.setBackground(new java.awt.Color(0, 102, 102));
        REGS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REGSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REGSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REGSMouseExited(evt);
            }
        });

        H.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H.setText("REGISTER");

        javax.swing.GroupLayout REGSLayout = new javax.swing.GroupLayout(REGS);
        REGS.setLayout(REGSLayout);
        REGSLayout.setHorizontalGroup(
            REGSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(H, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        REGSLayout.setVerticalGroup(
            REGSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(H, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(REGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 80, 30));

        usrn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        usrn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(usrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 200, 30));

        CANS.setBackground(new java.awt.Color(0, 102, 102));
        CANS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CANSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CANSMouseExited(evt);
            }
        });

        CANSS.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CANSS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CANSS.setText("CANCEL");

        javax.swing.GroupLayout CANSLayout = new javax.swing.GroupLayout(CANS);
        CANS.setLayout(CANSLayout);
        CANSLayout.setHorizontalGroup(
            CANSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CANSS, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        CANSLayout.setVerticalGroup(
            CANSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CANSS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(CANS, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Already Have an Account? Click Here to Login");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        em.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 200, 30));

        fn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        fn.setForeground(new java.awt.Color(255, 255, 255));
        fn.setText("Full Name:");
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 30));

        emel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        emel.setForeground(new java.awt.Color(255, 255, 255));
        emel.setText("Email:");
        jPanel3.add(emel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 30));

        user.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("User:");
        jPanel3.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, 30));

        pass.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Password:");
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 30));

        type.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setText("Account Type:");
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, 30));

        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User", " " }));
        jPanel3.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 200, 30));

        passw.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(passw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 200, 30));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(310, 0, 450, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitsMouseClicked
       System.exit(0);
    }//GEN-LAST:event_exitsMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
     LOGIN lf=new LOGIN();
     lf.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void CANSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANSMouseExited
        buttonDefaultColor(CANS);
    }//GEN-LAST:event_CANSMouseExited

    private void CANSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANSMouseEntered
        buttonBorderAnimation(CANS);
    }//GEN-LAST:event_CANSMouseEntered

    private void REGSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGSMouseExited
        buttonDefaultColor(REGS);
    }//GEN-LAST:event_REGSMouseExited

    private void REGSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGSMouseEntered
        buttonBorderAnimation(REGS);
    }//GEN-LAST:event_REGSMouseEntered

    private void REGSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REGSMouseClicked
       if(FN.getText().isEmpty()||em.getText().isEmpty()||usrn.getText().isEmpty()||passw.getText().isEmpty() ){
        JOptionPane.showMessageDialog(null,"All Fields are Required"); 
       }else{if(passw.getText().length() < 8){
         JOptionPane.showMessageDialog(null,"Password character should be 8 above");
         passw.setText("");
     }else if(duplicateCheack()){
             System.out.println("Duplicate Exist");
       }else{
        dbConnector dbc = new dbConnector();
        if(dbc.insertData("INSERT INTO tbl_user (u_name, u_email, u_user, u_password, u_type, u_status)"
                + "VALUES('"+FN.getText()+"', '"+em.getText()+"', '"+usrn.getText()+"', '"+passw.getText()+"', '"+utype.getSelectedItem()+"', 'Pending')"))
        {
           JOptionPane.showMessageDialog(null,"Inserted Success!"); 
             LOGIN lf=new LOGIN();
             lf.setVisible(true);
             this.dispose();
        }else{
          JOptionPane.showMessageDialog(null,"Registration Error"); 
        }  
       }
       }
<<<<<<< HEAD
    
=======
>>>>>>> 61408eb2a7ae18f8add68beba58a1de6f30bf05e
    }//GEN-LAST:event_REGSMouseClicked

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CANS;
    private javax.swing.JLabel CANSS;
    private javax.swing.JTextField FN;
    private javax.swing.JLabel H;
    private javax.swing.JLabel IMAGE;
    private javax.swing.JPanel REGS;
    private javax.swing.JTextField em;
    private javax.swing.JLabel emel;
    private javax.swing.JLabel exits;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel pass;
    private javax.swing.JTextField passw;
    private javax.swing.JLabel type;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usrn;
    private javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
