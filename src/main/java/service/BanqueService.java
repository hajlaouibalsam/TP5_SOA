package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import metier.Compte;

    @WebService
    public class BanqueService {

        @WebMethod
        public double conversion(@WebParam(name = "montant") double montant, @WebParam(name = "taux") double taux) {
            return montant * taux;
        }

        @WebMethod
        public List<Compte> getComptes() {
            List<Compte> comptes = new ArrayList<>();

            Compte compte1 = new Compte(001, 1500.0, "10/10/2010");
            Compte compte2 = new Compte(002, 2500.0, "15/10/2020");
            Compte compte3 = new Compte(003, 3500.0, "14/06/2000");

            comptes.add(compte1);
            comptes.add(compte2);
            comptes.add(compte3);

            return comptes;
        }




}
