// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escrever um algoritmo que leia a partir do teclado dois números reais e um dos
// símbolos de operação: + , - , * , / ou ^ .
// O algoritmo deve retornar o resultado da operação.
// Caso o símbolo informado seja diferente dos símbolos preestabelecidos, o algoritmo
// deve apresentar uma mensagem de erro, informando que o símbolo da operação é
// inválido.

import java.util.Scanner;

public class QUESTAO5 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double num1;
    double num2;
    double result;
    
    System.out.println("Informe dois numero");
    num1 = enterScanner.nextDouble();
    num2 = enterScanner.nextDouble();

    System.out.println("Escolha qual operação matematica deseja realizar (+, -, *, /, ^)");
    char op = enterScanner.next().charAt(0);

    switch (op){
        
    case '+':
        result = num1+ num2;
        System.out.println("A soma dos numero é " + result);
    break;
        
    case '-':
        result = num1 - num2;
        System.out.println("A subtração dos numero é " + result);
    break;

    case '*':
        result = num1 * num2;
        System.out.println("A multiplicação dos numero é " + result);
    break;

    case '/':
        result = num1 / num2;
        System.out.println("A divisao dos numero é " + result);
    break;

    case '^':
        result = Math.pow(num1,num2);
        System.out.println("A a elevação dos numero é " + result);
    break;

        default:
        System.out.println("O simbolo da operação é invalido, reinicie e tente novamente");
        break;

    }
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}