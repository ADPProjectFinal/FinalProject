
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class DVDMainFrame extends javax.swing.JPanel {

   
    public DVDMainFrame() {
        initComponents();
        //popluates the table on startup
        getTableContents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dvdTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txfTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbmCat = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        txfYearReleased = new javax.swing.JTextField();
        addNewDvd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txfSearch = new javax.swing.JTextField();
        btnRemoveDVD = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));
        setMinimumSize(new java.awt.Dimension(740, 450));
        setPreferredSize(new java.awt.Dimension(740, 450));

        dvdTable.setBackground(new java.awt.Color(255, 255, 51));
        dvdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DVD Number", "Title", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dvdTable.setEditingColumn(1);
        jScrollPane1.setViewportView(dvdTable);

        jLabel1.setText("Title: ");

        txfTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTitleActionPerformed(evt);
            }
        });

        jLabel3.setText("Category: ");

        cbmCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horror", "Sci-fi", "Drama", "Romance", "Comedy", "Action", "Cartoon" }));
        cbmCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmCatActionPerformed(evt);
            }
        });

        jLabel2.setText("Year Released:");

        txfYearReleased.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfYearReleasedActionPerformed(evt);
            }
        });

        addNewDvd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adddvd.png"))); // NOI18N
        addNewDvd.setContentAreaFilled(false);
        addNewDvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewDvdActionPerformed(evt);
            }
        });

        jLabel4.setText("Search:");

        txfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfSearchActionPerformed(evt);
            }
        });
        txfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfSearchKeyReleased(evt);
            }
        });

        btnRemoveDVD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/removedvd.png"))); // NOI18N
        btnRemoveDVD.setContentAreaFilled(false);
        btnRemoveDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDVDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txfSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbmCat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel1)))
                                            .addComponent(jLabel2))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfYearReleased, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(addNewDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnRemoveDVD)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbmCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txfYearReleased, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addComponent(addNewDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveDVD)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txfYearReleasedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfYearReleasedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfYearReleasedActionPerformed

    private void addNewDvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewDvdActionPerformed

        ClientMainMenu clientDVD = new ClientMainMenu();
        
        String dvdTitle = txfTitle.getText();
        String yReleased = txfYearReleased.getText(); 
       
        
        if (dvdTitle.length()==0 || yReleased.length()==0)
        {
            JOptionPane.showMessageDialog(null, "Please fill in all the fields required!");
        }
        else
        {
        
            String category = cbmCat.getSelectedItem().toString(); 
            int yearReleased = Integer.parseInt(yReleased); 
            String year = "";  

            int yRel = Calendar.getInstance().get(Calendar.YEAR);
            
            if(yearReleased == yRel)
            {
                year = "true"; 
            }
        else
        {
            year = "false"; 
        }
        
        clientDVD.addNewDvd(dvdTitle, category, year);
        
        txfTitle.setText("");
        txfYearReleased.setText("");
        getTableContents(); 
        
        } 
        
        
       
    }//GEN-LAST:event_addNewDvdActionPerformed

    private void cbmCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmCatActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cbmCatActionPerformed

    private void txfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSearchKeyReleased
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
      
       
        sorter.setRowFilter(RowFilter.regexFilter(txfSearch.getText(), 1));
        dvdTable.setRowSorter(sorter);
        
       
    }//GEN-LAST:event_txfSearchKeyReleased

    private void btnRemoveDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDVDActionPerformed
      
        ClientMainMenu remDVD = new ClientMainMenu(); 
      
        int row = dvdTable.getSelectedRow();
        
        if(dvdTable.getRowSorter() !=null)
        {
            row = dvdTable.getRowSorter().convertRowIndexToModel(row); 
        }
        else
        {
            row = dvdTable.getSelectedRow();
        }
        
        if(row == -1)
        {
            JOptionPane.showMessageDialog(null, "Please select a DVD to remove first!");
        }
        else
        {     
            int dvdNumber = (Integer)dvdTable.getModel().getValueAt(row, 0); 

            remDVD.removeDvd(dvdNumber);
            model.removeRow(row);
            getTableContents(); 
        }   

    }//GEN-LAST:event_btnRemoveDVDActionPerformed

    private void txfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfSearchActionPerformed

    private void txfTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTitleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewDvd;
    private javax.swing.JButton btnRemoveDVD;
    private javax.swing.JComboBox<String> cbmCat;
    private javax.swing.JTable dvdTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txfSearch;
    private javax.swing.JTextField txfTitle;
    private javax.swing.JTextField txfYearReleased;
    // End of variables declaration//GEN-END:variables
    private static DefaultTableModel model;
    private static ClientMainMenu cView; 
    private static DVD dvd; 
    

 public void getTableContents()
 {
    
       ClientMainMenu cView = new ClientMainMenu(); 
       ArrayList<DVD> dvdList = new ArrayList<DVD>(cView.dvdTable());
       
       //sorts the ArrayList in alphabetical order
       Collections.sort(dvdList, new Comparator<DVD>()
       {
         @Override
           public int compare(DVD t1, DVD t2) 
           {
               return t1.getCategory().compareTo(t2.getCategory()); 
           }
           
       
       });
       
       //populates the table from the arrayList
        model = (DefaultTableModel) dvdTable.getModel();
        model.setRowCount(0);
        for(int a = 0; a<dvdList.size(); a++)
        {
            model.addRow(new Object[]{dvdList.get(a).getDvdNumber(), dvdList.get(a).getTitle(), dvdList.get(a).getCategory()});
        }
    
    
}
 

       
       
       
 }


