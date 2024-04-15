package model;
import br.Pessoa;
import java.io.*;
import java.util.ArrayList;


public class RelatorioIMC {


    private int totalPessoas;
    private int totalMagro;
    private int totalSaudavel;
    private int totalObesidadeI;
    private int totalObesidadeII;
    private int totalObesidadeIII;

    private final ArrayList<Pessoa> listaPessoa;


    public RelatorioIMC() {        ///construtor criando a array list
        listaPessoa = new ArrayList<>();

        // Inicializa os contadores
        totalPessoas = 0;
        totalMagro = 0;
        totalSaudavel = 0;
        totalObesidadeI = 0;
        totalObesidadeII = 0;
        totalObesidadeIII = 0;
    }

    public int getTotalPessoas() {
        return totalPessoas;
    }

    public int getTotalMagro() {
        return totalMagro;
    }

    public int getTotalSaudavel() {
        return totalSaudavel;
    }

    public int getTotalObesidadeI() {
        return totalObesidadeI;
    }

    public int getTotalObesidadeII() {
        return totalObesidadeII;
    }

    public int getTotalObesidadeIII() {
        return totalObesidadeIII;
    }



    public void adicionarPessoa(Pessoa pessoa) {
        listaPessoa.add(pessoa);
        totalPessoas++;  //Contando a quantidade de pessoas


// Atualiza o contador de acordo com o estado de saúde da pessoa
        switch (pessoa.getEstadoSaude()) {
            case "Magro(a)":
                totalMagro++;
                break;
            case "Saudável":
                totalSaudavel++;
                break;
            case "Obesidade I":
                totalObesidadeI++;
                break;
            case "Obesidade II":
                totalObesidadeII++;
                break;
            case "Obesidade III":
                totalObesidadeIII++;
                break;
            default:
                break;
        }


        // Escreve o arquivo txt

        String url = "C:\\Users\\User\\IdeaProjects\\IMC.Lab.2\\src\\arquivo";    //criando um arquivo
        File arquivo = new File(url);

        try {
            FileWriter fw = new FileWriter(arquivo, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(pessoa.toString());
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    public void gerarRelatorio() {

        for (Pessoa pessoa : listaPessoa) {     //get retornando o valor atual do atributo
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getIdade());
            System.out.println(pessoa.getAltura());
            System.out.println(pessoa.getPeso());
            System.out.println(pessoa.getImc());
            System.out.println(pessoa.getCpf());
            System.out.println(pessoa.getEstadoSaude());
        }

        for (Pessoa pessoa : listaPessoa) {   //rodando a Array list
            System.out.println(pessoa);
        }
    }


    /////////////////////////////////////////// Métodos para calcular as médias, maior e menor idade, altura e peso
    public int MediaIdade() {
        int totalIdade = 0;
        for (Pessoa pessoa : listaPessoa) {
            totalIdade += pessoa.getIdade();
        }
        return totalIdade / listaPessoa.size();
    }


    public int MenorIdade() {
        int menorIdade = Integer.MAX_VALUE;

        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getIdade() < menorIdade) {
                menorIdade = pessoa.getIdade();
            }
        }
        return menorIdade;
    }


