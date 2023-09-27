package ac1;

public class Desenvolvedor {
    private String nome;
    private String cpf;
    private char genero;
    private double valorHora;

    public Desenvolvedor() {
    }

    public Desenvolvedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calculaSalario(int qtdeHoras) {
        return qtdeHoras * valorHora;
    }
    
    public String imprimir() {
        String strGenero = "";
        if(genero == 'm') strGenero = "Masculino";
        else if (genero == 'f') strGenero = "Feminino";
        
        return "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nGênero: " + strGenero +
                "\nValor Hora: R$" + String.format("%.2f", valorHora) +
                "\n\n";
    }
    
    public String imprimir(int qtdeHoras) {
        String strGenero = "";
        if(genero == 'm') strGenero = "Masculino";
        else if (genero == 'f') strGenero = "Feminino";
        
        return "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nGênero: " + strGenero +
                "\nValor Hora: R$" + String.format("%.2f", valorHora) +
                "\nSalário: R$" + String.format("%.2f", calculaSalario(qtdeHoras)) +
                "\n\n";
    }
}
