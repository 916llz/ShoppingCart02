public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex"; //nome do comprador
        String itemDesc = "Camisas"; //quantidade de camisetas
        String message = custName+"quer compra duas "+itemDesc; //frase que mostra a quantidade de camietas qua alex quer comprar.
        
        double preco = 20.50; // valor da camiseta
        double imposto = 0.28; //valor do imposto
        int quantidade = 2; //quantidade de camisetas
        
           
        double custoTotal = (preco + quantidade) + (1 + imposto);
        
        
        System.out.println(message);
        System.out.println("o custo total com o imposto e: $" + custoTotal);
        
    }    
}
