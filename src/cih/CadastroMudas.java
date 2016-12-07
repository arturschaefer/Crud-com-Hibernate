package cih;

import cdp.Mudas;
import cdp.Pessoa;
import cdp.Viveiro;
import cgt.ControleMudas;
import cgt.ControleViveiros;
import desabilitado.CadastroEquipamentos;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Artur Schaefer<artur.schaefer2 at gmail.com>
 */
public class CadastroMudas extends javax.swing.JFrame {

    ControleMudas crtlMudas = new ControleMudas();
    Mudas mudaAtual;
    
    public CadastroMudas() {
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
        precojLabel2 = new javax.swing.JLabel();
        tempo1jLabel3 = new javax.swing.JLabel();
        tamanhotel2jLabel4 = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        descjTextField1 = new javax.swing.JTextField();
        precojTextField2 = new javax.swing.JTextField();
        tempojTextField3 = new javax.swing.JTextField();
        tamanhojTextField4 = new javax.swing.JTextField();
        viveirojLabel1 = new javax.swing.JLabel();
        viveiroListajComboBox1 = new javax.swing.JComboBox<>();
        cadastrarViveirojButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Mudas");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        menuJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuJPanel.setPreferredSize(new java.awt.Dimension(900, 95));

        firstJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_first.png"))); // NOI18N
        firstJLabel.setText("Primeiro");
        firstJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        firstJLabel.setEnabled(false);
        firstJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        previsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previsJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_previous.png"))); // NOI18N
        previsJLabel.setText("Anterior");
        previsJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        previsJLabel.setEnabled(false);
        previsJLabel.setMaximumSize(new java.awt.Dimension(100, 36));
        previsJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        nextJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_next.png"))); // NOI18N
        nextJLabel.setText("Próximo");
        nextJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nextJLabel.setEnabled(false);
        nextJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        lastJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_last.png"))); // NOI18N
        lastJLabel.setText("Último");
        lastJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lastJLabel.setEnabled(false);
        lastJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        addJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addJLabel.setText("Incluir");
        addJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addJLabel.setPreferredSize(new java.awt.Dimension(100, 70));
        addJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addJLabelMouseClicked(evt);
            }
        });

        updateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-mark (1).png"))); // NOI18N
        updateJLabel.setText("Alterar");
        updateJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updateJLabel.setEnabled(false);
        updateJLabel.setPreferredSize(new java.awt.Dimension(100, 70));

        searchJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        searchJLabel.setText("Pesquisar");
        searchJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchJLabel.setEnabled(false);
        searchJLabel.setMaximumSize(new java.awt.Dimension(100, 36));
        searchJLabel.setPreferredSize(new java.awt.Dimension(100, 70));
        searchJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchJLabelMouseClicked(evt);
            }
        });

        delJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel-icon.png"))); // NOI18N
        delJLabel.setText("Excluir");
        delJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        delJLabel.setEnabled(false);
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
                .addContainerGap(49, Short.MAX_VALUE))
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

        precojLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        precojLabel2.setText("Preço");

        tempo1jLabel3.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        tempo1jLabel3.setText("Tempo de Cultivo");

        tamanhotel2jLabel4.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        tamanhotel2jLabel4.setText("Tamanho");

        viveirojLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        viveirojLabel1.setText("Viveiro");
        viveirojLabel1.setEnabled(false);

        cadastrarViveirojButton1.setText("Cadastrar Novo Viveiro?");
        cadastrarViveirojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarViveirojButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pessoajPanelLayout = new javax.swing.GroupLayout(pessoajPanel);
        pessoajPanel.setLayout(pessoajPanelLayout);
        pessoajPanelLayout.setHorizontalGroup(
            pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pessoajPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaojLabel1)
                    .addComponent(precojLabel2)
                    .addComponent(tempo1jLabel3)
                    .addComponent(tamanhotel2jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomejTextField)
                    .addComponent(descjTextField1)
                    .addComponent(precojTextField2)
                    .addComponent(tempojTextField3)
                    .addComponent(tamanhojTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoajPanelLayout.createSequentialGroup()
                        .addComponent(viveirojLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viveiroListajComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoajPanelLayout.createSequentialGroup()
                        .addComponent(cadastrarViveirojButton1)
                        .addGap(79, 79, 79))))
        );
        pessoajPanelLayout.setVerticalGroup(
            pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pessoajPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viveirojLabel1)
                    .addComponent(viveiroListajComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaojLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precojTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precojLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempojTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempo1jLabel3))
                .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pessoajPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pessoajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tamanhojTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tamanhotel2jLabel4)))
                    .addGroup(pessoajPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cadastrarViveirojButton1)))
                .addGap(343, 343, 343))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
            .addComponent(pessoajPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pessoajPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarViveirojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarViveirojButton1ActionPerformed
        new CadastroViveiros(0);
    }//GEN-LAST:event_cadastrarViveirojButton1ActionPerformed

    private void addJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJLabelMouseClicked
        try {
            crtlMudas.inserirMuda(lerCampos(0));
            limparCampos();
            JOptionPane.showMessageDialog(this, "Inserido com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Algum campo está vazio!!");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Valor inválido em algum campo!!");
        }
    }//GEN-LAST:event_addJLabelMouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        List<Viveiro> viv = null;
        try {
            viv = new ControleViveiros().listarViveiro(0, "");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroMudas.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < viv.size(); i++) {
            viveiroListajComboBox1.addItem(viv.get(i).getNome());
        }

        if (viveiroListajComboBox1.getItemCount() <= 0) {
            JOptionPane.showMessageDialog(this, "Não há viveiro cadastrado. Cadastre um!");
            this.setVisible(false);
            new CadastroViveiros(1).setVisible(true);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void searchJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJLabelMouseClicked
        ListarMudas listaMudas = new ListarMudas(this, true);
        listaMudas.setVisible(true);
        listaMudas.setAlwaysOnTop(true);

        try {
            mudaAtual = listaMudas.getMudaSelecionada();
            
        } catch (NullPointerException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaMudas.dispose();
    }//GEN-LAST:event_searchJLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroMudas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroMudas();
        });
    }

    public Mudas lerCampos(int op) throws SQLException, ClassNotFoundException {
        try {
            Mudas muda = new Mudas();
            muda.setNome(nomejTextField.getText());
            muda.setDescricao(descjTextField1.getText());
            muda.setLoteDeMudas(null);
            muda.setPrecoUnidade(Double.parseDouble(precojTextField2.getText()));
            muda.setTamanho(Double.parseDouble(tempojTextField3.getText()));
            muda.setTempoDeCultivo(tempojTextField3.getText());

            return muda;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Algum campo está vazio!!");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "Valor inválido em algum campo!!");
        }
        return null;
    }

    private void limparCampos() {
        descjTextField1.setText("");
        nomejTextField.setText("");
        viveiroListajComboBox1.setSelectedIndex(0);
        precojTextField2.setText("");
        tamanhojTextField4.setText("");
        tempojTextField3.setText("");
    }

    public void insereMudaDoBanco (Mudas muda){
        nomejTextField.setText(muda.getNome());
        descjTextField1.setText(muda.getDescricao());
        precojTextField2.setText(Double.toString(muda.getPrecoUnidade()));
        tempojTextField3.setText(muda.getTempoDeCultivo());
        tamanhojTextField4.setText(Double.toString(muda.getTamanho()));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addJLabel;
    private javax.swing.JButton cadastrarViveirojButton1;
    private javax.swing.JLabel delJLabel;
    private javax.swing.JTextField descjTextField1;
    private javax.swing.JLabel descricaojLabel1;
    private javax.swing.JLabel firstJLabel;
    private javax.swing.JLabel lastJLabel;
    private javax.swing.JPanel menuJPanel;
    private javax.swing.JLabel nextJLabel;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JPanel pessoajPanel;
    private javax.swing.JLabel precojLabel2;
    private javax.swing.JTextField precojTextField2;
    private javax.swing.JLabel previsJLabel;
    private javax.swing.JLabel searchJLabel;
    private javax.swing.JTextField tamanhojTextField4;
    private javax.swing.JLabel tamanhotel2jLabel4;
    private javax.swing.JLabel tempo1jLabel3;
    private javax.swing.JTextField tempojTextField3;
    private javax.swing.JLabel updateJLabel;
    private javax.swing.JComboBox<String> viveiroListajComboBox1;
    private javax.swing.JLabel viveirojLabel1;
    // End of variables declaration//GEN-END:variables
}
