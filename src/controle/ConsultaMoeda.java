package controle;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

import modelo.Moeda;

public class ConsultaMoeda {
    public Moeda buscarMoeda(String moeda){

        URI uri = URI.create("https://v6.exchangerate-api.com/v6/484a1adc9e8e4f178fc41c22/latest/"+moeda);

        HttpRequest request = HttpRequest.newBuilder()
                              .uri(uri)
                              .build();

        try {
            HttpResponse<String> reponse = HttpClient
                                .newHttpClient()
                                .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(reponse.body(), Moeda.class);

            } catch (Exception e) {
                throw new RuntimeException("Erro ao consulta moeda");
        }
    }
}
