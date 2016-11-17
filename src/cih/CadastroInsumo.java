/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cih;


/**
 *
 * @author Artur Schaefer<artur.schaefer2 at gmail.com>
 */
public class CadastroInsumo extends javax.swing.JFrame {

    /**
     * Creates new form Clientes
     */
    public CadastroInsumo() {
        initComponents();
        setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuJPanel = new javax.swing.JPanel();
        firstJLabel = new javax.swing.JLabel();
        previsJLabel = new javax.swing.JLabel();
        nextJLabel = new javax.swing.JLabel();
        lastJLabel = new javax.swing.JLabel();
        addJLabel = new javax.swing.JLabel();
        updateJLabel = new javax.swing.JLabel();
        searchJLabel = new javax.swing.JLabel();
        delJLabel = new javax.swing.JLabel();
        pessoajPanel = new javax.swing.JPanel();
        nomejLabel = new javax.swing.JLabel();
        descricaojLabel1 = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Clientes");

        menuJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuJPanel.setPreferredSize(new java.awt.Dimension(900, 95));

        firstJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_first.png"))); // NOI18N
        firstJLabel.setText("Primeiro");
        firstJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        firstJLabel.setMaximumSize(new java.awt.Dimension(100, 36));
        firstJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        previsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previsJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_previous.png"))); // NOI18N
        previsJLabel.setText("Anterior");
        previsJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        previsJLabel.setMaximumSize(new java.awt.Dimension(100, 36));
        previsJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        nextJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_next.png"))); // NOI18N
        nextJLabel.setText("Próximo");
        nextJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nextJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        lastJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_last.png"))); // NOI18N
        lastJLabel.setText("Último");
        lastJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lastJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        addJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addJLabel.setText("Incluir");
        addJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        updateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-mark (1).png"))); // NOI18N
        updateJLabel.setText("Alterar");
        updateJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updateJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        searchJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        searchJLabel.setText("Pesquisar");
        searchJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchJLabel.setMaximumSize(new java.awt.Dimension(100, 36));
        searchJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        delJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel-icon.png"))); // NOI18N
        delJLabel.setText("Excluir");
        delJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        delJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        javax.swing.GroupLayout menuJPanelLayout = new javax.swing.GroupLayout(menuJPanel);
        menuJPanel.setLayout(menuJPanelLayout);
        menuJPanelLayout.setHorizontalGroup(
            menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuJPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(firstJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        menuJPanelLayout.setVerticalGroup(
            menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pessoajPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomejLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        nomejLabel.setText("Nome");

        descricaojLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        descricaojLabel1.setText("Descrição");

        javax.swing.GroupLayout pessoajPanelLayout = new javax.swing.GroupLayout(pessoajPanel);
        pessoajPanel.setLayout(pessoajPanelLayout);
        pessoajPanelLayout.setHorizontalGroup(
            pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pessoajPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaojLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap(525, Short.MAX_VALUE))
        );
        pessoajPanelLayout.setVerticalGroup(
            pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoajPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaojLabel1))
                .addGap(415, 415, 415))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addComponent(pessoajPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pessoajPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(CadastroInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroInsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addJLabel;
    private javax.swing.JLabel delJLabel;
    private javax.swing.JLabel descricaojLabel1;
    private javax.swing.JLabel firstJLabel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lastJLabel;
    private javax.swing.JPanel menuJPanel;
    private javax.swing.JLabel nextJLabel;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JPanel pessoajPanel;
    private javax.swing.JLabel previsJLabel;
    private javax.swing.JLabel searchJLabel;
    private javax.swing.JLabel updateJLabel;
    // End of variables declaration//GEN-END:variables
}
