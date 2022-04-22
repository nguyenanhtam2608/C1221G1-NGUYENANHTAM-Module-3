package case_study.model;

public class Division {
     int idDivision;
     String nameDivision;

    public Division() {
    }

    public Division(int idDivision, String nameDivision) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }
}
