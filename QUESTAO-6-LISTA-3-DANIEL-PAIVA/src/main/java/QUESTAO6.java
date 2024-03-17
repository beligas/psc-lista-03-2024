// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
// Crie um algoritmo que leia dois números inteiros e realize o sorteio de um número
// aleatório. O algoritmo deve validar qual é o menor e o maior número informado pelo
// teclado, para que independente da ordem que o usuário digite os números, consiga
// realizar o sorteio.
// Se o algoritmo gerar um número par, escreva na tela o número gerado e informe que
// ele é par. Se o algoritmo gerar um número ímpar, escreva na tela o número gerado e
// que ele é um número ímpar.

import java.util.Scanner;
import java.util.Random;
  
public class QUESTAO6 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);
    Random random = new Random();

    int num1;
    int num2;
    int maior;
    int menor;
    int Sorteio;
       
    System.out.println("Informe dois numero inteiros");
    num1 =enterScanner.nextInt();
    num2 =enterScanner.nextInt();

    maior = Math.max(num1, Math.max(num1, num2));
    menor = Math.min(num2, Math.min(num1, num2));
    
    System.out.println("O maior numero é: " + maior);
    System.out.println("O menor numero é: " + menor);
    
    Sorteio = random.nextInt(maior - menor + 1) + menor;  

    if(Sorteio % 2 == 0){
      
    System.out.println("O numero sorteado foi "+ Sorteio +" é par: ");
    } else {
      
      System.out.println("O numero sorteado foi "+ Sorteio +" é impar: ");
    }
    
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}