
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stean
 */
public class RentalsReportFrame extends javax.swing.JPanel {

   
    public RentalsReportFrame() {
        initComponents();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDailyRentals = new javax.swing.JTable();
        btnSaveReport = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 102, 102));
        setMinimumSize(new java.awt.Dimension(850, 500));
        setPreferredSize(new java.awt.Dimension(850, 500));

        selectDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDateActionPerformed(evt);
            }
        });

        jLabel1.setText("Select date:");

        tblDailyRentals.setBackground(new java.awt.Color(255, 255, 51));
        tblDailyRentals.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDailyRentals);

        btnSaveReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save report.png"))); // NOI18N
        btnSaveReport.setContentAreaFilled(false);
        btnSaveReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveReportActionPerformed(evt);
            }
        });

        jLabel2.setText("Day Rental Report");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectDate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(139, 139, 139)
                                .addComponent(btnSaveReport))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel2)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSaveReport))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDateActionPerformed
       
        
       ClientMainMenu cView = new ClientMainMenu();
       
       Date date = selectDate.getDate();
       
       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       String dd = dateFormat.format(date); 
       populateTable(dd);
        
    }//GEN-LAST:event_selectDateActionPerformed

    private void btnSaveReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveReportActionPerformed
       
        String filePath; 
        Date date1 = new Date();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
        String date = dateFormat.format(date1); 
        String fileName = "\\" + "(Daily rentals for: )" + date + ".txt"; 
        
        
        JFileChooser fChooser = new JFileChooser();
        fChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fChooser.showSaveDialog(this); 
        
        try
        {    
            filePath = fChooser.getSelectedFile().getCanonicalPath(); 


            FileWriter fw = new FileWriter(filePath + fileName); 
            bw = new BufferedWriter(fw); 
            
            bw.write(String.format("%-20s", "Rantal Number") + String.format("%-20s", "Date Rented") + String.format("%-20s", "Date Returned") + String.format("%-20s", "Customer Number") + String.format("%-20s", "DVD Number"));
            bw.newLine();
            
            bw.write("_________________________________________________________________________");
            bw.newLine();
            
            for(int cnt = 0; cnt<tblDailyRentals.getRowCount(); cnt++)
            {
                bw.newLine();
                for(int cnt1 = 0; cnt1<5; cnt1++)
                {
                    String rentalsData = String.format("%-20s", tblDailyRentals.getValueAt(cnt, cnt1).toString()); 
                    bw.write(rentalsData);
                }
        }
            
        bw.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, "IOException thrown");
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "NullPointerException thrown");
        }
        
       
        
        
    }//GEN-LAST:event_btnSaveReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker selectDate;
    private javax.swing.JTable tblDailyRentals;
    // End of variables declaration//GEN-END:variables
     private static DefaultTableModel model;
     private static BufferedWriter bw;
public void populateTable(String date)
{

           
    
       ClientMainMenu clientView = new ClientMainMenu(); 
       ArrayList<Rental> rentals = new ArrayList<Rental>(clientView.getDailyRentals(date));
       
        //populates the table from the arrayList
        model = (DefaultTableModel) tblDailyRentals.getModel();
        model.setRowCount(0);
        for(int a = 0; a<rentals.size(); a++)
        {
            model.addRow(new Object[]{rentals.get(a).getRentalNumber(), rentals.get(a).getDateRented(), rentals.get(a).getDateReturned(), rentals.get(a).getCusNumber(), rentals.get(a).dvdNumber()});
        }

                

}
}
