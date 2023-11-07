package Nome_10vezes;

import java.util.Scanner;

public class nome10vzs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        String nome;

        System.out.println("Digite o nome: ");
        nome = sc.next();

        while (count <= 10) {
            System.out.println(nome);
            count++;
        }
    }
}
