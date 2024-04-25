import java.util.Scanner;
import java.util.Random;

public class jogoAdvinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numeroInserido = 0;
    while (numeroAleatorio != numeroInserido) {
        System.out.println("Insira um número de 1 a 100");
        numeroInserido = leitura.nextInt();
        tentativas++;
       if (numeroAleatorio == numeroInserido) {
           System.out.println("Parabéns! O número secreto é: " + numeroAleatorio + " e você acertou com: "+ tentativas + " tentativas.");
           break;
        } else if (numeroInserido < numeroAleatorio) {
            System.out.println("O número digitado é menor que o número gerado.");
         } else {
            System.out.println("O número digitado é maior que o número gerado.");
        }
    }
    }
    }


