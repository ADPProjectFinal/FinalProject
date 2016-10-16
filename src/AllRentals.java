
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stean
 */
public class AllRentals extends javax.swing.JPanel {

    /**
     * Creates new form Reports
     */
    public AllRentals() {
        initComponents();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        allRentals = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        allRentals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rental Number", "Date Rented", "Date Returned", "Customer Number", "DVD Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(allRentals);

        jButton1.setText("Save Report");
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String path; 
        Date d1 = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
        String date = dateFormat.format(d1); 
        String fileName = "\\"+"(All Rentals for)"+date+".txt"; 
        
        
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.showSaveDialog(this); 
        
        try{
            
            
            
        path = chooser.getSelectedFile().getCanonicalPath(); 
       
       
        FileWriter fw = new FileWriter(path+fileName); 
        out = new BufferedWriter(fw); 
        out.write(String.format("%-20s", "Rantal Number")+String.format("%-20s", "Date Rented")+String.format("%-20s", "Date Returned")
        +String.format("%-20s", "Customer Number")+String.format("%-20s", "Customer Name")+String.format("%-20s", "DVD Number"));
        out.newLine();
        out.write("__________________________________________________________________________________________________");
        out.newLine();
        for(int i = 0; i<allRentals.getRowCount(); i++){
        out.newLine();
        for(int j = 0; j<5; j++){
        String jy = String.format("%-20s", allRentals.getValueAt(i, j).toString()); 
        out.write(jy);
        }    
        
        
        }
        
        
        out.close();
        }catch(IOException e){
        }catch(NullPointerException e){
        
        }
        
       
     
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allRentals;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
     private static DefaultTableModel model;
     private static Date date1, date2; 
     private static DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
     private static BufferedWriter out = null; 
     public void populateTable(){

           
    
       ClientMainView view = new ClientMainView(); 
       ArrayList<Rental> rentals = new ArrayList<Rental>(view.rentals(""));
       
      Collections.sort(rentals, new Comparator<Rental>(){
        @Override        
                public int compare(Rental t, Rental t1) {
                    
                  return t1.getDateRented().compareTo(t.getDateRented());  
                }
           
       
       });
      
           
          
         
      
      
       //populates the table from the arrayList
        model = (DefaultTableModel) allRentals.getModel();
        model.setRowCount(0);
        for(int a = 0; a<rentals.size(); a++){
        model.addRow(new Object[]{rentals.get(a).getRentalNumber(), rentals.get(a).getDateRented(), 
        rentals.get(a).getDateReturned(), rentals.get(a).getCusNumber(), rentals.get(a).dvdNumber()});
}

                

           }

} 
