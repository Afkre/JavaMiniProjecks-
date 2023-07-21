package guI;

import guI.settings.ActionSetting;


public class FrageSeite extends javax.swing.JFrame {

    public FrageSeite() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        frage_seite_panel = new javax.swing.JPanel();
        frage_seite_begruß_label = new javax.swing.JLabel();
        frage1_label = new javax.swing.JLabel();
        frage1jaRadioButton = new javax.swing.JRadioButton();
        frage1neinRadioButton = new javax.swing.JRadioButton();
        frage_erklärung_label1 = new javax.swing.JLabel();
        frage2neinRadioButton = new javax.swing.JRadioButton();
        frage2jaRadioButton = new javax.swing.JRadioButton();
        frage2_label = new javax.swing.JLabel();
        frage3neinRadioButton = new javax.swing.JRadioButton();
        frage3jaRadioButton = new javax.swing.JRadioButton();
        frage3_label = new javax.swing.JLabel();
        frage4neinRadioButton = new javax.swing.JRadioButton();
        frage4jaRadioButton = new javax.swing.JRadioButton();
        frage4_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        frage_antworten_absenden_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Green Island Air I-Kiosk Bordkart Voraussetzungen");

        frage_seite_panel.setBackground(new java.awt.Color(255, 255, 204));

        frage_seite_begruß_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        frage_seite_begruß_label.setForeground(new java.awt.Color(255, 0, 51));
        frage_seite_begruß_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        frage_seite_begruß_label.setText("Sehr geehrte(r) [User Vor- und Nachname]");

        frage1_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        frage1_label.setForeground(new java.awt.Color(0, 51, 153));
        frage1_label.setText("Frage 1: Besitzen Sie ein gültiges Visum für das Land, in das Sie reisen?");

