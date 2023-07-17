package ProjectIKiosk.guI;




import database.DbConnection;
import guI.settings.ActionSetting;
import guI.settings.ButtonSetting;
import guI.settings.InterfaceEditor;
import guI.settings.TextSetting;
import java.awt.Color;


public final class Startbildschrim extends javax.swing.JFrame implements InterfaceEditor {

    private final String USER_ID_ORIGINAL = "User ID";
    private final String PASSWORD_TEXT_ORIGINAL = "**********";
    
    public Startbildschrim() {
        initComponents();
        getEdits();
        new DbConnection();
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        einloggin_panel = new javax.swing.JPanel();
        willkommen_label = new javax.swing.JLabel();
        user_id_field = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        user_id_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        register_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("I-Kiosk Bordkart System Startseite");

        einloggin_panel.setBackground(new java.awt.Color(153, 204, 255));

        willkommen_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        willkommen_label.setForeground(new java.awt.Color(0, 0, 255));
        willkommen_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        willkommen_label.setText("Willkommen bei I-Kiosk System");

        user_id_field.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_id_field.setForeground(new java.awt.Color(153, 153, 153));
        user_id_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user_id_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_id_fieldFocusLost(evt);
            }
        });
        user_id_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_id_fieldActionPerformed(evt);
            }
        });

        password_field.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password_field.setForeground(new java.awt.Color(153, 153, 153));
        password_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_fieldFocusLost(evt);
            }
        });

        user_id_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_id_label.setForeground(new java.awt.Color(0, 51, 255));
        user_id_label.setText("User ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Password");

        register_button.setBackground(new java.awt.Color(204, 204, 255));
        register_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register_button.setText("Register");
        register_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        register_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                register_buttonMouseExited(evt);
            }
        });
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        login_button.setBackground(new java.awt.Color(255, 204, 204));
        login_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login_button.setText("Login");
        login_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_buttonMouseExited(evt);
            }
        });
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        register_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        register_label.setForeground(new java.awt.Color(255, 0, 0));
        register_label.setText("Bitte registrieren Sie sich, wenn Sie noch kein Konto haben");

        javax.swing.GroupLayout einloggin_panelLayout = new javax.swing.GroupLayout(einloggin_panel);
        einloggin_panel.setLayout(einloggin_panelLayout);
        einloggin_panelLayout.setHorizontalGroup(
            einloggin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einloggin_panelLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(einloggin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(willkommen_label, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(einloggin_panelLayout.createSequentialGroup()
                        .addComponent(user_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(user_id_field, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                    .addGroup(einloggin_panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(password_field))
                    .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_label))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        einloggin_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {password_field, register_label, user_id_field});

        einloggin_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, user_id_label});

        einloggin_panelLayout.setVerticalGroup(
            einloggin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(einloggin_panelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(willkommen_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(einloggin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(einloggin_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(register_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        einloggin_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {login_button, password_field, register_button, register_label, user_id_field});

        einloggin_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, user_id_label});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(einloggin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(einloggin_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        einloggin_panel.setFocusable(true);
        user_id_field.setText(USER_ID_ORIGINAL);
        password_field.setText(PASSWORD_TEXT_ORIGINAL);
        TextSetting.setOnlyNumber(user_id_field);
    }
    
    
    private void user_id_fieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    }                                             

    //Button Färbung

    private void login_buttonMouseEntered(java.awt.event.MouseEvent evt) {                                          
        ButtonSetting.setBgFg(login_button, Color.cyan, Color.blue);
    }                                         

    private void login_buttonMouseExited(java.awt.event.MouseEvent evt) {                                         
        ButtonSetting.setOriginalBgFg(login_button);
    }                                        

    private void register_buttonMouseEntered(java.awt.event.MouseEvent evt) {                                             
        ButtonSetting.setBgFg(register_button, Color.magenta, Color.green);
    }                                            

    private void register_buttonMouseExited(java.awt.event.MouseEvent evt) {                                            
        ButtonSetting.setOriginalBgFg(register_button);
    }                                           
    

    //Fokussierungsoperationen für den Textbereich
    private void user_id_fieldFocusGained(java.awt.event.FocusEvent evt) {                                          
        TextSetting.chechTheTextFocusGained(user_id_field, USER_ID_ORIGINAL);
    }                                         

    private void user_id_fieldFocusLost(java.awt.event.FocusEvent evt) {                                        
        TextSetting.checkTheTextFocusLost(user_id_field);
    }                                       

    private void password_fieldFocusGained(java.awt.event.FocusEvent evt) {                                           
        TextSetting.chechTheTextFocusGained(password_field, PASSWORD_TEXT_ORIGINAL);
    }                                          

    private void password_fieldFocusLost(java.awt.event.FocusEvent evt) {                                         
        TextSetting.checkTheTextFocusLost(password_field);
    }                                        
    
    
    //Button actions
    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        ActionSetting.setVisible(this, new UserKontoSeite());
    }                                            

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        ActionSetting.setVisible(this, new Register());
    }                                               

    
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
            java.util.logging.Logger.getLogger(Startbildschrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startbildschrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startbildschrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startbildschrim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startbildschrim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel einloggin_panel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel register_label;
    private javax.swing.JTextField user_id_field;
    private javax.swing.JLabel user_id_label;
    private javax.swing.JLabel willkommen_label;
    // End of variables declaration                   
}
