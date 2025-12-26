import java.util.Scanner;

import controle.ConsultaMoeda;
import modelo.Moeda;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consultaMoeda = new ConsultaMoeda();

        System.out.println("Qual moeda vai usar para converter?"+
            "\n1 - USD - dólar americano (EUA)"+
            "\n2 - EUR - euro (Europa)"+
            "\n3 - BRL - real brasileiro (Brasil)"+
            "\n4 - GBP - libra esterlina (Reino unido)"+
            "\n5 - JPY - iene japonês (Japão)"+
            "\n6 - USD - dolar canadense (Canada)"+
            "\n0 - Sair - sair da aplicação"
        );
        String moedaAtual = leitura.nextLine();

        System.out.println("Escolha para qual Moeda deseja converter:"+
            "\n1 - USD - dólar americano (EUA)"+
            "\n2 - EUR - euro (Europa)"+
            "\n3 - BRL - real brasileiro (Brasil)"+
            "\n4 - GBP - libra esterlina (Reino unido)"+
            "\n5 - JPY - iene japonês (Japão)"+
            "\n6 - USD - dolar canadense (Canada)"+
            "\n0 - Sair - sair da aplicação"
        );
        String moedaConversao = leitura.nextLine();

        System.out.println("Digite o valor da conversão");
        double valorDaConversao = leitura.nextDouble();

        Moeda moeda = consultaMoeda.buscarMoeda(moedaAtual, moedaConversao, valorDaConversao);
        System.out.println("Valor da conversão é: "+moeda);
        

    }
}
