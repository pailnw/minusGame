
package jdelete;
import java.util.Random;
public class FDelete extends javax.swing.JFrame {

    public FDelete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        winner = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        num = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        winner.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        winner.setText("เกมลบเลข");

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("ปุ่ม -1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("ปุ่ม -2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        num.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        num.setText("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)
                        .addGap(63, 63, 63)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(winner))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(num)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(20, 20, 20)
                .addComponent(winner)
                .addGap(30, 30, 30)
                .addComponent(num)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        //ปุ่ม -1
        int count = Integer.parseInt(num.getText());
        count = count-1;
        num.setText(Integer.toString(count));
        if(count==1){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        winner.setText("คนชนะ");
        }else{
        
        Random rnd = new Random();
        int abc = rnd.nextInt(2)+1;
        System.out.println(abc);
        if(count==3){
        count = count-2;
        num.setText(Integer.toString(count));
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        winner.setText("คอมพิวเตอร์ชนะ");
        }else if(count==2){
        count = count-1;
        num.setText(Integer.toString(count));
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        winner.setText("คอมพิวเตอร์ชนะ");
        }else if(count==1){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        winner.setText("คอมพิวเตอร์ชนะ");
        }else{
        count = count-abc;
        num.setText(Integer.toString(count));
        }
      }
    }                                     

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {                                      
        //ปุ่ม -2
        int count = Integer.parseInt(num.getText());
        count = count-2;
        num.setText(Integer.toString(count));
        if(count==1){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        winner.setText("คนชนะ");
        }else{
        
        Random rnd = new Random();
        int abc = rnd.nextInt(2)+1;
        System.out.println(abc);
        if(count==3){
        count = count-2;
        num.setText(Integer.toString(count));
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        winner.setText("คอมพิวเตอร์ชนะ");
        }else if(count==2){
        count = count-1;
        num.setText(Integer.toString(count));
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        winner.setText("คอมพิวเตอร์ชนะ");
        }else if(count==1){
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        winner.setText("คอมพิวเตอร์ชนะ");
        }else{
        count = count-abc;
        num.setText(Integer.toString(count));
        }
      }
    }                                     

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {                                      
            //ปุ่ม Reset
        num.setText("10");
        winner.setText("เกมลบเลข");
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
    }                                     

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
            java.util.logging.Logger.getLogger(FDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel num;
    private javax.swing.JLabel winner;
    // End of variables declaration                   
}
