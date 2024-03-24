////////////////////////////Pessoa.java
package br;

public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private double imc;

    /////////////////////////Construtor Sobrecarga
    public Pessoa() {
    }

    /////////////////////////Construtor
    public Pessoa(String nome, int idade, double peso, double altura, double imc) {

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;

    }
    //////////////////////////////metodo Get (Ler o valor do atributo)

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getImc() {
        return this.imc;
    }

    public void calcularIMC() {
        this.imc = this.peso / (this.altura * this.altura);
    }

///////////////////////////////metodo Set (modificar o valor do atributo)

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void imprimir() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("IMC: " + this.imc);

        if (imc <= 18.5) {
            System.out.println("Magro(a).");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Saudável.");
        } else if (imc > 25 && imc <= 29.9) {
            System.out.println("Obesidade I.");
        } else if (imc > 30 && imc <= 39.9) {
            System.out.println("Obesidade II.");
        } else if (imc > 40) {
            System.out.println("Obesidade III.");
        }
   return null;
    }
}
