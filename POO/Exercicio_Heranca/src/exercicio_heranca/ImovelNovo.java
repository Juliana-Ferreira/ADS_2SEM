package exercicio_heranca;

public class ImovelNovo extends Imovel{
    private double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(int codigo, String endereco, double valor, double valorAdicional) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public double calcularValorImovel() {
        return getValor() + getValorAdicional();
    }
    
    @Override
    public String imprimir() {
        String imprimir = super.imprimir() +
                "\nValor adicional: R$" + String.format("%.2f", valorAdicional) +
                "\nValor do imóvel: R$" + String.format("%.2f", calcularValorImovel()) + "\n\n";
        return imprimir;
    }
}
