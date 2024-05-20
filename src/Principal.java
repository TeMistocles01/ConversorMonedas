import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {

        // inicializa la variable para que entre de inmediato al siclo
        int opcion = 0;

      HttpClient client = new HttpClient();


        HttpClient httpClient;
        var menu = """
                ------------------------------------------------------
                Sea bienvenido/a al Conversor de Monedas =]
                Elija una opcción válida
                
                1)Dólar =>> Peso argentino
                2)Peso argentino =>> Dólar
                3)Dólar =>> Real brasileño
                4)Real brasileño =>> Dólar
                5)Dólar =>> Peso colombiano
                6)Peso colombiano =>> Dólar
                7)salir
                
                ------------------------------------------------------
                """;

       // HttpClient httpClient;

        //Moneda moneda;

        Scanner escritura = new Scanner(System.in);
        System.out.println(menu);
        //var inicarSiclo = escritura.nextInt();


        while (opcion != 7){

            System.out.println( menu);

            opcion = escritura.nextInt();

                switch (opcion){

                    case 1:

                        System.out.println("Ingrece el valor que desea convertir");
                        int catidad = escritura.nextInt();

                        try {

                            Conversion conversion = client.obtenerConversion("EUR","GBP",catidad);
                            System.out.println(conversion);
                        }catch (RuntimeException e){
                            System.out.println(e.getMessage());
                            System.out.println("Consulta finalizada");

                        }


                        break;
                    case 2:
                        System.out.println("dos");
                        break;
                    case 3:
                        System.out.println("tres");
                        break;
                    case 4:
                        System.out.println("cuatro");
                        break;
                    case 5:
                        System.out.println("cinco");
                        break;
                    case 6:
                        System.out.println("seis");
                        break;

                    default:
                        System.out.println("seis");
                        break;
                }




/*

            System.out.println("Ingrece el valor que desea convertir");
            int catidad = escritura.nextInt();

            try {

                Conversion conversion = client.obtenerConversion("ed","re",catidad);
                System.out.println(conversion);
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Consulta finalizada");

            }

*/




        }

        System.out.println("ha salido del sistema");




    }
}