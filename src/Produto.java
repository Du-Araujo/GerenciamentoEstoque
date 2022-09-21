public class Produto {
    private int idProd;
    private String nome;
    private int quantidade;
    private double valorUnitario;
    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }


    // Métodos de Negócio

   public boolean registarEntrada(int qtdEntrada){
        if (qtdEntrada > 0){
         quantidade += qtdEntrada;
         return true;
        }
        return false;
   }

    public boolean registrarSaida(int qtdSaida) {
        if (quantidade <= quantidade) {
            quantidade -= qtdSaida;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dados do Produto \n" +
                "Id: " + idProd + "\n" +
                "Nome: " + nome + "\n" +
                "Quantidade: " + quantidade + "\n" +
                "valor Unitário: " + valorUnitario + "\n";

    }
}




