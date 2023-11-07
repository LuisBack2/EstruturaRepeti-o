
package exer5;

import java.util.Scanner;

public class exer5 {
    
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         
         String nome;
         int n1,n2,n3,medarit;
         
        System.out.println("Digite o nome do aluno: ");
        nome = sc.next();
        System.out.println("Digite o nota 1: ");
        n1 = sc.nextInt();
        System.out.println("Digite o nota 2: ");
        n2 = sc.nextInt();
        System.out.println("Digite o nota 3: ");
        n3 = sc.nextInt();
        
        medarit = n1 + n2 + n3 / 3;
        
        System.out.println("O aluno " + nome + " teve uma media Aritmetica de: " + medarit);    
     }
}
