public class Produto {
        // Atributos
        int codigo;
        private String nome;
        double valor;

        // setter - definir valor para o atributo
    public void setNome(String valor){
        this.nome = valor;
    }

        // Construtor padrão
        Produto(){}
        // Sobrecarga do método constructor
        Produto(int _codigo) {
            this.codigo = _codigo;
        }
        // mais uma sobrecarga
    Produto(int _codigo, String _nome) {
            this.codigo = _codigo;
            this.nome = _nome;
    }

    public Produto(String nomeProduto) {
            this.nome = nomeProduto;
    }
}

