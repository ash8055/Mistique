/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystique;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;   
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author hp
 */
public class formDecode extends javax.swing.JDialog {

 BufferedImage img=null;
    int MaxX, MaxY,i,j;
    public formDecode(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Decoding - Mystique");
        setBounds(new java.awt.Rectangle(400, 22, 0, 0));
        setPreferredSize(new java.awt.Dimension(670, 658));
        setResizable(false);

        jLabel1.setText("Choose Image : ");

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Image Chosen : ");

        jLabel4.setText("Hidden Message : ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Decode");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("Go to Encoding>>>>>");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea1.setText("");
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jfc.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpeg", "jpg", "png", "bmp", "gif", "dib"));
        jfc.setAcceptAllFileFilterUsed(false);
        int ret = jfc.showOpenDialog(this);

        if(ret==JFileChooser.APPROVE_OPTION)
        {
            try
            {
                File file = jfc.getSelectedFile();

                img = ImageIO.read(file);
                Image dimg =  img.getScaledInstance(500, 347, Image.SCALE_SMOOTH);
                jLabel3.setIcon( new ImageIcon(dimg));
                jButton2.setEnabled(true);
            }
            catch(IOException ex)
            {
                JOptionPane.showMessageDialog(rootPane, "Cannot open selected image!", "Steganography", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MaxX =img.getWidth();
        MaxY =img.getHeight();
        PinDecode obj =new PinDecode(Mystique.form1, true);
        obj.setVisible(true);
        String code = obj.get();
        int p=Integer.parseInt(code);
        int pin=getPin();
        if(pin==p)
        {
            int Result=getLength();

            byte[] bytes = new byte[Result];

            for(int x = 0;x<Result;x++)
            {
                bytes[x]=getMessage();
            }
            String msg =  new String(bytes);
            jTextArea1.setText(jTextArea1.getText()+msg);
            jButton2.setEnabled(false);
            jTextArea1.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Cannot Decode");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        this.dispose();
        formEncode obj =new formEncode(Mystique.form1,true);
        obj.setVisible(true);
        
    }//GEN-LAST:event_jLabel5MouseClicked
private int getPin()
{
 int pin=0,Count=0; 
    Count=0;
        for (i = 0; i < MaxX && Count < 32;) {
            for (j = 0; j < MaxY && Count < 32; j++, Count++) {
                int rgb = img.getRGB(i, j);
                int LenBit = mystique.CommonFunctions.getBit(rgb, 0);
                pin = mystique.CommonFunctions.setBit(pin, Count, LenBit);
            }
            if(j==MaxY)
            {
                i++;
                j=0;
            }
            
        }  
        return pin;   
}

private int getLength() {
    int Result=0,Count=0; 
    Count=0;
        for (; i < MaxX && Count < 32;) {
            for (; j < MaxY && Count < 32; j++, Count++) {
                int rgb = img.getRGB(i, j);
                int LenBit = mystique.CommonFunctions.getBit(rgb, 0);
                Result = mystique.CommonFunctions.setBit(Result, Count, LenBit);
            }
            if(j==MaxY)
            {
                i++;
                j=0;
            }
            
        }  
        return Result;
}
private byte getMessage(){
    
        int Count=0;
        byte n=0;
        for (; i < MaxX && Count < 8;) {
            for (; j < MaxY && Count < 8; j++, Count++) {
                int rgb = img.getRGB(i, j);
                int Bit = mystique.CommonFunctions.getBit(rgb, 0);
                n  = (byte) mystique.CommonFunctions.setBit(n, Count, Bit);   
                
            }
            if(j==(MaxY))
                {    
                    j=0;
                    i++;
                }
            
        }
        return n;
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
            java.util.logging.Logger.getLogger(formDecode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formDecode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formDecode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formDecode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formDecode dialog = new formDecode(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
