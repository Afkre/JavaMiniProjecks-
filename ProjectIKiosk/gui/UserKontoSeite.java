package guI;

import guI.settings.ActionSetting;
import guI.settings.ButtonSetting;
import guI.settings.InterfaceEditor;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;


public class UserKontoSeite extends javax.swing.JFrame implements InterfaceEditor {

    /**
     * Creates new form UserKontoSeite
     */
    public UserKontoSeite() {
        initComponents();
        getEdits();
    }


    @SuppressWarnings("unchecked")

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        user_konto_panel.setFocusable(true);
    } 
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        user_konto_panel = new javax.swing.JPanel();
        willkommen_label = new javax.swing.JLabel();
        user_vor_nachname_label = new javax.swing.JLabel();
        abflug_icon = new javax.swing.JLabel();
        abflug_text = new javax.swing.JLabel();
        uhr_label = new javax.swing.JLabel();
        datum_icon = new javax.swing.JLabel();
        ankunft_icon = new javax.swing.JLabel();
        uhr_icon = new javax.swing.JLabel();
        kontrollbitte_label1 = new javax.swing.JLabel();
        ankunft_label = new javax.swing.JLabel();
        datum_label = new javax.swing.JLabel();
        datum_text = new javax.swing.JLabel();
        uhr_text = new javax.swing.JLabel();
        abflug_label = new javax.swing.JLabel();
        ankunft_text = new javax.swing.JLabel();
        kontrollfrage_label = new javax.swing.JLabel();
        accept1_button = new javax.swing.JButton();
        accept_icon = new javax.swing.JLabel();
        exit_icon1 = new javax.swing.JLabel();
        setting_icon10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Konto Seite");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_konto_panel.setBackground(new java.awt.Color(153, 255, 255));
        user_konto_panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        user_konto_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        willkommen_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        willkommen_label.setForeground(new java.awt.Color(51, 102, 255));
        willkommen_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        willkommen_label.setText("Willkommen beim I-Kiosk-System für Bordkarten");
        user_konto_panel.add(willkommen_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 33, 600, 30));

        user_vor_nachname_label.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        user_vor_nachname_label.setForeground(new java.awt.Color(51, 102, 255));
        user_vor_nachname_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_vor_nachname_label.setText("[USER VORNAME NACHNAME]");
        user_konto_panel.add(user_vor_nachname_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 800, 50));

        abflug_icon.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        abflug_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guI/icons/abflug_icon.png"))); // NOI18N
        user_konto_panel.add(abflug_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 216, -1, -1));

        abflug_text.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        abflug_text.setText("[Abflug]");
        user_konto_panel.add(abflug_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 234, 400, -1));

        uhr_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        uhr_label.setForeground(new java.awt.Color(51, 51, 51));
        uhr_label.setText("Uhr");
        user_konto_panel.add(uhr_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 501, -1, -1));

        datum_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Documents\\NetBeansProjects\\ProjeckIKiosk\\src\\guI\\icons\\datum.png")); // NOI18N
        user_konto_panel.add(datum_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 414, 58, 61));

        ankunft_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Documents\\NetBeansProjects\\ProjeckIKiosk\\src\\guI\\icons\\ankunft_icon.png")); // NOI18N
        user_konto_panel.add(ankunft_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 307, -1, -1));

        uhr_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Documents\\NetBeansProjects\\ProjeckIKiosk\\src\\guI\\icons\\uhr_icon2.png")); // NOI18N
        user_konto_panel.add(uhr_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 501, 58, 61));

        kontrollbitte_label1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kontrollbitte_label1.setForeground(new java.awt.Color(51, 102, 255));
        kontrollbitte_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kontrollbitte_label1.setText("Bitte überprüfen Sie die folgenden Informationen");
        user_konto_panel.add(kontrollbitte_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 149, 600, 30));

        ankunft_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ankunft_label.setForeground(new java.awt.Color(51, 51, 51));
        ankunft_label.setText("Ankunft");
        user_konto_panel.add(ankunft_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 325, -1, -1));

        datum_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        datum_label.setForeground(new java.awt.Color(51, 51, 51));
        datum_label.setText("Datum");
        user_konto_panel.add(datum_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 422, -1, -1));

        datum_text.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        datum_text.setText("[Datum]");
        user_konto_panel.add(datum_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 422, 400, -1));

        uhr_text.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        uhr_text.setText("[Uhr]");
        user_konto_panel.add(uhr_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 501, 400, -1));

        abflug_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        abflug_label.setForeground(new java.awt.Color(51, 51, 51));
        abflug_label.setText("Abflug");
        user_konto_panel.add(abflug_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 234, -1, -1));

        ankunft_text.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ankunft_text.setText("[Ankunft]");
        user_konto_panel.add(ankunft_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 325, 400, -1));

        kontrollfrage_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        kontrollfrage_label.setForeground(new java.awt.Color(51, 102, 255));
        kontrollfrage_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kontrollfrage_label.setText("Haben Sie die Informationen überprüft?");
        user_konto_panel.add(kontrollfrage_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 608, 450, 30));

        accept1_button.setBackground(new java.awt.Color(255, 204, 204));
        accept1_button.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        accept1_button.setText("OK");
        accept1_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accept1_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accept1_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accept1_buttonMouseExited(evt);
            }
        });
        accept1_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accept1_buttonActionPerformed(evt);
            }
        });
        user_konto_panel.add(accept1_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(686, 591, -1, 64));

        accept_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Documents\\NetBeansProjects\\ProjeckIKiosk\\src\\guI\\icons\\accept_icon5.png")); // NOI18N
        user_konto_panel.add(accept_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 591, -1, -1));

        exit_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guI/icons/exit_icon.png"))); // NOI18N
        exit_icon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_icon1MouseClicked(evt);
            }
        });
        user_konto_panel.add(exit_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 40));

        setting_icon10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Documents\\NetBeansProjects\\ProjeckIKiosk\\src\\guI\\icons\\setting_icon3.png")); // NOI18N
        setting_icon10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setting_icon10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setting_icon10MouseClicked(evt);
            }
        });
        user_konto_panel.add(setting_icon10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 50, -1));

        getContentPane().add(user_konto_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 710));

        pack();
    }// </editor-fold>                        
    
   
    
    private void accept1_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        ActionSetting.setVisible(this, new FrageSeite());
    }                                              
   
    private void accept1_buttonMouseEntered(java.awt.event.MouseEvent evt) {                                            
        this.setBgFg(evt.getComponent());
    }                                           

    private void accept1_buttonMouseExited(java.awt.event.MouseEvent evt) {                                           
        ButtonSetting.setOriginalBgFg((JButton)evt.getComponent());
    }                                          

    private void exit_icon1MouseClicked(java.awt.event.MouseEvent evt) {                                        
        ActionSetting.setVisible(this, new Startbildschrim());
    }                                       

    private void setting_icon10MouseClicked(java.awt.event.MouseEvent evt) {                                            
        ActionSetting.setVisible(this, new Setting());
    }                                           
    
    
    
    public void setBgFg(Component c){
        ButtonSetting.setBgFg((JButton) c, Color.black, Color.white);
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
            java.util.logging.Logger.getLogger(UserKontoSeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserKontoSeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserKontoSeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserKontoSeite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserKontoSeite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel abflug_icon;
    private javax.swing.JLabel abflug_label;
    private javax.swing.JLabel abflug_text;
    private javax.swing.JButton accept1_button;
    private javax.swing.JLabel accept_icon;
    private javax.swing.JLabel ankunft_icon;
    private javax.swing.JLabel ankunft_label;
    private javax.swing.JLabel ankunft_text;
    private javax.swing.JLabel datum_icon;
    private javax.swing.JLabel datum_label;
    private javax.swing.JLabel datum_text;
    private javax.swing.JLabel exit_icon1;
    private javax.swing.JLabel kontrollbitte_label1;
    private javax.swing.JLabel kontrollfrage_label;
    private javax.swing.JLabel setting_icon10;
    private javax.swing.JLabel uhr_icon;
    private javax.swing.JLabel uhr_label;
    private javax.swing.JLabel uhr_text;
    private javax.swing.JPanel user_konto_panel;
    private javax.swing.JLabel user_vor_nachname_label;
    private javax.swing.JLabel willkommen_label;
    // End of variables declaration                   
}
