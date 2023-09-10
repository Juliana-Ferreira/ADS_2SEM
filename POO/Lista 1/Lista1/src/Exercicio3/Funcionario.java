package Exercicio3;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float calcularSalario() {
        return valorHora * qtdeHora;
    }
    
    public float calcularValorReceber() {
        if (tipoVinculo == 'H' || tipoVinculo == 'h') {
            return calcularSalario() - valorDesconto;
        }
        else if (tipoVinculo == 'N' || tipoVinculo == 'n') {
            return salario - valorDesconto;
        }
        else {
            return 0;
        }
    }
    
    public String imprimir() {
        float valorSalario;
        if (tipoVinculo == 'H' || tipoVinculo == 'h') {
            valorSalario = calcularSalario();
        }
        else {
            valorSalario = salario;
        }
        
        return "Crachá: " + cracha +
                "\nNome: " + nome +
                "\nTipo de vínculo: " + tipoVinculo +
                "\nSalário: R$" + String.format("%.2f",valorSalario) +
                "\nDesconto: R$" + String.format("%.2f",valorDesconto) +
                "\nValor a receber: R$" + String.format("%.2f", calcularValorReceber());
    }
}
