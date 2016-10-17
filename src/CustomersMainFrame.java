
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CustomersMainFrame extends javax.swing.JPanel {

   
    public CustomersMainFrame() {
        initComponents();
        //populates tatble when program is started
        getTableContents(); 
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfName = new javax.swing.JTextField();
        txfSurname = new javax.swing.JTextField();
        txfPhone = new javax.swing.JTextField();
        addNewCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        removeCustomer = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));
        setMinimumSize(new java.awt.Dimension(740, 450));
        setPreferredSize(new java.awt.Dimension(740, 450));

        jLabel1.setText("Name: ");

        jLabel2.setText("Surname:");

        jLabel3.setText("Phone Number");

        txfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNameActionPerformed(evt);
            }
        });

        txfSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSurnameActionPerformed(evt);
            }
        });

        addNewCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/addcust.png"))); // NOI18N
        addNewCustomer.setContentAreaFilled(false);
        addNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCustomerActionPerformed(evt);
            }
        });

        customerTable.setBackground(new java.awt.Color(255, 255, 51));
        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Num", "Name", "Surname", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTable);
        if (customerTable.getColumnModel().getColumnCount() > 0) {
            customerTable.getColumnModel().getColumn(0).setResizable(false);
            customerTable.getColumnModel().getColumn(1).setResizable(false);
            customerTable.getColumnModel().getColumn(3).setResizable(false);
        }

        removeCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remove cust.png"))); // NOI18N
        removeCustomer.setContentAreaFilled(false);
        removeCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(addNewCustomer)))
                .addGap(96, 96, 96))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(removeCustomer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(59, 59, 59)
                                .addComponent(jLabel3))
                            .addComponent(txfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(addNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeCustomer)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCustomerActionPerformed

        ClientMainMenu clientM = new ClientMainMenu(); 
        
        String custName = txfName.getText(); 
        String custSurname = txfSurname.getText();
        String custCell = txfPhone.getText();
        
        if(custName.length()==0 || custSurname.length()==0 || custCell.length()==0)
        {
            JOptionPane.showMessageDialog(null, "All field must be entered!");
        }
        else
        {
        
            String nameUpper = custName.substring(0, 1).toUpperCase() + custName.substring(1); 
            String surnameUpper = custSurname.substring(0, 1).toUpperCase() + custSurname.substring(1); 


            txfName.setText("");
            txfSurname.setText("");
            txfPhone.setText("");

            clientM.addNewCustomer(nameUpper, surnameUpper, custCell);
            getTableContents(); 
        }
       
        
         
        
    }//GEN-LAST:event_addNewCustomerActionPerformed

    private void removeCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCustomerActionPerformed

        
      ClientMainMenu clientRemove = new ClientMainMenu(); 
      
        int row = customerTable.getSelectedRow();
        
        if(customerTable.getRowSorter()!=null)
        {
            row = customerTable.getRowSorter().convertRowIndexToModel(row); 
        }
        else
        {
            row = customerTable.getSelectedRow();
        }
        
        if(row == -1)
        {
            JOptionPane.showMessageDialog(null, "A customer needs to be selected!");
        }
        else
        {
                
          int custID = (Integer) customerTable.getModel().getValueAt(row, 0); 
          clientRemove.removeCustomer(custID);
          model.removeRow(row);
          getTableContents(); 
    }
         

       
    }//GEN-LAST:event_removeCustomerActionPerformed

    private void txfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNameActionPerformed

    private void txfSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSurnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewCustomer;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeCustomer;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfPhone;
    private javax.swing.JTextField txfSurname;
    // End of variables declaration//GEN-END:variables
    private static DefaultTableModel model;
    private static ClientMainMenu clientView; 
    private static Customer customer; 
   
    
    public void getTableContents(){
    
       ClientMainMenu viewC = new ClientMainMenu(); 
       ArrayList<Customer> list = new ArrayList<Customer>(viewC.customerTable());
       
        //sorts the ArrayList in alphabetical order
       Collections.sort(list, new Comparator<Customer>()
       {
           @Override
           public int compare(Customer t, Customer t1) 
           {
               return t.getName().compareTo(t1.getName()); 
           }
       
       });
       
       //populates arrayList from table
        model = (DefaultTableModel) customerTable.getModel();
        model.setRowCount(0);
        for(int a = 0; a<list.size(); a++){
        model.addRow(new Object[]{list.get(a).getCustNumber(), list.get(a).getName(),list.get(a).getSurname(), 
        list.get(a).getPhoneNum()});
}
    
    
}

}