    public int MaiorIdade() {
        int maiorIdade = Integer.MIN_VALUE;

        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getIdade() > maiorIdade) {
                maiorIdade = pessoa.getIdade();
            }
        }
        return maiorIdade;
    }


    public Double MediaAltura() {
        double totalAltura = 0;
        for (Pessoa pessoa : listaPessoa) {
            totalAltura += pessoa.getAltura();
        }
        return  totalAltura / listaPessoa.size();
    }


    public double MenorAltura() {
        double menorAltura = Integer.MAX_VALUE;

        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getAltura() < menorAltura) {
                menorAltura = pessoa.getAltura();
            }
        }
        return menorAltura;
    }



    public double MaiorAltura() {
        double maiorAltura = Integer.MIN_VALUE;

        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getAltura() > maiorAltura) {
                maiorAltura = pessoa.getAltura();
            }
        }
        return  maiorAltura;
    }


    public Double MediaPeso() {
        double totalPeso = 0;
        for (Pessoa pessoa : listaPessoa) {
            totalPeso += pessoa.getPeso();
        }
        return  totalPeso / listaPessoa.size();
    }




    public double MenorPeso() {
        double menorPeso = Double.MAX_VALUE;
        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getPeso() < menorPeso) {
                menorPeso = pessoa.getPeso();
            }
        }
        return menorPeso;
    }


    public double MaiorPeso() {
        double maiorPeso = Double.MIN_VALUE;
        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getPeso() > maiorPeso) {
                maiorPeso = pessoa.getPeso();
            }
        }
        return maiorPeso;
    }


    public static void main(String[] args) {  //criando o relatório

        RelatorioIMC relatorio = new RelatorioIMC();


        Pessoa p1 = new Pessoa(); ////criando o objeto pessoa
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();

        p1.setNome("Cassiana C. Marciano");         //set modificando o valor dos atributos
        p1.setIdade(21);
        p1.setAltura(1.60);
        p1.setPeso(41);
        p1.setImc(16.41);
        p1.setCpf(9999999);
        p1.setEstadoSaude("Magro(a)");


        p2.setNome("Cesar Oliveira");
        p2.setIdade(34);
        p2.setAltura(1.70);
        p2.setPeso(70);
        p2.setImc(24.22);
        p2.setCpf(7777777);
        p2.setEstadoSaude("Saudável");

        p3.setNome("Cael Bispo");
        p3.setIdade(55);
        p3.setAltura(1.78);
        p3.setPeso(83);
        p3.setImc(26.20);
        p3.setCpf(1111111);
        p3.setEstadoSaude("Obesidade I");


        p4.setNome("Vanessa Pinheiro");
        p4.setIdade(28);
        p4.setAltura(1.75);
        p4.setPeso(60);
        p4.setImc(19.59);
        p4.setCpf(5555555);
        p4.setEstadoSaude("Saudável");

        relatorio.adicionarPessoa(p1);
        relatorio.adicionarPessoa(p2);
        relatorio.adicionarPessoa(p3);
        relatorio.adicionarPessoa(p4);



        ///listaPessoa.remove();  //remover um item da Array List
        /// listaPessoa.add();     //adicionar um item a Array Lidt
        /// listaPessoa.clear();   //excluir todos os itens


        System.out.println("Média de Idade: " + relatorio.MediaIdade());  //Mostrando os resultados
        System.out.println("Menor Idade: " + relatorio.MenorIdade());
        System.out.println("Maior Idade: " + relatorio.MaiorIdade());
        System.out.println("Média de Altura: " + relatorio.MediaAltura());
        System.out.println("Menor Altura: " + relatorio.MenorAltura());
        System.out.println("Maior Altura: " + relatorio.MaiorAltura());
        System.out.println("Média de Peso: " + relatorio.MediaPeso());
        System.out.println("Menor Peso: " + relatorio.MenorPeso());
        System.out.println("Maior Peso: " + relatorio.MaiorPeso());

        System.out.println("Total de Pessoas: " + relatorio.getTotalPessoas());
        System.out.println("Total de Pessoas Magras: " + relatorio.getTotalMagro());
        System.out.println("Total de Pessoas Saudáveis: " + relatorio.getTotalSaudavel());
        System.out.println("Total de Pessoas com Obesidade I: " + relatorio.getTotalObesidadeI());
        System.out.println("Total de Pessoas com Obesidade II: " + relatorio.getTotalObesidadeII());
        System.out.println("Total de Pessoas com Obesidade III: " + relatorio.getTotalObesidadeIII());

        relatorio.gerarRelatorio();

    }

}
