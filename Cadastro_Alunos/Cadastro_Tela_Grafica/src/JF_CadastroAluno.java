


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import viaCep.ViaCEP;
import viaCep.ViaCEPException;
/**
 *
 * @author viana
 */

public class JF_CadastroAluno extends javax.swing.JFrame {

    /**
     * Creates new form JF_CadastroAluno
     */
 
    public JF_CadastroAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
 
     public void limpaCampos(){
         JTF_nome.setText("");
         JTF_cpf.setText("");
         JTF_rg.setText("");
         JTF_ra.setText("");
         JTF_dtnasc.setText("");
         JTF_email.setText("");
         JTF_emailalt.setText("");
         JTF_dddcel.setText("");
         JTF_cel.setText("");
         JTF_dddtel.setText("");
         JTF_tel.setText("");
         JTF_cep.setText("");
         JTF_rua.setText("");
         JTF_bairro.setText("");
         JTF_numero.setText("");
         JTF_cidade.setText("");
         JTF_uf.setText("");
         JTF_situacao.setText("");
         JTA_observacao.setText("");
         
     }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JTF_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTF_ra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTF_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTF_emailalt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTF_cep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTF_rua = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTF_numero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        JTF_bairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        JTF_cidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTF_uf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JTF_situacao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTA_observacao = new javax.swing.JTextArea();
        JB_limpa = new javax.swing.JButton();
        JB_cadastro = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        JTF_dtnasc = new javax.swing.JFormattedTextField();
        JTF_rg = new javax.swing.JFormattedTextField();
        JTF_cpf = new javax.swing.JFormattedTextField();
        JTF_dddtel = new javax.swing.JFormattedTextField();
        JTF_dddcel = new javax.swing.JFormattedTextField();
        JTF_tel = new javax.swing.JFormattedTextField();
        JTF_cel = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setText("NOME");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setText("RG");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setText("RA");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setText("EMAIL");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setText("SEGUNDO EMAIL");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel7.setText("CELULAR");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setText("TELEFONE");

