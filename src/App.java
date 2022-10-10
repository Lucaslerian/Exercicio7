import java.util.Scanner;

public class App {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
    // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.    
        // Pedir a medida do quadrado
        System.out.print("Digite a medida do lado do quadrado: ");
        int lado = sc.nextInt();
        sc.close();

        //Calcular a área do quadrado
        int area = lado * lado;
        System.out.println("A área do quadrado é " + area);
        //Calcular o dobro da área
        int dobro = area * 2;

        System.out.println("O dobro da área do quadrado de lado " + lado + " é igual a " + dobro);

    }
}
