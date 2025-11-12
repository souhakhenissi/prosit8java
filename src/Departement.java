public class Departement {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    public Departement() {}

    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getNombreEmployes() {
        return nombreEmployes;
    }
    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o) return false;
        if (o.getClass() == Departement.class){
            Departement d=(Departement) o;
            return id == d.getId() && nomDepartement.equals(d.getNomDepartement());
        }
        return false;
    }
    @Override
    public String toString() {
        return "Departement: Id=" + id + ", NomDepartement=" + nomDepartement+", NombreEmployes=" + nombreEmployes;
    }
}
