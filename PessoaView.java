package view;

import br.Pessoa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public static class PessoaView implements ActionListener {
    private JPanel pnPrincipal;
    private JPanel jnTítulo;
    private JPanel pnButton;
    private JButton buttonIMC;
    private JButton buttonFechar;
    private JPanel pnMostrarIMC;
    private JPanel pnInformaçoes;
    private JTextField jtNome;
    private JTextField jtIdade;
    private JTextArea jtMostrarIMC;
    private JPanel pnTitulo;
    private JFrame frame;
    private JLabel jlbTitulo;
    private JButton buttonCalcularIMC;

    public PessoaView () { //CONSTRUTOR

        Pessoa pessoa = new Pessoa();
        frame = new JFrame(); //JFrame object

        frame.add(pnPrincipal, BorderLayout.CENTER);  //set the panel to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set what happens when they close the frame
        frame.setTitle("Calculadora IMC"); //set the title
        frame.pack(); // set the window  to be match a certain size
        frame.setVisible(true); //set the window to be visible and in focus


        JFrame frame = new JFrame("Calculadora de IMC");
        frame.setContentPane(new PessoaView().pnPrincipal);
        buttonCalcularIMC.addActionListener(newActionListener() {

            @Override  //Metodo
            public void actionPerformed (ActionEvent e){

            }
        }}}





