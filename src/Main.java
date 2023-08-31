import java.util.Locale;
import java.util.Scanner;

public class Main {

    // tipo de retorno inteiro
    public static int quantosPacotes( float quantidade) { //quantidade tem um escopo local

        Scanner entrada = new Scanner(System.in);
        float quilo = 0.0f;
        int pacote = 0;

        while(quilo<quantidade){

            System.out.print("Digite o peso do pacote: ");
            float peso = entrada.nextFloat();
            quilo = quilo + peso; //quilo += peso;
            pacote = pacote + 1;


        }
        entrada.close();

        return pacote;
    }
    // sempre que o tipo de retorno seja diferente de void
    //é necessário usar o "return"
    // não retorna valor apenas executa o algoritmo
    public static void main(String[] args) {

        //escopo global
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do cachorro: ");
        String nome = ler.nextLine();
        System.out.print("Digite a quantidade de ração: ");
        float quantidade = ler.nextFloat();

        int valor = quantosPacotes(quantidade);
        System.out.printf("Seu cachorro vai precisar de %d pacotes.",valor);

        ler.close();
    }

}
