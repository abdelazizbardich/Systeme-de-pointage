package JDBC101.model;

public class Speciality {

    private long id_speciality;
    private String name;
    private Speciality speciality;

    public Speciality(int id_speciality, String name) {
        this.id_speciality = id_speciality;
        this.name = name;
    }

    public Speciality(int id) {

    }

    public  Speciality(){

    }

    public long getId_speciality() {
        return id_speciality;
    }

    public void setId_speciality(long id_speciality) {
        this.id_speciality = id_speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality createSpeciality(){
return speciality;
    }

    public Speciality updateSpeciality(){
        return speciality;
    }

    public Speciality deleteSpeciality(){
        return speciality;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id_speciality=" + id_speciality +
                ", name='" + name + '\'' +
                '}';
    }
}
