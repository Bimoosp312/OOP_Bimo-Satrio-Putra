package BAB10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


//masukkan import dibawah sini
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author icornermalang
 */
public class Gui_Penilaian extends javax.swing.JFrame {
    /**
     * Creates new form Gui_Penilaian
     */
    public Gui_Penilaian() {
        initComponents();
        //masuukan source code (txtKeaktifan.setEnabled(false);tampil();tampil_mhs();tampil_mk(); txtKeaktifan.setText(Integer.toString(0));)
                txtKeaktifan.setEnabled(false);
        tampil();
        tampil_Kredit();
        //tampil_mk();
txtKeaktifan.setText(Integer.toString(0));

    }
    public void batal() {
        txtNP1.setText("");
        txtNP2.setText("");
        txtNP3.setText("");
        
        txtKeaktifan.setText("");
    }
    //masukkan atribut dibawah sini (String nim1, kd_mk1, np1, np2, np3, UTS, UAS, PRAK, keaktifan, NA;)
    String nim1, kd_mk1, np1, np2, np3, UTS, UAS, PRAK, keaktifan, NA;
    //masukkan conection dibawah sini (public Connection conn;)
    public Connection conn;
    
    //masukkan method koneksi()
    public void koneksi() throws SQLException {
        try {
            conn = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/OOP_2218062?user=root&password=");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gui_Penilaian.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            Logger.getLogger(Gui_Penilaian.class.getName()).log(Level.SEVERE, null, e);
        } catch (Exception es) {
            Logger.getLogger(Gui_Penilaian.class.getName()).log(Level.SEVERE, null, es);
        }
    }

    
    //masukkan method tampil()
    public void tampil() {
        DefaultTableModel tabelhead = new DefaultTableModel();
        tabelhead.addColumn("NIM");
        tabelhead.addColumn("Kode MK");
        tabelhead.addColumn("NP1");
        tabelhead.addColumn("NP2");
        tabelhead.addColumn("UTS");
        tabelhead.addColumn("NP3");
        tabelhead.addColumn("PRAK");
        tabelhead.addColumn("UAS");
        tabelhead.addColumn("NA");
        try {
            koneksi();
            String sql = "SELECT * FROM tb_nilai";
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                tabelhead.addRow(new Object[]{res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10),});
            }
            jTable2.setModel(tabelhead);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "BELUM TERKONEKSI");
        }
    }


    //masukka method tampil_Kredit() dibawah sini
    public void tampil_Kredit() {
        try {
            koneksi();
            String sql = "SELECT Nama Pembeli FROM tb_datakredit";
            Statement stt = conn.createStatement();
            ResultSet res = stt.executeQuery(sql);
            while (res.next()) {
                Object[] ob = new Object[3];
                ob[0] = res.getString(1);
                cmbNim.addItem((String) ob[0]);
            }
            res.close();
            stt.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    //masukkan method tampil_mk()
//    public void tampil_mk() {
//        try {
//            koneksi();
//            String sql = "SELECT kode_mk FROM tb_matkul order by kode_mk asc";
//            Statement stt = conn.createStatement();
//            ResultSet res = stt.executeQuery(sql);
//            while (res.next()) {
//                Object[] ob = new Object[3];
//                ob[0] = res.getString(1);
//                cmbKodeMk.addItem((String) ob[0]);
//            }
//            res.close();
//            stt.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    
    //masukkan method refresh()
    public void refresh() {
        new Gui_Penilaian().setVisible(true);
        this.setVisible(false);
    }


    //masukkan method insert()
    public void insert() {
        String Nim = (String) cmbNim.getSelectedItem();
        //String KodeMK = (String) cmbKodeMk.getSelectedItem();
        String NP1 = txtNP1.getText();
        String NP2 = txtNP2.getText();
        String NP3 = txtNP3.getText();
        String bs = txtKeaktifan.getText();
        try {
            koneksi();
            Statement statement = conn.createStatement();
            statement.executeUpdate("INSERT INTO tb_datamotor(`Nama Pembeli`,`Merk`,`harga`,`Cicilan Perbulan`,`Bonus service`)"
                    + "VALUES('" + Nim + "','"  + "','" + NP1 + "','" + NP2 + "','" + "','" + NP3 + "')");
            statement.close();
            JOptionPane.showMessageDialog(null, "Berhasil Memasukan Data Nilai!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Input!");
        }
        refresh();
    }

    
    //masukkan method update()  
    public void update() {
        String Nim = (String) cmbNim.getSelectedItem();
        String NP1 = txtNP1.getText();
        String NP2 = txtNP2.getText();
        
        String NP3 = txtNP3.getText();
        

        String nim_lama = nim1;
        String kode_lama = kd_mk1;

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate("UPDATE tb_nilai SET Nim='" + Nim + "'," + "kd_mk='" + "'"
                    + ",NP1='" + NP1 + "',NP2='" + NP2 + "',UTS='" + UTS + "',NP3='" + NP3 + "',prak='" + PRAK + "',UAS='" + UAS + "',NA='" + NA + "' WHERE Nim ='" + nim_lama + "' AND kd_mk='" + kode_lama + "'");
            statement.close();
            conn.close();
            JOptionPane.showMessageDialog(null, "Update Data Nilai!");
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        refresh();
    }

    
    //masukkan method NilaiAkhir()
    


    //masukkan method itempilih()
    void itempilih() {
        cmbNim.setSelectedItem(nim1);
        //cmbKodeMk.setSelectedItem(kd_mk1);
        txtNP1.setText(np1);
        txtNP2.setText(np2);
        txtNP3.setText(np3);
        
        txtKeaktifan.setText(keaktifan);
        txtKeaktifan.setText(Integer.toString(0));
        
    }

    


    
    //masukkan method delete()
    public void delete() {
        int ok = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
                String sql = "DELETE FROM tb_nilai WHERE Nim='" + cmbNim.getSelectedItem() + "' AND kd_mk='"  + "'";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil di hapus");
                batal();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus");
            }
        }
        refresh();
    }


    //masukkan method cari()
