/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6_gui;

/**
 *
 * @author asus
 */
public class Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form Pembayaran
     */
    public Pembayaran() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hargabarang2 = new javax.swing.JTextField();
        Hargabarang3 = new javax.swing.JTextField();
        Hargabarang4 = new javax.swing.JTextField();
        diskon1 = new javax.swing.JTextField();
        Hargabarang1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        hapus = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        proses = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Harga Barang 2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 120, 20);

        jLabel3.setText("Harga Barang 3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 170, 120, 20);

        jLabel4.setText("Harga Barang 4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 210, 120, 20);

        jLabel5.setText("Harga Barang 1");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 90, 120, 20);

        Hargabarang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hargabarang2ActionPerformed(evt);
            }
        });
        getContentPane().add(Hargabarang2);
        Hargabarang2.setBounds(180, 130, 130, 26);

        Hargabarang3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hargabarang3ActionPerformed(evt);
            }
        });
        getContentPane().add(Hargabarang3);
        Hargabarang3.setBounds(180, 170, 130, 26);

        Hargabarang4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hargabarang4ActionPerformed(evt);
            }
        });
        getContentPane().add(Hargabarang4);
        Hargabarang4.setBounds(180, 210, 130, 26);

        diskon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskon1ActionPerformed(evt);
            }
        });
        getContentPane().add(diskon1);
        diskon1.setBounds(180, 250, 130, 26);

        Hargabarang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hargabarang1ActionPerformed(evt);
            }
        });
        getContentPane().add(Hargabarang1);
        Hargabarang1.setBounds(180, 90, 130, 26);

        jLabel6.setText("Diskon");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 250, 48, 20);

        jLabel7.setText("Hasil");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 340, 34, 20);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 380, 370, 180);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(null);

        hapus.setBackground(new java.awt.Color(255, 255, 102));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel1.add(hapus);
        hapus.setBounds(170, 300, 77, 29);

        keluar.setBackground(new java.awt.Color(255, 255, 102));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel1.add(keluar);
        keluar.setBounds(270, 300, 77, 29);

        proses.setBackground(new java.awt.Color(255, 255, 51));
        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        jPanel1.add(proses);
        proses.setBounds(70, 300, 79, 29);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 20, 120, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 440, 580);

        setBounds(0, 0, 456, 632);
    }// </editor-fold>//GEN-END:initComponents

    private void Hargabarang3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hargabarang3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hargabarang3ActionPerformed

    private void diskon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diskon1ActionPerformed

    private void Hargabarang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hargabarang1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hargabarang1ActionPerformed

    private void Hargabarang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hargabarang2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hargabarang2ActionPerformed

    private void Hargabarang4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hargabarang4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hargabarang4ActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        double hargabarang1 = Double.parseDouble(Hargabarang1.getText());
        double hargabarang2 = Double.parseDouble(Hargabarang2.getText());
        double hargabarang3 = Double.parseDouble(Hargabarang3.getText());
        double hargabarang4 = Double.parseDouble(Hargabarang4.getText());
        double diskon = Double.parseDouble(diskon1.getText());

        double totalHarga = hargabarang1 + hargabarang2 + hargabarang3 + hargabarang4;
        diskon = (totalHarga * (diskon / 100));
        double totalBayar = totalHarga - diskon;
        hasil.setText("Harga Barang 1 :" + hargabarang1 + "\nHarga Barang 2 :" + hargabarang2 + "\nHarga Barang 3 :" + hargabarang3 + "\nHarga Barang 4 :" + hargabarang4 + "\nDiskon anda :" + diskon + "\nTotal Harga :" + totalHarga + "\nTotal Bayar :" + totalBayar);


    }//GEN-LAST:event_prosesActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
     Hargabarang1.setText(" ");
     Hargabarang2.setText(" ");
     Hargabarang3.setText(" ");
     Hargabarang4.setText(" ");
     diskon1.setText(" ");
     hasil.setText(" ");
     
     
        
        
        
        

    }//GEN-LAST:event_hapusActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
    dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Hargabarang1;
    private javax.swing.JTextField Hargabarang2;
    private javax.swing.JTextField Hargabarang3;
    private javax.swing.JTextField Hargabarang4;
    private javax.swing.JTextField diskon1;
    private javax.swing.JButton hapus;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}
