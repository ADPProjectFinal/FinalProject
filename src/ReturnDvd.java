
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class ReturnDvd extends javax.swing.JPanel {

    
    public ReturnDvd() {
        initComponents();
        populateTable(); 
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        rentalTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));
        setMinimumSize(new java.awt.Dimension(740, 450));

        rentalTable.setBackground(new java.awt.Color(255, 255, 51));
        rentalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rental Num", "Date Rented ", "Date Returned", "Customer Num", "DVD Num"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(rentalTable);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        ClientMainMenu cViewReturn = new ClientMainMenu();
        int rentNum = rentalTable.getSelectedRow(); 
        
        if(rentNum == -1)
        {
            JOptionPane.showMessageDialog(null, "Please select a rental before you can return one!");
        }
        else
        {
            if(rentalTable.getRowSorter()!=null)
            {
                rentNum = rentalTable.getRowSorter().convertRowIndexToModel(rentNum); 
            }
            else
            {
                rentNum = rentalTable.getSelectedRow();
            }
            String rentalNum = rentalTable.getModel().getValueAt(rentNum, 0).toString();
            String cusNum = rentalTable.getModel().getValueAt(rentNum, 3).toString(); 
            String dvdNum = rentalTable.getModel().getValueAt(rentNum, 4).toString(); 
            cViewReturn.returnRentl(rentalNum, cusNum, dvdNum); 
        }
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rentalTable;
    // End of variables declaration//GEN-END:variables
    private static DefaultTableModel model;
    
public void populateTable(){

       ClientMainMenu view = new ClientMainMenu(); 
       ArrayList<Rental> rentals = new ArrayList<Rental>(view.rentals("NA"));
      
      
       //populates the table from the arrayList
        model = (DefaultTableModel) rentalTable.getModel();
        model.setRowCount(0);
        for(int a = 0; a<rentals.size(); a++){
        model.addRow(new Object[]{rentals.get(a).getRentalNumber(), rentals.get(a).getDateRented(), 
        rentals.get(a).getDateReturned(), rentals.get(a).getCusNumber(), rentals.get(a).dvdNumber()});
}

}

}
