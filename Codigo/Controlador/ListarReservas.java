//Classe referente a Tela "ListarReservas" do projeto, que tem como acao, como o proprio nome diz, listar as reservas realizadas

package Controlador;

import Esquema.Reserva;
import Esquema.SalaSquash;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.Date;

//Classe extende o JFrame, pois assim se torna possivel a criação da interface grafica
public class ListarReservas extends javax.swing.JFrame {

    //Construtor da classe "ListarReservas" 
    public ListarReservas() {
        initComponents();
        
        List<SalaSquash> listaSala = SalaSquash.listarSalas(MenuInicial.manager);
        
        for(SalaSquash aux : listaSala)
            cmbNroIdSala.addItem(aux.getNroIdSala()+"");
    }

    /*Metodo que inicializa os componentes graficos da tela "ListarReservas". 
    
    O metodo contem a instancia de todos os botoes, forms etc e suas 
    respectivas acoes que sao orientadas a eventos, como cliques do mouse.
    
    A interface gráfica foi criada utilizando a IDE Netbeans, que 
    torna esse processo facilitado, ja que o programador "desenha"
    a GUI e a IDE automaticamente vai gerando o codigo*/
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaReservas = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        cmbNroIdSala = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Sala", "ID Sócio", "Data/Hora Reserva"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaReservas.setAlignmentX(0.1F);
        tabelaReservas.setAlignmentY(0.1F);
        tabelaReservas.setCellSelectionEnabled(true);
        tabelaReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tabelaReservas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 400, 240));

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
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

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
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 160, 70));

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
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        cmbNroIdSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNroIdSalaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbNroIdSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 80, -1));

        jLabel2.setText("Sala:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel3.setText("Reservas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background700x600.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }

    /*-----------------------------------------------------------------------------------------!
    //Conjunto de metodos que sao executados conforme eventos (estes, passados por parametros)
    !-----------------------------------------------------------------------------------------*/

    //Metodo que realiza a acao do botao "Listar", apos um evento 
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {
        String sala = cmbNroIdSala.getSelectedItem().toString();
        
        List<Reserva> listaRes = Reserva.listarReservasPorSala(MenuInicial.manager, Integer.valueOf(sala));
        DefaultTableModel model = (DefaultTableModel) tabelaReservas.getModel();
        
        for(int i = model.getRowCount() - 1; i >= 0 ; i--)
            model.removeRow(i);
        
        SimpleDateFormat smp = new SimpleDateFormat();
        smp.applyPattern("dd/MM/yyyy HH:mm");
        
        //Ir adicionando linha a linha
        for(Reserva aux : listaRes)
        {
            Object[] dados = new Object[3];
            dados[0] = aux.getId().getNroIdSala().getNroIdSala();
            dados[1] = aux.getId().getNroSocio().getNroSocio();
            dados[2] = smp.format(aux.getId().getDataHora().getTime());
            
            model.addRow(dados);
        }
        
    }

    //Metodo que realiza a acao do botao "Limpar", apos um evento  
    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tabelaReservas.getModel();
        
        for(int i = model.getRowCount() - 1; i >= 0 ; i--)
            model.removeRow(i);
    }

    //Apos selecinar a opcao "Voltar", torna a mostrar o menu inicial
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new MenuInicial().show();
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

    //Imagem do botao "Listar" apos o mesmo ser clicado
    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarPressionado.png")));
    }

    //Imagem do botao "Listar" apos o ponteiro ser colocado em cima
    private void btnListarMouseEntered(java.awt.event.MouseEvent evt) {
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarMouseCima.png")));
    }

    //Imagem do botao "Voltar" apos o ponteiro ser tirado de cima do botao
    private void btnListarMouseExited(java.awt.event.MouseEvent evt) {
        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListar.png")));
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

    private void cmbNroIdSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNroIdSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNroIdSalaActionPerformed

    //Metodo main da classe "ListarReservas"
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Cria and mostra / apresenta a tela "ListarReservas"
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarReservas().setVisible(true);
            }
        });
    }

    // Declaracoes de variaveis (padrao) 
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbNroIdSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaReservas;
}
