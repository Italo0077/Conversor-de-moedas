package controle;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modelo.Moeda;

public class ConsultaMoeda {
    public Moeda buscarMoeda(String moedaDe, String moedaPara, double valor) {

        URI uri = URI.create("https://v6.exchangerate-api.com/v6/484a1adc9e8e4f178fc41c22/pair/" + moedaDe + "/"
                + moedaPara + "/" + valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET()
                .build();
        try {
            HttpResponse<String> reponse = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            // JsonElement elemento = JsonParser.parseString(reponse.body());
            // JsonObject objectRoot = elemento.getAsJsonObject();

            return new Gson().fromJson(reponse.body(), Moeda.class);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao consulta moeda");
        }
    }

    public String seletorMoeda(int valor) {
        String tipoMoeda = "";
        switch (valor) {
            case 1:
                return tipoMoeda = "USD";
            case 2:
                return tipoMoeda = "EUR";
            case 3:
                return tipoMoeda = "BRL";
            case 4:
                return tipoMoeda = "GBP";
            case 5:
                return tipoMoeda = "JPY";
            case 6:
                return tipoMoeda = "USD";
            default:
                break;
        }
        return tipoMoeda;
    }
}