//    public void cari() {
//        try {
//            try ( Statement statement = conn.createStatement()) {
//                String sql = "SELECT * FROM tb_nilai WHERE `Nim` LIKE '%" + txtCari.getText() + "%'";
//                ResultSet rs = statement.executeQuery(sql);
//                //menampilkan data dari sql query
//                if (rs.next()) // .next() = scanner method
//                {
//                    cmbNim.setSelectedItem(rs.getString(2));
//                    cmbKodeMk.setSelectedItem(rs.getString(3));
//                    txtNP1.setText(rs.getString(4));
//                    txtNP2.setText(rs.getString(5));
//                    
//                    txtNP3.setText(rs.getString(7));
//                    
//
//                } else {
//                    JOptionPane.showMessageDialog(null, "Data yang Anda cari tidak ada");
//                }
//            }
//        } catch (Exception ex) {
//            System.out.println("Error." + ex);
//        }
//    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmKeaktifan = new javax.swing.JCheckBox();
        txtNP1 = new javax.swing.JTextField();
        txtNP2 = new javax.swing.JTextField();
        txtNP3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtKeaktifan = new javax.swing.JTextField();
        cmbNim = new javax.swing.JComboBox<>();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnNim = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Kredit");

        jLabel5.setText("Merk");

        jLabel6.setText("Harga");

        jLabel7.setText("Cicilan Perbulan");

        cmKeaktifan.setText("Bonus Service Tambahan");
        cmKeaktifan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmKeaktifanActionPerformed(evt);
            }
        });

        jLabel11.setText("Bonus Service");

        txtKeaktifan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeaktifanActionPerformed(evt);
            }
        });

        cmbNim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama" }));
        cmbNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNimActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnUbah.setText("Update");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Delete");
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

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnNim.setText("Nama Pembeli");
        btnNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNimActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama Pembeli", "Merk", "Harga", "Cicilan Perbulan", "Bonus Service"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNP3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(25, 25, 25)
                                        .addComponent(txtKeaktifan))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNP2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(txtNP1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmKeaktifan))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnNim)
                                .addGap(18, 18, 18)
                                .addComponent(cmbNim, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUbah)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnBatal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCari)))
                        .addGap(1467, 1467, 1467))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNim)
                    .addComponent(btnCari))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmKeaktifan)
                            .addComponent(jLabel11)
                            .addComponent(txtKeaktifan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnSimpan))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapus)
                        .addComponent(btnUbah)
                        .addComponent(btnBatal)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKeaktifanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeaktifanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeaktifanActionPerformed

    private void cmKeaktifanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmKeaktifanActionPerformed
        // TODO add your handling code here:
        if (cmKeaktifan.isSelected()){
            txtKeaktifan.setEnabled(true);
        }else{
            txtKeaktifan.setEnabled(false);
        }
    }//GEN-LAST:event_cmKeaktifanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        //masukkan method batal();
        
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        //masukkan method insert();
        insert();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        //masukkan method update();
        update();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        //masukkan method delete();
        delete();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        //masukkan method cari();
        //cari();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNimActionPerformed
        // TODO add your handling code here:
        new Gui_Penilaian().setVisible(true);
        
    }//GEN-LAST:event_btnNimActionPerformed

    private void cmbNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNimActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbNimActionPerformed

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
            java.util.logging.Logger.getLogger(Gui_Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui_Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui_Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui_Penilaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_Penilaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnNim;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JCheckBox cmKeaktifan;
    private javax.swing.JComboBox<String> cmbNim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtKeaktifan;
    private javax.swing.JTextField txtNP1;
    private javax.swing.JTextField txtNP2;
    private javax.swing.JTextField txtNP3;
    // End of variables declaration//GEN-END:variables
}
