package uaspl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class FromAntrian extends javax.swing.JFrame {
    // membuat objek queue baru bernama antrian dengan linkedlist
    Queue<Object> antrian = new LinkedList<>();
    //menginialisasi/memberi nilai ke variabel nomor dengan nilai 0
    int nomor = 0;
    
    //method constructor untuk memanggil method initcomponents dan inisialisasi
    public FromAntrian() {
        //untuk eksekusi perintah pada method initcomponents lansung ketika program dijalankan
        initComponents(); 
        inisialisasi(); //untuk eksekusi perintah pada method inisialisasi
    }
    
 private void inisialisasi(){
     // membuat object cal dari class calendar
      Calendar cal = Calendar.getInstance();
 //membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
 //membuat jam dengan format(HH:mm) jam menit
    SimpleDateFormat s=new SimpleDateFormat("EEEE, dd-MMMM-yyyy HH:mm");
 //menginialisasi variabel tanggal dengan format s diatas
    String tgl = s.format(cal.getTime());

        JlhAntrian.setText("0");
        TtlAntrian.setText("0");
        nopanggil.setText("-----");
        
        txt1.setText(tgl);
        txt2.setText("Nomor Antrian");
        txt3.setText("--------");
        txt4.setText("Silahkan menunggu");
        txt5.setText("--------");
    }
 
 private void tambahAntrian(){
     Calendar cal = Calendar.getInstance();
     SimpleDateFormat s=new SimpleDateFormat("EEEE, dd-MMMM-yyyy HH:MM");
     String tgl = s.format(cal.getTime());
    
        nomor++; //increment variabel nomor
       
        String antr = "Antrian "+nomor;
       antrian.add(antr);
        
        String cvt = String.valueOf(antrian.size());
        //menampilkan banyak antrian pada jumlah antrian
        JlhAntrian.setText(cvt);
        nopanggil.setText(""+antrian.peek());
        //menampilkan total antrian yang terjadi
        TtlAntrian.setText(""+nomor);
        txtAntrian.append(antr + "\n");
        
        //menampilkan tanggal hari ini pada txt1
        txt1.setText(tgl);
        txt2.setText("Nomor Antrian");
        txt3.setText("  " + nomor);
        txt4.setText("Silahkan menunggu " + cvt + " Antrian Lagi ");
        txt5.setText("Mohon untuk bersabar");
    }
 //method untuk memproses antrian
 private void prosesAntrian(){
     //jika antrian bernilai kosong maka akan menampilkan pesan warning / promt
        if(antrian.isEmpty()){
            JOptionPane.showMessageDialog(this, "Ambil Nomor antrian terlebih dahulu !");
        }
       txtAntrian.setText("");
      antrian.poll();
        //antrian tadi yang sudah diisi akan dilakukan looping dengan menggunakan forEach loop
        antrian.forEach((Object element) -> {
            //menambahkan data yang secara otomatis sebanyak nilai antrian yang 
            //dimasukkan,dan agar dapat memproses antrian secara satupersatu 
         
            txtAntrian.append("" + element + "\n");
        });
        
        //pengecekan apakah antrian tersebut masih kosong dengan method bawaan queue itu
        if(antrian.isEmpty()){
            //jika kosong akan menampilka --- pada jlabel nopanggil
            nopanggil.setText("-----");
        }else{
             //jika data tidak kosong maka akan menggunakan fungsi peek kembali
            nopanggil.setText(""+antrian.peek());
        }
        //membuat sebuah variable dengan nama cvt dengan type data string
        String cvt = String.valueOf(antrian.size());
        JlhAntrian.setText(cvt);
        txt4.setText("Silahkan menunggu "+cvt+" Antrian Lagi");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ambil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        PanggilAntrian = new javax.swing.JLabel();
        nopanggil = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        JlhAntrian = new javax.swing.JLabel();
        TtlAntrian = new javax.swing.JLabel();
        Proses = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAntrian = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ANTRIAN");

        Ambil.setBackground(new java.awt.Color(102, 255, 255));
        Ambil.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Ambil.setText("Ambil Nomor");
        Ambil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmbilActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Kozuka Mincho Pr6N H", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APOTIK NASIONAL");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel3.setText("JL.Jend.Ahmad Yani no 119, Pekanbaru");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt3.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txt5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        PanggilAntrian.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        PanggilAntrian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanggilAntrian.setText("Panggilan Nomor Antrian");
        PanggilAntrian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nopanggil.setBackground(new java.awt.Color(0, 153, 153));
        nopanggil.setFont(new java.awt.Font("Arial Black", 0, 25)); // NOI18N
        nopanggil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nopanggil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jumlah.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jumlah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jumlah.setText("Jumlah Antrian");
        jumlah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        total.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        total.setText("Total Antrian");
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JlhAntrian.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        JlhAntrian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JlhAntrian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TtlAntrian.setFont(new java.awt.Font("Arial Black", 0, 17)); // NOI18N
        TtlAntrian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TtlAntrian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Proses.setBackground(new java.awt.Color(102, 255, 255));
        Proses.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Proses.setForeground(new java.awt.Color(0, 51, 51));
        Proses.setText("Proses Antrian");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nopanggil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Proses))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JlhAntrian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jumlah, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(TtlAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PanggilAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(PanggilAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nopanggil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Proses, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jumlah, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlhAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TtlAntrian, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jpanel1Layout = new javax.swing.GroupLayout(jpanel1);
        jpanel1.setLayout(jpanel1Layout);
        jpanel1Layout.setHorizontalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(Ambil)))
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel1Layout.setVerticalGroup(
            jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpanel1Layout.createSequentialGroup()
                        .addComponent(Ambil, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Daftar Antrian");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtAntrian.setColumns(20);
        txtAntrian.setRows(5);
        jScrollPane1.setViewportView(txtAntrian);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
        // TODO add your handling code here:
        prosesAntrian();
    }//GEN-LAST:event_ProsesActionPerformed

    private void AmbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmbilActionPerformed
        // TODO add your handling code here:
        tambahAntrian();
    }//GEN-LAST:event_AmbilActionPerformed

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
            java.util.logging.Logger.getLogger(FromAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromAntrian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FromAntrian().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ambil;
    private javax.swing.JLabel JlhAntrian;
    private javax.swing.JLabel PanggilAntrian;
    private javax.swing.JButton Proses;
    private javax.swing.JLabel TtlAntrian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JLabel jumlah;
    private javax.swing.JLabel nopanggil;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JTextArea txtAntrian;
    // End of variables declaration//GEN-END:variables
}
