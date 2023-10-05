package exercicio_heranca;

public class ImovelVelho extends Imovel{
    private double valorDesconto;

    public ImovelVelho() {
    }

    public ImovelVelho(int codigo, String endereco, double valor, double valorDesconto) {
        super(codigo, endereco, valor);
        this.valorDesconto = valorDesconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    @Override
    public double calcularValorImovel() {
        return getValor() - getValorDesconto();
    }
    
    @Override
    public String imprimir() {
        String imprimir = super.imprimir() +
                "\nValor do desconto: R$" + String.format("%.2f", valorDesconto) +
                "\nValor do imóvel: R$" + String.format("%.2f", calcularValorImovel()) + "\n\n";
        return imprimir;
    }
}
