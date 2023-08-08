package PacoteJava;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        Scanner ler = new Scanner(System.in);
        
        int valorTotal = 0;
        
        String Produto = ""; // a função das "" é puxar o valor que se refere dentro dela, que seria o comentario em verde 
        
         
        System.out.println("1 - Cachorro quente (10,00)");
        
        System.out.println("2 - Xsalada (15,00)");
        
        System.out.println("3 - Xbacon (18,00)");
        
        System.out.println("4 - Bauru (12,00)");
        
        System.out.println("5 - Refrigerante (8,00)");
        
        System.out.println("6 - Suco de laranja (13,00)");
        
        System.out.print("Digite o número do produto desejado: ");
        int item = ler.nextInt();
        
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = ler.nextInt();
        
        
        switch (item) {
            case 1:
                valorTotal = 10 * quantidade;
                Produto = "Cachorro quente";
                break;
                
            case 2:
                valorTotal = 15 * quantidade;
                Produto = "Xsalada";
                break;
                
            case 3:
                valorTotal = 18 * quantidade;
                Produto = "Xbacon";
                break;
                
            case 4:
                valorTotal = 12 * quantidade;
                Produto = "Bauru";
                break;
                
            case 5:
                valorTotal = 8 * quantidade;
                Produto = "Refrigerante";
                break;
                
            case 6:
                valorTotal = 13 * quantidade;
                Produto = "Suco de laranja";
                break;
                
           //default: 
            	
               // System.out.println("Item não encontrado no menu."); a função do default é para quando a minha condição ñ encontrar o valor desejado 
                //return;
        }
        
        System.out.println("Item selecionado: " + Produto); // o + significa concatenar com o resultado que vc espera 
        System.out.println("Valor total a pagar: " + valorTotal);
		
		
		
		
		
	}}