package veiculos;

import java.util.Scanner;

//Classe principal com método main.
public class Principal {

    public static void main(String[] args) {
        //Classe de entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        /*Instanciando um objeto carro1, passando paramentros
        para o construtor
        */
        Carro carro1 = new Carro("Fusca", 1990, 5000);
        //Exibindo mensagem em tela
        System.out.println(carro1);

        //Instanciando objeto carro2 sem passar parâmetros
        Carro carro2 = new Carro();
        
        //setando o objeto carro2
        carro2.setModelo("Corolla");
        carro2.setAno(2010);
        carro2.setPreco(35000);
        
        //Exibindo mensagem em tela
        System.out.println(carro2);
        //Instanciando objeto carro2 sem passar parâmetros
        Carro carro3 = new Carro();
        
        //setando o objeto carro3
        System.out.println("Digite o modelo do carro: ");
        //recebendo o valor para o atributo modelo via teclado.
        carro3.setModelo(teclado.next());
        System.out.println("Digite o ano do carro: ");
        //recebendo os valores para o atributo ano via teclado.
        carro3.setAno(teclado.nextInt());        
        System.out.println("Digite o preço do carro: ");
        //recebendo os valores para o atributo preco via teclado.
        carro3.setPreco(teclado.nextDouble());        
        System.out.println(carro3);
        //Exibindo em tela
        System.out.println("\nComparando " + carro3.modelo + " com "
                + carro2.modelo);
        
        /* comparando o objeto carro3 com o objeto carro2
        através do método maisBarato e atribuindo o resultado 
        ao objeto barato.*/
        Carro barato = carro3.maisBarato(carro2);
        
        //se for null, os carros possuem o mesmo valor
        if (barato == null) {
            System.out.println("Os dois carros tem o mesmo preço");
            System.out.println(carro3);
            System.out.println(carro2);
        } else {
            
            //caso contrário mostrará o mais barato entre o carro2 e carro3
            System.out.println("O mais barato é " + barato);
        }

    }

}
