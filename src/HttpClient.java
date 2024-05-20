import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClient {


     // Obteninendo una consulta de convercion


    // metodo retorna el objeto de tipo Conversion
    public Conversion obtenerConversion (String valor1, String valor2, double cantidad ){

        // https://v6.exchangerate-api.com/v6/ YOUR-API-KEY /pair/ EUR / GBP / CANTIDAD
       // URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5f14303141e2c0381e82125c/pair/EUR/GBP/CANTIDAD");

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/5f14303141e2c0381e82125c/pair/"+valor1+valor2+cantidad);

        // 4) Construyendo el Cliente para Solicitudes (HttpClient)

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
                             // solicita

        /*tomar encuenta procesos de serializacion y de desarializacion*/

      //  5) Construyendo la Solicitud (HttpRequest)


        try {
               // recibe strings            recibe respuesta e intenta interpretar
            HttpResponse<String>  response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return  new Gson().fromJson(response.body(), Conversion.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Operacion no realizada",e);

            //recibe
        }


    }








}
