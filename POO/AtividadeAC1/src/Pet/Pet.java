package Pet;

public class Pet {
    private String nome;
    private String raca;
    private int idade;
    private char sexo;
    private String sexoString;

    public Pet(String nome, String raca, int idade, char sexo) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
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

    public void setSexoString(char sexo) {
        if (sexo == 'm') sexoString = "Masculino";
        if (sexo == 'f') sexoString = "Feminino";
    }
    
    
    
    public String imprimir() {
        return "Nome: " + nome +
                "\nRaça: " + raca +
                "\nIdade: " + idade +
                "\nSexo: " + sexoString + "\n\n";
    }
}
