/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leo
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class OrderGUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public OrderGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        pin = new javax.swing.JTextField();
        phno = new javax.swing.JTextField();
        category = new javax.swing.JComboBox<>();
        items = new javax.swing.JComboBox<>();
        orders = new javax.swing.JComboBox<>();
        price = new javax.swing.JTextField();
        TotalCost = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("PIN");

        jLabel4.setText("Phone No:");

        jLabel5.setText("Category");

        jLabel6.setText("Items");

        jLabel7.setText("Price");

        jLabel8.setText("No of Orders");

        jLabel9.setText("Total Price");

        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Veg", "Non Veg" }));
        category.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryItemStateChanged(evt);
            }
        });
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        items.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemsItemStateChanged(evt);
            }
        });
        items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsActionPerformed(evt);
            }
        });

        orders.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        orders.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ordersItemStateChanged(evt);
            }
        });
        orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersActionPerformed(evt);
            }
        });

        price.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        price.setEnabled(false);

        TotalCost.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TotalCost.setEnabled(false);

        jButton1.setText("Place Your Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(items, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(category, javax.swing.GroupLayout.Alignment.LEADING, 0, 145, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orders, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TotalCost)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(items, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(orders, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void itemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemsActionPerformed

    private void categoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryItemStateChanged
        // TODO add your handling code here:
        Connection con;
        Statement st;
        ResultSet rs;
        String sql="";
        try
            
        {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Customers","root","");
               st=con.createStatement();
               sql="select prod_items from orders where prod_type='"+category.getSelectedItem()+"'";
               rs=st.executeQuery(sql);
               items.removeAllItems();
               while(rs.next())
               {
                   items.addItem(rs.getString("prod_items"));
                   
               }
            
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }       
        
        
    }//GEN-LAST:event_categoryItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int c = 0;
        //DATABASE IS STORED IN USERS TABLE
       Connection con;
       Statement st;
       c = ValidationCheck();
        
            
        if (c == 1) {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Customers","root","");
           String sql="";
           st=con.createStatement();
           sql="insert into Users values('"+name.getText()+"',";
           sql+="'"+address.getText()+"',";
           sql+="'"+pin.getText()+"',";
           sql+="'"+phno.getText()+"',";
           sql+="'"+category.getSelectedItem()+"',";
           sql+="'"+items.getSelectedItem()+"',";
           sql+="'"+orders.getSelectedItem()+"',";
           sql+="'"+TotalCost.getText()+"')";
           st.executeUpdate(sql);
           con.close();
           st.close();
           
       }
        
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(this, e);
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed
       
   }
    
       public int ValidationCheck()
       {
           //VALIDATION FOR NAME
           String s ="";
           s=name.getText();
           if(s.equals("")==true)
           {
               JOptionPane.showMessageDialog(this, "Name field cannot be blank");
               name.requestFocus();
               return 0;
           }
           for(int i=0;i<s.length();i++)
           {
               if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)==' ')
               {
                   
               }
               else
               {
                   JOptionPane.showMessageDialog(this, "Please Enter a Valid Name");
                   name.requestFocus();
                   return 0;
               }
           }
           
           //FOR ADDRESS 
           
           s=address.getText();
           if(s.equals("")==true)
           {
               JOptionPane.showMessageDialog(this, "Address field cannot be blank");
               address.requestFocus();
               return 0;
           }
           for(int i=0;i<s.length();i++)
           {
               if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9' || s.charAt(i)==' ' || s.charAt(i)=='/' || s.charAt(i)==',' || s.charAt(i)=='.')                
               {
                   
               }
               else
               {
                   JOptionPane.showMessageDialog(this, "Please Enter a Valid Address");
                   address.requestFocus();
                   return 0;
               }
           }
               
               // FOR PIN
               s=pin.getText();
               if(s.equals("")==true)
               {
                  JOptionPane.showMessageDialog(this, "PIN field cannot be blank");
                  pin.requestFocus();
                  return 0;
               }
               
                for(int i=0;i<s.length();i++)
                {
                    if(s.charAt(i)>='0' && s.charAt(i)<='9')
                    {
                        
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Please enter a valid PIN");
                        pin.requestFocus();
                        return 0;
                    }
                }
                
            //FOR PhoneNo
            s=phno.getText();
            if(s.equals("")==true)
            {  
              JOptionPane.showMessageDialog(this, "Phone Number field cannot be blank");
                  phno.requestFocus();
                  return 0;  
            }
            
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                {
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Please enter a valid Phone Number");
                    phno.requestFocus();
                    return 0;
                }
            }
            
           //For Category
           if(category.getSelectedItem()=="-Select")
           {
               JOptionPane.showMessageDialog(this, "Please choose your category");
               category.requestFocus();
               return 0;
           }
           
           JOptionPane.showMessageDialog(this, "Your order is placed");
           return 1;
       }
    
    private void itemsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemsItemStateChanged
        //TODO handling code here:
         Connection con;
        Statement st;
        ResultSet rs;
        String sql="";
        try
            
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Customers","root","");
               st=con.createStatement();
               sql="select prod_price from orders where prod_items='"+items.getSelectedItem()+"'";
               rs=st.executeQuery(sql);
               while(rs.next())
               {
                   price.setText(rs.getString("prod_price"));
                   
               }
               
        orders.setSelectedIndex(1);
        int num,cost=0,total=0;
        num=Integer.parseInt(String.valueOf(orders.getSelectedItem()));
        cost=Integer.parseInt(String.valueOf(price.getText()));
        total=cost*num;
        TotalCost.setText(String.valueOf(total));
        
        }
               
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }       
      
       
        
    }//GEN-LAST:event_itemsItemStateChanged

    private void ordersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ordersItemStateChanged
        // TODO add your handling code here:
        int num,cost=0,total=0;
        num=Integer.parseInt(String.valueOf(orders.getSelectedItem()));
        cost=Integer.parseInt(String.valueOf(price.getText()));
        total=cost*num;
        TotalCost.setText(String.valueOf(total));
        
    }//GEN-LAST:event_ordersItemStateChanged

    private void ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ordersActionPerformed

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
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TotalCost;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JComboBox<String> items;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> orders;
    private javax.swing.JTextField phno;
    private javax.swing.JTextField pin;
    private javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables
}
