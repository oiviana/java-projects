package urna_eletronica.view;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import urna_eletronica.data.Conexao;
import urna_eletronica.data.Candidato;
import urna_eletronica.data.CandidatoDAO;
import urna_eletronica.data.Eleitor;
import urna_eletronica.data.EleitorDAO;


/**
 *
 * @author viana
 */
public class JF_Urna extends javax.swing.JFrame {
        Eleitor e = new Eleitor();
        EleitorDAO daotwo = new EleitorDAO();
    /**
     * Creates new form Urna
     */
    public JF_Urna() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        JTF_first_number.setEditable(false);
        JTF_second_number.setEditable(false);


    }
     String concatNumbers;
    //Função que monta o número do candidato
    public void getNumbers(String value) {
       
        Candidato c = new Candidato();
        CandidatoDAO dao = new CandidatoDAO();

        if ((!JTF_second_number.getText().trim().equals(""))) {

        } else {

            if (JTF_first_number.getText().trim().equals("")) {
                JTF_first_number.setText(value);
            } else {
                JTF_second_number.setText(value);
            }
            if ((!JTF_second_number.getText().trim().equals(""))) {
                concatNumbers = JTF_first_number.getText().concat(JTF_second_number.getText()); //concatena os numeros
    
                c = dao.consultaCandidato(concatNumbers); //procura o candidato pelo numero concatenado

                if (c == null) { //caso não encontre nenhum dado
                    JL_can_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notfound.jpg")));
                } else {
                    if(c.getNome().equals("Nulos")){ //tratamento de voto nulo que é 0
                        
                        
                    }else{
                    JL_can_nome.setText(c.getNome());
                    JL_can_vice.setText(c.getVice());
                    JL_can_partido.setText(c.getPartido());
                    JL_can_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c.getFoto())));
                    JL_can_vice_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + c.getFotovice())));
                    }
                }
            }
        }
    }
    
  public void song(String nomeSom){ //tocar som de urna eletrônica
      URL url = getClass().getResource("/som/"+nomeSom);
      AudioClip audio = Applet.newAudioClip(url);
      audio.play();
  }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JB_one = new javax.swing.JButton();
        JB_three = new javax.swing.JButton();
        JB_two = new javax.swing.JButton();
        JB_six = new javax.swing.JButton();
        JB_five = new javax.swing.JButton();
        JB_four = new javax.swing.JButton();
        JB_nine = new javax.swing.JButton();
        JB_seven = new javax.swing.JButton();
        JB_eight = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        JB_zero = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JL_eleitor = new javax.swing.JLabel();
        JTF_second_number = new javax.swing.JTextField();
        JTF_first_number = new javax.swing.JTextField();
        JL_can_vice = new javax.swing.JLabel();
        JL_can_nome = new javax.swing.JLabel();
        JL_can_partido = new javax.swing.JLabel();
        JL_can_vice_img = new javax.swing.JLabel();
        JL_can_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 51, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("JUSTIÇA");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ELEITORAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(37, 37, 37)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(7, 7, 7));

        JB_one.setBackground(new java.awt.Color(18, 18, 18));
        JB_one.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_one.setForeground(new java.awt.Color(255, 255, 255));
        JB_one.setText("1");
        JB_one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_one.setFocusable(false);
        JB_one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_oneActionPerformed(evt);
            }
        });

        JB_three.setBackground(new java.awt.Color(18, 18, 18));
        JB_three.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_three.setForeground(new java.awt.Color(255, 255, 255));
        JB_three.setText("3");
        JB_three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_three.setFocusable(false);
        JB_three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_threeActionPerformed(evt);
            }
        });

        JB_two.setBackground(new java.awt.Color(18, 18, 18));
        JB_two.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_two.setForeground(new java.awt.Color(255, 255, 255));
        JB_two.setText("2");
        JB_two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_two.setFocusable(false);
        JB_two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_twoActionPerformed(evt);
            }
        });

        JB_six.setBackground(new java.awt.Color(18, 18, 18));
        JB_six.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_six.setForeground(new java.awt.Color(255, 255, 255));
        JB_six.setText("6");
        JB_six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_six.setFocusable(false);
        JB_six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_sixActionPerformed(evt);
            }
        });

        JB_five.setBackground(new java.awt.Color(18, 18, 18));
        JB_five.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_five.setForeground(new java.awt.Color(255, 255, 255));
        JB_five.setText("5");
        JB_five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_five.setFocusable(false);
        JB_five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_fiveActionPerformed(evt);
            }
        });

        JB_four.setBackground(new java.awt.Color(18, 18, 18));
        JB_four.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_four.setForeground(new java.awt.Color(255, 255, 255));
        JB_four.setText("4");
        JB_four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_four.setFocusable(false);
        JB_four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_fourActionPerformed(evt);
            }
        });

        JB_nine.setBackground(new java.awt.Color(18, 18, 18));
        JB_nine.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_nine.setForeground(new java.awt.Color(255, 255, 255));
        JB_nine.setText("9");
        JB_nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_nine.setFocusable(false);
        JB_nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_nineActionPerformed(evt);
            }
        });

        JB_seven.setBackground(new java.awt.Color(18, 18, 18));
        JB_seven.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_seven.setForeground(new java.awt.Color(255, 255, 255));
        JB_seven.setText("7");
        JB_seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_seven.setFocusable(false);
        JB_seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_sevenActionPerformed(evt);
            }
        });

        JB_eight.setBackground(new java.awt.Color(18, 18, 18));
        JB_eight.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_eight.setForeground(new java.awt.Color(255, 255, 255));
        JB_eight.setText("8");
        JB_eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_eight.setFocusable(false);
        JB_eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_eightActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(41, 115, 36));
        jButton14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setText("CONFIRMA");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        JB_zero.setBackground(new java.awt.Color(18, 18, 18));
        JB_zero.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        JB_zero.setForeground(new java.awt.Color(255, 255, 255));
        JB_zero.setText("0");
        JB_zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JB_zero.setFocusable(false);
        JB_zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_zeroActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("BRANCO");
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(188, 64, 64));
        jButton18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText("CORRIGE");
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JB_four, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(JB_five, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(JB_six, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JB_one, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(JB_two, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(JB_three, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JB_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(JB_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(JB_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_one, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_two, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_three, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_four, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_five, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_six, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_seven, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_nine, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JB_eight, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(JB_zero, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(45, 45, 45))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Eleitor:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Vice:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Número:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Partido:");

        JL_eleitor.setFont(new java.awt.Font("Arial", 0, 26)); // NOI18N
        JL_eleitor.setForeground(new java.awt.Color(0, 0, 0));
        JL_eleitor.setText("Lucas Viana Silva André");

        JTF_second_number.setBackground(new java.awt.Color(255, 255, 255));
        JTF_second_number.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        JTF_second_number.setForeground(new java.awt.Color(0, 0, 0));
        JTF_second_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF_second_number.setFocusable(false);
        JTF_second_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTF_second_numberFocusGained(evt);
            }
        });
        JTF_second_number.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                JTF_second_numberInputMethodTextChanged(evt);
            }
        });
        JTF_second_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_second_numberActionPerformed(evt);
            }
        });
        JTF_second_number.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                JTF_second_numberPropertyChange(evt);
            }
        });

        JTF_first_number.setBackground(new java.awt.Color(255, 255, 255));
        JTF_first_number.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        JTF_first_number.setForeground(new java.awt.Color(0, 0, 0));
        JTF_first_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTF_first_number.setFocusable(false);

        JL_can_vice.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        JL_can_vice.setForeground(new java.awt.Color(0, 0, 0));

        JL_can_nome.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        JL_can_nome.setForeground(new java.awt.Color(0, 0, 0));
        JL_can_nome.setText(" ");

        JL_can_partido.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        JL_can_partido.setForeground(new java.awt.Color(0, 0, 0));

        JL_can_vice_img.setText(".");
        JL_can_vice_img.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JL_can_img.setText(".");
        JL_can_img.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JL_can_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_can_vice, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_first_number, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTF_second_number, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JL_can_partido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_eleitor, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(JL_can_img, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JL_can_vice_img, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JL_eleitor))
                        .addGap(170, 170, 170)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTF_first_number, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JTF_second_number, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(JL_can_nome))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(JL_can_partido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JL_can_vice))
                .addGap(121, 121, 121))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(JL_can_img, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(JL_can_vice_img, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void JB_oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_oneActionPerformed
        getNumbers(JB_one.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_oneActionPerformed

    private void JB_twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_twoActionPerformed
        getNumbers(JB_two.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_twoActionPerformed

    private void JB_threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_threeActionPerformed
        getNumbers(JB_three.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_threeActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        //corrigir e limpar os campos
        JTF_first_number.setText(" ");
        JTF_second_number.setText(" ");
        JL_can_nome.setText(" ");
        JL_can_vice.setText(" ");
        JL_can_partido.setText(" ");
        JL_can_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cinza.jpg")));
        JL_can_vice_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cinza.jpg")));
    }//GEN-LAST:event_jButton18ActionPerformed

    private void JB_fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_fourActionPerformed
        getNumbers(JB_four.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_fourActionPerformed

    private void JB_fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_fiveActionPerformed
        getNumbers(JB_five.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_fiveActionPerformed

    private void JB_sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_sixActionPerformed
        getNumbers(JB_six.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_sixActionPerformed

    private void JB_sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_sevenActionPerformed
        getNumbers(JB_seven.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_sevenActionPerformed

    private void JB_eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_eightActionPerformed
        getNumbers(JB_eight.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_eightActionPerformed

    private void JB_nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_nineActionPerformed
        getNumbers(JB_nine.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_nineActionPerformed

    private void JB_zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_zeroActionPerformed
        getNumbers(JB_zero.getText());
        song("numero.wav");
    }//GEN-LAST:event_JB_zeroActionPerformed

    private void JTF_second_numberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTF_second_numberFocusGained

    }//GEN-LAST:event_JTF_second_numberFocusGained

    private void JTF_second_numberInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_JTF_second_numberInputMethodTextChanged

    }//GEN-LAST:event_JTF_second_numberInputMethodTextChanged

    private void JTF_second_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_second_numberActionPerformed

    }//GEN-LAST:event_JTF_second_numberActionPerformed

    private void JTF_second_numberPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_JTF_second_numberPropertyChange

    }//GEN-LAST:event_JTF_second_numberPropertyChange

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Candidato c = new Candidato();
        CandidatoDAO dao = new CandidatoDAO();

        if (JTF_second_number.getText().trim().equals("") || JTF_first_number.getText().trim().equals("")) { //não faz nada se não tiver preenchido numeros
        } else {
            c = dao.consultaCandidato(concatNumbers);
            if(c == null){ //não faz nada se não encontrar candidatos
            }else{
                song("votou.wav");
                dao.atualizaVoto(concatNumbers); //atualiza numero de votos
                daotwo.atualizaStatus(JF_Acesso.numeroRg); //atualiza status do eleitor
                JF_Acesso acesso = new JF_Acesso(); //volta à tela de acesso
                acesso.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        e = daotwo.acessaEleitor(JF_Acesso.numeroRg);
        JL_eleitor.setText(e.getNome());
    }//GEN-LAST:event_formWindowOpened

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        CandidatoDAO dao = new CandidatoDAO();
        song("votou.wav");
        dao.votoNulo();
        daotwo.atualizaStatus(JF_Acesso.numeroRg);
        JF_Acesso acesso = new JF_Acesso();
        acesso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton17ActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Urna().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JB_eight;
    private javax.swing.JButton JB_five;
    private javax.swing.JButton JB_four;
    private javax.swing.JButton JB_nine;
    private javax.swing.JButton JB_one;
    private javax.swing.JButton JB_seven;
    private javax.swing.JButton JB_six;
    private javax.swing.JButton JB_three;
    private javax.swing.JButton JB_two;
    private javax.swing.JButton JB_zero;
    private javax.swing.JLabel JL_can_img;
    private javax.swing.JLabel JL_can_nome;
    private javax.swing.JLabel JL_can_partido;
    private javax.swing.JLabel JL_can_vice;
    private javax.swing.JLabel JL_can_vice_img;
    private javax.swing.JLabel JL_eleitor;
    private javax.swing.JTextField JTF_first_number;
    private javax.swing.JTextField JTF_second_number;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