        buttonGroup1.add(frage1jaRadioButton);
        frage1jaRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage1jaRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        frage1jaRadioButton.setText("JA");
        frage1jaRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frage1jaRadioButtonMouseClicked(evt);
            }
        });

        buttonGroup1.add(frage1neinRadioButton);
        frage1neinRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage1neinRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        frage1neinRadioButton.setText("NEIN");
        frage1neinRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frage1neinRadioButtonActionPerformed(evt);
            }
        });

        frage_erklärung_label1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage_erklärung_label1.setForeground(new java.awt.Color(0, 51, 153));
        frage_erklärung_label1.setText("Bitte wählen Sie die passende Antwort :");

        buttonGroup2.add(frage2neinRadioButton);
        frage2neinRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage2neinRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        frage2neinRadioButton.setText("NEIN");
        frage2neinRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frage2neinRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(frage2jaRadioButton);
        frage2jaRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage2jaRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        frage2jaRadioButton.setText("JA");

        frage2_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        frage2_label.setForeground(new java.awt.Color(0, 51, 153));
        frage2_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        frage2_label.setText("Frage 2: Haben Sie einen gültigen Reisepass dabei?");

        buttonGroup3.add(frage3neinRadioButton);
        frage3neinRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage3neinRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        frage3neinRadioButton.setText("NEIN");
        frage3neinRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frage3neinRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(frage3jaRadioButton);
        frage3jaRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage3jaRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        frage3jaRadioButton.setText("JA");

        frage3_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        frage3_label.setForeground(new java.awt.Color(0, 51, 153));
        frage3_label.setText("Frage 3: Haben Sie noch anderes Gepäck als Handgepäck?");

        buttonGroup4.add(frage4neinRadioButton);
        frage4neinRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage4neinRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        frage4neinRadioButton.setText("NEIN");
        frage4neinRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frage4neinRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup4.add(frage4jaRadioButton);
        frage4jaRadioButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage4jaRadioButton.setForeground(new java.awt.Color(0, 51, 153));
        frage4jaRadioButton.setText("JA");

        frage4_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        frage4_label.setForeground(new java.awt.Color(0, 51, 153));
        frage4_label.setText("Frage 4: Ist Ihr Handgepäck schwerer als 8 Kilogramm?");

        frage_antworten_absenden_button.setBackground(new java.awt.Color(0, 255, 255));
        frage_antworten_absenden_button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        frage_antworten_absenden_button.setText("Antworten absenden");
        frage_antworten_absenden_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                frage_antworten_absenden_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                frage_antworten_absenden_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                frage_antworten_absenden_buttonMouseExited(evt);
            }
        });
        frage_antworten_absenden_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frage_antworten_absenden_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frage_seite_panelLayout = new javax.swing.GroupLayout(frage_seite_panel);
        frage_seite_panel.setLayout(frage_seite_panelLayout);
        frage_seite_panelLayout.setHorizontalGroup(
            frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frage_seite_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(542, 542, 542)
                .addComponent(frage_antworten_absenden_button, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(frage_seite_panelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(frage_seite_panelLayout.createSequentialGroup()
                            .addComponent(frage_erklärung_label1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frage_seite_panelLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frage_seite_panelLayout.createSequentialGroup()
                                    .addComponent(frage2_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(frage2jaRadioButton)
                                    .addGap(41, 41, 41)
                                    .addComponent(frage2neinRadioButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frage_seite_panelLayout.createSequentialGroup()
                                    .addComponent(frage1_label)
                                    .addGap(53, 53, 53)
                                    .addComponent(frage1jaRadioButton)
                                    .addGap(41, 41, 41)
                                    .addComponent(frage1neinRadioButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frage_seite_panelLayout.createSequentialGroup()
                                    .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(frage_seite_panelLayout.createSequentialGroup()
                                            .addComponent(frage3_label)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frage_seite_panelLayout.createSequentialGroup()
                                            .addComponent(frage4_label)
                                            .addGap(181, 181, 181)))
                                    .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(frage_seite_panelLayout.createSequentialGroup()
                                            .addComponent(frage4jaRadioButton)
                                            .addGap(41, 41, 41)
                                            .addComponent(frage4neinRadioButton))
                                        .addGroup(frage_seite_panelLayout.createSequentialGroup()
                                            .addComponent(frage3jaRadioButton)
                                            .addGap(41, 41, 41)
                                            .addComponent(frage3neinRadioButton)))))))
                    .addComponent(frage_seite_begruß_label, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        frage_seite_panelLayout.setVerticalGroup(
            frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frage_seite_panelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(frage_seite_begruß_label, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(frage_erklärung_label1)
                .addGap(37, 37, 37)
                .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frage1_label)
                    .addComponent(frage1jaRadioButton)
                    .addComponent(frage1neinRadioButton))
                .addGap(39, 39, 39)
                .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frage2_label)
                    .addComponent(frage2jaRadioButton)
                    .addComponent(frage2neinRadioButton))
                .addGap(42, 42, 42)
                .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frage3_label)
                    .addComponent(frage3jaRadioButton)
                    .addComponent(frage3neinRadioButton))
                .addGap(43, 43, 43)
                .addGroup(frage_seite_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frage4_label)
                    .addComponent(frage4jaRadioButton)
                    .addComponent(frage4neinRadioButton))
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frage_antworten_absenden_button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frage_seite_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frage_seite_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void frage1neinRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
    }                                                     

    private void frage2neinRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
    }                                                     

    private void frage3neinRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
    }                                                     

    private void frage4neinRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        
    }                                                     

    private void frage1jaRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {                                                 
        
    }                                                

    private void frage_antworten_absenden_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                                
        
    }                                                               

    private void frage_antworten_absenden_buttonMouseEntered(java.awt.event.MouseEvent evt) {                                                             
        
    }                                                            

    private void frage_antworten_absenden_buttonMouseExited(java.awt.event.MouseEvent evt) {                                                            
        
    }                                                           

    private void frage_antworten_absenden_buttonMouseClicked(java.awt.event.MouseEvent evt) {                                                             
        if ( frage1jaRadioButton.isSelected()&& frage2jaRadioButton.isSelected() && frage3neinRadioButton.isSelected() && frage4neinRadioButton.isSelected()) {
           ActionSetting.setVisible(this, new Ergebnispositiv());
        } else {
            ActionSetting.setVisible(this, new Ergebnisnegativ());
        }
    }                                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrageSeite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel frage1_label;
    private javax.swing.JRadioButton frage1jaRadioButton;
    private javax.swing.JRadioButton frage1neinRadioButton;
    private javax.swing.JLabel frage2_label;
    private javax.swing.JRadioButton frage2jaRadioButton;
    private javax.swing.JRadioButton frage2neinRadioButton;
    private javax.swing.JLabel frage3_label;
    private javax.swing.JRadioButton frage3jaRadioButton;
    private javax.swing.JRadioButton frage3neinRadioButton;
    private javax.swing.JLabel frage4_label;
    private javax.swing.JRadioButton frage4jaRadioButton;
    private javax.swing.JRadioButton frage4neinRadioButton;
    private javax.swing.JButton frage_antworten_absenden_button;
    private javax.swing.JLabel frage_erklärung_label1;
    private javax.swing.JLabel frage_seite_begruß_label;
    private javax.swing.JPanel frage_seite_panel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
