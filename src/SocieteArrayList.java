import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SocieteArrayList implements IGestion<Employe>,IRechercheAvancee<Employe>{
    List<Employe> employeList= new ArrayList<>();
    public void ajouterEmploye(Employe employe)
    {
        employeList.add(employe);
    }
    public boolean rechercherEmploye(String nom){
        for (Employe e : employeList) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    public boolean rechercherEmploye(Employe employe)
    {
        employeList.contains(employe);
        return false;
    }
    public void supprimerEmploye(Employe employe)
    {
        employeList.remove(employe);
    }
    public void displayEmploye()
    {
        if (employeList.isEmpty()) {
            System.out.println("Aucun employé trouvé dans la société.");
        } else {
            System.out.println("Liste des employés :");
            for (Employe e : employeList) {
                System.out.println(e);
            }
        }
    }
    public void trierEmployeParId(){
        //

    }
    public void trierEmployeParNomDepartementEtGrade(){
        //

    }

    public List<Employe> rechercherParDepartement(String nomDepartement){
        List<Employe> result = new ArrayList<>();

        for (Employe e : employeList) {
            if (e.getNomDepartement().equals(nomDepartement)) {
                result.add(e);
            }
        }

        return result;
    }
}
