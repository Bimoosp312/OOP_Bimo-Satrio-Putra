package BAB10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;     
/**
 *
 * @author BIMO SP
 */
public class GUI_KreditMotor extends javax.swing.JFrame {

    /**
     * Creates new form GUI_KreditMotor
     */
    public GUI_KreditMotor() {
        initComponents();
        tampil();
    }
public Connection conn;
String nap, al, mrk, hgr,cpb, bon; 
     public void batal() {
        txtMerk.setText("");
        txtNama.setText("");
        txtHarga.setText("");
        txtCicilan.setText("");
        txtalamat.setText("");
        txt_Bonus.setText("");
    }
    public void koneksi() throws SQLException {
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/oop_kreditmotor?user=root&password=");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GUI_KreditMotor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(GUI_KreditMotor.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(GUI_KreditMotor.class.getName()).log(Level.SEVERE, null, es);
        }
    }
 public void tampil() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("KODE MK");
        tabelhead.addColumn("NAMA MK");
        tabelhead.addColumn("DOSEN");
        tabelhead.addColumn("JML SKS");
        try {
            koneksi();
            String sql = "SELECT * FROM tb_datakredit";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabelhead.addRow(new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7)});
            }
            tabel_data_KreditMotor.setModel(tabelhead);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }
public void refresh() {
        new GUI_KreditMotor().setVisible(true);
        this.setVisible(false);
    }
public void insert() {
        String Nama = txtNama.getText();
        String alamt = txtalamat.getText();
        String merk = txtMerk.getText();
        String hrg = txtHarga.getText();
        String cicil = txtCicilan.getText();
        String bns = txt_Bonus.getText();
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_datakredit(`Nama Pembeli`,`Alamat`,`Merk`,`Harga`,`Cicilan Perbulan`,`Bonus Service`)"
                    + "VALUES('" + Nama + "','" + alamt + "','" + merk + "','" + hrg + "','" + cicil + "','" + bns + "')");
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data Matakuliah!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Input!");
        }
        refresh();
    }
public void update() {
        String Nama = txtNama.getText();
        String alamt = txtalamat.getText();
        String merk = txtMerk.getText();
        String hrg = txtHarga.getText();
        String cicil = txtCicilan.getText();
        String bns = txt_Bonus.getText();
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE tb_datakredit SET `Nama Pembeli`='" + Nama + "',`Alamat`" + "='" + alamt + "',"
                    + "`Merk`='" + "`Merk`='" + "`Harga`='" + "`Cicilan Perbulan`='" + "`Bonus Service`='");

            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update Data MataKuliah!");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        refresh();
    }
public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_datakredit WHERE `Nama Pembeli`='" + txtNama.getText() + "'";
                java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
                batal();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus");
            }
        }
        refresh();
    }
public void itempilih() {
        txtNama.setText(nap);
        txtalamat.setText(al);
        txtMerk.setText(mrk);
        txtHarga.setText(hgr);
        txtCicilan.setText(cpb);
        txt_Bonus.setText(bon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHarga = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        txtCicilan = new javax.swing.JTextField();
        btnBatal = new javax.swing.JButton();
        txt_Bonus = new javax.swing.JTextField();
        btnNotaPembayaran = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_data_KreditMotor = new javax.swing.JTable();
        txtMerk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        txt_Bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BonusActionPerformed(evt);
            }
        });

        btnNotaPembayaran.setText("Nota Pembayarann");
        btnNotaPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotaPembayaranActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setText("Search 🔍");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        tabel_data_KreditMotor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama Pembeli", "Alamat", "Merk", "Harga", "Cicilan Perbulan", "Bonus Service"
            }
        ));
        tabel_data_KreditMotor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_data_KreditMotorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel_data_KreditMotor);

        txtMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMerkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Kredit Motor");

        jLabel2.setText("Nama Pembeli");

        jLabel3.setText("Alamat");

        jLabel4.setText("Merk");

        jLabel5.setText("Harga");

        jLabel6.setText("Cicilan Perbulan");

        jLabel7.setText("Bonus Service");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCicilan, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1)
                                        .addComponent(txtMerk, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                        .addComponent(txtalamat)
                                        .addComponent(txtNama)))
                                .addComponent(txt_Bonus))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(343, 343, 343)
                                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnSearch))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(83, 83, 83)
                                            .addComponent(btnSimpan)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnHapus)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnBatal)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnClose)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnUpdate)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNotaPembayaran)
                            .addGap(39, 39, 39)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(txtMerk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtCicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txt_Bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 8, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSimpan)
                                .addComponent(btnClose)
                                .addComponent(btnHapus)
                                .addComponent(btnBatal)
                                .addComponent(btnUpdate))
                            .addGap(15, 15, 15)
                            .addComponent(btnNotaPembayaran)))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        //masukkan method delete()
        delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        batal();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnNotaPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaPembayaranActionPerformed
        // TODO add your handling code here:
        new GUI_KreditMotor().setVisible(true);
    }//GEN-LAST:event_btnNotaPembayaranActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        //masukkan method import
        insert();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //masukkan method update()
        update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //  masukkan method cari()
        //cari();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        //exit
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tabel_data_KreditMotorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_data_KreditMotorMouseClicked
        // TODO add your handling code here:
        //masukkan source code onclick pada tabel
        int tabel = tabel_data_KreditMotor.getSelectedRow();
        nap = tabel_data_KreditMotor.getValueAt(tabel, 0).toString();
        al = tabel_data_KreditMotor.getValueAt(tabel, 1).toString();
        mrk = tabel_data_KreditMotor.getValueAt(tabel, 2).toString();
        hgr = tabel_data_KreditMotor.getValueAt(tabel, 3).toString();
        cpb = tabel_data_KreditMotor.getValueAt(tabel, 4).toString();
        bon = tabel_data_KreditMotor.getValueAt(tabel, 5).toString();
        itempilih();

    }//GEN-LAST:event_tabel_data_KreditMotorMouseClicked

    private void txtMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMerkActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txt_BonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BonusActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_KreditMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_KreditMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_KreditMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_KreditMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_KreditMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNotaPembayaran;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabel_data_KreditMotor;
    private javax.swing.JTextField txtCicilan;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtMerk;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txt_Bonus;
    private javax.swing.JTextField txtalamat;
    // End of variables declaration//GEN-END:variables
}
