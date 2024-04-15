package view;
import br.Pessoa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


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
    private JLabel lbCPF;
    private JTextField textCpf;
    private JButton btnSalvar;
    private JButton btnAdicionar;
    private JButton btnLimpar;
    private JPanel pnTitulo;
    private JFrame frame;
    private JLabel jlbTitulo;
    private JButton buttonCalcularIMC;
    private Pessoa pessoa;
    private List<Pessoa> listaPessoa;
    private String arquivo;




    public PessoaView() { //CONSTRUTOR

        listaPessoa = new ArrayList<>();
        eventosPessoaView();
        arquivo = "C:\\Users\\User\\IdeaProjects\\IMC.Lab.2\\src\\arquivo";
    }

    public void eventosPessoaView() {

        btnFechar.addActionListener(new ActionListener() {   //Método de fechar a tela
            @Override
            public void actionPerformed(ActionEvent e) { System.exit(0); }

        });

        btnIMC.addActionListener(new ActionListener() {  //Método de ler os atributos e calcular o IMC
            @Override
            public void actionPerformed(ActionEvent e) {

                pessoa.setNome(textNome.getText());
                pessoa.setIdade(Integer.parseInt(textIdade.getText()));
                pessoa.setAltura(Double.parseDouble(textAltura.getText()));
                pessoa.setPeso(Double.parseDouble(textPeso.getText()));
                pessoa.setCpf(Integer.parseInt(textCpf.getText()));
                pessoa.calcularIMC();
                lbIMC.setText((String.format("%.2f", pessoa.getImc())));
                lbSaude.setText(pessoa.estadoSaude());
                System.out.println(pessoa.getNome());
                System.out.println(pessoa.getIdade());
                System.out.println(pessoa.getAltura());
                System.out.println(pessoa.getPeso());
                System.out.println(pessoa.getCpf());
                System.out.println(pessoa.getImc());
                System.out.print(pessoa.getEstadoSaude());
            }
        });

        btnLimpar.addActionListener(new ActionListener() {  //Método de limpar tudo
            @Override
            public void actionPerformed(ActionEvent e) {
                lbIMC.setText("   ");
                lbSaude.setText("  ");
            }
        });

        this.pessoa = new Pessoa();
        btnAdicionar.addActionListener(new ActionListener() {  //Método adicionar os atributos da pessoa
            @Override
            public void actionPerformed(ActionEvent e) {

                Pessoa novaPessoa = new Pessoa();
                novaPessoa.setNome(textNome.getText());
                novaPessoa.setIdade(Integer.parseInt(textIdade.getText()));
                novaPessoa.setAltura(Float.parseFloat(textAltura.getText()));
                novaPessoa.setPeso(Double.parseDouble(textPeso.getText()));
                novaPessoa.setCpf(Integer.parseInt(textCpf.getText()));
                novaPessoa.estadoSaude();
                listaPessoa.add(novaPessoa);
                textNome.setText("");
                textIdade.setText("");
                textAltura.setText("");
                textPeso.setText("");
            }
        });

        btnSalvar.addActionListener(new ActionListener() {  //Método de salvar os atributos da pessoa no arquivo.txt
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarNoArquivo("arquivo");
            }
        });

    }

    private void salvarNoArquivo(String listapessoas) {  //Método de ler e escrever os atributos salvos no arquivo.txt

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Pessoa pessoa : listaPessoa) {
                writer.write(pessoa.toString());
                writer.newLine();
            }
            System.out.println("\nLista de pessoas salva em " + arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args){ //Metodo principal
        JFrame frame  = new JFrame("Calculadora IMC");
        frame.setContentPane(new PessoaView().pnPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
