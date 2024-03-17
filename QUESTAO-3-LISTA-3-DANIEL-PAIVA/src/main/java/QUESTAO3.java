// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um algoritmo que resolva uma equação de segundo grau, realizando a
// verificação de consistência dos valores dos coeficientes ("a", "b" e "c") e do
// discriminante (delta).
// a. Se os coeficientes "a" e "b" forem iguais a zero e o coeficiente "c" for diferente de
// zero, apresentar a mensagem "Coeficientes informados incorretamente.".
// b. Caso o coeficiente "a" seja igual a zero e o coeficiente "b" for diferente de zero,
// deverá ser impressa a mensagem: "Essa é uma equação de primeiro grau" e deverá
// ser informado o valor da raiz real da equação.
// c. Caso o discriminante seja negativo, deverá ser impressa a mensagem: "Esta
// equação não possui raízes reais".
// d. Caso o discriminante seja zero, apresentar a mensagem "Esta equação possui duas
// raízes reais iguais. " e informar o valor das raízes da equação.
// e. Caso o discriminante seja maior que zero, apresentar a mensagem "Esta equação
// possui duas raízes reais diferentes. " e informar o valor das raízes da equação.

import java.util.Scanner;

public class QUESTAO3 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double a;
    double b;
    double c;
    double delta;
    double raiz1;
    double raiz2;
        
    System.out.println("Informe os valores de a, b e c: ");
    a = enterScanner.nextDouble();
    b = enterScanner.nextDouble();
    c = enterScanner.nextDouble();

    if (a == 0  && b == 0 && c != 0){
      
      System.out.println("Os coeficientes foram informados incorretamente");
    } else if (a == 0 && b != 0){
      
      System.out.println("Essa é uma equacao do primeiro grau");
    } 
    delta = (b * b) - 4 * a * c;

    if (delta < 0){
      System.out.println("Essa equação nao possui raizes reais");
    } else if (delta == 0 ){
         
      raiz1 = ((-b) + Math.sqrt(delta))/2*a;
      raiz2 = ((-b) - Math.sqrt(delta))/2*a;
      System.out.println("Essa equação possui duas raizes reais iguais, QUE" + raiz1 + " e " + raiz2);
    } else if(delta > 0){
      
      raiz1 = ((-b) + Math.sqrt(delta))/2*a;
      raiz2 = ((-b) - Math.sqrt(delta))/2*a;
      System.out.println("Essa equação possui duas raizes reais diferentes, "+ raiz1 + " e " + raiz2);
    }
  
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}