        JTF_cep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTF_cepFocusLost(evt);
            }
        });
        JTF_cep.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                JTF_cepInputMethodTextChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel9.setText("CEP");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setText("RUA");

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setText("NÚMERO");

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setText("BAIRRO");

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel13.setText("CIDADE");

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel14.setText("UF");

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel15.setText("SITUAÇÃO");

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel16.setText("OBSERVAÇÕES");

        JTA_observacao.setColumns(20);
        JTA_observacao.setRows(5);
        jScrollPane1.setViewportView(JTA_observacao);

        JB_limpa.setText("LIMPAR");
        JB_limpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_limpaActionPerformed(evt);
            }
        });

        JB_cadastro.setBackground(new java.awt.Color(51, 153, 0));
        JB_cadastro.setText("CADASTRAR");
        JB_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_cadastroActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel17.setText("DATA DE NASCIMENTO");

        try {
            JTF_dtnasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            JTF_rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            JTF_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            JTF_dddtel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            JTF_dddcel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            JTF_tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            JTF_cel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel18.setText("CADASTRAR ALUNOS");

        jButton1.setText("Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(JTF_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(JTF_email, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTF_dddtel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(JTF_dddcel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_cel))
                    .addComponent(JTF_emailalt, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(jLabel5)
                    .addComponent(JTF_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_dtnasc)
                    .addComponent(JTF_ra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JTF_situacao, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addComponent(JTF_cep, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addComponent(JTF_rua, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addComponent(JTF_numero)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addComponent(JTF_bairro, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(JTF_cidade))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTF_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(39, 39, 39))))
                        .addComponent(jLabel16)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JB_limpa, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JB_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(177, 177, 177)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTF_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_rg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTF_dtnasc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTF_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(JTF_situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(JTF_emailalt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTF_dddcel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_cel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTF_dddtel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JB_cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JB_limpa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_limpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_limpaActionPerformed
        limpaCampos();
    }//GEN-LAST:event_JB_limpaActionPerformed
 
    private void JB_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_cadastroActionPerformed
        AlunoDAO dao = new AlunoDAO();
        Aluno a;
        a = new Aluno();
        a.setNome(JTF_nome.getText());
        a.setDtnasc(JTF_dtnasc.getText());
        a.setRg(JTF_rg.getText());
        a.setCpf(JTF_rg.getText());
        a.setRa(JTF_ra.getText());
        a.setEmail(JTF_email.getText());
        a.setEmailalt(JTF_emailalt.getText());
        a.setDddtel(JTF_dddtel.getText());
        a.setTel(JTF_tel.getText());
        a.setDddcel(JTF_dddtel.getText());
        a.setCel(JTF_tel.getText());
        a.setCep(JTF_cep.getText());
        a.setRua(JTF_rua.getText());
        a.setBairro(JTF_bairro.getText());
        a.setCidade(JTF_cidade.getText());
        a.setUf(JTF_uf.getText());
        a.setObserv(JTA_observacao.getText());
        a.setSituacao(JTF_situacao.getText());
        
        if(JTF_numero.getText().equals("")){
            JTF_numero.setText("0");
            a.setNumero(Integer.parseInt(JTF_numero.getText()));
        }else{
            a.setNumero(Integer.parseInt(JTF_numero.getText()));
        }      
        if(JTF_nome.getText().trim().equals("") || JTF_dtnasc.getText().trim().equals("") || JTF_rg.getText().trim().equals("") 
           || JTF_rg.getText().trim().equals("") || JTF_ra.getText().trim().equals("") || JTF_email.getText().trim().equals("")
           || JTF_emailalt.getText().trim().equals("") || JTF_dddtel.getText().trim().equals("") || JTF_tel.getText().trim().equals("")
           || JTF_dddtel.getText().trim().equals("") || JTF_tel.getText().trim().equals("") || JTF_cep.getText().trim().equals("")
           || JTF_rua.getText().trim().equals("") || JTF_bairro.getText().trim().equals("") || JTF_numero.getText().trim().equals(0)
           || JTF_cidade.getText().trim().equals("") || JTF_uf.getText().trim().equals("") || JTF_situacao.getText().trim().equals("")
           || JTA_observacao.getText().trim().equals("")){
            
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos!");
            JTF_numero.setText("");
            
        }else{
            dao.adicionarAluno(a);
            limpaCampos();
            JOptionPane.showMessageDialog(null, "Aluno Cadastrado com sucesso");
        }
        
        
    }//GEN-LAST:event_JB_cadastroActionPerformed

    private void JTF_cepInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JTF_cepInputMethodTextChanged

    }//GEN-LAST:event_JTF_cepInputMethodTextChanged

    private void JTF_cepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTF_cepFocusLost

        ViaCEP vc = new ViaCEP();
        try {
            vc.buscar(JTF_cep.getText().trim());
            JTF_rua.setText(vc.getLogradouro());
            JTF_bairro.setText(vc.getBairro());
            JTF_cidade.setText(vc.getLocalidade());
            JTF_uf.setText(vc.getUf());
            
        
        } catch (ViaCEPException ex) {
            Logger.getLogger(JF_CadastroAluno.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "CEP não encontrado");
            JTF_rua.setText("");
            JTF_bairro.setText("");
            JTF_cidade.setText("");
            JTF_uf.setText("");
        }
    }//GEN-LAST:event_JTF_cepFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JF_ListaAlunos lista = new JF_ListaAlunos();
        lista.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JF_Prinpical home = new JF_Prinpical();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_CadastroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_cadastro;
    private javax.swing.JButton JB_limpa;
    private javax.swing.JTextArea JTA_observacao;
    private javax.swing.JTextField JTF_bairro;
    private javax.swing.JFormattedTextField JTF_cel;
    private javax.swing.JTextField JTF_cep;
    private javax.swing.JTextField JTF_cidade;
    private javax.swing.JFormattedTextField JTF_cpf;
    private javax.swing.JFormattedTextField JTF_dddcel;
    private javax.swing.JFormattedTextField JTF_dddtel;
    private javax.swing.JFormattedTextField JTF_dtnasc;
    private javax.swing.JTextField JTF_email;
    private javax.swing.JTextField JTF_emailalt;
    private javax.swing.JTextField JTF_nome;
    private javax.swing.JTextField JTF_numero;
    private javax.swing.JTextField JTF_ra;
    private javax.swing.JFormattedTextField JTF_rg;
    private javax.swing.JTextField JTF_rua;
    private javax.swing.JTextField JTF_situacao;
    private javax.swing.JFormattedTextField JTF_tel;
    private javax.swing.JTextField JTF_uf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
