import java.util.Scanner;

import controle.ConsultaMoeda;
import modelo.Moeda;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String moedaAtual;
        String moedaConversao;
        int seletorOpcao = 0;

        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        try {
            while (seletorOpcao < 6) {
                System.out.println("Qual moeda vai deseja usar para converter?" +
                        "\n1 - USD - dólar americano (EUA)" +
                        "\n2 - EUR - euro (Europa)" +
                        "\n3 - BRL - real brasileiro (Brasil)" +
                        "\n4 - GBP - libra esterlina (Reino unido)" +
                        "\n5 - JPY - iene japonês (Japão)" +
                        "\n6 - USD - dolar canadense (Canada)" +
                        "\n0 - Sair - sair da aplicação");
                seletorOpcao = leitura.nextInt();
                if (seletorOpcao == 0 | seletorOpcao > 6)
                    return;
                moedaAtual = consultaMoeda.seletorMoeda(seletorOpcao);

                System.out.println("Escolha para qual Moeda deseja converter:" +
                        "\n1 - USD - dólar americano (EUA)" +
                        "\n2 - EUR - euro (Europa)" +
                        "\n3 - BRL - real brasileiro (Brasil)" +
                        "\n4 - GBP - libra esterlina (Reino unido)" +
                        "\n5 - JPY - iene japonês (Japão)" +
                        "\n6 - USD - dolar canadense (Canada)" +
                        "\n0 - Sair - sair da aplicação");
                seletorOpcao = leitura.nextInt();
                if (seletorOpcao == 0 | seletorOpcao > 6)
                    return;
                moedaConversao = consultaMoeda.seletorMoeda(seletorOpcao);

                System.out.println("Digite o valor da conversão");
                double valorDaConversao = leitura.nextDouble();

                Moeda moeda = consultaMoeda.buscarMoeda(moedaAtual, moedaConversao, valorDaConversao);
                System.out.println("\nValor da conversão de " + moedaAtual + " Para " + moedaConversao + " é de: "
                        + moeda.conversion_result()+"\n");

                System.out.println("Deseja fazer outra conversão? " +
                        "\n1 - Sim" +
                        "\n2 - Não");
                seletorOpcao = leitura.nextInt();
                if (seletorOpcao == 2) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Digite um valor válido");
        }

    }
}
