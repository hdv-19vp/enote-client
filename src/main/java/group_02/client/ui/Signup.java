package group_02.client.ui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextAttribute;
import java.util.EventListener;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Admin
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        jButton.requestFocus();
        
        createacc.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
                Login fram1 = new Login();
                fram1.setVisible(true);
//                Signup.this.setVisible(false);
                Signup.this.dispose();
            }
            
            public void mouseEntered(MouseEvent e) {
                Font font = createacc.getFont();
                Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
                attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
                createacc.setFont(font.deriveFont(attributes));
            }
            
            public void mouseExited(MouseEvent e) {
                Font font = createacc.getFont();
                Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
                attributes.put(TextAttribute.UNDERLINE, -1);
                createacc.setFont(font.deriveFont(attributes));
            }
        });
        
        username.setForeground(Color.GRAY);
        
        password.setEchoChar((char)0);
        password.setForeground(Color.GRAY);
        password.setText("Password");
        
        confirm.setEchoChar((char)0);
        confirm.setForeground(Color.GRAY);
        confirm.setText("Confirm password");
        
        password.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (password.getText().length()!=0) {
                    password.setText("");
                    password.setEchoChar('*');
                    password.setForeground(Color.GRAY);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (password.getText().isEmpty()) {
                    password.setForeground(Color.GRAY);
                    password.setEchoChar((char)0);
                    password.setText("Password");
                }
            }
        });
        
        confirm.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (confirm.getText().length()!=0) {
                    confirm.setText("");
                    confirm.setEchoChar('*');
                    confirm.setForeground(Color.GRAY);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (confirm.getText().isEmpty()) {
                    confirm.setForeground(Color.GRAY);
                    confirm.setEchoChar((char)0);
                    confirm.setText("Confirm password");
                }
            }
        });
        
        username.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (username.getText().length()!=0) {
                    username.setText("");
                    username.setForeground(Color.GRAY);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (username.getText().isEmpty()) {
                    username.setForeground(Color.GRAY);
                    username.setText("Username");
                }
            }
        });
        
        Validuser.setForeground(Color.white);
        Validpass.setForeground(Color.white);
        Validconfirm.setForeground(Color.white);
        Validcheck.setForeground(Color.white);
        
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (username.getText().equals("Username")) {
                    Validuser.setForeground(Color.RED);
                }
                if (!username.getText().equals("Username")) {
                    Validuser.setForeground(Color.WHITE);
                }
                if (password.getText().equals("Password")) {
                    Validpass.setForeground(Color.RED);
                }
                if (!password.getText().equals("Password")) {

                    Validpass.setForeground(Color.WHITE);
                }

                if (confirm.getText().equals("Confirm password")) {
                    Validconfirm.setForeground(Color.RED);
                }
                if (!confirm.getText().equals("Confirm password")) {
                    Validconfirm.setForeground(Color.WHITE);
                }
                if(jCheckBox.isSelected()) {
                    Validcheck.setForeground(Color.WHITE);
                }
                if(!jCheckBox.isSelected()) {
                    Validcheck.setForeground(Color.RED);
                }
            }
        });
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Container = new javax.swing.JPanel();
        Form = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        iconuser = new javax.swing.JLabel();
        iconpass = new javax.swing.JLabel();
        jCheckBox = new javax.swing.JCheckBox();
        jButton = new javax.swing.JButton();
        Validuser = new javax.swing.JTextField();
        Validpass = new javax.swing.JTextField();
        jSeparatoruser = new javax.swing.JSeparator();
        jSeparatorpass = new javax.swing.JSeparator();
        confirm = new javax.swing.JPasswordField();
        jSeparatorconfirm = new javax.swing.JSeparator();
        Validconfirm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Validcheck = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        createacc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Form.setBackground(new java.awt.Color(255, 255, 255));
        Form.setForeground(new java.awt.Color(102, 102, 102));
        Form.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                FormComponentRemoved(evt);
            }
        });

        title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        title.setText("SIGNUP");

        username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username.setText("Username");
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password.setText("Password");
        password.setBorder(null);

        jCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox.setText("Agree to terms and conditions");
        jCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxActionPerformed(evt);
            }
        });

        jButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton.setText("SIGN UP");

        Validuser.setText("Invalid username");
        Validuser.setBorder(null);
        Validuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiduserActionPerformed(evt);
            }
        });

        Validpass.setText("Invalid password");
        Validpass.setBorder(null);
        Validpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidpassActionPerformed(evt);
            }
        });

        jSeparatoruser.setForeground(new java.awt.Color(153, 153, 153));

        jSeparatorpass.setForeground(new java.awt.Color(153, 153, 153));

        confirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        confirm.setText("Confirm password");
        confirm.setBorder(null);

        jSeparatorconfirm.setForeground(new java.awt.Color(153, 153, 153));

        Validconfirm.setText("Password error");

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\MMT\\enote-client\\src\\main\\java\\group_02\\client\\ui\\img\\icons8_checked_radio_button_20px.png")); // NOI18N
        jLabel1.setText("jLabel1");

        Validcheck.setText("You need agree to terms and conditions");
        Validcheck.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\MMT\\enote-client\\src\\main\\java\\group_02\\client\\ui\\img\\icons8_person_20px.png")); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\MMT\\enote-client\\src\\main\\java\\group_02\\client\\ui\\img\\icons8_lock_20px.png")); // NOI18N
        jLabel3.setText("jLabel3");

        jSeparator.setForeground(new java.awt.Color(204, 204, 204));

        createacc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createacc.setText("Login");

        javax.swing.GroupLayout FormLayout = new javax.swing.GroupLayout(Form);
        Form.setLayout(FormLayout);
        FormLayout.setHorizontalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormLayout.createSequentialGroup()
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(title))
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Validpass, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FormLayout.createSequentialGroup()
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addComponent(iconuser)
                                                .addGap(0, 0, 0)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(FormLayout.createSequentialGroup()
                                                .addComponent(iconpass)
                                                .addGap(0, 0, 0)
                                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, 0)
                                        .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Validconfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparatoruser)
                                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                            .addComponent(password)
                                            .addComponent(Validuser)
                                            .addComponent(jSeparatorpass)
                                            .addComponent(jSeparatorconfirm)
                                            .addComponent(confirm)))))
                            .addGroup(FormLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jCheckBox)))))
                        .addGroup(FormLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(Validcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(createacc)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        FormLayout.setVerticalGroup(
            FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparatoruser, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Validuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconpass)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jSeparatorpass, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Validpass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, 0)
                .addComponent(jSeparatorconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Validconfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox)
                .addGap(0, 0, 0)
                .addComponent(Validcheck)
                .addGap(5, 5, 5)
                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(createacc)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FormComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_FormComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_FormComponentRemoved

    private void ValidpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValidpassActionPerformed

    private void ValiduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiduserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValiduserActionPerformed

    private void jCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameKeyPressed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel Form;
    private javax.swing.JLabel Validcheck;
    private javax.swing.JLabel Validconfirm;
    private javax.swing.JTextField Validpass;
    private javax.swing.JTextField Validuser;
    private javax.swing.JPasswordField confirm;
    private javax.swing.JLabel createacc;
    private javax.swing.JLabel iconpass;
    private javax.swing.JLabel iconuser;
    private javax.swing.JButton jButton;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparatorconfirm;
    private javax.swing.JSeparator jSeparatorpass;
    private javax.swing.JSeparator jSeparatoruser;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel title;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
