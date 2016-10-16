
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AddRemoveCustomer extends javax.swing.JFrame {

   
    public AddRemoveCustomer() {
        initComponents();
        //populates tatble on startup 
        getTableContents(); 
        
     
       
        
    }
public void addFrame(){
    
    this.setVisible(true);
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        surname = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        addNewCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        removeCustomer = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(740, 450));
        setPreferredSize(new java.awt.Dimension(0, 0));

        jLabel1.setText("Name: ");

        jLabel2.setText("Surname:");

        jLabel3.setText("Phone Number");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        addNewCustomer.setText("Add New Customer");
        addNewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewCustomerActionPerformed(evt);
            }
        });

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Num", "Name", "Surname", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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
        }

        removeCustomer.setText("Remove Customer");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(removeCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(90, 90, 90)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(addNewCustomer)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(addNewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeCustomer)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewCustomerActionPerformed

        ClientMainView k = new ClientMainView(); 
        
        String cusname = this.name.getText(); 
        String cussurname = this.surname.getText();
        String cusphoneNumber = this.phoneNumber.getText();
        if(cusname.trim().length()==0 || cussurname.trim().length()==0||cusphoneNumber.trim().length()==0){
        JOptionPane.showMessageDialog(null, "Pleas fill in all the fields");
        }else{
        
        String upperName = cusname.substring(0, 1).toUpperCase()+cusname.substring(1); 
        String upperSurname = cussurname.substring(0, 1).toUpperCase()+cussurname.substring(1); 
        
        
        this.name.setText("");
        this.surname.setText("");
        this.phoneNumber.setText("");
        
        k.addNewCustomer(upperName, upperSurname, cusphoneNumber);
        getTableContents(); 
        }
       
        
         
        
    }//GEN-LAST:event_addNewCustomerActionPerformed

    private void removeCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCustomerActionPerformed

        
      ClientMainView k = new ClientMainView(); 
      
        int row = customerTable.getSelectedRow();
        
        if(customerTable.getRowSorter()!=null){
        row = customerTable.getRowSorter().convertRowIndexToModel(row); 
        }else{
        row = customerTable.getSelectedRow();
        }
        
        if(row == -1){
        JOptionPane.showMessageDialog(null, "Please select a customer");
        }else{
                
          int cusNumber = (Integer)customerTable.getModel().getValueAt(row, 0); 
          k.removeCustomer(cusNumber);
          model.removeRow(row);
          getTableContents(); 
          
           
    }
         

       
    }//GEN-LAST:event_removeCustomerActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewCustomer;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton removeCustomer;
    private javax.swing.JTextField surname;
    // End of variables declaration//GEN-END:variables
    private static DefaultTableModel model;
    private static ClientMainView view; 
    private static Customer customer; 
   
    
    public void getTableContents(){
    
       ClientMainView view = new ClientMainView(); 
       ArrayList<Customer> list = new ArrayList<Customer>(view.customerTable());
       //sorts the ArrayList in alphabetical order
       Collections.sort(list, new Comparator<Customer>(){
           @Override
           public int compare(Customer t, Customer t1) {
               return t.getName().compareTo(t1.getName()); 
           }
       
       });
       
       //populates the table from the arrayList
        model = (DefaultTableModel) customerTable.getModel();
        model.setRowCount(0);
        for(int a = 0; a<list.size(); a++){
        model.addRow(new Object[]{list.get(a).getCustNumber(), list.get(a).getName(),list.get(a).getSurname(),list.get(a).getPhoneNum()});
}
    
    
}

}
