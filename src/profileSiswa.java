
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class profileSiswa extends javax.swing.JFrame {

    /**
     * Creates new form profileSiswa
     */
    public profileSiswa() {
        initComponents();
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namaLabel = new javax.swing.JLabel();
        nisLabel = new javax.swing.JLabel();
        jurusanLabel = new javax.swing.JLabel();
        kelasLabel = new javax.swing.JLabel();
        updateNama = new javax.swing.JButton();
        updateJurusan = new javax.swing.JButton();
        updateKelas = new javax.swing.JButton();
        nama = new javax.swing.JTextField();
        nis = new javax.swing.JTextField();
        jurusan = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        rekapNilai = new javax.swing.JButton();
        buttonBack = new javax.swing.JButton();
        container = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Nama Profile.png"))); // NOI18N
        getContentPane().add(namaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        nisLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/NIS Profile.png"))); // NOI18N
        getContentPane().add(nisLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jurusanLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Jurusan Profile.png"))); // NOI18N
        getContentPane().add(jurusanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        kelasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Kelas Profile.png"))); // NOI18N
        getContentPane().add(kelasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        updateNama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update.png"))); // NOI18N
        updateNama.setToolTipText("Button update");
        updateNama.setBorder(null);
        updateNama.setBorderPainted(false);
        updateNama.setContentAreaFilled(false);
        updateNama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateNama.setFocusPainted(false);
        updateNama.setIconTextGap(0);
        updateNama.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update Hovered.png"))); // NOI18N
        updateNama.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update Hovered.png"))); // NOI18N
        getContentPane().add(updateNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        updateJurusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update.png"))); // NOI18N
        updateJurusan.setToolTipText("Button update");
        updateJurusan.setBorder(null);
        updateJurusan.setBorderPainted(false);
        updateJurusan.setContentAreaFilled(false);
        updateJurusan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateJurusan.setFocusPainted(false);
        updateJurusan.setIconTextGap(0);
        updateJurusan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update Hovered.png"))); // NOI18N
        updateJurusan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update Hovered.png"))); // NOI18N
        updateJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJurusanActionPerformed(evt);
            }
        });
        getContentPane().add(updateJurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        updateKelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update.png"))); // NOI18N
        updateKelas.setToolTipText("Button update");
        updateKelas.setBorder(null);
        updateKelas.setBorderPainted(false);
        updateKelas.setContentAreaFilled(false);
        updateKelas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateKelas.setFocusPainted(false);
        updateKelas.setIconTextGap(0);
        updateKelas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update Hovered.png"))); // NOI18N
        updateKelas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Update Hovered.png"))); // NOI18N
        getContentPane().add(updateKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, -1, -1));

        nama.setBackground(new java.awt.Color(255, 255, 255));
        nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nama.setText("Nama");
        nama.setToolTipText("Input nama siswa");
        nama.setAutoscrolls(false);
        nama.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 4));
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 600, 50));

        nis.setBackground(new java.awt.Color(255, 255, 255));
        nis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nis.setText("Nomor Induk Siswa");
        nis.setToolTipText("Input nomor induk siswa");
        nis.setAutoscrolls(false);
        nis.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 4));
        getContentPane().add(nis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 600, 50));

        jurusan.setBackground(new java.awt.Color(255, 255, 255));
        jurusan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jurusan.setText("Jurusan");
        jurusan.setToolTipText("Input jurusan");
        jurusan.setAutoscrolls(false);
        jurusan.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 4));
        jurusan.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(jurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 600, 50));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setText("Kelas");
        jTextField4.setToolTipText("Input kelas");
        jTextField4.setAutoscrolls(false);
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 10, 4, 4));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 600, 50));

        rekapNilai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Rekap.png"))); // NOI18N
        rekapNilai.setBorder(null);
        rekapNilai.setBorderPainted(false);
        rekapNilai.setContentAreaFilled(false);
        rekapNilai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rekapNilai.setFocusPainted(false);
        rekapNilai.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Rekap Hovered.png"))); // NOI18N
        rekapNilai.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Rekap Hovered.png"))); // NOI18N
        rekapNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekapNilaiActionPerformed(evt);
            }
        });
        getContentPane().add(rekapNilai, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 280, -1, -1));

        buttonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Back.png"))); // NOI18N
        buttonBack.setBorder(null);
        buttonBack.setBorderPainted(false);
        buttonBack.setContentAreaFilled(false);
        buttonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack.setFocusPainted(false);
        buttonBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Back Hovered.png"))); // NOI18N
        buttonBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Button Back Hovered.png"))); // NOI18N
        buttonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBackMouseClicked(evt);
            }
        });
        getContentPane().add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 500, -1, -1));

        container.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Profile Container.png"))); // NOI18N
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Header.png"))); // NOI18N
        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Components/Background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rekapNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekapNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rekapNilaiActionPerformed

    private void buttonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBackMouseClicked
        // TODO add your handling code here:
        siswaPage buttonBack = new siswaPage();
        buttonBack.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonBackMouseClicked

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void updateJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateJurusanActionPerformed

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
            java.util.logging.Logger.getLogger(profileSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profileSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profileSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profileSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profileSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel background;
    private javax.swing.JButton buttonBack;
    private javax.swing.JLabel container;
    public javax.swing.JLabel header;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jurusan;
    private javax.swing.JLabel jurusanLabel;
    private javax.swing.JLabel kelasLabel;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JTextField nis;
    private javax.swing.JLabel nisLabel;
    private javax.swing.JButton rekapNilai;
    private javax.swing.JButton updateJurusan;
    private javax.swing.JButton updateKelas;
    private javax.swing.JButton updateNama;
    // End of variables declaration//GEN-END:variables
}
