/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.jfree.chart.ChartPanel;

/**
 * This is a Blood Glucose Data Analyzer. It takes data in and tells the user,
 * based on the data the is opened, where there have been patterns in the data 
 * over the last week.
 * @author Joseph
 */
public class BloodGlucoseGUI extends javax.swing.JFrame {

    private MyTableModel tabMod;
    private ChartPanel chartPanel;
    private DefaultListModel listMod;
    private JFileChooser jfc;
    
    /**
     * Constructor
     * Creates new form BloodGlucoseGUI
     */
    // I would put most of it in initComponents if I could 
    // edit that generated code.
    public BloodGlucoseGUI() {
        initComponents();
        jfc = new JFileChooser("Resources/Data");
        
        
        // For "commercial" use
        //jfc = new JFileChooser("C:\\Program Files\\BGDataAnalysis\\Data");
        
        tabMod = new MyTableModel();
        jTable2.setModel(tabMod);
        
        listMod = new DefaultListModel();
        jList1.setModel(listMod);
        
        JTableHeader th = jTable2.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue("Time");
        tc = tcm.getColumn(1);
        tc.setHeaderValue( "Blood Glucose" );
        th.repaint();
        
        notesTextArea.setLineWrap(true);
        notesTextArea.setWrapStyleWord(true);
        
        notesTextArea.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    e.consume();
            
                    ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
                    pu.add("Please don't press the ENTER button!");
                    pu.display();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        analyzeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        graphBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        saveGraphMenuItem = new javax.swing.JMenuItem();
        saveDataMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blood Glucose Data Analysis");
        setName(""); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12:00 am", null},
                {"1:00 am", null},
                {"2:00 am", null},
                {"3:00 am", null},
                {"4:00 am", null},
                {"5:00 am", null},
                {"6:00 am", null},
                {"7:00 am", null},
                {"8:00 am", null},
                {"9:00 am", null},
                {"10:00 am", null},
                {"11:00 am", null},
                {"12:00 pm", null},
                {"1:00 pm", null},
                {"2:00 pm", null},
                {"3:00 pm", null},
                {"4:00 pm", null},
                {"5:00 pm", null},
                {"6:00 pm", null},
                {"7:00 pm", null},
                {"8:00 pm", null},
                {"9:00 pm", null},
                {"10:00 pm", null},
                {"11:00 pm", null}
            },
            new String [] {
                "Time", "Blood Glucose"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setText("Date:");

        analyzeBtn.setText("Analyze");
        analyzeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeBtnActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        notesTextArea.setColumns(20);
        notesTextArea.setRows(5);
        jScrollPane3.setViewportView(notesTextArea);

        jLabel2.setText("Notes:");

        jLabel3.setText("Analysis:");

        graphBtn.setText("Graph");
        graphBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(graphBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analyzeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(graphBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(analyzeBtn)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Blood Glucose", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Graph", jPanel2);

        jMenu1.setText("File");

        newMenuItem.setText("New");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(newMenuItem);

        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(openMenuItem);

        saveGraphMenuItem.setText("Save Graph");
        saveGraphMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveGraphMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveGraphMenuItem);

        saveDataMenuItem.setText("Save Data");
        saveDataMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveDataMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveDataMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Opens a user specified file
     * @param evt 
     */
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        jfc.showOpenDialog(jfc);
        jfc.cancelSelection();
        
        for (int i = 0; i < tabMod.getMyData().length; i++)
            jTable2.setValueAt("", i, 1);
        
        tabMod.getDataFromFile(jfc.getSelectedFile());
        
        try
        {
            setTable();
        }
        catch (Exception ex) {}
    }//GEN-LAST:event_openMenuItemActionPerformed

