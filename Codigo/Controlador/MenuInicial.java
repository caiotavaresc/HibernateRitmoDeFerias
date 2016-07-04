//Classe referente a Tela inicial do projeto, que exibe as opcoes disponiveis 

package Controlador;

import javax.persistence.*;

//Classe extende o JFrame, pois assim se torna possivel a criação da interface grafica
public class MenuInicial extends javax.swing.JFrame {
    
    //Fabrica de EntityManager
    public static EntityManagerFactory factory;
    public static EntityManager manager;

    //Construtor da classe "MenuInicial" 
    public MenuInicial() {
        
        //Iniciar os Entity Managers
        if(MenuInicial.factory == null)
        {
        MenuInicial.factory = Persistence.createEntityManagerFactory("sempre_em_forma");
        MenuInicial.manager = MenuInicial.factory.createEntityManager();
        MenuInicial.manager.getTransaction().begin();
        }
        
        initComponents();
    }

    /*Metodo que inicializa os componentes graficos do Sistema. 
    
    O metodo contem a instancia de todos os botoes, forms etc e suas 
    respectivas acoes que sao orientadas a eventos, como cliques do mouse.
    
    A interface gráfica foi criada utilizando a IDE Netbeans, que 
    torna esse processo facilitado, ja que o programador "desenha"
    a GUI e a IDE automaticamente vai gerando o codigo*/
    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnCadastrar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnListarReservas = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JButton();
        
                
        lblBackground = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnFuturasReservas.png"))); // NOI18N
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setMaximumSize(new java.awt.Dimension(233, 109));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(233, 109));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(164, 71));
        btnCadastrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
        
        });
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
            
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 160, 70));

        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnReservar.png"))); // NOI18N
        btnReservar.setBorderPainted(false);
        btnReservar.setContentAreaFilled(false);
        btnReservar.setMaximumSize(new java.awt.Dimension(164, 71));
        btnReservar.setPreferredSize(new java.awt.Dimension(164, 71));
        btnReservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReservarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReservarMouseExited(evt);
            }
        });
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 160, 70));

        btnListarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarReservas.png"))); // NOI18N
        btnListarReservas.setBorderPainted(false);
        btnListarReservas.setContentAreaFilled(false);
        btnListarReservas.setMaximumSize(new java.awt.Dimension(164, 71));
        btnListarReservas.setMinimumSize(new java.awt.Dimension(164, 71));
        btnListarReservas.setPreferredSize(new java.awt.Dimension(164, 71));
        btnListarReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarReservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarReservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarReservasMouseExited(evt);
            }
        });
        btnListarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarReservasActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 160, 70));

        btnListarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarUsuarios.png"))); // NOI18N
        btnListarUsuarios.setBorderPainted(false);
        btnListarUsuarios.setContentAreaFilled(false);
        btnListarUsuarios.setMaximumSize(new java.awt.Dimension(164, 71));
        btnListarUsuarios.setMinimumSize(new java.awt.Dimension(164, 71));
        btnListarUsuarios.setPreferredSize(new java.awt.Dimension(164, 71));
        btnListarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarUsuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarUsuariosMouseExited(evt);
            }
        });
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });
        getContentPane().add(btnListarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 160, 70));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background700x600.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }

    /*-----------------------------------------------------------------------------------------!
    //Conjunto de metodos que sao executados conforme eventos (estes, passados por parametros)
    !-----------------------------------------------------------------------------------------*/

    //Lista as reservas futuras
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {
            ListarFuturasReservas ListFutReserv = new ListarFuturasReservas();
            ListFutReserv.show();
            this.setVisible(false);
    }

    //Imagem do botao "cadastrar" apos fim de acao do mouse
    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnFuturasReservas.png")));
    }

    //Imagem do botao "cadastrar" apos clique pelo mouse
    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnFuturasReservasPressionado.png")));
    }

    //Imagem do botao "Reservar" apos acao do mouse
    private void btnReservarMouseEntered(java.awt.event.MouseEvent evt) {
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnReservarMouseCima.png")));
    }

    //Imagem do botao "Reservar" apos fim de acao do mouse
    private void btnReservarMouseExited(java.awt.event.MouseEvent evt) {
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnReservar.png")));
    }

    //Imagem do botao "Reservar" apos clique pelo mouse
    private void btnReservarMouseClicked(java.awt.event.MouseEvent evt) {
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnReservarPressionado.png")));
    }

    //Imagem do botao "Listar Reservas" apos acao do mouse
    private void btnListarReservasMouseEntered(java.awt.event.MouseEvent evt) {
        btnListarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarReservasMouseCima.png")));
    }

    //Imagem do botao "Listar Reservas" apos fim de acao mouse
    private void btnListarReservasMouseExited(java.awt.event.MouseEvent evt) {
        btnListarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarReservas.png")));
    }
    
    //Imagem do botao "Listar Reservas" apos clique pelo mouse
    private void btnListarReservasMouseClicked(java.awt.event.MouseEvent evt) {
        btnListarReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarReservasPressionado.png")));
    }

    //Imagem do botao "Listar Usuario" apos clique pelo mouse
    private void btnListarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {
        btnListarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarUsuariosPressionado.png")));
    }

    //Imagem do botao "Listar Usuario" evento do mouse
    private void btnListarUsuariosMouseEntered(java.awt.event.MouseEvent evt) {
        btnListarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarUsuariosMouseCima.png")));
    }

    //Imagem do botao "Listar Usuario" apos fim de acao do mouse
    private void btnListarUsuariosMouseExited(java.awt.event.MouseEvent evt) {
        btnListarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnListarUsuarios.png")));
    }

    //Imagem do botao "Cadastrar" apos fim de acao do mouse
    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnFuturasReservasMouseCima.png")));
    }

    //Apos selecinar a opcao "ListarReservas", torna o menu inicial não visivel
    private void btnListarReservasActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new ListarReservas().show();
    }

    //Apos selecinar a opcao "ReservaSalas", torna o menu inicial não visivel
    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new ReservaSala().show();
    }

    //Apos selecinar a opcao "listas Usuarios", torna o menu inicial não visivel
    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {
        new ListarUsuarios().show();
        this.setVisible(false);
    }

    //Metodo main da classe "MenuInicial"
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Cria and mostra / apresenta a tela MenuInicial 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Declaracoes de variaveis (padrao) 
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnListarReservas;
    private javax.swing.JButton btnListarUsuarios;
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel lblBackground;
}
