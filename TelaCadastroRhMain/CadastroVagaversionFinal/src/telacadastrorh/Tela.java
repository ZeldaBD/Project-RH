/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telacadastrorh;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
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

        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jLabelFormacao = new javax.swing.JLabel();
        txtFormacao = new javax.swing.JTextField();
        jLabelHorario = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        jLabelRegime = new javax.swing.JLabel();
        txtRegime = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabelSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        jLabelCadastroVaga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1140, 900));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 254, 254));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 126, 20));
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(1140, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1140, 600));

        jLabelTitle.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTitle.setText("Titulo vaga:");

        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        jLabelCargo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelCargo.setText("Cargo:");

        txtCargo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

        jLabelFormacao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelFormacao.setText("Formação:");

        txtFormacao.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtFormacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelHorario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelHorario.setText("Horário:");

        txtHorario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelRegime.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelRegime.setText("Regime de Trabalho:");

        txtRegime.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtRegime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelDescricao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDescricao.setText("Descrição:");

        txtDesc.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        jLabelSalario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelSalario.setText("Salario:");

        txtSalario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtSalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(253, 126, 20));
        btnCadastro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setText("Cadastrar");
        btnCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCadastro.setPreferredSize(new java.awt.Dimension(336, 50));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jLabelCadastroVaga.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCadastroVaga.setText("Cadastro de Vaga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCadastroVaga)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHorario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHorario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(txtFormacao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFormacao, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabelRegime))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDescricao)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(txtRegime)
                                    .addComponent(jLabelSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSalario))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addGap(299, 299, 299))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelCadastroVaga)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitle)
                    .addComponent(jLabelRegime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo)
                    .addComponent(jLabelDescricao))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabelFormacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFormacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHorario)
                            .addComponent(jLabelSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1283, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // TODO add your handling code here:
        CadastroVaga vaga1 = new CadastroVaga(txtTitulo.getText(), txtCargo.getText()
            , txtFormacao.getText(), txtHorario.getText(), txtRegime.getText()
            ,txtDesc.getText(), Double.parseDouble(txtSalario.getText()));

        try {
        	
        	//PrintWriter writer = new PrintWriter(new File("Vaga.csv"));
        	
        	FileWriter fw = new FileWriter("vagas.csv", true);
			PrintWriter writer = new PrintWriter(fw);
   
        	
            StringBuilder sb = new StringBuilder();
            sb.append("Titulo: " + vaga1.getTituloVaga() + ", ");
        
            sb.append("Cargo: " + vaga1.getCargo() + ", ");
   
            sb.append("Formacao: " + vaga1.getFormacaoAcademica()+ ", ");
    
            sb.append("Periodo: " + vaga1.getPeriodo()+ ", ");

            sb.append("Regime" + vaga1.getRegime() + ", ");

            sb.append("Descricao: " + vaga1.getDescricaoVaga()+ ", ");

            sb.append("Salario: " +vaga1.getSalario());
            writer.append(sb.toString());
            writer.println();
            writer.flush();
            writer.close();
            JOptionPane.showMessageDialog(null , "Vaga criada com sucesso!");
        } catch (IOException e){
            JOptionPane.showMessageDialog(null , "Ocorreu um ERRO!");
    }//GEN-LAST:event_btnCadastroActionPerformed
    
    txtTitulo.setText("");
    txtCargo.setText("");
    txtFormacao.setText("");
    txtHorario.setText("");
    txtRegime.setText("");
    txtDesc.setText("");
    txtSalario.setText("");

    }
    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

        

     public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JLabel jLabelCadastroVaga;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelFormacao;
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelRegime;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtFormacao;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtRegime;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}