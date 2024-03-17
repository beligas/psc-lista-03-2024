// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
// Escreva o algoritmo de uma máquina de venda automática de salgadinhos, doces,
// sucos e refrigerantes. O algoritmo deve calcular o menor número de notas que deve
// ser dado de troco para um pagamento efetuado.
// O algoritmo deve ler o valor da compra e o valor pago. Se o valor pago for menor que
// o valor da compra, a máquina deve apresentar uma mensagem, informando que a
// quantia paga é insuficiente para realizar a compra. A máquina aceita apenas notas de
// R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.

import java.util.Scanner;
  
public class QUESTAO2 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double valCompra;
    double valRec;
    double troco;
    int n50, n20, n10, n5, n2, n1;
    
    System.out.println("Digite o valor da compra: ");
    valCompra = enterScanner.nextDouble();

    System.out.println("Digite o valor que foi recebido");
    valRec = enterScanner.nextDouble();
      
    if (valRec < valCompra){
    System.out.println("Quantia insuficiente para realizar a compra");
  } else {  }
    troco = valRec - valCompra;

    System.out.println("O troco é de: " + troco);

    n50 = (int) (troco / 50);
    troco = troco % 50;
    n20 = (int) (troco / 20);
    troco = troco % 20;
    n10 = (int) (troco / 10);
    troco = troco % 10;
    n5 = (int) (troco / 5);
    troco = troco % 5;
    n2 = (int) (troco / 2);
    troco = troco % 2;
    n1 = (int) (troco / 1);
    troco = troco % 1;

    System.out.println("Notas de 50: " + n50);
    System.out.println("Notas de 20: " + n20);
    System.out.println("Notas de 10: " + n10);
    System.out.println("Notas de 5: " + n5);
    System.out.println("Notas de 2: " + n2);
    System.out.println("Notas de 1: " + n1);
    
    enterScanner.close();
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}