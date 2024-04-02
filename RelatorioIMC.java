package br;
import br.Pessoa;
import principal.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RelatorioIMC {

    public static void main(String[] args) {


        private int totalMagro;
        private int totalSaudavel;
        private int totalObesidadeI;
        private int totalObesidadeII;
        private int totalObasidadeIII;

        private double mediaIdade;
        private double mediaAltura;
        private double mediaPeso;

        private double menorIdade;
        private double menorAltura;
        private double menorPeso;

        private double maiorIdade;
        private double maiorAltura;
        private double maiorPeso;

        private List<Pessoa> listaPessoa;

        public void RelatoriaIMC() {

            this.listaPessoa = listaPessoa;
            this.pessoa = pessoa;
        }

        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa aux;

        p1.setNome("Cassiana C. Marciano");
        p1.setIdade("21");
        p1.setAltura("1.60");
        p1.setPeso("41");
        p1.estadoSaude();


        p2.setNome("Cesar Oliveira");
        p2.setIdade("34");
        p2.setAltura("1.70");
        p2.setPeso("70");
        p2.estadoSaude();


        p3.setNome("Cael Bispo");
        p3.setIdade("55");
        p3.setAltura("1.78");
        p3.setPeso("83");
        p3.estadoSaude();


        p4.setNome("Vanessa Pinheiro");
        p4.setIdade("28");
        p4.setAltura("1.75");
        p4.setPeso("60");
        p4.estadoSaude();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);

        System.out.println(aux.getNome());
        System.out.println(aux.getIdade());
        System.out.println(aux.getAltura());
        System.out.println(aux.getPeso());
        System.out.println(aux.getImc());
        System.out.println(aux.getEstadoSaude());

        lista.remove();
        lista.add();
        

        }
    }
}
