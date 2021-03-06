/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.InterfaceTrabalho;

import br.edu.ifnmg.tads.DataAcess.DAOCliente;
import br.edu.ifnmg.tads.DataAcess.DAOUsuario;
import br.edu.ifnmg.tads.DoMainModel.trabalho1.Usuario;
import br.edu.ifnmg.tads.DoMainModel.trabalho1.Pessoa;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Desktop
 */
public class frmCadastroUsuario extends javax.swing.JInternalFrame {

    DAOCliente daocliente = new DAOCliente();
    DAOUsuario dao = new DAOUsuario();
    Usuario usuario = new Usuario();
    Pessoa pessoa = new Pessoa();
    
    public static Date formataData(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }

        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date) formatter.parse(data);
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    /**
     * Creates new form frmCadastroUsuario
     */
    public frmCadastroUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelDadosGerais = new javax.swing.JTabbedPane();
        jpnlDadosGerais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        lblDataNasc = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtRG = new javax.swing.JTextField();
        txtLoguin = new javax.swing.JTextField();
        lblDataNasc1 = new javax.swing.JLabel();
        lblDataNasc2 = new javax.swing.JLabel();
        lblDataNasc3 = new javax.swing.JLabel();
        txtDataNasc = new javax.swing.JTextField();
        pswSenha = new javax.swing.JPasswordField();
        pswSenha2 = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        lblNome.setText("Nome");

        lblCPF.setText("CPF");

        lblRG.setText("RG");

        lblDataNasc.setText("Data Nasc");

        lblDataNasc1.setText("Senha");

        lblDataNasc2.setText("Loguin");

        lblDataNasc3.setText("Confirmação de Senha");

        javax.swing.GroupLayout jpnlDadosGeraisLayout = new javax.swing.GroupLayout(jpnlDadosGerais);
        jpnlDadosGerais.setLayout(jpnlDadosGeraisLayout);
        jpnlDadosGeraisLayout.setHorizontalGroup(
            jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDadosGeraisLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlDadosGeraisLayout.createSequentialGroup()
                        .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblRG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(txtRG))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlDadosGeraisLayout.createSequentialGroup()
                            .addComponent(lblDataNasc3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pswSenha2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlDadosGeraisLayout.createSequentialGroup()
                            .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDataNasc)
                                .addComponent(lblDataNasc2)
                                .addComponent(lblDataNasc1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDataNasc)
                                .addComponent(txtLoguin)
                                .addComponent(pswSenha)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jpnlDadosGeraisLayout.setVerticalGroup(
            jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDadosGeraisLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRG)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataNasc)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNasc2)
                    .addComponent(txtLoguin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataNasc1)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlDadosGeraisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNasc3)
                    .addComponent(pswSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        PainelDadosGerais.addTab("Dados Gerais", jpnlDadosGerais);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PainelDadosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelDadosGerais, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja Cancelar?") == 0) {
            JOptionPane.showMessageDialog(rootPane, "Ação Cancela pelo Usuário");
            dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente adicionar o Cliente?")
                == 0) {
            try {
                usuario.setNome(txtNome.getText());
                usuario.setCPF(txtCPF.getText());
                usuario.setRG(txtRG.getText());
                Date test = null;
                try {
                    test = formataData(txtDataNasc.getText());
                } catch (Exception ex) {
                    Logger.getLogger(FrmCadastroClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                usuario.setNascimento(test);
                usuario.setUsuario(txtLoguin.getText());
                usuario.setSenha(pswSenha.getText());
                String x = pswSenha.getText();
                usuario.setSenha(pswSenha2.getText()); 
                if(x != pswSenha2.getText()){
                    JOptionPane.showMessageDialog(rootPane, "As senhas não são iguais");
                }
            } catch (Exception ex) {
                Logger.getLogger(frmCadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            daocliente.Salvar(usuario);
            dao.Salvar(usuario);
            JOptionPane.showMessageDialog(rootPane, "Cliente adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ação cancelada pelo usuário!");
            dispose();
        }
    
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PainelDadosGerais;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jpnlDadosGerais;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDataNasc;
    private javax.swing.JLabel lblDataNasc1;
    private javax.swing.JLabel lblDataNasc2;
    private javax.swing.JLabel lblDataNasc3;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRG;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JPasswordField pswSenha2;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtLoguin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
