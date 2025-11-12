import java.util.*;

public class DepartementHashSet implements IDepartement<Departement>{

    Set<Departement> departements = new HashSet<>();

    public void ajouterDepartement(Departement d){
        departements.add(d);
    }

    public boolean rechercherDepartement(String nomDepartement){
        for(Departement d : departements){
            if(d.getNomDepartement().equals(nomDepartement)){
                return true;
            }
        }
        return false;
    }

    public boolean rechercherDepartement(Departement d){
        return departements.contains(d);
    }

    public void supprimerDepartement(Departement d){
        departements.remove(d);
    }

    public void afficherDepartements(){
        for(Departement d : departements){
            System.out.println(d);
        }
    }

    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>(departements);
        Collections.sort(list,Comparator.comparing(Departement::getNomDepartement));
        for(Departement d : list){
            System.out.println(d);
        }
    }

    public void trierDepartementsParNomEtNombreEmployes(){
        List<Departement> list = new ArrayList<>(departements);
        Collections.sort(list,Comparator.comparing(Departement::getNomDepartement).thenComparingInt(Departement::getNombreEmployes));
        for(Departement d : list){
            System.out.println(d);
        }
    }

}
