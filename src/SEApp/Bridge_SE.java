/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SEApp;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Thiwanka
 */
public class Bridge_SE extends javax.swing.JFrame {

    /**
     * Creates new form Bridge_SE
     */
    public Bridge_SE() {
        initComponents();
        loadTabale();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Computer Type", "Brand", "Model", "RAM", "GPU", "SSD"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ps2.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("msi");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/acerlo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("acer");

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add MSI DeskTop");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add Acer Laptop");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(80, 80, 80))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(149, 149, 149))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bridge_SE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bridge_SE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bridge_SE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bridge_SE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bridge_SE().setVisible(true);
            }
        });
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
    public void loadTabale(){
         desktopPc dp = new desktopPc(new MSI(),new X592());
         dp.createCom();
         laptopPc lp = new laptopPc(new Acer(), new Z124());
         lp.createCom();
         
         //Desktop
         String deskR = dp.RAM;
         String deskG = dp.GPU;
         String deskS = dp.SSD;
         String deskb = dp.brand.toString();
         String deskm = dp.model.toString();
         
         //Laptop
         String lapR = lp.RAM;
         String lapG = lp.GPU;
         String lapS = lp.SSD;
         String lapb = lp.brand.toString();
         String lapm = lp.model.toString();
      
         
            TableModel tm = jTable1.getModel();
            DefaultTableModel dtm = (DefaultTableModel) tm;
            Vector<String> v = new Vector<>();
            v.add("Desktop Computer");
            v.add(deskb);
            v.add(deskm);
            v.add(deskR);
            v.add(deskG);
            v.add(deskS);
            
            Vector<String> v2 = new Vector<>();
            v2.add("Laptop Computer");
            v2.add(lapb);
            v2.add(lapm);
            v2.add(lapR);
            v2.add(lapG);
            v2.add(lapS);
            
            dtm.addRow(v);
            dtm.addRow(v2);
    }
    
}
abstract class computerType{  //Super class
    
    Brand brand;
    Model model;
    String RAM = "8GB";
    String GPU = "Nvidia x20 2GB";
    String SSD = "Kingston 250GB";
    

    public computerType(Brand brand,Model model) {
        this.brand = brand;
        this.model = model;
    }
    
    
public abstract void createCom();
}
 


class desktopPc extends computerType{

    public desktopPc(Brand brand,Model model) {
        super(brand,model);
    }
    
    @Override
    public void createCom() {
        String comtype = "Desktop Computer";
        System.out.println(comtype);
        model.fillModel();
        brand.fillBrand();

        
        String desktopRam = super.RAM;
        String desktopGpu = super.GPU;
        String desktopSsd = super.SSD;
        
        System.out.println(desktopRam);
        System.out.println(desktopGpu);
        System.out.println(desktopSsd);
    }
    
}
class laptopPc extends computerType{

    public laptopPc(Brand brand,Model model) {
        super(brand,model);
    }
  
    @Override
    public void createCom() {
         String comtype = "Laptop Computer";
        System.out.println(comtype);
        model.fillModel();
        brand.fillBrand();
        
        String laptopRam = super.RAM;
        String laptopGpu = super.GPU;
        String laptopSsd = super.SSD;
        
        System.out.println(laptopRam);
        System.out.println(laptopGpu);
        System.out.println(laptopSsd);
    }
    
}
interface Brand{
   public abstract void fillBrand(); 
}
class MSI implements Brand{    
    @Override
    public void fillBrand() {
        String DesktopBrand="MSI";
        System.out.println(DesktopBrand);
    }
        
   
}
class Acer implements Brand{

    @Override
    public void fillBrand() {
        String laptopBrand = "MSI";
        System.out.println(laptopBrand);
    }
    
}
interface Model{
    public abstract void fillModel();
}
class X592 implements Model{

    @Override
    public void fillModel() {
        String desktopBrand = "X592";
        System.out.println(desktopBrand);
    }
    
}
class Z124 implements Model{

    @Override
    public void fillModel() {
        String laptopBrand = "Z124";
        System.out.println(laptopBrand);
        
    }
}
