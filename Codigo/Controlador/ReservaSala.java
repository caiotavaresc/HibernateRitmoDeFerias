//Classe referente a Tela "ReservaSala" do projeto, que tem como acao reservar uma sala

package Controlador;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import Esquema.*;

//Classe extende o JFrame, pois assim se torna possivel a criação da interface grafica
public class ReservaSala extends javax.swing.JFrame {

    //Construtor da classe "ReservaSala" 
    public ReservaSala() {
        
        //inicializa os componenentes graficos
        initComponents();
        
        //Instancia dos objetos para reservar uma Sala de Squash
        List<SalaSquash> listaSala = SalaSquash.listarSalas(MenuInicial.manager);
        
        //Adiciona um item vazio antes
        cblistaSalaSquash.addItem(" ");
        for(SalaSquash aux : listaSala)
            cblistaSalaSquash.addItem(aux.getNroIdSala()+"");
        
        //Instancia dos objetos para manipular os socios
        List<Socio> listaSocio = Socio.listarSocios(MenuInicial.manager);
        
        //Adicionar um item vazio antes
        cbListaSocio.addItem(" ");
        for(Socio aux : listaSocio)
            cbListaSocio.addItem(aux.getNroSocio()+"");
    }

    /*Metodo que inicializa os componentes graficos da tela "ReservaSala". 
    
    O metodo contem a instancia de todos os botoes, forms etc e suas 
    respectivas acoes que sao orientadas a eventos, como cliques do mouse.
    
    A interface gráfica foi criada utilizando a IDE Netbeans, que 
    torna esse processo facilitado, ja que o programador "desenha"
    a GUI e a IDE automaticamente vai gerando o codigo*/
        @SuppressWarnings("unchecked")
    private void initComponents() {

        btnReservar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbListaSocio = new javax.swing.JComboBox<>();
        cblistaSalaSquash = new javax.swing.JComboBox<>();
        DTReserva = new com.toedter.calendar.JDateChooser();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        escolherHora = new javax.swing.JSpinner(sm);
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 50));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnReservar.png"))); // NOI18N
        btnReservar.setBorderPainted(false);
        btnReservar.setContentAreaFilled(false);
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
        getContentPane().add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

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
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, -1, -1));

        jLabel1.setText("Hora da reserva:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 130, -1));

        jLabel2.setText("Número da sala:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 120, -1));

        jLabel3.setText("Código do Sócio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 130, -1));

        jLabel4.setText("Data da reserva:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 130, -1));

        getContentPane().add(cbListaSocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 130, -1));

        cblistaSalaSquash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblistaSalaSquashActionPerformed(evt);
            }
        });
        getContentPane().add(cblistaSalaSquash, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, -1));
        getContentPane().add(DTReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 130, -1));

        JSpinner.DateEditor de = new JSpinner.DateEditor(escolherHora, "HH:mm");
        escolherHora.setEditor(de);
        escolherHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(escolherHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 130, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background700x600.png"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 600));

        pack();
    }

    /*-----------------------------------------------------------------------------------------!
    //Conjunto de metodos que sao executados conforme eventos (estes, passados por parametros)
    !-----------------------------------------------------------------------------------------*/

    //Metodo que eh invocado quando o botao reservar recebe um evento
    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        Reserva res = new Reserva();
        
        //Converte a entrada do usuario em String
        String _NROIDSALA, _NROIDSOCIO;
        _NROIDSALA = cblistaSalaSquash.getSelectedItem().toString();
        _NROIDSOCIO = cbListaSocio.getSelectedItem().toString();
        
        //Caso o usuario nao tenha escolhido uma sala, o sistema avisa
        if(_NROIDSALA.equals(" "))
        {
            JOptionPane.showMessageDialog(this, "Por favor escolha uma sala");
            return;
        }
        
        //Caso o usuario nao tenha escolhido um socio, o sistema avisa
        if(_NROIDSOCIO.equals(" "))
        {
            JOptionPane.showMessageDialog(this, "Por favor selecione um sócio");
            return;
        }
        
        //Configura o valor (em iInteger) da entrada do usuario
        res.setNroIdSala(Integer.parseInt(_NROIDSALA), MenuInicial.manager);
        res.setSocio(Integer.parseInt(_NROIDSOCIO), MenuInicial.manager);
        
        Calendar calHora;
        String retorno;
        
        try
        {
        JSpinner.DateEditor de = new JSpinner.DateEditor(escolherHora, "HH:mm");
        de.getTextField().setEditable( false );
        escolherHora.setEditor(de);
        String valFor = de.getFormat().format(escolherHora.getValue());
        
        //Quebrar a String para pegar o valor
        String Hora = valFor.substring(0, 2);
        String Minuto = valFor.substring(3, 5);
        
        //Insere os valores "quebrados" nos campos corretos  
        Date dataReserva = DTReserva.getDate();
        dataReserva.setHours(Integer.valueOf(Hora));
        dataReserva.setMinutes(Integer.valueOf(Minuto));
        
        //COnfigura o formato da Hora e da Data
        SimpleDateFormat smp = new SimpleDateFormat();
        smp.applyPattern("dd/MM/yyyy HH:mm");
        retorno = smp.format(dataReserva);
        
        //Usa a biblioteca de calendario
        calHora = smp.getCalendar();
        }
        catch(Exception e)
        {
            //Caso o valor seja incorreto, o usuario eh avisado
            JOptionPane.showMessageDialog(this, "Data da reserva inválida");
            return;
        }
        
        //Configura os valores nos locais separados, facilitando futuras buscas 
        res.setDataHora(calHora);
        
        //Se a sala já estiver reservada nesse horário, exibir mensagem
        if(res.salaJaReservada(MenuInicial.manager))
        {
            JOptionPane.showMessageDialog(this, "Esta sala já está reservada nesse horário. Não é possível efetuar a reserva");
            return;
        }
            
        //Mensagens de sucesso ou erro da operacao de reservar uma sala    
        try
        {
            MenuInicial.manager.persist(res);
            MenuInicial.manager.getTransaction().commit();
            MenuInicial.manager.getTransaction().begin();
            
            JOptionPane.showMessageDialog(this, "Registro adicionado com sucesso");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Não foi possível adicionar o registro :(");
        }
    }

    //Apos selecinar a opcao "Voltar", torna a mostrar o menu inicial
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
        new MenuInicial().show();
    }

    //Imagem do botao "Reservar" apos o ponteiro ser colocado em cima
    private void btnReservarMouseEntered(java.awt.event.MouseEvent evt) {
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnReservarMouseCima.png")));
    }

    //Imagem do botao "Reservar" apos o ponteiro ser tirado de cima do botao
    private void btnReservarMouseExited(java.awt.event.MouseEvent evt) {
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnReservar.png")));
    }

    //Imagem do botao "Reservar" apos o mesmo ser clicado
    private void btnReservarMouseClicked(java.awt.event.MouseEvent evt) {
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnReservarPressionado.png")));
    }

    //Imagem do botao "Voltar" apos o ponteiro ser colocado em cima
    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltarMouseCima.png")));
    }

    //Imagem do botao "Voltar" apos o mesmo ser clicado
    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltarPressionado.png")));
    }

    //Imagem do botao "Voltar" apos o ponteiro ser tirado de cima do botao
    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/btnVoltar.png")));
    }

    private void cblistaSalaSquashActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    //Metodo main da classe "ReservaSala"
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReservaSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Cria and mostra / apresenta a tela "ReservaSala" 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaSala().setVisible(true);
            }
        });
    }

    // Declaracoes de variaveis (padrao) 
    private com.toedter.calendar.JDateChooser DTReserva;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbListaSocio;
    private javax.swing.JComboBox<String> cblistaSalaSquash;
    private javax.swing.JSpinner escolherHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblBackground;
}
