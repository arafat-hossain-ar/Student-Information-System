/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.information.system;

import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Arafat Hossain Ar
 */
public class AddStudents extends javax.swing.JFrame {

    /**
     * Creates new form AddStudents
     */
    Connection conn;
    ResultSet rs;
    PreparedStatement ps;
    PlaceHolder holder;
    int key = 0;

    public AddStudents() {
        initComponents();
        conn = DatabaseConnection.ConnectDb();
        try {
            setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/student_registration_64px.png")));

        } catch (Exception ex) {
            System.out.println(ex);
        }
        holder = new PlaceHolder(name, Color.GRAY, Color.black, "Name", false, "Times New Roman", 18);
        holder = new PlaceHolder(phone, Color.GRAY, Color.black, "Phone", false, "Times New Roman", 18);
        holder = new PlaceHolder(nid, Color.GRAY, Color.black, "NID Number", false, "Times New Roman", 18);
        holder = new PlaceHolder(address, Color.GRAY, Color.black, "Address", false, "Times New Roman", 18);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nid = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        saveSData = new keeptoo.KButton();
        cancelButton = new keeptoo.KButton();
        dob = new datechooser.beans.DateChooserCombo();
        startDate = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        dis = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        statusbox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Student");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/student_registration_64px_white.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Student");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 94, -1, -1));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 96, 302, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Phone:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 152, -1, -1));

        phone.setBackground(new java.awt.Color(255, 255, 255));
        phone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(0, 0, 0));
        phone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneKeyTyped(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 152, 302, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NID:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 207, -1, -1));

        nid.setBackground(new java.awt.Color(255, 255, 255));
        nid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nid.setForeground(new java.awt.Color(0, 0, 0));
        nid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nidKeyTyped(evt);
            }
        });
        jPanel1.add(nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 209, 302, -1));

        address.setBackground(new java.awt.Color(255, 255, 255));
        address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 266, 302, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Address:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 264, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Date of Birth:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 325, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Start Date:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 387, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Discription:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 519, -1, -1));

        saveSData.setText("Save");
        saveSData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveSData.setkHoverEndColor(new java.awt.Color(0, 102, 102));
        saveSData.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        saveSData.setkHoverStartColor(new java.awt.Color(0, 102, 51));
        saveSData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSDataActionPerformed(evt);
            }
        });
        jPanel1.add(saveSData, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 661, 122, 37));

        cancelButton.setText("Cancel");
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelButton.setkHoverColor(new java.awt.Color(153, 153, 153));
        cancelButton.setkHoverEndColor(java.awt.Color.red);
        cancelButton.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        cancelButton.setkHoverStartColor(new java.awt.Color(255, 102, 0));
        cancelButton.setkStartColor(java.awt.Color.red);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 661, 122, 37));

        dob.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(230, 230, 230),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(230, 230, 230),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(230, 230, 230),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                    new java.awt.Color(230, 230, 230),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dob.setCalendarBackground(new java.awt.Color(255, 255, 255));
    dob.setCalendarPreferredSize(new java.awt.Dimension(300, 200));
    dob.setFieldFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 14));
    jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 325, 302, -1));

    startDate.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                new java.awt.Color(230, 230, 230),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                new java.awt.Color(230, 230, 230),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                new java.awt.Color(230, 230, 230),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12),
                new java.awt.Color(230, 230, 230),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
startDate.setCalendarBackground(new java.awt.Color(255, 255, 255));
startDate.setCalendarPreferredSize(new java.awt.Dimension(300, 200));
startDate.setWeekStyle(datechooser.view.WeekDaysStyle.SHORT);
startDate.setFieldFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 14));
jPanel1.add(startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 383, 302, -1));

dis.setBackground(new java.awt.Color(255, 255, 255));
dis.setColumns(10);
dis.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
dis.setForeground(new java.awt.Color(0, 0, 0));
dis.setRows(3);
jScrollPane1.setViewportView(dis);

jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 519, 302, 116));

jLabel10.setBackground(new java.awt.Color(0, 0, 0));
jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
jLabel10.setForeground(new java.awt.Color(0, 0, 0));
jLabel10.setText("Status:");
jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 452, 60, -1));