    /**
     * Saves the data to a file
     * @param evt 
     */
    private void saveDataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveDataMenuItemActionPerformed
        FileIO fio = new FileIO();
        try
        {
            tabMod.setDate(dateTextField.getText());
            tabMod.setNotes(notesTextArea.getText());
            
            fio.outputToFile(tabMod.getDate(), tabMod.getMyData(), tabMod.getNotes());
            
            ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
            pu.add("Save Complete!");
            pu.display();
        }
        catch (Exception ex)
        {
            ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
            pu.add("Input a valid date:");
            pu.add("mm/dd/yy");
            pu.add("mm-dd-yy");
            pu.display();
            System.out.printf("%s", ex.getMessage());
        }
    }//GEN-LAST:event_saveDataMenuItemActionPerformed

    /**
     * Analyzes the data
     * @param evt 
     */
    private void analyzeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeBtnActionPerformed
        listMod.clear();
        
        int[] hls;
        
        try
        {
            AnalyzeData ad = new AnalyzeData(tabMod.getMyData(), tabMod.getDate());
            hls = ad.getToday();
            
            MyListModel list = new MyListModel(hls, tabMod.getMyData());
            
            for (int i = 0; i < list.getList().size(); i++)
            {
                listMod.addElement(list.getList().get(i));
            }
            
            //jList1.setModel(listMod);
        }
        catch (Exception ex)
        {
            ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
            pu.add("Invalid Input!");
            pu.display();
            ex.getMessage();
        }
        
    }//GEN-LAST:event_analyzeBtnActionPerformed

    /**
     * "Clears" the GUI of any data so that the user can input more
     * @param evt 
     */
    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed
        for (int i = 0; i < tabMod.getMyData().length; i++)
            tabMod.setValueAt("", i, 1);

        
        tabMod.resetDate();
        listMod.clear();
        notesTextArea.setText("");
        dateTextField.setText("");   
    }//GEN-LAST:event_newMenuItemActionPerformed

    /**
     * Graphs the data
     * @param evt 
     */
    private void graphBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphBtnActionPerformed
        try
        {
            tabMod.setDate(dateTextField.getText());
            tabMod.setNotes(notesTextArea.getText());
            
            ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
            pu.add("Added Data Successfully!");
            pu.display();
        }
        catch (Exception ex)
        {
            ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
            pu.add("Input a valid date:");
            pu.add("mm/dd/yy");
            pu.add("mm-dd-yy");
            pu.display();
            System.out.println("setTable() Error!");
        }
        
        try
        {
            GraphData graph = new GraphData(tabMod.getDate());
            chartPanel = new ChartPanel(graph.graphVsTime(tabMod.getMyData(), tabMod.getNames()));
            jTabbedPane1.setComponentAt(1, chartPanel);
        }
        catch (Exception ex)
        {
            ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
            pu.add("No Data Found!");
            pu.display();
        }
    }//GEN-LAST:event_graphBtnActionPerformed

    /**
     * Saves the generated Graph to a file
     * @param evt 
     */
    private void saveGraphMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveGraphMenuItemActionPerformed
        try
        {
            FileIO fio = new FileIO();
            fio.saveGraph(tabMod.getDate(), chartPanel.getChart());
            
            ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
            pu.add("Done saving the Chart.");
            pu.display();
        }
        catch (Exception ex)
        {
            ErrorGUIs.Popup pu = new ErrorGUIs.Popup();
            pu.add("Saving the chart Failed!");
            pu.display();
        }
    }//GEN-LAST:event_saveGraphMenuItemActionPerformed

    /**
     * Sets the jTable with data from the model
     * @throws Exception 
     */
    public void setTable() throws Exception
    {
        dateTextField.setText(tabMod.getDate());
        notesTextArea.setText(tabMod.getNotes());
        
        for (int i = 0; i < tabMod.getMyData().length; i++)
        {
            if (tabMod.getMyData()[i][1] != null)
                jTable2.setValueAt(tabMod.getMyData()[i][1], i, 1);
        }
    }
    
    /**
     * Launches the Application
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                /*if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }*/
                
                UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BloodGlucoseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodGlucoseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodGlucoseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodGlucoseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodGlucoseGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analyzeBtn;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton graphBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveDataMenuItem;
    private javax.swing.JMenuItem saveGraphMenuItem;
    // End of variables declaration//GEN-END:variables
}
