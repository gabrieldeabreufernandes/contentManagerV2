package Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

/**
 * @author Gabriel Fernandes
 */
public class loadDevice extends javax.swing.JFrame {
    
    private main mainScreen = new main();
    
    /**
     * Creates new form loadDevice
     */
    public loadDevice() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTextFieldInsertDevice.setText(searchDevice());
    }
    
    
    static String searchDevice(){
        
        String buff = null;
        System.out.println("Searching devices...");

        //Creates a vector with de devices
        File[] roots = null;

        FileSystemView fs = FileSystemView.getFileSystemView();

        //verify if the OS are Windows.
        if (System.getProperties().getProperty("os.name").toLowerCase().contains("windows")) {

            //List the roots directories
            roots = File.listRoots();

            //Scrolls the vector
            for (File file : roots) {
                
                //Take the description of the directories
                String descricao = fs.getSystemTypeDescription(file);
                
                if (descricao != null) {
                    
                    // check if it's a removable disk
                    if (descricao.endsWith("removível")) {
                        
                        //Show device
                        System.out.println(file.getAbsolutePath());
                        buff = file.getAbsolutePath();
                    }
                }
            }       //verify is if Linux
        } else if (System.getProperties().getProperty("os.name").toLowerCase().contains("linux")) {

            //take all the directories mounted on /media
            roots = fs.getFiles(new File("/media/"), true);

            //Scrolls the vector
            for (File file : roots) {
                
                //Show device
                System.out.println(file.getAbsolutePath());
                buff = file.getAbsolutePath();
            }
        }
        
        return buff;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInsertDevice = new javax.swing.JLabel();
        jTextFieldInsertDevice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelInsertDevice.setText("Device");

        jTextFieldInsertDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInsertDeviceActionPerformed(evt);
            }
        });

        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/company_logo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/powered_by_actia_3.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelInsertDevice)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldInsertDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInsertDevice)
                    .addComponent(jTextFieldInsertDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldInsertDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInsertDeviceActionPerformed
        // TODO add your handling code here:
        
        jTextFieldInsertDevice.setText(searchDevice());
    }//GEN-LAST:event_jTextFieldInsertDeviceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(mainScreen == null){
            mainScreen = new main();
            mainScreen.setLocationRelativeTo(null);
            mainScreen.setVisible(true);
            mainScreen.setResizable(false);
        }else{
            mainScreen.setLocationRelativeTo(null);
            mainScreen.setVisible(true);
            mainScreen.setResizable(false);
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean isOK = true;
        
        File dir = new File("C:\\ACTIA\\ContentManager\\packages\\");
        //File arq = new File(dir, txtFieldRouteName.getText()+ ".txt");
        //String[] children = dir.list();

        /*
        if (children.length > 0) {
            System.out.println("Existe arquivo no diretorio..");
        }else{
            System.out.println("NAO existe arquivo no diretorio..");
        }*/
        
        if (dir.exists()) {
            //if(arq.exists()){
                System.out.println("Directory [packages] already exists !!!");
                //isOK = false;
                //JOptionPane.showMessageDialog(null,"Route Name invalid! This name has already been used...");
            //}else{
                //System.out.println("Directory [packages] does not exists, let's create it...");
                //try {
                //    arq.createNewFile();
                //} catch (IOException ex) {
                //    Logger.getLogger(create.class.getName()).log(Level.SEVERE, null, ex);
                //}
            //}
        }else{
            System.out.println("The directory [packages] does not exist, let's create it...");
            dir.mkdirs();
            //try {
            //    arq.createNewFile();
            //} catch (IOException ex) {
            //    Logger.getLogger(create.class.getName()).log(Level.SEVERE, null, ex);
            //}
        }
            
        File origem = new File("C:\\ACTIA\\ContentManager\\config\\");  
        File destino = new File("C:\\ACTIA\\ContentManager\\packages\\");  
        FileChannel oriChannel = null;  
        FileChannel destChannel = null;  

        try {  

            if (!destino.exists())  

                destino.mkdir();  

            File[] listaDeArquivos = origem.listFiles();  

            for (File file : listaDeArquivos) {  

                file.setLastModified(origem.lastModified());  

                // Cria channel na origem  
                oriChannel = new FileInputStream(file.getPath()).getChannel();  

                // Cria channel no destino  
                System.out.println("Copiando arquivo: " + file.getName());  
                destChannel = new FileOutputStream(destino + "\\"  
                        + file.getName()).getChannel();  

                // Copia conteúdo da origem no destino  
                destChannel.transferFrom(oriChannel, 0, oriChannel.size());  

                // Fecha channels  
                oriChannel.close();  
                destChannel.close();  
            }  

            //Runtime.getRuntime().exec("explorer " + destino.getAbsolutePath());    

        } catch (IOException e) {  

            String msg = e.getMessage();  

        } finally {  


            /*
            try {
                Thread.sleep(50);
                //JOptionPane.showMessageDialog(null,"Package Generate uccessfull");
                //Runtime.getRuntime().exec("explorer " + destino.getAbsolutePath());   
            } catch (InterruptedException ex) {
                Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            if (oriChannel != null && oriChannel.isOpen()) {  

                try {  
                    oriChannel.close();
                } catch (IOException ex) {
                    Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  

            if (destChannel != null && destChannel.isOpen()) {  

                try {  
                    destChannel.close();
                } catch (IOException ex) {
                    Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
            }
            //JOptionPane.showMessageDialog(null,"Package Generate uccessfull");
            /*
            try {   
                Runtime.getRuntime().exec("explorer " + destino.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
                
        File origemMedia = new File("C:\\ACTIA\\ContentManager\\media\\");  
        File destinoMedia = new File("C:\\ACTIA\\ContentManager\\packages\\");  
        FileChannel oriMediaChannel = null;  
        FileChannel destMediaChannel = null;  

        try {  

            if (!destinoMedia.exists())  

                destinoMedia.mkdir();  

            File[] listaDeArquivos = origemMedia.listFiles();  

            for (File file : listaDeArquivos) {  

                file.setLastModified(origemMedia.lastModified());  

                // Cria channel na origem  
                oriMediaChannel = new FileInputStream(file.getPath()).getChannel();  

                // Cria channel no destino  
                System.out.println("Copiando arquivo: " + file.getName());  
                destMediaChannel = new FileOutputStream(destinoMedia + "\\"  
                        + file.getName()).getChannel();  

                // Copia conteúdo da origem no destino  
                destMediaChannel.transferFrom(oriMediaChannel, 0, oriMediaChannel.size());  

                // Fecha channels  
                oriChannel.close();  
                destChannel.close();  
            }  

            //Runtime.getRuntime().exec("explorer " + destino.getAbsolutePath());    

        } catch (IOException e) {  

            String msg = e.getMessage();  

        } finally {  


            try {
                Thread.sleep(50);
                //JOptionPane.showMessageDialog(null,"Package Generate uccessfull");
                //Runtime.getRuntime().exec("explorer " + destino.getAbsolutePath());   
            } catch (InterruptedException ex) {
                Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (oriChannel != null && oriChannel.isOpen()) {  

                try {  
                    oriChannel.close();
                } catch (IOException ex) {
                    Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  

            if (destChannel != null && destChannel.isOpen()) {  

                try {  
                    destChannel.close();
                } catch (IOException ex) {
                    Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                JOptionPane.showMessageDialog(null,"Package Generate uccessfull");
                Runtime.getRuntime().exec("explorer " + destino.getAbsolutePath());
            } catch (IOException ex) {
                Logger.getLogger(loadDevice.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        /*
        for (int i = 1; i <= 100; i++) {
            try {
                    jProgressBar1.setValue(i);
                    jProgressBar1.setString(i + "%");
                    Thread.sleep(20);
            } catch (InterruptedException ex) {
                    ex.printStackTrace();
            }
	} */

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(loadDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loadDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loadDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loadDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //searchDevice();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loadDevice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelInsertDevice;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldInsertDevice;
    // End of variables declaration//GEN-END:variables
}
