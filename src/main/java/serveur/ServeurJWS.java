package serveur;
import service.BanqueService;
import jakarta.xml.ws.Endpoint;

    public class ServeurJWS {

        public static void main(String[] args) {

            String url = "http://localhost:8084/banque";


            BanqueService banqueService = new BanqueService();


            Endpoint.publish(url, banqueService);


            System.out.println("Service Web publié à l'URL : " + url);


            try {
                System.out.println("Appuyez sur Enter pour arrêter le serveur");
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }




