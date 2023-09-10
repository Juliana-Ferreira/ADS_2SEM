package Exercicio1;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice(){
    }
    
    public Apolice(int numero, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    
    public double calcularValor() {
        if ((sexo == 'M' || sexo == 'm') && idade <= 25) {
            return (valorAutomovel * 10)/100;
        }
        if ((sexo == 'M' || sexo == 'm') && idade > 25) {
            return (valorAutomovel * 5)/100;
        }
        if (sexo == 'F' || sexo == 'f') {
            return (valorAutomovel * 2)/100;
        }
        else {
            return 0;
        }
    }
    
    public String imprimir() {
        return "Número: " + numero +
                "\nNome: " + nome + 
                "\nIdade: " + idade + 
                "\nSexo: " + sexo +
                "\nValor do Automóvel: R$" + String.format("%.2f", valorAutomovel) + 
                "\nValor da Apólice: R$" + String.format("%.2f", calcularValor());
    }
}
