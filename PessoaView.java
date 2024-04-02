package view;

import br.Pessoa;
import principal.Principal;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PessoaView  extends JFrame {
    private JPanel pnPrincipal;
    private JPanel pnTítulo;
    private JLabel lbTítulo;
    private JPanel pnButton;
    private JButton btnIMC;
    private JButton btnFechar;
    private JPanel pnCenter;
    private JPanel pnForm;
    private JPanel pnResultado;
    private JLabel lbNome;
    private JTextField textNome;
    private JLabel lbIdadde;
    private JTextField textIdade;
    private JLabel lbAltura;
    private JTextField textAltura;
    private JLabel lbPeso;
    private JTextField textPeso;
    private JLabel lbIMC;
    private JLabel lbSaude;
    private JPanel pnTitulo;
    private JFrame frame;
    private JLabel jlbTitulo;
    private JButton buttonCalcularIMC;
    private Pessoa pessoa;

    public PessoaView() { //CONSTRUTOR

        eventosPessoaView();
        this.pessoa = new Pessoa();
    }

    public void eventosPessoaView() {  //Método botão fechar e clacular IMC

        btnFechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { System.exit(0); }

        });

        btnIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pessoa.setNome(textNome.getText());
                pessoa.setIdade(Integer.parseInt(textIdade.getText()));
                pessoa.setAltura(Double.parseDouble(textAltura.getText()));
                pessoa.setPeso(Double.parseDouble(textPeso.getText()));
                pessoa.calcularIMC();
                lbIMC.setText((String.format("%.2f", pessoa.getImc())));
                lbSaude.setText(pessoa.estadoSaude());
                System.out.println(pessoa.getNome());
                System.out.println(pessoa.getIdade());
                System.out.println(pessoa.getAltura());
                System.out.println(pessoa.getPeso());
            }
        });
    }


    public static void main(String[] args){ //Metodo principal
        JFrame frame  = new JFrame("Calculadora IMC");
        frame.setContentPane(new PessoaView().pnPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}



