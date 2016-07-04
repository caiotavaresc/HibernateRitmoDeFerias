//Classe referente a Tela "ListarFuturasReservas" do projeto, que tem como acao, como o proprio nome diz, listar as reservas futuras realizadas

package Controlador;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import Esquema.Reserva;

//Classe extende o JFrame, pois assim se torna possivel a criação da interface grafica
public class ListarFuturasReservas extends javax.swing.JFrame {

    //Construtor da classe "ListarFuturasReservas" 
    public ListarFuturasReservas() {
        initComponents();
    }

    /*Metodo que inicializa os componentes graficos da tela "ListarFuturasReservas". 
    
    O metodo contem a instancia de todos os botoes, forms etc e suas 
    respectivas acoes que sao orientadas a eventos, como cliques do mouse.
    
    A interface gráfica foi criada utilizando a IDE Netbeans, que 
    torna esse processo facilitado, ja que o programador "desenha"
    a GUI e a IDE automaticamente vai gerando o codigo*/
    @SuppressWarnings("unchecked")
    private void initComponents() {

        tabUsuarios = new javax.swing.JScrollPane();
        tabUsuarios2 = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(290, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabUsuarios2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Socio", "Qtd de Reservas Futuras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabUsuarios.setViewportView(tabUsuarios2);

        getContentPane().add(tabUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 390, 230));

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
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

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
        getContentPane().add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 160, 70));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background700x600.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }

    //Metodo que faz a operação de limpar a tabela
    private void limparTabela()
    {
        DefaultTableModel model = (DefaultTableModel) tabUsuarios2.getModel();
        
        for(int i = model.getRowCount()-1; i >= 0; i--)
            model.removeRow(i);
    }

    /*-----------------------------------------------------------------------------------------!
    //Conjunto de metodos que sao executados conforme eventos (estes, passados por parametros)
    !-----------------------------------------------------------------------------------------*/

    //Metodo que realiza a acao do botao "Listar", apos um evento 
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel) tabUsuarios2.getModel();
        
        //Pegar a lista de reservas futuras
        List<Object[]> lista = Reserva.listarReservasNaoUsadas(MenuInicial.manager);
        
        //Limpar a tabela
        this.limparTabela();
        
        //Adicionar os registros um a um
        for(Object[] rc : lista)
            model.addRow(rc);
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

    //Metodo main da classe "ListarFuturasReservas"
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarFuturasReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFuturasReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFuturasReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFuturasReservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Cria and mostra / apresenta a tela "ListarFuturasReservas"
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFuturasReservas().setVisible(true);
            }
        });
    }

    // Declaracoes de variaveis (padrao) 
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JScrollPane tabUsuarios;
    private javax.swing.JTable tabUsuarios2;
}
