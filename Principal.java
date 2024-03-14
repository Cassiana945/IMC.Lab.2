package principal;
import java.util.Scanner;
import br.Pessoa;
public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Entre com o seu nome: ");
        pessoa.setNome(entrada.nextLine());
        System.out.println("Entre com a sua idade: ");
        pessoa.setIdade(entrada.nextInt());
        System.out.println("Entre com o seu peso: ");
        pessoa.setPeso(entrada.nextFloat());
        System.out.println("Entre com a sua altura: ");
        pessoa.setAltura(entrada.nextFloat());

        pessoa.calcularIMC(); // Primeiro calculamos o IMC
        System.out.println("IMC: " + pessoa.getImc());
        pessoa.imprimir();
    }
}
