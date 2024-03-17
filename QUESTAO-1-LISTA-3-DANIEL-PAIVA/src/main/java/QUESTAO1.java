// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

// 1. Escreva um algoritmo que leia 3 números a partir do teclado.
// O algoritmo deve apresentar:
// a. O maior número.
// b. O menor número.
// c. A média aritmética dos três números

import java.util.Scanner;

public class QUESTAO1 {
  public static void main(String[] args) {
    
    Scanner enterScanner = new Scanner(System.in);
  
    double x, y, z; 
    double maior; 
    double menor;
    double media;
    // int arrayValores[];
    
    System.out.println("Me informe tres numeros");
    x = enterScanner.nextDouble();
    y = enterScanner.nextDouble();
    z = enterScanner.nextDouble();

    maior = Math.max(x, Math.max(y, z));
    menor = Math.min(x, Math.min(y, z));
    media = (x + y + z) / 3;

    System.out.println("O maior numero é: " + maior);
    System.out.println("O menor numero é: " + menor);
    System.out.println("A media é: " + media); 
    
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}