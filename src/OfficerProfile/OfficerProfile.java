package OfficerProfile;



import DataBase.DataBase;
import FrontLine.Frontline_mainpage;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOH
 */
public class OfficerProfile extends javax.swing.JFrame {

    Connection con,con1 = null;
    PreparedStatement ps,ps1 = null;
    ResultSet rs,rs1 = null;
    
    DataBase dbs = new DataBase();
    String DBuser = dbs.UserDB.getText();
    String DBpass = dbs.PassDB.getText();
    String DBName = dbs.nameDB.getText();
    
    String str,w1=null;
    int x,y;
    public OfficerProfile() {
        initComponents();
         this.setLocationRelativeTo(null);
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myprof = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        eid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        epro = new javax.swing.JLabel();
        Wer = new javax.swing.JTextField();
        passs = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        pno = new javax.swing.JTextField();
        cty = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MY PROFILE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(299, 299, 299))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 0));
        jPanel2.setLayout(null);

        myprof.setEditable(false);
        myprof.setColumns(20);
        myprof.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        myprof.setRows(5);
        jScrollPane1.setViewportView(myprof);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(272, 0, 626, 414);

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));
        jPanel3.setLayout(null);

        eid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eid.setForeground(new java.awt.Color(255, 0, 0));
        eid.setOpaque(false);
        jPanel3.add(eid);
        eid.setBounds(310, 50, 220, 30);

        jLabel6.setBackground(new java.awt.Color(153, 0, 51));
        jLabel6.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Employee ID");
        jLabel6.setOpaque(true);
        jPanel3.add(jLabel6);
        jLabel6.setBounds(310, 20, 220, 32);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/OfficerProfile/update.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10);
        jLabel10.setBounds(550, 20, 150, 70);

        jLabel15.setBackground(new java.awt.Color(51, 255, 255));
        jLabel15.setOpaque(true);
        jPanel3.add(jLabel15);
        jLabel15.setBounds(310, 80, 220, 10);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\JO\\Desktop\\New folder (2)\\ppa.jpg")); // NOI18N
        jPanel3.add(jLabel8);
        jLabel8.setBounds(0, 0, 1170, 90);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(-3, 411, 1160, 90);

        epro.setBackground(new java.awt.Color(51, 51, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(epro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(epro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(905, 13, 250, 229);

        Wer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Wer.setForeground(new java.awt.Color(102, 255, 102));
        Wer.setBorder(null);
        Wer.setOpaque(false);
        jPanel2.add(Wer);
        Wer.setBounds(0, 260, 242, 22);

        passs.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passs.setForeground(new java.awt.Color(102, 255, 102));
        passs.setBorder(null);
        passs.setOpaque(false);
        jPanel2.add(passs);
        passs.setBounds(0, 140, 242, 22);

        uname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uname.setForeground(new java.awt.Color(102, 255, 102));
        uname.setBorder(null);
        uname.setOpaque(false);
        jPanel2.add(uname);
        uname.setBounds(0, 40, 242, 22);

        pno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pno.setForeground(new java.awt.Color(102, 255, 102));
        pno.setBorder(null);
        pno.setOpaque(false);
        jPanel2.add(pno);
        pno.setBounds(910, 310, 240, 22);

        cty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cty.setForeground(new java.awt.Color(102, 255, 102));
        cty.setBorder(null);
        cty.setOpaque(false);
        jPanel2.add(cty);
        cty.setBounds(0, 370, 242, 22);

        jLabel3.setBackground(new java.awt.Color(153, 0, 51));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 240, 40);

        jLabel4.setBackground(new java.awt.Color(153, 0, 51));
        jLabel4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("City");
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 340, 240, 30);

        jLabel5.setBackground(new java.awt.Color(153, 0, 51));
        jLabel5.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Phone No.");
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(910, 280, 240, 32);

        jLabel7.setBackground(new java.awt.Color(153, 0, 51));
        jLabel7.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Password");
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 102, 240, 40);

        jLabel9.setBackground(new java.awt.Color(153, 0, 51));
        jLabel9.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Wereda");
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(0, 220, 240, 40);

        jLabel12.setBackground(new java.awt.Color(51, 255, 255));
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12);
        jLabel12.setBounds(0, 70, 240, 10);

        jLabel13.setBackground(new java.awt.Color(51, 255, 255));
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13);
        jLabel13.setBounds(0, 170, 240, 10);

        jLabel14.setBackground(new java.awt.Color(51, 255, 255));
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 290, 240, 10);

        jLabel16.setBackground(new java.awt.Color(51, 255, 255));
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16);
        jLabel16.setBounds(910, 340, 240, 10);

        jLabel17.setBackground(new java.awt.Color(51, 255, 255));
        jLabel17.setOpaque(true);
        jPanel2.add(jLabel17);
        jLabel17.setBounds(0, 400, 240, 10);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\JO\\Desktop\\New folder (2)\\ppa.jpg")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1160, 510);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel_48px.png"))); // NOI18N
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        if(eid.getText().equals("") ||pno.getText().equals("") ||cty.getText().equals("") ||Wer.getText().equals("") ||passs.getText().equals("") ||uname.getText().equals(""))
{
    JOptionPane.showMessageDialog(null, "Fill nessessery fields");
}
else
{
        try {
            //Validate Employee ID correct or not
            String str_upd = "SELECT empID FROM employee WHERE empID=?";
            con1 = DriverManager.getConnection(DBName, DBuser,DBpass);
            ps1 = con1.prepareStatement(str_upd);
            ps1.setString(1, eid.getText());
            rs1 = ps1.executeQuery();
        if(rs1.next() && rs1.getString("empID").equals(eid.getText()))
        {
            //connection
                con = DriverManager.getConnection(DBName, DBuser,DBpass);

                str = "UPDATE employee set username=?,password=?,wereda=?,city=?,Phone_number=? WHERE empID=?";
                ps = con.prepareStatement(str);
            //Update Profile
                ps.setString(1, uname.getText());
                ps.setString(2, passs.getText());
                ps.setString(3, Wer.getText());
                ps.setString(4, cty.getText());
                ps.setString(5, pno.getText());            
                ps.setString(6, eid.getText());
                ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Updated Successfuly!!");

            String s1,s2,s3,s4,s5;

            str = "SELECT username,password,wereda,city,Phone_number,image from employee WHERE empid=?";
                ps = con.prepareStatement(str);
                ps.setString(1, eid.getText());
                rs=ps.executeQuery();
                while(rs.next())
                    {
                        s1 = rs.getString(1);
                        s2 = rs.getString(2);
                        s3 = rs.getString(3);
                        s4 = rs.getString(4);
                        s5 = rs.getString(5);
                        
                        
                        uname.setText(s1);
                         passs.setText(s2);
                         Wer.setText(s3);
                         cty.setText(s4);
                         pno.setText(s5);
                        
                         myprof.setText("");
                        myprof.append("\t\t MY PROFILE \n"
                        + 
                          "\n===================================================\n"+
                                "Employee Name:\t"+s1+"\n\n"+
                                "Password:\t\t"+s2+"\n\n"+
                                "Wereda:\t\t"+s3+"\n\n"+
                                "City:\t\t"+s4+"\n\n"+
                                "PhoneNumber:\t\t"+s5+"\n\n"+
                           "\n==================================================\n");
                    }
           
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrect ID"); 
        }
                } catch (SQLException ex) {
                    Logger.getLogger(OfficerProfile.class.getName()).log(Level.SEVERE, null, ex);
                } 
}
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx,yy;
        
        xx = evt.getXOnScreen();
        yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(OfficerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OfficerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OfficerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OfficerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OfficerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Wer;
    public javax.swing.JTextField cty;
    private javax.swing.JTextField eid;
    public javax.swing.JLabel epro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea myprof;
    public javax.swing.JTextField passs;
    public javax.swing.JTextField pno;
    public javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
