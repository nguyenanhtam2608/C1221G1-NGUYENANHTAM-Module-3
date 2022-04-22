package case_study.model;

public class EducationDegree {
   int idEducationDegree;
   String nameEducationDegree;

    public EducationDegree(int idEducationDegree, String nameEducationDegree) {
        this.idEducationDegree = idEducationDegree;
        this.nameEducationDegree = nameEducationDegree;
    }

    public EducationDegree() {
    }

    public int getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(int idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public String getNameEducationDegree() {
        return nameEducationDegree;
    }

    public void setNameEducationDegree(String nameEducationDegree) {
        this.nameEducationDegree = nameEducationDegree;
    }
}
