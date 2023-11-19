package quanlythuvien.ui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import quanlythuvien.utils.XImage;

/**
 *
 * @author thuon
 */
public class ChaoJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ChaoJDialog
     */
    int XIcon;
    int YIcon;
    String[] listNameIcon = {"src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading1.png","src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading1.png","src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading1.png", "src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading2.png","src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading2.png","src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading2.png", "src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading3.png","src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading3.png","src\\main\\resources\\quanlythuvien\\icon\\rsz_iconloading3.png"};
    int count = 0;

    public ChaoJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    void init() {
        this.setLocationRelativeTo(null);
        this.setTitle("Loading");
        this.setIconImage(XImage.getAppIcon());
        XIcon = lblIconLoad.getX();
        YIcon = lblIconLoad.getY();
        new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = prgLoad.getValue();
                if (value < 100) {
                    prgLoad.setValue(value + 1);
                    XIcon = (int) ((value / 100.0) * prgLoad.getWidth());
                    lblIconLoad.setLocation(XIcon, YIcon);
                    lblIconLoad.setIcon(new ImageIcon(listNameIcon[count]));
                    if(count== listNameIcon.length-1){
                        count=0;
                    }
                    count++;
                } else {
                    ChaoJDialog.this.dispose();
                }
            }
        }).start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlChao = new javax.swing.JPanel();
        prgLoad = new javax.swing.JProgressBar();
        lblLogo = new javax.swing.JLabel();
        lblIconLoad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlChao.setBackground(new java.awt.Color(204, 204, 255));

        prgLoad.setBackground(new java.awt.Color(153, 153, 255));
        prgLoad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlythuvien/icon/logoLib.png"))); // NOI18N

        lblIconLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlythuvien/icon/iconLoading__1.png"))); // NOI18N

        javax.swing.GroupLayout pnlChaoLayout = new javax.swing.GroupLayout(pnlChao);
        pnlChao.setLayout(pnlChaoLayout);
        pnlChaoLayout.setHorizontalGroup(
            pnlChaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChaoLayout.createSequentialGroup()
                .addGroup(pnlChaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChaoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlChaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIconLoad)
                            .addComponent(prgLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlChaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlChaoLayout.setVerticalGroup(
            pnlChaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChaoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIconLoad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prgLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlChao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChaoJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChaoJDialog dialog = new ChaoJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lblIconLoad;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlChao;
    private javax.swing.JProgressBar prgLoad;
    // End of variables declaration//GEN-END:variables
}
