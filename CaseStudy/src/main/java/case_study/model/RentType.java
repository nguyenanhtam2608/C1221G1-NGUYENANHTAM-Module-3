package case_study.model;

public class RentType {
    Integer idRentType;
    String nameRentType;
    Double costRentType;

    public RentType(Integer idRentType, String nameRentType, Double costRentType) {

        this.idRentType = idRentType;
        this.nameRentType = nameRentType;
        this.costRentType = costRentType;
    }

    public RentType() {
    }

    public Integer getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(Integer idRentType) {
        this.idRentType = idRentType;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public Double getCostRentType() {
        return costRentType;
    }

    public void setCostRentType(Double costRentType) {
        this.costRentType = costRentType;
    }
}
