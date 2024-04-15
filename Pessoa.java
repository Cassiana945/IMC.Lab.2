////////////////////////////Pessoa.java
package br;

public class Pessoa {

    private String nome;
    private String estadoSaude;
    private int cpf;
    private int idade;
    private double peso;
    private double altura;
    private double imc;


    /////////////////////// To String

    @Override
    public String toString() {
        return nome + ";" +
                idade + ";" +
                peso + ";" +
                altura + ";" +
                imc + ";" +
                estadoSaude + ";"+
                cpf + ";";
    }


    /////////////////////////Construtor Sobrecarga
    public Pessoa() {
    }

    /////////////////////////Construtor
    public Pessoa(String nome, int idade, double peso, double altura, double imc, int cpf) {

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.cpf = cpf;

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

    public String getEstadoSaude() {
        return this.estadoSaude;
    }

    public double getImc() {
        return this.imc;
    }

    public void calcularIMC() {
        this.imc = this.peso / (this.altura * this.altura);
    }

    public int getCpf() { return this.cpf; }

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

    public void setEstadoSaude(String estadoSaude) {
        this.estadoSaude = estadoSaude;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void setCpf(int cpf) { this.cpf = cpf; }

    public String imprimir() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("CPF: " + this.cpf);
        System.out.println("IMC: " + this.imc);
        return null;
    }

        public String estadoSaude() {

            calcularIMC();
            double imc = this.imc;

            if (this.imc <= 18.5) {
                estadoSaude = "Magro(a)";
            } else if (this.imc > 18.5 && imc < 24.9) {
                estadoSaude = "Saudável";
            } else if (this.imc > 25 && imc <= 29.9) {
                estadoSaude = "Obesidade I";
            } else if (this.imc > 30 && imc <= 39.9) {
                estadoSaude = "Obesidade II";
            } else if (this.imc > 40) {
                estadoSaude = "Obesidade III";
            }
            return estadoSaude;
        }
    }
