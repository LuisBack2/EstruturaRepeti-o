
package exer6;

import java.util.Scanner;


public class exer6 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        int a, b, c;
        
        System.out.println("Digite a variavel A: ");
        a = sc.nextInt();
        System.out.println("Digite a variavel B: ");
        b = sc.nextInt();
        
        c = a;
        a = b;
        b = c;
        
        System.out.println("Variavel A: " + a);
        System.out.println("Variavel B: " + b);
    }
}
