////////final

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class ClientMainMenu extends javax.swing.JFrame {
    
    private static ObjectOutputStream out; 
    private static ObjectInputStream in; 
    private static Socket socket;   
    
    public ClientMainMenu() {
       
        initComponents();
        
        
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowListener(){
            
            @Override
            public void windowClosed(WindowEvent we) {
            }

            @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosing(WindowEvent we){
                try{
                out.writeObject(null);
                }catch(IOException e){
                
                }
                System.exit(0);
            }

            @Override
            public void windowIconified(WindowEvent we) {
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
            }

            @Override
            public void windowActivated(WindowEvent we) {
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
            }

            
        });
       }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddDVD = new javax.swing.JButton();
        btnRentDVD = new javax.swing.JButton();
        btnReturnDVD = new javax.swing.JButton();
        btnListMovies = new javax.swing.JButton();
        btnListCustomers = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        addCustBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuMenu = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setForeground(new java.awt.Color(51, 153, 255));
        setMinimumSize(null);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        btnAddDVD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button add dvd.png"))); // NOI18N
        btnAddDVD.setContentAreaFilled(false);
        btnAddDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDVDActionPerformed(evt);
            }
        });

        btnRentDVD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button2.png"))); // NOI18N
        btnRentDVD.setContentAreaFilled(false);
        btnRentDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentDVDActionPerformed(evt);
            }
        });

        btnReturnDVD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (1).png"))); // NOI18N
        btnReturnDVD.setContentAreaFilled(false);
        btnReturnDVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnDVDActionPerformed(evt);
            }
        });

        btnListMovies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button all movies.png"))); // NOI18N
        btnListMovies.setContentAreaFilled(false);
        btnListMovies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListMoviesActionPerformed(evt);
            }
        });

        btnListCustomers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button (1) all cust.png"))); // NOI18N
        btnListCustomers.setContentAreaFilled(false);
        btnListCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCustomersActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button reports.png"))); // NOI18N
        btnReports.setContentAreaFilled(false);
        btnReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportsActionPerformed(evt);
            }
        });

        addCustBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button.png"))); // NOI18N
        addCustBtn.setToolTipText("");
        addCustBtn.setBorder(null);
        addCustBtn.setBorderPainted(false);
        addCustBtn.setContentAreaFilled(false);
        addCustBtn.setMaximumSize(new java.awt.Dimension(705, 609));
        addCustBtn.setMinimumSize(new java.awt.Dimension(705, 609));
        addCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(addCustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(addCustBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu.setText("File");

        menuMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        menuMenu.setText("Menu");
        menuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMenuActionPerformed(evt);
            }
        });
        menu.add(menuMenu);

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menu.add(menuExit);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListCustomers, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnListMovies)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddDVD)
                            .addComponent(btnRentDVD))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturnDVD)
                        .addGap(73, 73, 73))))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch)
                    .addComponent(btnReports))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListCustomers)
                        .addGap(36, 36, 36)
                        .addComponent(btnListMovies)
                        .addGap(19, 19, 19)
                        .addComponent(btnReports))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAddDVD)
                        .addGap(30, 30, 30)
                        .addComponent(btnRentDVD)
                        .addGap(20, 20, 20)
                        .addComponent(btnReturnDVD)))
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuMenuActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        ClientMainMenu mainMenuC = new ClientMainMenu(); 
        mainMenuC.setVisible(true);
        mainMenuC.setSize(this.getWidth(), this.getHeight());

        getContentPane().removeAll();
        add(mainMenuC);
        revalidate();
        repaint();
        
    }
    
    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
       
        
        
    }//GEN-LAST:event_formWindowStateChanged

    private void addCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustBtnActionPerformed
   
         
        CustomersMainFrame addRemCust = new CustomersMainFrame(); 
        addRemCust.setVisible(true);
        addRemCust.setSize(this.getWidth(), this.getHeight());

        getContentPane().removeAll();
        add(addRemCust);
        revalidate();
        repaint();
  
    }//GEN-LAST:event_addCustBtnActionPerformed

    private void btnAddDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDVDActionPerformed
        
        DVDMainFrame addRemDVD = new DVDMainFrame(); 
        addRemDVD.setVisible(true);
        addRemDVD.setSize(this.getWidth(), this.getHeight());

        getContentPane().removeAll();
        add(addRemDVD);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_btnAddDVDActionPerformed

    private void btnReturnDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnDVDActionPerformed
        
        ReturnDvd returnDVD = new ReturnDvd(); 
        returnDVD.setVisible(true);
        returnDVD.setSize(this.getWidth(), this.getHeight());

        getContentPane().removeAll();
        add(returnDVD);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_btnReturnDVDActionPerformed

    
    
    private void btnListCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCustomersActionPerformed
       
        CustomerListFrame listCust = new CustomerListFrame(); 
        listCust.setVisible(true);
        listCust.setSize(this.getWidth(), this.getHeight());

        getContentPane().removeAll();
        add(listCust);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_btnListCustomersActionPerformed

    private void btnListMoviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListMoviesActionPerformed
        
        MoviesListFrame listMovies = new MoviesListFrame(); 
        listMovies.setVisible(true);
        listMovies.setSize(this.getWidth(), this.getHeight());

        getContentPane().removeAll();
        add(listMovies);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_btnListMoviesActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // search all movies
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        
        Reports reports = new Reports(); 
        reports.setVisible(true);
        reports.setSize(this.getWidth(), this.getHeight());

        getContentPane().removeAll();
        add(reports);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnRentDVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentDVDActionPerformed
        
        DVDRentFrame rentDVD = new DVDRentFrame(); 
        rentDVD.setVisible(true);
        rentDVD.setSize(this.getWidth(), this.getHeight());

        getContentPane().removeAll();
        add(rentDVD);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_btnRentDVDActionPerformed

    private void menuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMenuActionPerformed

        ClientMainMenu clientMenu = new ClientMainMenu();
        this.dispose();
        clientMenu.show();

    }//GEN-LAST:event_menuMenuActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_menuExitActionPerformed

   
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
       
        
        //creates new Server thread
        (new Thread(new Server())).start();
        //Aleeps the main tread for 1 second to get the server running
         try{
        Thread.sleep(1000);
        }catch(InterruptedException e){
        e.printStackTrace();
        }
       //connect to server and open streams
        try{
        socket = new Socket("localhost", 30000); 
        out = new ObjectOutputStream(socket.getOutputStream()); 
        out.flush();
        in = new ObjectInputStream(socket.getInputStream()); 
        
        }catch(IOException e){
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientMainMenu().setVisible(true);
            }
        });
        
        
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustBtn;
    private javax.swing.JButton btnAddDVD;
    private javax.swing.JButton btnListCustomers;
    private javax.swing.JButton btnListMovies;
    private javax.swing.JButton btnRentDVD;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnReturnDVD;
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuMenu;
    // End of variables declaration//GEN-END:variables
    private static ArrayList<Customer> customerList; 
    private static ArrayList<DVD> dvdList; 
    private static ArrayList<Rental> rentals; 
    private ArrayList<DVD> available; 
    Customer customer; 

    //Requests all customers in database in an arraylist format
    public ArrayList customerTable(){
    customerList = new ArrayList<Customer>();
     try{
    out.writeObject("tableC");
    out.flush();
    customerList = (ArrayList) in.readObject(); 
    }catch(IOException e){
    e.printStackTrace();
    }catch(ClassNotFoundException e){
    e.printStackTrace();
    }
   return customerList; 
}
    
    //requests all DVD's in the database
    public ArrayList dvdTable(){
    dvdList = new ArrayList<DVD>();
    try{
    out.writeObject("dvdTab");
    out.flush();
    dvdList = (ArrayList) in.readObject(); 
    }catch(IOException e){
    e.printStackTrace();
    }catch(ClassNotFoundException e){
    e.printStackTrace();
    }
    
    
    return dvdList; 
    }
    
    //sends request to server to add new customer 
    public void addNewCustomer(String name, String surname, String phoneNumber){
        
        String message = name+"#"+surname+"#"+phoneNumber; 
        
        String command = "addNew";
        try{
        out.writeObject(command+message);
        out.flush();
        String reply = (String)in.readObject();
        JOptionPane.showMessageDialog(null, reply);
        }catch(IOException e){
        e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
      
} 
    //sends request to server to add new dvd
    public void addNewDvd(String title, String cat, String year){
    
        String message = title+"#"+cat+"#"+year; 
        String command = "addDvd"; 
        
         try{
        out.writeObject(command+message);
        out.flush();
        }catch(IOException e){
        e.printStackTrace();
        }
         try{
        String reply = (String) in.readObject(); 
        JOptionPane.showMessageDialog(null, reply);
         }catch(IOException e){
         }catch(ClassNotFoundException e){
         
         }
        
    }
    
    //sends request to server to remove customer
    public void removeCustomer(int i){
    try{
        
        String number = Integer.toString(i); 
        String command = "remove"; 
        out.writeObject(command+number);
        out.flush();
    }catch(IOException e){
    e.printStackTrace();
    }
    }
    
    //sends request to server to remove dvd
    public void removeDvd(int i){
    
        String command = "remDvd"; 
        String number = Integer.toString(i);
        try{
        out.writeObject(command+number);
        out.flush();
        }catch(IOException e){
        e.printStackTrace();
        }
        
    }
    
    //sends request to server to rent a dvd
    public void rentDVD(String cusNumber, String dvdNumber){
        
        String message = ""; 
        Double credit = 0.0; 
        Double price = 0.0;
        
        String rent = cusNumber+"#"+dvdNumber; 
        String command = "rentDv"; 
        try{
        out.writeObject(command+rent);
        message = (String) in.readObject();
        
        String details = message.substring(3); 
        String submessage = message.substring(0, 3);
        if(submessage.equals("yes")){
        JOptionPane.showMessageDialog(null, "Customer has successfully rented the DVD");
        }else if(submessage.equals("noo")){
            
             StringTokenizer rentToken = new StringTokenizer(details, "#");
                        while(rentToken.hasMoreElements()){
                         credit = Double.parseDouble(rentToken.nextToken()); 
                         price = Double.parseDouble(rentToken.nextToken());
                        }
                        
                        String amountDue = Double.toString(price-credit);
                        
            
        String[] buttons = { "Pay amount due","Load R100 credits", "Cancel" };
        int rc = JOptionPane.showOptionDialog(null,"Customer credit: "+credit+"\n Price: "+price+"\n Amount due: "+amountDue , "Insuficient credit",
        JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);
        if(rc == 0){
        out.writeObject("pay");
        }else if(rc == 1){
        out.writeObject("load");
        }
        }
        }catch(IOException e){
        e.printStackTrace();
        }catch(ClassNotFoundException e){
        e.printStackTrace();
        }
        
        
    }
    
    //sends request to server to retrieve all outstanding rentals
    public ArrayList rentals(String s){
    
    rentals = new ArrayList<Rental>();
     try{
    out.writeObject("rental"+s);
    out.flush();
    rentals = (ArrayList) in.readObject(); 
    }catch(IOException e){
    e.printStackTrace();
    }catch(ClassNotFoundException e){
    e.printStackTrace();
    }
   return rentals; 
}
   
    
    //sends request to server to return a rental 
    public void returnRentl(String rentalNumber, String cusNum, String dvdNum){
    
        String command = "retRen"; 
        String message = rentalNumber+"#"+cusNum+"#"+dvdNum; 
        
        try{
        out.writeObject(command+message);
        out.flush();
        String reply = (String)in.readObject();
        if(reply.equals("complete")){
         
        JOptionPane.showMessageDialog(null, "DVD successfully returned");
        }else{
        double rentCred = (Double)in.readObject(); 
        double penalty = (Double)in.readObject(); 
        
        //Custom JOptionPane
        String[] buttons = { "Pay amount due", "Cancel" };
        int rc = JOptionPane.showOptionDialog(null, reply+"\n Credit amount: "+rentCred+"\n Penalty cost: "+penalty
        +"\n Amount payable: "+(penalty-rentCred), "Insuficient credit",
        JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[1]);
        System.out.println(rc);
        
      if(rc == 0){
      //pay aamount due
      out.writeObject("pay");
      
      }
       
        }
        }catch(IOException e){
        e.printStackTrace();
        }catch(ClassNotFoundException e){
        e.printStackTrace();
        }
    
    
    }
    
    //sends request to server to retrieve daily rentals
    public ArrayList getDailyRentals(String date){
    
        rentals = new ArrayList<Rental>();
        
        String command = "dayRen"; 
    try{
    out.writeObject(command+date);
    rentals = (ArrayList)in.readObject(); 
    }catch(IOException e){
    e.printStackTrace();
    }catch(ClassNotFoundException e){
    e.printStackTrace();
    }
    return rentals; 
    }
    
    
   
//closes all sockets and streams
public void closeStreams(){
try{
in.close();
out.close();
socket.close();
System.exit(0); 
}catch(IOException e){
e.printStackTrace();
}
}



}
