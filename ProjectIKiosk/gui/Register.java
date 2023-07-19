package guI;

import guI.settings.ActionSetting;
import guI.settings.ButtonSetting;
import guI.settings.InterfaceEditor;
import guI.settings.TextSetting;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame implements InterfaceEditor {

   
    public Register() {
        initComponents();
        getEdits();
        TextSetting.setOnlyAlphabetic(user_vor_nachname_text_field);
        TextSetting.setOnlyNumber(user_id_text_field);
        TextSetting.setOnlyNumber(user_telefon_no_text_field);
        TextSetting.setMaxLimit(user_id_text_field, 11);
        TextSetting.setMaxLimit(user_telefon_no_text_field, 11);
        
    }
   
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        register_panel = new javax.swing.JPanel();
        informationen_sicherheit_label = new javax.swing.JLabel();
        user_vor_nachname_label = new javax.swing.JLabel();
        user_vor_nachname_text_field = new javax.swing.JTextField();
        user_id_label = new javax.swing.JLabel();
        user_id_text_field = new javax.swing.JTextField();
        user_telefon_no_label = new javax.swing.JLabel();
        user_telefon_no_text_field = new javax.swing.JTextField();
        informationen_person_label = new javax.swing.JLabel();
        sicherheit_frage_label = new javax.swing.JLabel();
        sicherheit_frage_text_field = new javax.swing.JComboBox<>();
        sicherheit_antwort_label = new javax.swing.JLabel();
        sicherheit_antwort_text_field = new javax.swing.JTextField();
        register_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("I-Kiosk Bordkart System Registerseite");

        register_panel.setBackground(new java.awt.Color(204, 255, 204));

        informationen_sicherheit_label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        informationen_sicherheit_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        informationen_sicherheit_label.setText("Informationen zur Sicherheit");

        user_vor_nachname_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_vor_nachname_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user_vor_nachname_label.setText("Vor-und Nachname :");

        user_vor_nachname_text_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        user_id_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_id_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user_id_label.setText("User ID :");

        user_id_text_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        user_telefon_no_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_telefon_no_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user_telefon_no_label.setText("Telefon No :");

        user_telefon_no_text_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        informationen_person_label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        informationen_person_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        informationen_person_label.setText("Informationen zur Person");

        sicherheit_frage_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sicherheit_frage_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sicherheit_frage_label.setText("Frage der Sicherheit :");

        sicherheit_frage_text_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sicherheit_frage_text_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wie lautet der Name Ihres ersten Haustiers? ", "Wie lautet der Nachname Ihrer Grundschullehrer/-in? ", "Wo würden Sie gerne für den Rest Ihres Lebens leben? ", "Oder geben Sie einen beliebigen Satz ein (Vorschlag)" }));
        sicherheit_frage_text_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sicherheit_frage_text_fieldActionPerformed(evt);
            }
        });

        sicherheit_antwort_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sicherheit_antwort_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sicherheit_antwort_label.setText("Antwort :");

        sicherheit_antwort_text_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        register_button.setBackground(new java.awt.Color(102, 102, 255));
        register_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        register_button.setText("Register");
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

        javax.swing.GroupLayout register_panelLayout = new javax.swing.GroupLayout(register_panel);
        register_panel.setLayout(register_panelLayout);
        register_panelLayout.setHorizontalGroup(
            register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(register_panelLayout.createSequentialGroup()
                .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(register_panelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sicherheit_frage_label)
                            .addComponent(informationen_person_label, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_vor_nachname_label)
                            .addComponent(user_id_label)
                            .addComponent(user_telefon_no_label)
                            .addComponent(informationen_sicherheit_label)
                            .addComponent(sicherheit_antwort_label))
                        .addGap(18, 18, 18)
                        .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sicherheit_antwort_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, register_panelLayout.createSequentialGroup()
                                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))))
                    .addGroup(register_panelLayout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_telefon_no_text_field, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(sicherheit_frage_text_field, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user_id_text_field)
                            .addComponent(user_vor_nachname_text_field))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        register_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {sicherheit_antwort_text_field, sicherheit_frage_text_field, user_telefon_no_text_field});

        register_panelLayout.setVerticalGroup(
            register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, register_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informationen_person_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_vor_nachname_label)
                    .addComponent(user_vor_nachname_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_id_label)
                    .addComponent(user_id_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_telefon_no_label)
                    .addComponent(user_telefon_no_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(informationen_sicherheit_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sicherheit_frage_label)
                    .addComponent(sicherheit_frage_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(register_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sicherheit_antwort_label)
                    .addComponent(sicherheit_antwort_text_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        register_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {user_vor_nachname_label, user_vor_nachname_text_field});

        register_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sicherheit_antwort_text_field, sicherheit_frage_label, sicherheit_frage_text_field, user_telefon_no_label, user_telefon_no_text_field});

        register_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {user_id_label, user_id_text_field});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(register_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(register_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 513, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        register_panel.setFocusable(true);
               
    }

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        JOptionPane.showMessageDialog(this, "Ihre Registrierung ist abgeschlossen");
        ActionSetting.setVisible(this, new Startbildschrim());
    }                                               

    private void register_buttonMouseEntered(java.awt.event.MouseEvent evt) {                                             
        ButtonSetting.setBgFg(register_button, Color.black, Color.white);
    }                                            

    private void register_buttonMouseExited(java.awt.event.MouseEvent evt) {                                            
        ButtonSetting.setOriginalBgFg(register_button);
    }                                           

    private void sicherheit_frage_text_fieldActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        // TODO add your handling code here:
    }                                                           

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel informationen_person_label;
    private javax.swing.JLabel informationen_sicherheit_label;
    private javax.swing.JButton register_button;
    private javax.swing.JPanel register_panel;
    private javax.swing.JLabel sicherheit_antwort_label;
    private javax.swing.JTextField sicherheit_antwort_text_field;
    private javax.swing.JLabel sicherheit_frage_label;
    private javax.swing.JComboBox<String> sicherheit_frage_text_field;
    private javax.swing.JLabel user_id_label;
    private javax.swing.JTextField user_id_text_field;
    private javax.swing.JLabel user_telefon_no_label;
    private javax.swing.JTextField user_telefon_no_text_field;
    private javax.swing.JLabel user_vor_nachname_label;
    private javax.swing.JTextField user_vor_nachname_text_field;
    // End of variables declaration                   
}
