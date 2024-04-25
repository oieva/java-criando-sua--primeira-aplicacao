public class Media {

    public static void main(String[] args) {
        double nota1 = 7.0;
        double nota2 = 8.0;
        double nota3 = 9.987;
       double media = ((nota1 + nota2)/2);
        System.out.println(media);
        double mediana = (int) (media+nota3);
        System.out.println( mediana);
    }

}
/* resposta 1
public class Media{
    public static void main(String[] args) {
        double nota1 = 8.9;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);
    }
}
resposta 2
public class Casting{
    public static void main(String[] args) {
        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroInteiro);
    }
}
 */