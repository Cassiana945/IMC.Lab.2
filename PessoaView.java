package view;

import br.Pessoa;
import javax.swing.*;
import java.awt.*;



public class PessoaView  extends JFrame {
    private JPanel pnPrincipal;
    private JPanel jnTítulo;
    private JPanel pnButton;
    private JButton buttonIMC;
    private JButton buttonFechar;
    private JPanel pnMostrarIMC;
    private JPanel pnInformaçoes;
    private JTextArea jtMostrarIMC;
    private JTextField tfNome;
    private JTextField tfIdade;
    private JTextField tfAltura;
    private JTextField tfPeso;
    private JLabel jlTitulo;
    private JLabel jlInfoPessoal;
    private JLabel jlNome;
    private JLabel jlIdade;
    private JLabel jlAltura;
    private JLabel jlPeso;
    private JLabel jlResultIMC;
    private JPanel pnTitulo;
    private JFrame frame;
    private JLabel jlbTitulo;
    private JButton buttonCalcularIMC;

    public PessoaView() { //CONSTRUTOR

    }


public static void main(String[] args){ //Metodo principal
        JFrame frame  = new JFrame("Calculadora IMC");
        frame.setContentPane(new PessoaView().pnPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
