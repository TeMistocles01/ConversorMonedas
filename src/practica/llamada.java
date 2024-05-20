package practica;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class llamada {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrece la cantidad a convertir");
        var conbertir = lectura.nextInt();

        String direccion = "https://v6.exchangerate-api.com/v6/5f14303141e2c0381e82125c/pair/EUR/GBP/"+conbertir;



        // 4) Construyendo el Cliente para Solicitudes (HttpClient)

        java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                        // anexar en el parametro el metodo create()
                .uri(URI.create(direccion))
                .build();
        // solicita

        //  5) Construyendo la Solicitud (HttpRequest)



            // recibe strings            recibe respuesta e intenta interpretar
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());



    }




}
