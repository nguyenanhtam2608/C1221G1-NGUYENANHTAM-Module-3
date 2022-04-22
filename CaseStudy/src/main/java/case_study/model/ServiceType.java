package case_study.model;

public class ServiceType {
    int idServiceType;
    String  nameServiceType;

    public ServiceType(int idServiceType, String nameServiceType) {
        this.idServiceType = idServiceType;
        this.nameServiceType = nameServiceType;
    }

    public ServiceType() {
    }

    public int getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(int idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getNameServiceType() {
        return nameServiceType;
    }

    public void setNameServiceType(String nameServiceType) {
        this.nameServiceType = nameServiceType;
    }
}
