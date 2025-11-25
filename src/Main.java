//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employe Souha = new Employe(0,"Khenissi","Souha","Marketing",1);
        Employe Ghofrane= new Employe(1,"Hraghi","Ghofrane","RH",2);
        Departement RH = new Departement(0,"RH",10);
        Departement Marketing = new Departement(1,"Marketing",20);
        AffectationHashMap affectationHashMap = new AffectationHashMap();
        affectationHashMap.ajouterEmployeDepartement(Souha,Marketing);
        affectationHashMap.ajouterEmployeDepartement(Ghofrane,RH);
        affectationHashMap.ajouterEmployeDepartement(Souha,RH);
        affectationHashMap.afficherEmployesEtDepartements();

    }
}