statusbox.setBackground(new java.awt.Color(255, 255, 255));
statusbox.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
statusbox.setForeground(new java.awt.Color(0, 0, 0));
statusbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Pending", "Admitted" }));
statusbox.setBorder(null);
jPanel1.add(statusbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 451, 302, -1));

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveSDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSDataActionPerformed
        // TODO add your handling code here:
        if (statusbox.getSelectedItem().equals("None")) {
            key = 5;
        } else if (statusbox.getSelectedItem().equals("Pending")) {
            key = 4;
        } else {
            key = (int) Math.floor(Math.random() * (999999 - 1 + 1) + 1);
        }
        if (name.getText().equals("Name") || name.getText().equals("")) {
            PopUp popUp = new PopUp();
            popUp.setVisible(true);
            popUp.setHeader.setText("Error!");
            popUp.setHeader.setForeground(Color.red);
            popUp.setMsg.setText("Please enter Name.");

        } else if (phone.getText().equals("Phone") || phone.getText().equals("")) {
            PopUp popUp = new PopUp();
            popUp.setVisible(true);
            popUp.setHeader.setText("Error!");
            popUp.setHeader.setForeground(Color.red);
            popUp.setMsg.setText("Please enter Phone number.");
        } else if (nid.getText().equals("NID Number") || nid.getText().equals("")) {
            PopUp popUp = new PopUp();
            popUp.setVisible(true);
            popUp.setHeader.setText("Error!");
            popUp.setHeader.setForeground(Color.red);
            popUp.setMsg.setText("Please enter NID Number.");
        } else if (address.getText().equals("Address") || address.getText().equals("")) {
            PopUp popUp = new PopUp();
            popUp.setVisible(true);
            popUp.setHeader.setText("Error!");
            popUp.setHeader.setForeground(Color.red);
            popUp.setMsg.setText("Please enter Address.");
        } else {

            try {
                String sql = "INSERT into studentsdata (name, phone, nid, address, dob, startd, dis, status, key) values (?,?,?,?,?,?,?,?,?)";
                ps = conn.prepareStatement(sql);
                ps.setString(1, name.getText());
                ps.setString(2, phone.getText());
                ps.setString(3, nid.getText());
                ps.setString(4, address.getText());
                ps.setString(5, dob.getText());
                ps.setString(6, startDate.getText());
                ps.setString(7, dis.getText());
                ps.setString(8, (String) statusbox.getSelectedItem());
                ps.setInt(9, key);
                ps.execute();
                rs.close();
                ps.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }

            PopUp popUp = new PopUp();
            popUp.setVisible(true);
            popUp.setHeader.setText("Success!");
            popUp.setHeader.setForeground(Color.green);
            popUp.setMsg.setText("Data saved successfully.");
            name.setText("");
            phone.setText("");
            nid.setText("");
            address.setText("");
            dis.setText("");
            statusbox.setSelectedIndex(0);

            holder = new PlaceHolder(name, Color.GRAY, Color.black, "Name", false, "Times New Roman", 18);
            holder = new PlaceHolder(phone, Color.GRAY, Color.black, "Phone", false, "Times New Roman", 18);
            holder = new PlaceHolder(nid, Color.GRAY, Color.black, "NID Number", false, "Times New Roman", 18);
            holder = new PlaceHolder(address, Color.GRAY, Color.black, "Address", false, "Times New Roman", 18);
            holder = new PlaceHolder(dis, Color.GRAY, Color.black, "Ex: Called about payment", false, "Times New Roman", 18);
        }
    }//GEN-LAST:event_saveSDataActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {

            PopUp popUp = new PopUp();
            popUp.setVisible(true);
            popUp.setHeader.setText("Error!");
            popUp.setHeader.setForeground(Color.red);
            popUp.setMsg.setText("Please enter numbers only.");

        }
    }//GEN-LAST:event_phoneKeyTyped

    private void nidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nidKeyTyped
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {

            PopUp popUp = new PopUp();
            popUp.setVisible(true);
            popUp.setHeader.setText("Error!");
            popUp.setHeader.setForeground(Color.red);
            popUp.setMsg.setText("Please enter numbers only.");

        }
    }//GEN-LAST:event_nidKeyTyped

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
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private keeptoo.KButton cancelButton;
    private javax.swing.JTextArea dis;
    private datechooser.beans.DateChooserCombo dob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nid;
    private javax.swing.JTextField phone;
    private keeptoo.KButton saveSData;
    private datechooser.beans.DateChooserCombo startDate;
    private javax.swing.JComboBox<String> statusbox;
    // End of variables declaration//GEN-END:variables
}
