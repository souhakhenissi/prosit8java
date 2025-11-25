import java.util.*;

public class AffectationHashMap {
    HashMap<Employe, Departement> map = new HashMap<>();
    public void ajouterEmployeDepartement(Employe e, Departement d){
        if(map.containsKey(e)==false){
            map.put(e,d);
        }
        else{
            System.out.println("l'employé est affecté déjà à un département");
        }
    }

    public void afficherEmployesEtDepartements(){
        for(Map.Entry<Employe,Departement> entry :map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e){
        map.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d){
        if (map.get(e)==d){
            map.remove(e);
        }
        else{
            System.out.println("n'existe pas");
        }
    }

    public void afficherEmployes(){
        Set<Employe> employes = map.keySet();
        Iterator<Employe> iterator = employes.iterator();
        while (iterator.hasNext()){
            System.out.println("Employe: "+iterator.next());
        }
    }

    public void afficherDepartements(){
        Collection<Departement> departements = map.values();
        for(Departement d : departements){
            System.out.println("Departement: "+d);
        }
    }

    public boolean rechercherEmploye(Employe e){
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d){
        return map.containsValue(d);
    }

    Comparator<Employe> idComparator = new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            return Integer.compare(e1.getId(), e2.getId());
        }
    };

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sortedMap = new TreeMap<>(idComparator);
        sortedMap.putAll(this.map);

        return sortedMap;
    }


}
