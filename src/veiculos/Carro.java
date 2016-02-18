package veiculos;


//Classe Carro
public class Carro {

    //Atributos
    String modelo;
    int ano;
    double preco;

    //Inicializando o construtor
    public Carro() {

        modelo = null;
        ano = 0;
        preco = 0.0;
    }

    //Construtor com parâmetros.
    public Carro(String modelo, int ano, double preco) {
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    //Métodos get, mostrando valores
    public String getModelo() {
        return modelo;
    }

    //Métodos set, recebendo Valores
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /*Método maisBarato, instancia um objeto carro
    recebendo como parametro para comparação de valor
    */    
    public Carro maisBarato(Carro carro) {
        
        
        /*Compara se o valor do atributo preço é
            menor que o atributo preço do objeto carro.
        */
        if (preco < carro.preco) {
            
            //se for menor, retorna o atributo preço
            return this;

        } else if (carro.preco < preco) {
            
            //retorna que o atributo preço do objeto carro é menor.
            return carro;
            
        } else {

            /*se o atributo preço da classe Carro for maior,
            retorna */
            
            return null;
        }

    }

    //sobrecarga de metodo que retorna as informações do carro.
    @Override
    public String toString() {

        return modelo + ", ano: " + ano + " ,preço: " + preco;
    }

}
