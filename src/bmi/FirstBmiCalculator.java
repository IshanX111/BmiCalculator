/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

/**
 *
 * @author User
 */
public class FirstBmiCalculator extends javax.swing.JFrame {
       int flag=0;
       int test=0;
       ButtonGroup sex=new ButtonGroup();
    /**
     * Creates new form FirstBmiCalculator
     */
    boolean a=false;
    public FirstBmiCalculator() {
        initComponents();
        Screen.setVisible(false);
        sex.add(Male);
        
        sex.add(Female);
        
        
        
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
        first_Name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Age = new javax.swing.JComboBox<>();
        cpp = new javax.swing.JCheckBox();
        show_details = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Screen = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProList = new javax.swing.JList<>();
        cbProlist = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        first_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_NameActionPerformed(evt);
            }
        });

        last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_nameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BMI CALCULATOR");

        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        Age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "79", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80" }));
        Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeActionPerformed(evt);
            }
        });

        cpp.setText("Suggestions");
        cpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cppActionPerformed(evt);
            }
        });

        show_details.setText("Show Details");
        show_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_detailsActionPerformed(evt);
            }
        });

        jLabel4.setText("Age");

        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });

        Screen.setColumns(20);
        Screen.setRows(5);
        jScrollPane1.setViewportView(Screen);

        jLabel5.setText("Height(cm)");

        jLabel6.setText("Weight(kg)");

        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });

        ok.setText("Ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(ProList);

        cbProlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProlistActionPerformed(evt);
            }
        });

        jLabel7.setText("Users");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(first_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(show_details)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ok)
                                    .addComponent(cbProlist, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delete)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpp)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Male, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Female))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5)))
                                        .addGap(5, 5, 5)
                                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Add)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(first_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(Add)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Male)
                            .addComponent(Female))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cpp)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(show_details)
                                    .addComponent(ok))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbProlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(delete)
                                .addGap(12, 12, 12)
                                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeActionPerformed

    private void show_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_detailsActionPerformed
        // TODO add your handling code here:
       if(flag==0){
            Screen.setVisible(true);
            show_details.setText("Hide Details");
            flag=1;
       }
       else{
            Screen.setVisible(false);
            show_details.setText("Show Details");
            flag=0;
           
       }
        /*if(flag==0){
            
            Screen.setVisible(true);
            
        show_details.setText("Hide Details");
        flag=1;
        }
        else {
            Screen.setVisible(false);
            String f="";
        
            String l="";
            String sex1="";
             String Java="";
        
            String Cpp="";
        
             String Php="";
            show_details.setText("Show details");
            flag=0;
        }
        
        String f=first_Name.getText();
        
        String l=last_name.getText();
        
        String sex1="";
        String Java="";
        
        String Cpp="";
        
        String Php="";
        int age=Integer.parseInt(Age.getSelectedItem().toString());
        if(Male.isSelected()){
            sex1="Male";
        }
        else{
            if(Female.isSelected()){
                sex1="Female";
            }
        }
        
        
        if(cpp.isSelected()){
            Cpp="CPP";
            
        }
        
        if(php.isSelected()){
            Php="Php";
            
        }
        double res=Double.parseDouble(height.getText());
        
        double res1=Double.parseDouble(weight.getText());
        
        double finalres=(res/(res1*res1))/10000;
        
        
       Screen.append("Name : "+f+" "+l+"\n");
       Screen.append("Sex : "+sex1+"\n");
       Screen.append("Age: "+age+"\n");
       Screen.append("Proficiency : "+Cpp+"\n");
       Screen.append("Proficiency : "+Php+"\n");
       if(finalres<=18.5){
           Screen.append("Underweight\n");
       }
       else if(finalres>18.5 && finalres<24.5){
           Screen.append("Normal\n");
       }
       else if(finalres>24.5 && finalres<29.9){
           Screen.append("Overweight\n");
       }
       else{
           Screen.append("Obese\n");
       }
       test=1;
       
        */
        
    }//GEN-LAST:event_show_detailsActionPerformed

    private void first_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_NameActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed

    private void cppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cppActionPerformed

    private void last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_last_nameActionPerformed

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:
       /* if(flag==0){
            
        Screen.setVisible(true);
            
        show_details.setText("Hide Details");
        flag=1;
        }*/
        //else {
            //Screen.setVisible(false);
            //String f="";
        
            //String l="";
            //String sex1="";
             //String Java="";
        
            //String Cpp="";
        
             //String Php="";
            //show_details.setText("Show details");
            //flag=0;
        //}
        
        String f=first_Name.getText();
        
        String l=last_name.getText();
        
        String sex1="";
        String Java="";
        
        String Cpp="";
        
        String Php="";
        int age=Integer.parseInt(Age.getSelectedItem().toString());
        if(Male.isSelected()){
            sex1="Male";
        }
        else{
            if(Female.isSelected()){
                sex1="Female";
            }
        }
        double res=Double.parseDouble(height.getText());
        
        double res1=Double.parseDouble(weight.getText());
        
        double finalres=(res1/(res*res))*10000;
        
        if(cpp.isSelected()){
            Screen.append("Name : "+f+" "+l+"\n");
            Screen.append("Sex : "+sex1+"\n");
            Screen.append("Age: "+age+"\n");
            if(finalres<=18.5){
            Screen.append("Underweight\n");
            Cpp="You should Eat More Fat\n\n";
            Screen.append("Suggestions : "+Cpp+"\n");
            
            }
            else if(finalres>18.5 && finalres<24.5){
                Screen.append("Normal\n\n\n");
                Cpp="Congrats your BMI is perfect\n\n";
                Screen.append("Suggestions : "+Cpp+"\n");
            }
            else if(finalres>24.5 && finalres<29.9){
                Screen.append("Overweight\n\n\n");
                Cpp="Exercise a little bit\n\n";
            Screen.append("Suggestions : "+Cpp+"\n");
            }
            else{
                Screen.append("Obese\n\n\n");
                Cpp="You should Exercise\n\n";
                Screen.append("Suggestions : "+Cpp+"\n");
            } 
            
        } else {
            
            Screen.append("Name : "+f+" "+l+"\n");
            Screen.append("Sex : "+sex1+"\n");
            Screen.append("Age: "+age+"\n");
           
            
            if(finalres<=18.5){
                Screen.append("Underweight\n\n\n");
            }
            else if(finalres>18.5 && finalres<24.5){
                Screen.append("Normal\n\n\n");
            }
            else if(finalres>24.5 && finalres<29.9){
                Screen.append("Overweight\n\n\n");
            }
            else{
                Screen.append("Obese\n\n\n");
            }   }
        
       
        
        
        
       
        
        
       //Screen.append(""+finalres);
        
              test=1;
      // jList.add(first_Name.getText());
       
        
    }//GEN-LAST:event_okActionPerformed

    private void cbProlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbProlistActionPerformed
    DefaultListModel model=new DefaultListModel(); 
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        info.setText("");
        cbProlist.addItem(last_name.getText());
        model.addElement(last_name.getText());
        ProList.setModel(model);
        
        
        
        
    }//GEN-LAST:event_AddActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
       
       if(cbProlist.getItemCount()!=0 && !model.isEmpty() ){
        cbProlist.removeItemAt(cbProlist.getSelectedIndex());
        model.removeElementAt(ProList.getSelectedIndex());  
       }
       else{
           info.setText("Null");
       }
       
       
             
       
       
        
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(FirstBmiCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstBmiCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstBmiCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstBmiCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstBmiCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> Age;
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JList<String> ProList;
    private javax.swing.JTextArea Screen;
    private javax.swing.JComboBox<String> cbProlist;
    private javax.swing.JCheckBox cpp;
    private javax.swing.JButton delete;
    private javax.swing.JTextField first_Name;
    private javax.swing.JTextField height;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField last_name;
    private javax.swing.JButton ok;
    private javax.swing.JToggleButton show_details;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
