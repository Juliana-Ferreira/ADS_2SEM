package CadastroCarros;

public class Carro {
        private String modelo;
        private String marca;
        private String cor;
        private int anoFabricacao;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
        
    public String imprimir() {
        return  "Modelo: " + modelo +
                "\nMarca: " + marca +
                "\nCor: " + cor +
                "\nAno de fabricação: " + anoFabricacao + "\n\n";
    }
}