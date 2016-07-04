//Classe referente a Tela "ListarUsuario" do projeto, que tem como acao, como o proprio nome diz, listar os usuarios

package Controlador;

import Esquema.Reserva;
import java.util.List;
import javax.swing.table.DefaultTableModel;

//Classe extende o JFrame, pois assim se torna possivel a criação da interface grafica
public class ListarUsuarios extends javax.swing.JFrame {

    //Construtor da classe "ReservaSala" 
    public ListarUsuarios() {
        initComponents();
    }

    /*Metodo que inicializa os componentes graficos da tela "ListarUsuarios". 
    
    O metodo contem a instancia de todos os botoes, forms etc e suas 
    respectivas acoes que sao orientadas a eventos, como cliques do mouse.
    
    A interface gráfica foi criada utilizando a IDE Netbeans, que 
    torna esse processo facilitado, ja que o programador "desenha"
    a GUI e a IDE automaticamente vai gerando o codigo*/
    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnVoltar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabUsuarios = new javax.swing.JTable();
        rBtnAno = new javax.swing.JRadioButton();
        rBtnMes = new javax.swing.JRadioButton();
        btnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltar.png"))); // NOI18N
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setMaximumSize(new java.awt.Dimension(164, 71));
        btnVoltar.setMinimumSize(new java.awt.Dimension(164, 71));
        btnVoltar.setPreferredSize(new java.awt.Dimension(164, 71));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListar.png"))); // NOI18N
        btnListar.setBorderPainted(false);
        btnListar.setContentAreaFilled(false);
        btnListar.setMaximumSize(new java.awt.Dimension(164, 71));
        btnListar.setMinimumSize(new java.awt.Dimension(164, 71));
        btnListar.setPreferredSize(new java.awt.Dimension(164, 71));
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarMouseExited(evt);
            }
        });
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 160, 70));

        tabUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ano", "ID Sócio", "Contagem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabUsuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 210));

        buttonGroup1.add(rBtnAno);
        rBtnAno.setSelected(true);
        rBtnAno.setText("Por ano");
        rBtnAno.setContentAreaFilled(false);
        rBtnAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnAnoActionPerformed(evt);
            }
        });
        getContentPane().add(rBtnAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        buttonGroup1.add(rBtnMes);
        rBtnMes.setText("Por mês");
        rBtnMes.setContentAreaFilled(false);
        rBtnMes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rBtnMesStateChanged(evt);
            }
        });
        rBtnMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnMesActionPerformed(evt);
            }
        });
        getContentPane().add(rBtnMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnLimpar.png"))); // NOI18N
        btnLimpar.setBorderPainted(false);
        btnLimpar.setContentAreaFilled(false);
        btnLimpar.setPreferredSize(new java.awt.Dimension(164, 71));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimparMouseExited(evt);
            }
        });
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background700x600.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }

    //Metodo que faz a operação de limpar a tabela
    private void limparTabela()
    {
        DefaultTableModel model = (DefaultTableModel) tabUsuarios.getModel();
        
        for(int i = model.getRowCount()-1; i >= 0; i--)
            model.removeRow(i);
    }

    /*-----------------------------------------------------------------------------------------!
    //Conjunto de metodos que sao executados conforme eventos (estes, passados por parametros)
    !-----------------------------------------------------------------------------------------*/

    //Metodo que eh invocado quando o botao "Listar" recebe um evento
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {
        String tipoGer = "";

        //Pegar tipo de geração
        if(rBtnAno.isSelected())
            tipoGer = "A";
        
        if(rBtnMes.isSelected())
            tipoGer = "M";
        
        //Instancia dos objetos de Reserva
        List<Object[]> lista = Reserva.listarMaioresReservadores(MenuInicial.manager, tipoGer);
                
        //Limpa a tabela
        this.limparTabela();
        
        //Extrai o modelo para inserir as linhas
        DefaultTableModel model = (DefaultTableModel) tabUsuarios.getModel();
        
        int ultimo = -1;
        int ultimoId = -1;
        //Insere as linhas no modelo
        for(Object[] aux : lista)
        {
            String teste = (String) aux[2];
            if(Integer.parseInt(teste) >= ultimo || Integer.parseInt((String) aux[0]) != ultimoId)
            {
                model.addRow(aux);
                ultimo = Integer.parseInt(teste);
                ultimoId = Integer.parseInt((String) aux[0]);
            }
        }
    }

    //Metodo que eh invocado quando o botao "Mes" recebe um evento
    private void rBtnMesActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tabUsuarios.getModel();
        Object[] Colunas = new Object[3];
        Colunas[0] = "Mês";
        Colunas[1] = model.getColumnName(1);
        Colunas[2] = model.getColumnName(2);
        
        model.setColumnIdentifiers(Colunas);
    }

    //Metodo que eh invocado quando o botao "Ano" recebe um evento
    private void rBtnAnoActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tabUsuarios.getModel();
        Object[] Colunas = new Object[3];
        Colunas[0] = "Ano";
        Colunas[1] = model.getColumnName(1);
        Colunas[2] = model.getColumnName(2);
        
        model.setColumnIdentifiers(Colunas);
    }

    //Imagem do botao "Voltar" apos o mesmo ser clicado
    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltarPressionado.png")));
    }

    //Imagem do botao "Voltar" apos o ponteiro ser colocado em cima
    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltarMouseCima.png")));
    }

    //Imagem do botao "Voltar" apos o ponteiro ser tirado de cima do botao
    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltar.png")));
    }

    //Apos selecinar a opcao "Voltar", torna a mostrar o menu inicial
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new MenuInicial().show();
    }

    //Imagem do botao "Listar" apos o mesmo ser clicado
    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarPressionado.png")));
    }

    //Imagem do botao "Listar" apos o ponteiro ser colocado em cima
    private void btnListarMouseEntered(java.awt.event.MouseEvent evt) {
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarMouseCima.png")));
    }

    //Imagem do botao "Listar" apos o ponteiro ser tirado de cima do botao
    private void btnListarMouseExited(java.awt.event.MouseEvent evt) {
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListar.png")));
    }

    //Metodo que invoca a acao de limpar tabela, apos o botao receber um evento
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        this.limparTabela();
    }

     //Imagem do botao "Limpar" apos o mesmo ser clicado
    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnLimparPressionado.png")));
    }

    //Imagem do botao "Limpar" apos o ponteiro ser colocado em cima
    private void btnLimparMouseEntered(java.awt.event.MouseEvent evt) {
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnLimparMouseCima.png")));
    }

    //Imagem do botao "Limpar" apos o ponteiro ser tirado de cima do botao
    private void btnLimparMouseExited(java.awt.event.MouseEvent evt) {
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnLimpar.png")));
    }

    private void rBtnMesStateChanged(javax.swing.event.ChangeEvent evt) {
        // TODO add your handling code here:
    }

    //Metodo main da classe "ListarUsuarios"
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Cria and mostra / apresenta a tela "ListarUsuarios" 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarUsuarios().setVisible(true);
            }
        });
    }

    // Declaracoes de variaveis (padrao) 
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rBtnAno;
    private javax.swing.JRadioButton rBtnMes;
    private javax.swing.JTable tabUsuarios;
}
