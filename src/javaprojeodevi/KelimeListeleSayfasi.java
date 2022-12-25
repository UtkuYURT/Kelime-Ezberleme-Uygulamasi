package javaprojeodevi;

import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author UTKU
 */
public class KelimeListeleSayfasi extends javax.swing.JFrame {

    int index;
    String kelime, kelimeAnlam;

    /**
     * Creates new form KelimeListeleSayfasi
     */
    public KelimeListeleSayfasi() throws SQLException {
        initComponents();
        DefaultTableModel tblModel = (DefaultTableModel) tblWordList.getModel();
        Database.dbToTable(tblModel);
        Database.dbTableClear();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void close() {
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    public void arama(String ara) throws SQLException {
        DefaultTableModel tblModel = (DefaultTableModel) tblWordList.getModel();

        Database.dbSearch(ara, tblModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWordList = new javax.swing.JTable();
        lblKelimeAra = new javax.swing.JLabel();
        txtWord = new javax.swing.JTextField();
        btnHomePage = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUptade = new javax.swing.JButton();
        lblKelime = new javax.swing.JLabel();
        txtWordMean = new javax.swing.JTextField();
        lblKelimeAnlami = new javax.swing.JLabel();
        txtWordSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Kelime Listeleme Sayfası");
        setBackground(new java.awt.Color(189, 228, 221));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searchIco.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 220, 70, 50);

        tblWordList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblWordList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kelime Numarası", "Kelime", "Kelimenin Anlamı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWordList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWordListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWordList);
        if (tblWordList.getColumnModel().getColumnCount() > 0) {
            tblWordList.getColumnModel().getColumn(0).setResizable(false);
            tblWordList.getColumnModel().getColumn(1).setResizable(false);
            tblWordList.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 292, 804, 280);

        lblKelimeAra.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblKelimeAra.setText("Kelime Ara");
        getContentPane().add(lblKelimeAra);
        lblKelimeAra.setBounds(110, 230, 152, 38);

        txtWord.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWordActionPerformed(evt);
            }
        });
        txtWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWordKeyReleased(evt);
            }
        });
        getContentPane().add(txtWord);
        txtWord.setBounds(268, 18, 646, 38);

        btnHomePage.setBackground(new java.awt.Color(255, 204, 204));
        btnHomePage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHomePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back.png"))); // NOI18N
        btnHomePage.setBorderPainted(false);
        btnHomePage.setContentAreaFilled(false);
        btnHomePage.setFocusPainted(false);
        btnHomePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomePageActionPerformed(evt);
            }
        });
        getContentPane().add(btnHomePage);
        btnHomePage.setBounds(20, 580, 90, 80);

        btnAdd.setBackground(new java.awt.Color(255, 204, 204));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.png"))); // NOI18N
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(250, 130, 140, 80);

        btnRemove.setBackground(new java.awt.Color(255, 204, 204));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/remove.png"))); // NOI18N
        btnRemove.setBorderPainted(false);
        btnRemove.setContentAreaFilled(false);
        btnRemove.setFocusPainted(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove);
        btnRemove.setBounds(560, 130, 102, 80);

        btnUptade.setBackground(new java.awt.Color(255, 204, 204));
        btnUptade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUptade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        btnUptade.setBorderPainted(false);
        btnUptade.setContentAreaFilled(false);
        btnUptade.setFocusPainted(false);
        btnUptade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUptadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnUptade);
        btnUptade.setBounds(810, 130, 140, 80);

        lblKelime.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblKelime.setText("Kelime:");
        getContentPane().add(lblKelime);
        lblKelime.setBounds(110, 17, 152, 38);

        txtWordMean.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        getContentPane().add(txtWordMean);
        txtWordMean.setBounds(268, 75, 646, 38);

        lblKelimeAnlami.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblKelimeAnlami.setText("Kelime Anlamı:");
        getContentPane().add(lblKelimeAnlami);
        lblKelimeAnlami.setBounds(110, 74, 152, 38);

        txtWordSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtWordSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWordSearchActionPerformed(evt);
            }
        });
        txtWordSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWordSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtWordSearch);
        txtWordSearch.setBounds(268, 224, 646, 38);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1024, 700);

        setSize(new java.awt.Dimension(1038, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtWordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWordKeyReleased

    private void btnHomePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomePageActionPerformed
        close();
        AnaSayfa sayfa = new AnaSayfa();
        sayfa.setVisible(true);
    }//GEN-LAST:event_btnHomePageActionPerformed

    private void txtWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWordActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String txt = txtWord.getText();
        String txt2 = txtWordMean.getText();

        if (!txt.equals("") && !txt2.equals("")) {
            int id = 0;
            try {
                id = Database.dbLastid();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            id++;

            try {
                Database.dbTableAddValue(id, txt, txt2);
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
            DefaultTableModel tblModel = (DefaultTableModel) tblWordList.getModel();
            try {
                Database.dbToTable(tblModel);
            } catch (SQLException ex) {
                Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "eklendi");
            txtWord.setText("");
            txtWordMean.setText(""); 

        }else{
            JOptionPane.showMessageDialog(this, "Kelime ve Kelime Anlamı bos bırakılamaz...");
        }

        // messajlar durumlara göre değişecek
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) tblWordList.getModel();
        try {
            // TODO add your handling code here:
            Database.dbDeleteRow(index);
            Database.dbToTable(tblModel);

        } catch (SQLException ex) {
            Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Silindi");
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnUptadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUptadeActionPerformed
        try {
            // TODO add your handling code here:

            kelime = txtWord.getText();
            kelimeAnlam = txtWordMean.getText();
            if (!kelime.equals("") && !kelimeAnlam.equals("")) {
                Database.dbUpdate(index, kelime, kelimeAnlam);
                DefaultTableModel tblModel = (DefaultTableModel) tblWordList.getModel();
                Database.dbToTable(tblModel);
                JOptionPane.showMessageDialog(this, "güncellendi");
                txtWord.setText("");
                txtWordMean.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Kelime ve Kelime Anlamı bos bırakılamaz...");
            }

        } catch (SQLException ex) {
            Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }

        // messajlar durumlara göre değişecek
    }//GEN-LAST:event_btnUptadeActionPerformed

    private void tblWordListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWordListMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblWordList.getModel();
        index = (int) tblModel.getValueAt(tblWordList.getSelectedRow(), 0);
        txtWord.setText(tblModel.getValueAt(tblWordList.getSelectedRow(), 1).toString());
        txtWordMean.setText(tblModel.getValueAt(tblWordList.getSelectedRow(), 2).toString());


    }//GEN-LAST:event_tblWordListMouseClicked

    private void txtWordSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWordSearchActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtWordSearchActionPerformed

    private void txtWordSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWordSearchKeyReleased
        // TODO add your handling code here:
        String ara = txtWordSearch.getText();
        try {
            arama(ara);
        } catch (SQLException ex) {
            Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_txtWordSearchKeyReleased

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
            java.util.logging.Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {
                    new KelimeListeleSayfasi().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(KelimeListeleSayfasi.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHomePage;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUptade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKelime;
    private javax.swing.JLabel lblKelimeAnlami;
    private javax.swing.JLabel lblKelimeAra;
    private javax.swing.JTable tblWordList;
    private javax.swing.JTextField txtWord;
    private javax.swing.JTextField txtWordMean;
    private javax.swing.JTextField txtWordSearch;
    // End of variables declaration//GEN-END:variables
}