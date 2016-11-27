/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cih;

import cdp.Compra;
import cdp.Itens;
import cdp.Mudas;
import cdp.Pessoa;
import cgt.ControleCompras;
import cgt.ControleItens;
import cgt.ControleMudas;
import cgt.ControlePessoas;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Artur Schaefer<artur.schaefer2 at gmail.com>
 */
public class Venda extends javax.swing.JFrame {

    private static Venda instancia;

    Pessoa pesAtual = new Pessoa();
    Mudas mudaAtual = new Mudas();
    Compra compraAtual = new Compra();

    ControlePessoas crtlPessoa = new ControlePessoas();
    ControleCompras crtlCompra = new ControleCompras();
    ControleMudas crtlMudas = new ControleMudas();

    List<Compra> listaCompras = null;
    List<Mudas> listaMudas = null;

    public Venda() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        if ((listaCompras = crtlCompra.listarCompras(0, "")).size() >= 1) {
            preencherVenda(listaCompras.get(0));
        }
    }

    public static synchronized Venda getInstance() throws SQLException {
        if (instancia == null) {
            instancia = new Venda();
        }
        return instancia;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuJPanel2 = new javax.swing.JPanel();
        firstJLabel2 = new javax.swing.JLabel();
        previsJLabel2 = new javax.swing.JLabel();
        nextJLabel2 = new javax.swing.JLabel();
        lastJLabel2 = new javax.swing.JLabel();
        addJLabel2 = new javax.swing.JLabel();
        updateJLabel2 = new javax.swing.JLabel();
        searchJLabel2 = new javax.swing.JLabel();
        delJLabel2 = new javax.swing.JLabel();
        geraljPanel1 = new javax.swing.JPanel();
        clientejPanel2 = new javax.swing.JPanel();
        nomejTextField1 = new javax.swing.JTextField();
        cpfjTextField2 = new javax.swing.JTextField();
        rgjTextField3 = new javax.swing.JTextField();
        tel1jTextField4 = new javax.swing.JTextField();
        tel2jTextField5 = new javax.swing.JTextField();
        nfjTextField6 = new javax.swing.JTextField();
        dataComprajTextField1 = new javax.swing.JTextField();
        dataEntregajTextField2 = new javax.swing.JTextField();
        valorTotaljTextField3 = new javax.swing.JTextField();
        inserirItemMudajButton1 = new javax.swing.JButton();
        excluirItemMudajButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PDV");

        menuJPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuJPanel2.setPreferredSize(new java.awt.Dimension(900, 95));

        firstJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_first.png"))); // NOI18N
        firstJLabel2.setText("Primeiro");
        firstJLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        firstJLabel2.setMaximumSize(new java.awt.Dimension(100, 36));
        firstJLabel2.setPreferredSize(new java.awt.Dimension(100, 70));

        previsJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previsJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_previous.png"))); // NOI18N
        previsJLabel2.setText("Anterior");
        previsJLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        previsJLabel2.setEnabled(false);
        previsJLabel2.setMaximumSize(new java.awt.Dimension(100, 36));
        previsJLabel2.setPreferredSize(new java.awt.Dimension(100, 70));

        nextJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nextJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_next.png"))); // NOI18N
        nextJLabel2.setText("Próximo");
        nextJLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nextJLabel2.setEnabled(false);
        nextJLabel2.setPreferredSize(new java.awt.Dimension(100, 70));

        lastJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lastJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resultset_last.png"))); // NOI18N
        lastJLabel2.setText("Último");
        lastJLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lastJLabel2.setPreferredSize(new java.awt.Dimension(100, 70));

        addJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addJLabel2.setText("Incluir");
        addJLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addJLabel2.setPreferredSize(new java.awt.Dimension(100, 70));
        addJLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addJLabel2MouseClicked(evt);
            }
        });

        updateJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check-mark (1).png"))); // NOI18N
        updateJLabel2.setText("Alterar");
        updateJLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updateJLabel2.setPreferredSize(new java.awt.Dimension(100, 70));

        searchJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifier.png"))); // NOI18N
        searchJLabel2.setText("Pesquisar");
        searchJLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        searchJLabel2.setMaximumSize(new java.awt.Dimension(100, 36));
        searchJLabel2.setPreferredSize(new java.awt.Dimension(100, 70));

        delJLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel-icon.png"))); // NOI18N
        delJLabel2.setText("Excluir");
        delJLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        delJLabel2.setPreferredSize(new java.awt.Dimension(100, 70));

        javax.swing.GroupLayout menuJPanel2Layout = new javax.swing.GroupLayout(menuJPanel2);
        menuJPanel2.setLayout(menuJPanel2Layout);
        menuJPanel2Layout.setHorizontalGroup(
            menuJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuJPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(firstJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(previsJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuJPanel2Layout.setVerticalGroup(
            menuJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuJPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previsJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delJLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clientejPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nomejTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do Cliente"));
        nomejTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomejTextField1MouseClicked(evt);
            }
        });

        cpfjTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

        rgjTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("RG"));

        tel1jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone 1"));

        tel2jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone 2"));

        nfjTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder("NF"));

        dataComprajTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data da compra"));

        dataEntregajTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de envio"));

        valorTotaljTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor total"));

        inserirItemMudajButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        inserirItemMudajButton1.setText("Incluir Item");
        inserirItemMudajButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirItemMudajButton1ActionPerformed(evt);
            }
        });

        excluirItemMudajButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        excluirItemMudajButton2.setText("Excluir Item");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Cancelar Venda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clientejPanel2Layout = new javax.swing.GroupLayout(clientejPanel2);
        clientejPanel2.setLayout(clientejPanel2Layout);
        clientejPanel2Layout.setHorizontalGroup(
            clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientejPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(clientejPanel2Layout.createSequentialGroup()
                        .addGroup(clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomejTextField1)
                            .addComponent(tel1jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(nfjTextField6))
                        .addGap(18, 18, 18)
                        .addGroup(clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clientejPanel2Layout.createSequentialGroup()
                                .addComponent(dataComprajTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dataEntregajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(clientejPanel2Layout.createSequentialGroup()
                                .addGroup(clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tel2jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rgjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(clientejPanel2Layout.createSequentialGroup()
                        .addComponent(valorTotaljTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(inserirItemMudajButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirItemMudajButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        clientejPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cpfjTextField2, dataComprajTextField1, dataEntregajTextField2, rgjTextField3, tel2jTextField5});

        clientejPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {nfjTextField6, nomejTextField1, tel1jTextField4, valorTotaljTextField3});

        clientejPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {excluirItemMudajButton2, inserirItemMudajButton1, jButton1});

        clientejPanel2Layout.setVerticalGroup(
            clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientejPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel2jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel1jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataComprajTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataEntregajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nfjTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clientejPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTotaljTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserirItemMudajButton1)
                    .addComponent(excluirItemMudajButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clientejPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {excluirItemMudajButton2, inserirItemMudajButton1, jButton1, valorTotaljTextField3});

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Nome ", "Valor unitário", "Quantidade", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout geraljPanel1Layout = new javax.swing.GroupLayout(geraljPanel1);
        geraljPanel1.setLayout(geraljPanel1Layout);
        geraljPanel1Layout.setHorizontalGroup(
            geraljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientejPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        geraljPanel1Layout.setVerticalGroup(
            geraljPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geraljPanel1Layout.createSequentialGroup()
                .addComponent(clientejPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1044, Short.MAX_VALUE)
            .addComponent(geraljPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geraljPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomejTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomejTextField1MouseClicked
        ListarCliente listaClientes = new ListarCliente(this, true);
        listaClientes.setVisible(true);
        listaClientes.setAlwaysOnTop(true);

        try {
            pesAtual = listaClientes.getPessoaSelecionada();
            pesAtual = crtlPessoa.listarPessoas(2, pesAtual.getCpf()).get(0);
            inserirCompraPorPessoa(pesAtual);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaClientes.dispose();
    }//GEN-LAST:event_nomejTextField1MouseClicked

    private void inserirItemMudajButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirItemMudajButton1ActionPerformed
        ListarMudas listaMudas = new ListarMudas(this, true);
        listaMudas.setVisible(true);
        listaMudas.setAlwaysOnTop(true);

        try {
            mudaAtual = listaMudas.getMudaSelecionada();
            mudaAtual = crtlMudas.listarMudas(2, mudaAtual.getNome()).get(0);
            inserirItem(mudaAtual);
        } catch (NullPointerException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaMudas.dispose();
    }//GEN-LAST:event_inserirItemMudajButton1ActionPerformed

    private void addJLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJLabel2MouseClicked
        try {
            crtlCompra.inserirCompra(lerCampos());
            //lerCampos();
            limparCampos();
            JOptionPane.showMessageDialog(this, "Inserido com sucesso!!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addJLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Venda().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Venda.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public void inserirCompraPorPessoa(Pessoa pes) throws SQLException {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rc = model.getRowCount();
        double tot = 0;
        if (rc == 0) {
            valorTotaljTextField3.setText("0");
        } else {
            for (int i = 0; i < rc; i++) {
                tot += (Double) model.getValueAt(i, 4);
            }
        }
        nomejTextField1.setText(pes.getNome());;
        cpfjTextField2.setText(pes.getCpf());
        rgjTextField3.setText(pes.getRg());
        tel1jTextField4.setText(Integer.toString(pes.getTelefone01()));
        tel2jTextField5.setText(Integer.toString(pes.getTelefone02()));

        listaCompras = crtlCompra.listarCompras(0, "");

        nfjTextField6.setText(Integer.toString(listaCompras.size() + 1));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        dataComprajTextField1.setText(localDate.toString());

        dataEntregajTextField2.setText(localDate.plusDays(3).toString());
        valorTotaljTextField3.setText(Double.toString(tot));
    }

    public void preencherVenda(Compra compra) throws SQLException {
        nomejTextField1.setText(compra.getConta().getPessoa().getNome());
        cpfjTextField2.setText(compra.getConta().getPessoa().getCpf());
        rgjTextField3.setText(compra.getConta().getPessoa().getRg());
        tel1jTextField4.setText(Integer.toString(compra.getConta().getPessoa().getTelefone01()));
        tel2jTextField5.setText(Integer.toString(compra.getConta().getPessoa().getTelefone02()));
        nfjTextField6.setText(Integer.toString(compra.getIdCompra()));
        dataComprajTextField1.setText(compra.getDataDaCompra());
        dataEntregajTextField2.setText(compra.getDataDoEnvio());
        valorTotaljTextField3.setText(Double.toString(compra.getValorTotal()));
    }

    public final void limparTabela(JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        int rc = model.getRowCount();
        for (int i = 0; i < rc; i++) {
            model.removeRow(0);
        }
    }

    public void inserirItem(Mudas muda) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rc = model.getRowCount();
        Quantidade quantidade = new Quantidade(this, true);
        quantidade.setVisible(true);
        int qnt = quantidade.getQuantidade();
        quantidade.dispose();
        Object teste[] = {muda.getIdMudas(), muda.getNome(), muda.getPrecoUnidade(), qnt, (qnt * muda.getPrecoUnidade())};
        model.addRow(teste);
        double tot = 0;
        if (valorTotaljTextField3.getText().isEmpty() == false) {
            tot = Double.parseDouble(valorTotaljTextField3.getText()) + qnt * muda.getPrecoUnidade();
        } else {
            tot = qnt * muda.getPrecoUnidade();
        }
        valorTotaljTextField3.setText(Double.toString(tot));
        //limparTabela(jTable1);
    }

    public Compra lerCampos() throws SQLException, ClassNotFoundException {
        try {
            Compra compra = new Compra();
            compra.setConta(pesAtual.getConta());
            compra.setDataDaCompra(dataComprajTextField1.getText());
            compra.setDataDoEnvio(dataEntregajTextField2.getText());
            
            compra.setItens(retornaItensTabela(compra));
            
            compra.setValorTotal(Double.parseDouble(valorTotaljTextField3.getText()));

            return compra;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Algum campo está vazio!!");
        }
        return null;
    }

    public List<Itens> retornaItensTabela(Compra ultimaCompra) throws SQLException, ClassNotFoundException {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rc = model.getRowCount();
        if (rc >= 1){
            ControleItens crtlItens = new ControleItens();
            List<Itens> listaItens = new ArrayList<>();
            Itens itemAtual;
            Mudas muda;
            for (int i = 0; i < rc; i++){
                itemAtual = new Itens();
                
                /*PROCURAR PELO ID DA MUDA ESTÁ DANDO ERRO*/
                muda = new Mudas();
                muda.setIdMudas((int) model.getValueAt(i, 0));
                muda.setNome((String) model.getValueAt(i, 1));
                muda = crtlMudas.listarMudas(2,muda.getNome()).get(0);
                
                itemAtual.setMudas(muda);
                itemAtual.setCompra(ultimaCompra);
                itemAtual.setQuantidade((int) model.getValueAt(i, 3));
                itemAtual.setValor(itemAtual.getQuantidade() * itemAtual.getValor());
                
                listaItens.add(itemAtual);
            }
            
            return listaItens;
        }
        return null;
    }

    private void limparCampos() {
        nomejTextField1.setText("");
        rgjTextField3.setText("");
        cpfjTextField2.setText("");
        dataComprajTextField1.setText("");
        dataEntregajTextField2.setText("");
        valorTotaljTextField3.setText("");
        tel1jTextField4.setText("");
        tel2jTextField5.setText("");
        nfjTextField6.setText("");
        limparTabela(jTable1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addJLabel2;
    private javax.swing.JPanel clientejPanel2;
    private javax.swing.JTextField cpfjTextField2;
    private javax.swing.JTextField dataComprajTextField1;
    private javax.swing.JTextField dataEntregajTextField2;
    private javax.swing.JLabel delJLabel2;
    private javax.swing.JButton excluirItemMudajButton2;
    private javax.swing.JLabel firstJLabel2;
    private javax.swing.JPanel geraljPanel1;
    private javax.swing.JButton inserirItemMudajButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lastJLabel2;
    private javax.swing.JPanel menuJPanel2;
    private javax.swing.JLabel nextJLabel2;
    private javax.swing.JTextField nfjTextField6;
    private javax.swing.JTextField nomejTextField1;
    private javax.swing.JLabel previsJLabel2;
    private javax.swing.JTextField rgjTextField3;
    private javax.swing.JLabel searchJLabel2;
    private javax.swing.JTextField tel1jTextField4;
    private javax.swing.JTextField tel2jTextField5;
    private javax.swing.JLabel updateJLabel2;
    private javax.swing.JTextField valorTotaljTextField3;
    // End of variables declaration//GEN-END:variables

}
