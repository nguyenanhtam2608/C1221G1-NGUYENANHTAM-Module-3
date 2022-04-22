package case_study.model;

public class Position {
     Integer idPosition;
     String namePosition;

    public Position(Integer idPosition, String namePosition) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
    }

    public Position() {
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }
}
