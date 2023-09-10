package CadastroPessoas;

public class Pessoa {
    private String nome;
    private String cpf;
    private char sexo;
    private int idade;
    private String sexoString;

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexoString() {
        return sexoString;
    }

    public void setSexoString(char sexo) {
        if(sexo == 'f') sexoString = "Feminino";
        if(sexo == 'm') sexoString = "Masculino";
    }
    
    public String imprimir() {
        return  "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nSexo: " + sexoString +
                "\nIdade " + idade + "\n\n";
    }
}
