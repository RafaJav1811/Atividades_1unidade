
package com.mycompany.interfacevisual_atividade;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter; 
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Cadastro_Escolar extends javax.swing.JFrame 
{
    MaskFormatter data;
    private String nomeCadastrado;
    private String nascimentoCadastrado;
    private String serieCadastrado;
    private String responsavelCadastrado;
    private String cursoCadastrado;
    
    public Cadastro_Escolar() 
    {
        
        try 
        {
            data = new MaskFormatter("##/##/####");
        } 
        catch (ParseException ex) 
        {
            Logger.getLogger(Cadastro_Escolar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        initComponents();
        
        Botão_cadastro.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                
            Botão_cadastroActionPerformed(evt);
            
            }            
            
        });
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escolha_curso = new javax.swing.ButtonGroup();
        Tela_Preta = new javax.swing.JPanel();
        Tela_Branca = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        Responsável = new javax.swing.JTextField();
        Botão_cadastro = new javax.swing.JButton();
        Botão_imprimir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Descrição_Nome = new javax.swing.JLabel();
        Descrição_Nascimento = new javax.swing.JLabel();
        Descrição_Série = new javax.swing.JLabel();
        Descrição_Responsável = new javax.swing.JLabel();
        Descrição_Curso = new javax.swing.JLabel();
        Série = new javax.swing.JComboBox<>();
        Nascimento = new javax.swing.JFormattedTextField(data);
        TI = new javax.swing.JRadioButton();
        ELETRO = new javax.swing.JRadioButton();
        Tela_Verde = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Bem_Vindo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tela_Preta.setBackground(new java.awt.Color(0, 0, 0));
        Tela_Preta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Tela_Branca.setBackground(new java.awt.Color(255, 255, 255));
        Tela_Branca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Titulo.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(7, 164, 121));
        Titulo.setText("Cadastro");

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        Responsável.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResponsávelActionPerformed(evt);
            }
        });

        Botão_cadastro.setBackground(new java.awt.Color(7, 164, 121));
        Botão_cadastro.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Botão_cadastro.setForeground(new java.awt.Color(250, 250, 250));
        Botão_cadastro.setText("Cadastra-se");
        Botão_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_cadastroActionPerformed(evt);
            }
        });

        Botão_imprimir.setBackground(new java.awt.Color(7, 164, 121));
        Botão_imprimir.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Botão_imprimir.setForeground(new java.awt.Color(250, 250, 250));
        Botão_imprimir.setText("Imprimir");
        Botão_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botão_imprimirActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/java_resized.png"))); // NOI18N

        Descrição_Nome.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Descrição_Nome.setText("Nome -");

        Descrição_Nascimento.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Descrição_Nascimento.setText("Data de nascimento -");

        Descrição_Série.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Descrição_Série.setText("Série -");

        Descrição_Responsável.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Descrição_Responsável.setText("Responsável -");

        Descrição_Curso.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Descrição_Curso.setText("Curso -");

        Série.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Série.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1º ano - A", "1º ano - B", "2º ano - A", "2º ano - B", "3º ano - A", "3º ano - B", "4º ano - A", "4º ano - B" }));

        try {
            Nascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Escolha_curso.add(TI);
        TI.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TI.setText("Tecnologia da Informação (T.I)");

        Escolha_curso.add(ELETRO);
        ELETRO.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ELETRO.setText("Eletrotécnica (ELETRO)");

        javax.swing.GroupLayout Tela_BrancaLayout = new javax.swing.GroupLayout(Tela_Branca);
        Tela_Branca.setLayout(Tela_BrancaLayout);
        Tela_BrancaLayout.setHorizontalGroup(
            Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela_BrancaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela_BrancaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Botão_cadastro)
                        .addGap(77, 77, 77)
                        .addComponent(Botão_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(Tela_BrancaLayout.createSequentialGroup()
                        .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Tela_BrancaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(168, 168, 168)
                                .addComponent(Titulo))
                            .addGroup(Tela_BrancaLayout.createSequentialGroup()
                                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Descrição_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nome)
                                    .addComponent(Descrição_Série, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Série, 0, 217, Short.MAX_VALUE))
                                .addGap(90, 90, 90)
                                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Descrição_Responsável)
                                    .addComponent(Descrição_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Responsável, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(Nascimento))))
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(Tela_BrancaLayout.createSequentialGroup()
                        .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ELETRO)
                            .addComponent(TI)
                            .addComponent(Descrição_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Tela_BrancaLayout.setVerticalGroup(
            Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela_BrancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descrição_Nome)
                    .addComponent(Descrição_Nascimento))
                .addGap(18, 18, 18)
                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descrição_Série)
                    .addComponent(Descrição_Responsável))
                .addGap(18, 18, 18)
                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Responsável, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Série, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(Descrição_Curso)
                .addGap(18, 18, 18)
                .addComponent(TI)
                .addGap(18, 18, 18)
                .addComponent(ELETRO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Tela_BrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botão_cadastro)
                    .addComponent(Botão_imprimir))
                .addGap(44, 44, 44))
        );

        Tela_Verde.setBackground(new java.awt.Color(7, 164, 121));
        Tela_Verde.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/UserGrande2_resized.png"))); // NOI18N

        Bem_Vindo.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        Bem_Vindo.setForeground(new java.awt.Color(250, 250, 250));
        Bem_Vindo.setText("Seja Bem vindo!");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Informe seus dados a seguir para prosseguir.");

        javax.swing.GroupLayout Tela_VerdeLayout = new javax.swing.GroupLayout(Tela_Verde);
        Tela_Verde.setLayout(Tela_VerdeLayout);
        Tela_VerdeLayout.setHorizontalGroup(
            Tela_VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela_VerdeLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(Tela_VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(Tela_VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela_VerdeLayout.createSequentialGroup()
                            .addComponent(Bem_Vindo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela_VerdeLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(21, 21, 21)))))
        );
        Tela_VerdeLayout.setVerticalGroup(
            Tela_VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tela_VerdeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Bem_Vindo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Tela_PretaLayout = new javax.swing.GroupLayout(Tela_Preta);
        Tela_Preta.setLayout(Tela_PretaLayout);
        Tela_PretaLayout.setHorizontalGroup(
            Tela_PretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tela_PretaLayout.createSequentialGroup()
                .addComponent(Tela_Branca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tela_Verde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tela_PretaLayout.setVerticalGroup(
            Tela_PretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela_Verde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tela_Branca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela_Preta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tela_Preta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeActionPerformed

    private void ResponsávelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResponsávelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResponsávelActionPerformed

    private void Botão_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_imprimirActionPerformed
        String nome = Nome.getText();
        
        String serie = (String) Série.getSelectedItem();
        
        String curso; 
        if(TI.isSelected())
        {
        curso = "Tecnologia da Informação";    
        }
        else if (ELETRO.isSelected())
        {
        curso = "Eletrotécnica";        
        }
        else
        {
            curso = "Não foi escolhido";
        }
        
        String responsavel = Responsável.getText();
        
        String nascimento = Nascimento.getText();
        
        String mensagem = "Nome" + nome + "\n" + "Série" + serie + "Curso" + curso + "\n" + "Responsável" + responsavel + "\n" + "Data de nascimento" + nascimento;
        
        JOptionPane.showMessageDialog(this,mensagem,"Informações do cadastro", JOptionPane.INFORMATION_MESSAGE);
        
    
    }//GEN-LAST:event_Botão_imprimirActionPerformed

    private void Botão_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botão_cadastroActionPerformed
      String nome = Nome.getText();
      String nascimento = Nascimento.getText();
      String responsavel = Responsável.getText();
      String serie = (String) Série.getSelectedItem();
      String curso = TI.isSelected() ? "Tecnologia da informação" : "Eletrotécnica";
      
      if(nome.isEmpty() || nascimento.isEmpty() || serie.isEmpty())
      {
          JOptionPane.showMessageDialog(this, "Preencha todos os campos de texto corretamente", "Invalidação", JOptionPane.ERROR_MESSAGE);
          return;
      }
      
      LocalDate dataNascimento = LocalDate.parse(nascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
      LocalDate dataAtual = LocalDate.now();
      long idade = ChronoUnit.YEARS.between(dataNascimento, dataAtual);
      
      if(idade>=18)
      {
          responsavel = "";
      }
      else
      {
         JOptionPane.showMessageDialog(this, "Preencha o campo do Responsável","Inválido",JOptionPane.ERROR_MESSAGE);
         return;
      }
      
      this.nomeCadastrado = nome;
      this.nascimentoCadastrado = nascimento;
      this.serieCadastrado = serie;
      this.responsavelCadastrado = responsavel;
      this.cursoCadastrado = curso; 
      
    }//GEN-LAST:event_Botão_cadastroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Cadastro_Escolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Escolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Escolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Escolar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Escolar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bem_Vindo;
    private javax.swing.JButton Botão_cadastro;
    private javax.swing.JButton Botão_imprimir;
    private javax.swing.JLabel Descrição_Curso;
    private javax.swing.JLabel Descrição_Nascimento;
    private javax.swing.JLabel Descrição_Nome;
    private javax.swing.JLabel Descrição_Responsável;
    private javax.swing.JLabel Descrição_Série;
    private javax.swing.JRadioButton ELETRO;
    private javax.swing.ButtonGroup Escolha_curso;
    private javax.swing.JFormattedTextField Nascimento;
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField Responsável;
    private javax.swing.JComboBox<String> Série;
    private javax.swing.JRadioButton TI;
    private javax.swing.JPanel Tela_Branca;
    private javax.swing.JPanel Tela_Preta;
    private javax.swing.JPanel Tela_Verde;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
