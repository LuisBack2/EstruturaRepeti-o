
package facs;

import java.util.Scanner;


public class Facs {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int  sal, vendas, salf;
        String nome;
        
        
        System.out.println("Digite o nome: ");
        nome = sc.next();
        
        System.out.println("Digite o Salario: ");
        sal = sc.nextInt();
        
        System.out.println("Digite as vendas: ");
        vendas = sc.nextInt();

        salf = (int) (sal + (vendas * 0.15));
        
        System.out.println("O salario final é; " + salf);
        
        sc.close();
    }

}
