// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um algoritmo que leia dois valores: o primeiro servindo de indicador de
// operação e o segundo correspondendo ao raio de um círculo ou esfera. Caso o
// primeiro valor lido seja:
// a. 1: calcular e imprimir o perímetro do círculo.
// b. 2: calcular e imprimir a área do círculo.
// c. 3: calcular e imprimir o volume da esfera.
// Se o primeiro valor lido for diferente desses três valores possíveis, imprimir uma
// mensagem de erro, informando que o código da operação é inválido.

import java.util.Scanner;

public class QUESTAO4 {
  public static void main(String[] args) {
    Scanner enterScanner = new Scanner(System.in);

    int menu;
    double Raio;
    double Area;
    double Perimetro;
    double Volume;
    double Pi = 3.14;
    
    System.out.println("Digite o raio de um circulo (em centimetros)");
    
    Raio = enterScanner.nextDouble();
    System.out.println("Inforem o que deseja calcular \n 1 area do Circulo  \n 2 perimetro circulo \n 3 Volume de uma Esfera \n 0 Sair");
    
    menu = enterScanner.nextInt();
  if (menu == 1){
    Area = Pi * (Raio * Raio);
    System.out.println("A area do circulo é: " + Area); 
    
  } else if (menu == 2){
        Perimetro = 2 * Pi * Raio;
    System.out.println("O perimetro do circulo é " + Perimetro);
    
  }else if (menu == 3){
    
        Volume = (4 * Pi * (Raio * Raio * Raio)) / 3;
    System.out.println("O volume da esfera é: " + Volume); 
    
  } else if (menu == 0) {
    
    System.out.println("Sair do programa");
    enterScanner.close();
     } else {
    
    System.out.println("O codigo da operação é invalido");
    enterScanner.close();
     }
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}