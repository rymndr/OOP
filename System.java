import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;   
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class System extends JFrame {

    

    DefaultTableModel dtm;
    String sGender;
    String coursebox;
    int row;
    public System() {
        initComponents();
        dtm = new DefaultTableModel();
        setIconImage();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        studentid_tf = new javax.swing.JTextField();
        fname_tf = new javax.swing.JTextField();
        lname_tf = new javax.swing.JTextField();
        age_tf = new javax.swing.JTextField();
        address_tf = new javax.swing.JTextField();
        course_combo = new javax.swing.JComboBox<>();
        gender_combo = new javax.swing.JComboBox<>();
        create_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_view = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        search_tf = new javax.swing.JTextField();
        delete_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Information System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Student Information System");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Student ID:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("First Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Last Name:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Age:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Course");

        age_tf.setToolTipText("");

        course_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "ABCOMM", "BSA ", "BSBA ", "BSCM ", "BSHM ", "BSIT ", "BSMA ", "BSTM", " " }));
        course_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_comboActionPerformed(evt);
            }
        });

        gender_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        gender_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender_comboActionPerformed(evt);
            }
        });

        create_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        create_button.setText("Create");
        create_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_buttonActionPerformed(evt);
            }
        });

        update_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(studentid_tf)
                                .addComponent(fname_tf)
                                .addComponent(lname_tf)
                                .addComponent(age_tf)
                                .addComponent(gender_combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(address_tf))
                            .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(create_button)
                        .addGap(40, 40, 40)
                        .addComponent(update_button)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(age_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(address_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 33, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gender_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(course_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_button)
                    .addComponent(update_button))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tb_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Age", "Address", "Gender", "Course"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_viewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_view);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search ID:");

        search_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_tfActionPerformed(evt);
            }
        });
        search_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_tfKeyReleased(evt);
            }
        });

        delete_button.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(delete_button)
                        .addGap(197, 197, 197))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_button))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void deleteData(){
        studentid_tf.setText("");
        fname_tf.setText("");
        lname_tf.setText("");
        age_tf.setText("");
        address_tf.setText("");
        gender_combo.setSelectedIndex(0);
        course_combo.setSelectedIndex(0);
        
        
        
    }
    private void create_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_buttonActionPerformed
      
        String studentid = studentid_tf.getText();
        String firstname = fname_tf.getText();
        String lastname = lname_tf.getText();
        String age = age_tf.getText();
        String address = address_tf.getText();
        String gender = sGender;
        String course = coursebox;
               
        if(studentid.equals("")||firstname.equals("")||lastname.equals("")||age.equals("")||address.equals("")){
             JOptionPane.showMessageDialog(null,"Please fill all the details");
        
        }
        else{        
            dtm = (DefaultTableModel) tb_view.getModel();
            dtm.addRow(new Object[]{studentid,firstname,lastname,age,address,gender,course,});     
            tb_view.setModel(dtm); 
            JOptionPane.showMessageDialog(null,"Student record created");
            deleteData();
        
        
      
        
        try{
             FileWriter Writer = new FileWriter("C:\\Users\\Ren\\Desktop\\Database\\Information\\"+ studentid + "_"+ lastname+".txt");           
             Writer.write("StudentID: "+studentid+"\n"+"FirstName: "+firstname+"\n"+"LastName: "+lastname+"\n"+"Age: "+age+"\n"+"Address: "+address+"\n"+"Gender: "+gender+"\n"+"Course: "+course);
             Writer.write(java.lang.System.getProperty("line.separator"));
             Writer.close();           
             setVisible(true);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        }
    }//GEN-LAST:event_create_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        String studentid = studentid_tf.getText();
        String firstname = fname_tf.getText();
        String lastname = lname_tf.getText();
        String age = age_tf.getText();
        String address = address_tf.getText();
        String gender = sGender;
        String course = coursebox;
          
        File file = new File("C:\\Users\\Ren\\Desktop\\Database\\Information\\" + studentid_tf.getText() +"_"+lname_tf.getText() +".txt");
         
        if(studentid.equals("")||firstname.equals("")||lastname.equals("")||age.equals("")||address.equals("")||gender.equals("Select")||course.equals("Select")){
            if (file.exists()){
                if(file.delete()){
                    //none
                }
                else{
                    //none
                  
                }
            }else {
               
            }

            
          
        }
        else{      
            dtm.setValueAt(studentid_tf.getText(), row, 0);
            dtm.setValueAt(fname_tf.getText(), row, 1);
            dtm.setValueAt(lname_tf.getText(), row, 2);
            dtm.setValueAt(age_tf.getText(), row, 3);
            dtm.setValueAt(address_tf.getText(), row, 4);           
            dtm.setValueAt(gender_combo.getSelectedItem().toString(), row, 5);
            dtm.setValueAt(course_combo.getSelectedItem().toString(), row, 6);
            tb_view.setModel(dtm);      
            deleteData();
            create_button.setEnabled(true); 
        }     
        
          JOptionPane.showMessageDialog(null,"Update Succesfully!");        
      
        
        try{
             FileWriter Writer = new FileWriter("C:\\Users\\Ren\\Desktop\\Database\\Information\\"+ studentid + "_"+ lastname+".txt");           
             Writer.write("StudentID: "+studentid+"\n"+"FirstName: "+firstname+"\n"+"LastName: "+lastname+"\n"+"Age: "+age+"\n"+"Address: "+address+"\n"+"Gender: "+gender+"\n"+"Course: "+course);
             Writer.write(java.lang.System.getProperty("line.separator"));
             Writer.close();        
             setVisible(true);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void tb_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_viewMouseClicked
          dtm = (DefaultTableModel) tb_view.getModel();
          row = tb_view.getSelectedRow();
          studentid_tf.setText(""+tb_view.getValueAt(row, 0));
          fname_tf.setText(""+tb_view.getValueAt(row, 1));
          lname_tf.setText(""+tb_view.getValueAt(row, 2));
          age_tf.setText(""+tb_view.getValueAt(row, 3));
          address_tf.setText(""+tb_view.getValueAt(row, 4));        
          gender_combo.setSelectedItem(""+tb_view.getValueAt(row, 5));
          course_combo.setSelectedItem(""+tb_view.getValueAt(row, 6));
          create_button.setEnabled(false);  
    }//GEN-LAST:event_tb_viewMouseClicked

    private void course_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_comboActionPerformed
          coursebox = course_combo.getSelectedItem().toString();
    }//GEN-LAST:event_course_comboActionPerformed

    private void search_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tfKeyReleased
          dtm = (DefaultTableModel) tb_view.getModel();
            String search = search_tf.getText().toLowerCase();
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
            tb_view.setRowSorter(trs);
            trs.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_search_tfKeyReleased

    private void gender_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender_comboActionPerformed
         sGender = gender_combo.getSelectedItem().toString();
    }//GEN-LAST:event_gender_comboActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
     File file = new File("C:\\Users\\Ren\\Desktop\\Database\\Information\\" + studentid_tf.getText() +"_"+lname_tf.getText() +".txt");
     int choose = JOptionPane.showConfirmDialog(null,  "Are you sure you want to permanently remove this file??", "WARNING", JOptionPane.YES_NO_OPTION);

        if(choose == JOptionPane.YES_OPTION){
                
            if (file.exists()){

                 if(file.delete()){
                 deleteData();
                dtm.removeRow(row);
                JOptionPane.showMessageDialog(null, "Deletion successful");
                
             }   
        }
            

        }
        else if(choose == JOptionPane.NO_OPTION){
            // do nothing
        }
        else if(choose == JOptionPane.CLOSED_OPTION){
            // do nothing
        }       
        tb_view.setModel(dtm);
        create_button.setEnabled(true);
        
                                        
   
    }//GEN-LAST:event_delete_buttonActionPerformed

    private void search_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_tfActionPerformed
      
    }//GEN-LAST:event_search_tfActionPerformed
    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Icon.png")));

        
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_tf;
    private javax.swing.JTextField age_tf;
    private javax.swing.JComboBox<String> course_combo;
    private javax.swing.JButton create_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextField fname_tf;
    private javax.swing.JComboBox<String> gender_combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname_tf;
    private javax.swing.JTextField search_tf;
    private javax.swing.JTextField studentid_tf;
    private javax.swing.JTable tb_view;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables

    
}
