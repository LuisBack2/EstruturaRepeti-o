
package exer7;

import java.util.Scanner;

public class exer7 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        
        int c, f;
        
        System.out.println("Digite a temperatura em Celsius: ");
        c = sc.nextInt();
        
        f = (9*c + 160) / 5;
        
        System.out.println("A temperatura convertida em fahrenheit é: " + f);
        
    }
}
